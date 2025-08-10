package org.aplicacao.servico;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import org.aplicacao.dto.EnderecoDto;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ApiServico {

    EnderecoDto enderecoDto = new EnderecoDto();
    
    public EnderecoDto getEndereco(String cep) throws IOException, InterruptedException {
        try {
            HttpClient client = HttpClient.newHttpClient(); // cria as variaveis para a requisição HTTP
            HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://viacep.com.br/ws/" + cep + "/json/")).build();
                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString()); // envia a requisição e recebe a resposta como String

                ObjectMapper mapper = new ObjectMapper(); //deserializa o JSON recebido
                enderecoDto = mapper.readValue(response.body(), EnderecoDto.class); // recebe o JSON e converte para EnderecoDto (cria o objeto java)

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return enderecoDto; // retorna o objeto EnderecoDto
    }
}
