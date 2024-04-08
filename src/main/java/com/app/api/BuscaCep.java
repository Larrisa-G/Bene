
package com.app.api;

import com.app.entidades.endereco.Endereco;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import javax.swing.JOptionPane;
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
        endereco.setEstado(pegarEstado(endereco.getUf()));
        return endereco;
    }
    
    private static String pegarEstado(String stringUf) {
        
        UF uf = UF.valueOf(stringUf);
       
        switch (uf) {
            case AC:
                return "Acre";
            case AL:
                return "Alagoas";
            case AP:
                return "Amapá";
            case AM:
                return "Amazonas";
            case BA:
                return "Bahia";
            case CE:
                return "Ceará";
            case DF:
                return "Distrito Federal";
            case ES:
                return "Espírito Santo";
            case GO:
                return "Goiás";
            case MA:
                return "Maranhão";
            case MT:
                return "Mato Grosso";
            case MS:
                return "Mato Grosso do Sul";
            case MG:
                return "Minas Gerais";
            case PA:
                return "Pará";
            case PB:
                return "Paraíba";
            case PR:
                return "Paraná";
            case PE:
                return "Pernambuco";
            case PI:
                return "Piauí";
            case RJ:
                return "Rio de Janeiro";
            case RN:
                return "Rio Grande do Norte";
            case RS:
                return "Rio Grande do Sul";
            case RO:
                return "Rondônia";
            case RR:
                return "Roraima";
            case SC:
                return "Santa Catarina";
            case SP:
                return "São Paulo";
            case SE:
                return "Sergipe";
            case TO:
                return "Tocantins";
            default:
                return "UF não reconhecida";
        }
    }
}
