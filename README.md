# API de Gerenciamento de Time com Spring Boot

Esta é uma API RESTful desenvolvida em Java com Spring Boot para gerenciar uma lista de jogadores. O projeto serve como uma demonstração prática dos conceitos fundamentais de desenvolvimento back-end, incluindo a criação de endpoints CRUD, manipulação de JSON e aplicação dos pilares da Programação Orientada a Objetos.

A lista de jogadores é mantida em memória e reiniciada toda vez que a aplicação é iniciada.

## ✨ Funcionalidades

-   **Criar** novos jogadores (Comuns e VIPs) via requisições `POST`.
-   **Ler** a lista de todos os jogadores cadastrados via requisições `GET`.
-   **Atualizar** os dados de um jogador existente pelo seu índice via requisições `PUT`.
-   **Deletar** um jogador da lista pelo seu índice via requisições `DELETE`.
-   Lógica de negócio que aplica bônus de pontuação para jogadores VIP, demonstrando **Polimorfismo**.

## 🚀 Tecnologias e Conceitos Aplicados

-   **Java**
-   **Spring Boot**
-   **Spring Web** (para a criação de APIs RESTful)
-   **Maven** (para gerenciamento de dependências)
-   **API RESTful** (princípios e verbos HTTP)
-   **CRUD** (Create, Read, Update, Delete)
-   **Servidor Web Embutido (Tomcat)**
-   **Programação Orientada a Objetos (POO):**
    -   Encapsulamento
    -   Herança
    -   Polimorfismo

## Endpoints da API

A URL base da aplicação é `http://localhost:8080`.

| Método | URL                  | Corpo (Body) da Requisição                              | Descrição                                         |
| :----- | :------------------- | :------------------------------------------------------- | :-------------------------------------------------- |
| `GET`    | `/time`              | (Vazio)                                                  | Retorna a lista completa de jogadores.              |
| `POST`   | `/time`              | `{"nome": "Bruno", "idade": 30, "pontuacao": 50}`        | Cria um novo jogador comum e o retorna.             |
| `PUT`    | `/time/{indice}`     | `{"nome": "Ana Souza", "idade": 26, "pontuacao": 500}`   | Atualiza o jogador no `{indice}` e o retorna.     |
| `DELETE` | `/time/{indice}`     | (Vazio)                                                  | Deleta o jogador no `{indice}` e retorna uma msg. |

## ⚙️ Como Executar o Projeto

1.  **Pré-requisitos:** Certifique-se de ter o **JDK (Java Development Kit)** e o **Maven** instalados.
2.  **Clone o repositório:** `git clone https://github.com/JonathanLange93/gerenciador-de-time-api.git`
3.  **Navegue até a pasta** do projeto via terminal.
4.  **Execute o comando:** `./mvnw spring-boot:run` (no Linux/Mac) ou `mvnw.cmd spring-boot:run` (no Windows).
5.  A API estará disponível em `http://localhost:8080`.

## 🛠️ Como Testar

Recomenda-se o uso de um cliente de API como o **Postman** ou **Insomnia** para testar os endpoints `POST`, `PUT` e `DELETE`.