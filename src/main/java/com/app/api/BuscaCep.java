
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
    private static final String ERRORMSG = "Falha ao buscar informações do CEP";
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
                throw new IOException(ERRORMSG);
            }
        } catch (IOException e) {
            throw new IOException(ERRORMSG);
        }
    }
    
    public static Endereco fromApiResponse(String apiResponse) throws IOException{
        
        Endereco endereco = new Endereco();
        JSONObject json = new JSONObject(apiResponse);
       
        if(json.optBoolean("erro",false)) {
            throw new IOException(ERRORMSG);
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
       
        return switch (uf) {
            case AC -> "Acre";
            case AL -> "Alagoas";
            case AP -> "Amapá";
            case AM -> "Amazonas";
            case BA -> "Bahia";
            case CE -> "Ceará";
            case DF -> "Distrito Federal";
            case ES -> "Espírito Santo";
            case GO -> "Goiás";
            case MA -> "Maranhão";
            case MT -> "Mato Grosso";
            case MS -> "Mato Grosso do Sul";
            case MG -> "Minas Gerais";
            case PA -> "Pará";
            case PB -> "Paraíba";
            case PR -> "Paraná";
            case PE -> "Pernambuco";
            case PI -> "Piauí";
            case RJ -> "Rio de Janeiro";
            case RN -> "Rio Grande do Norte";
            case RS -> "Rio Grande do Sul";
            case RO -> "Rondônia";
            case RR -> "Roraima";
            case SC -> "Santa Catarina";
            case SP -> "São Paulo";
            case SE -> "Sergipe";
            case TO -> "Tocantins";
            default -> "UF não reconhecida";
        };
    }
}
