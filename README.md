# Sistema de gerenciamento de clientes e contratos

O desenvolvimento de um sistema de controle de clientes, criação e envio de contratos proporciona a oportunidade de aplicar conceitos teóricos de programação em um
contexto real, consolidando o aprendizado uma vez que envolve conceitos acadêmicos como os princípios de programação orientada a objeto (POO), Banco de dados relacional, interface gráfica (GUI) bem como gerenciamento de projetos.

O projeto não apenas resolve uma demanda real da parte interessada, mas também enriquece a experiência acadêmica dos alunos, que ao longo do projeto desenvolveram além
das hard skills citadas acima,  também soft skills como trabalho em equipe, comunicação e empatia. preparando-os para desafios futuros na área de desenvolvimento de software.

## Contribuintes
Este projeto teve a contribuição de:
-  <a href="https://github.com/gabrielssconceicao" target="_blank">Gabriel Conceição</a>
-  <a href="https://github.com/Larrisa-G" target="_blank">Larrisa-G
</a>
- <a href="https://github.com/EricEdu" target="_blank">EricEdu</a>

## Visão Geral
Este projeto tem como objetivo desenvolver um sistema em Java para a criação e gerenciamento de contratos. Ele permite aos usuários criar, visualizar, editar e deletar contratos, além de fornecer funcionalidades para a validação e armazenamento seguro dos mesmos.

## Objetivos a serem alcançados 

  - Promover um ambiente centralizado e seguro para gerenciar as informações dos clientes, tais como : CPF, RG, Nome completo, profissão, gênero e nacionalidade em caso de pessoa física e CNPJ, nome fantasia, CPF do representante da empresa e cadastro estadual em caso de pessoa jurídica;
    
  - Gerar contratos de forma mais eficiente, automatizando a inserção de dados pré cadastrados no banco;
    
  - Enviar contratos por email de forma simplificada com o uso de uma API.
  
## 🚀 Funcionalidades

- Cadastro Clientes: Permite que o usuário cadastre clientes, tanto de pessoas físicas, quanto de jurídicas
  
- Alterar Clientes: Permite a alteração dos dados dos clientes
  
- Deletar Cliente: Pertime a remoção dos clientes
  
- Listar Clientes: Permite a visualização dos clientes na base de dados
  
- Gerar Contratos: O usuário irá preencher os contratos com os dados que já estão em seu banco de dados. Caso não esteja, será preenchido manualemte


# Tecnologias

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)]()
[![SQlite](https://img.shields.io/badge/SQLite-07405E?style=for-the-badge&logo=sqlite&logoColor=white)]()

- Versão Java: 17
- Maven: 3.8.1
- IDE's: Apache NetBeans e IntelliJ

## Dependências Utilizadas

Este projeto utiliza várias bibliotecas para fornecer funcionalidades adicionais e suporte ao desenvolvimento. Abaixo está uma lista das dependências usadas no projeto, juntamente com uma breve descrição de cada uma:

- **SQLite JDBC**:
  - **Biblioteca**: `org.xerial:sqlite-jdbc:3.45.2.0`
  - **Descrição**: Driver JDBC para o banco de dados SQLite, permitindo que o Java interaja com bases de dados SQLite.
  - **Uso**: Conexão e manipulação de dados em um banco de dados SQLite.

- **SLF4J API**:
  - **Biblioteca**: `org.slf4j:slf4j-api:1.7.36`
  - **Descrição**: Interface de registro de logs para Java, fornece uma API para várias implementações de logging.
  - **Uso**: Implementação de logs na aplicação, facilitando a depuração e monitoramento.

- **Lombok**:
  - **Biblioteca**: `org.projectlombok:lombok:1.18.32`
  - **Descrição**: Biblioteca que reduz a verbosidade do código Java, fornecendo anotações para gerar código repetitivo automaticamente, como getters, setters, e construtores.
  - **Uso**: Simplificação do código através da geração automática de métodos comuns.
  - **Nota**: Incluído com o escopo `provided`, ou seja, necessário apenas em tempo de compilação.

- **JSON**:
  - **Biblioteca**: `org.json:json:20231013`
  - **Descrição**: Biblioteca para manipulação de dados JSON em Java.
  - **Uso**: Conversão de objetos Java para JSON e vice-versa, facilitando a manipulação e troca de dados em formato JSON.

- **Apache POI**:
  - **Biblioteca**: `org.apache.poi:poi:5.2.4`
  - **Descrição**: Biblioteca para manipulação de arquivos do Microsoft Office em Java.
  - **Uso**: Leitura e escrita de arquivos Excel (XLS e XLSX).

- **Apache POI Scratchpad**:
  - **Biblioteca**: `org.apache.poi:poi-scratchpad:5.2.4`
  - **Descrição**: Extensão da biblioteca Apache POI para suporte adicional a formatos de documentos.
  - **Uso**: Manipulação de formatos adicionais de documentos do Microsoft Office, como Word.

Estas dependências são configuradas no arquivo `pom.xml` e são gerenciadas pelo Maven, garantindo que todas as bibliotecas necessárias sejam baixadas e incluídas no projeto.

