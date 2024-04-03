
package com.app.api;

import com.app.entidades.endereco.Endereco;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import org.json.JSONObject;


public class BuscaCep {
    private static String errorMsg = "Falha ao buscar informações do CEP";
    public static Endereco buscar(String cep) throws IOException {
       try {
        String url = "https://viacep.com.br/ws/" + cep + "/json/";
        HttpURLConnection conexao = (HttpURLConnection) new URL(url).openConnection();
        conexao.setRequestMethod("GET");

        int respostaCode = conexao.getResponseCode();
        if (respostaCode == HttpURLConnection.HTTP_OK) {
            BufferedReader leitor = new BufferedReader(new InputStreamReader(conexao.getInputStream(), StandardCharsets.UTF_8));
            StringBuilder resposta = new StringBuilder();
            String linha;
            while ((linha = leitor.readLine()) != null) {
                resposta.append(linha);
            }
            leitor.close();
            
            Endereco response = fromApiResponse(resposta.toString());
            return response;
        } else {
                throw new IOException(errorMsg);
            }
        } catch (IOException e) {
            throw new IOException(errorMsg);
        }
    }
    
    public static Endereco fromApiResponse(String apiResponse) throws IOException{
        
        Endereco endereco = new Endereco();
        JSONObject json = new JSONObject(apiResponse);
        
        if(json.optBoolean("erro",false)) {
            throw new IOException(errorMsg);
        }
        
        endereco.setCep(json.getString("cep"));
        endereco.setLogradouro(json.optString("logradouro", null));
        endereco.setNumero(json.optInt("numero", 0)); 
        endereco.setComplemento(json.optString("complemento", null));
        endereco.setBairro(json.optString("bairro", null));
        endereco.setCep(json.optString("cep", null));
        endereco.setCidade(json.optString("localidade", null));
        endereco.setUf(json.optString("uf", null));
        return endereco;
    }
}
