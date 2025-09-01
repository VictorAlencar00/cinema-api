# Cinema Booking API

API RESTful para um sistema de venda de ingressos de cinema, desenvolvido com Java e Spring Boot.

## 🚧 Em desenvolvimento...

## Escopo do MVP (Backend)

O objetivo inicial deste backend é fornecer as seguintes funcionalidades

-   [ ] **Listagem e Detalhes de Filmes:** Disponibilizar os filmes que estão em cartaz e permitir a visualização de seus detalhes, incluindo as sessões disponíveis para cada um.

-   [ ] **Visualização de Assentos:** Expor os dados de uma sala para que o frontend possa renderizar o mapa de assentos de uma sessão específica, mostrando quais estão livres ou ocupados.

-   [ ] **Criação de Pedidos (Reserva):** Permitir a criação de um pedido com o status `PENDENTE`, "reservando" temporariamente os assentos selecionados pelo usuário.

-   [ ] **Confirmação de Pagamento (Webhook):** Disponibilizar um endpoint para receber uma notificação de um gateway de pagamento externo, que irá atualizar o status do pedido para `PAGO` e efetivar a compra dos ingressos.

-   [ ] **Estruturação de Entidades:** Implementar o CRUD (Create, Read, Update, Delete) para as entidades de gerenciamento, como `Cinema`, `Sala` e `Sessao`, que será utilizado em um painel administrativo futuro.

---

## Tecnologias

* Java 21
* Spring Boot 3.5.5
* Spring Data JPA / Hibernate
* PostgreSQL
* Maven

---
