# Sistema de Gerenciamento de Chamados (SGC)

Este projeto consiste em um sistema de gerenciamento de chamados desenvolvido com Java, Spring Boot, React e TypeScript, permitindo o controle de usuários e chamados de suporte através de uma interface web.

O sistema permite que o usuário:

- Cadastrar um novo usuário;
- Editar usuários cadastrados;
- Remover usuários;
- Listar todos os usuários cadastrados;
- Cadastrar novos chamados;
- Editar chamados;
- Remover chamados;
- Listar todos os chamados cadastrados;
- Buscar chamados pelo título;
- Filtrar chamados por status;
- Filtrar chamados por prioridade;
- Visualizar estatísticas dos chamados através de um dashboard.

## Tecnologias

### Backend

- Java 21
- Spring Boot
- Spring Web
- Spring Data JPA
- Bean Validation
- OpenAPI / Swagger
- Banco de Dados H2
- Maven

### Frontend

- React
- TypeScript
- React Router DOM
- Axios
- Vite

### Principais Classes e Componentes

#### Backend

- UserController
- TicketController
- UserService
- TicketService
- UserRepository
- TicketRepository
- GlobalExceptionHandler

#### Frontend

- Dashboard
- Users
- CreateUser
- EditUser
- Tickets
- CreateTicket
- EditTicket

## Como Executar

### Backend

Execute a aplicação Spring Boot:

```bash
mvn spring-boot:run
