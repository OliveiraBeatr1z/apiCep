# apiCep

Projeto Java para consulta de endereço via CEP utilizando uma API pública.

## Estrutura do Projeto

```
apiCep/
└── aplicacao/
    ├── pom.xml
    └── src/
        └── main/
            └── java/
                └── org/
                    └── aplicacao/
                        ├── Main.java
                        ├── dto/
                        │   └── EnderecoDto.java
                        └── servico/
                            └── ApiServico.java
```

## Pré-requisitos

- Java 17 ou superior
- Maven 3.6+ instalado e configurado no PATH

## Como executar

1. **Instale as dependências:**
   Abra o terminal na pasta `aplicacao` e execute:
   ```sh
   mvn compile
   ```

2. **Execute o programa:**
   ```sh
   mvn exec:java -Dexec.mainClass="org.aplicacao.Main"
   ```

## O que o projeto faz?

- Consulta um CEP usando uma API pública (exemplo: ViaCEP)
- Exibe as informações do endereço no console

## Exemplo de saída

```
Logradouro: Rua Maria Cândida
Bairro: Vila Guilherme
Cidade: São Paulo
UF: SP
CEP: 02011-000
Programa finalizado.
```

## Personalização

- Para consultar outro CEP, altere o valor passado para `apiServico.getEndereco("03805110")` no arquivo `Main.java`.

## Licença

Este projeto é livre
