#  Cursos PWEB1 - API REST

API REST desenvolvida em Java com Spring Boot para gerenciamento de cursos, aulas e instrutores, utilizando Spring Data JPA para persistência em banco de dados PostgreSQL.

##  Tecnologias Utilizadas

- **Java 21**
- **Spring Boot**
- **Spring Data JPA** (Hibernate)
- **PostgreSQL**
- **Maven**

##  Como Executar o Projeto

### Pré-requisitos
- Java 21 instalado
- PostgreSQL rodando localmente na porta `5432`
- Banco de dados `cursos_pweb1` criado no PostgreSQL

### Passos para execução
1. Clone o repositório:
   ```bash
   git clone [https://github.com/SEU_USUARIO/cursos_pweb1.git](https://github.com/SEU_USUARIO/cursos_pweb1.git)

1. Configure as credenciais do seu banco em src/main/resources/application.properties.

2. Execute a aplicação via terminal: ./mvnw spring-boot:run
A aplicação estará disponível em http://localhost:8080