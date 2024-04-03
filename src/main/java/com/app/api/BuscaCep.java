
package com.app.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


public class BuscaCep {
    public static String buscar(String cep) throws IOException {
        String url = "https://viacep.com.br/ws/" + cep + "/json/";
        HttpURLConnection conexao = (HttpURLConnection) new URL(url).openConnection();
        conexao.setRequestMethod("GET");

        int respostaCode = conexao.getResponseCode();
        if (respostaCode == HttpURLConnection.HTTP_OK) {
            BufferedReader leitor = new BufferedReader(new InputStreamReader(conexao.getInputStream()));
            StringBuilder resposta = new StringBuilder();
            String linha;
            while ((linha = leitor.readLine()) != null) {
                resposta.append(linha);
            }
            leitor.close();
            return resposta.toString();
        } else {
            throw new IOException("Falha ao buscar informações do CEP. Código de resposta: " + respostaCode);
        }
    }
}
