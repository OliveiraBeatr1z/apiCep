package org.aplicacao;

import java.io.IOException;

import org.aplicacao.dto.EnderecoDto;
import org.aplicacao.servico.ApiServico;

public class Main {
    public static void main(String[] args) {
       ApiServico apiServico = new ApiServico();
       try {
        EnderecoDto endereco = apiServico.getEndereco("03805110");
        System.out.println("Logradouro: " + endereco.getLogradouro());
        System.out.println("Bairro: " + endereco.getBairro());
        System.out.println("Cidade: " + endereco.getLocalidade());
        System.out.println("UF: " + endereco.getUf());
        System.out.println("CEP: " + endereco.getCep());
       } catch (IOException e) {
        throw new RuntimeException();
       } catch (InterruptedException e) {
        throw new RuntimeException("Erro inesperado: " + e.getMessage(), e);
       }
       System.out.println("Programa finalizado.");
    }
}