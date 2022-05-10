# Microservices Application

#### This application aims to provide a microservice with the following endpoints after consuming the data from the bellow mocks and returning the requested information

### About
Shopping List (Lista de Compras): http://www.mocky.io/v2/598b16861100004905515ec7

Client List (Lista de Clientes): http://www.mocky.io/v2/598b16291100004705515ec5

GET: /compras - Return shopping list sorted by value;
GET: /maior-compra/ano - (Example: /maior_compra/2016) - Given the year, return the largest purchase of that year;
GET: /clientes-fieis - Return the Top 3 most loyal customers, customers who have more recurring purchases with higher values;
GET: /recomendacao/cliente/tipo - Return a wine recommendation based on the types of wine the customer buys the most. - Not implemented*

This project contains:
- Service registry
- Compras service
- Clientes service (Not actually used, just implemented)

Obs.: Lista de Compras had 'cliente' field altered to Integer in order to match field 'id' in Lista de Clientes   

### Status

The application is functional

### Technologies

The following tools were used to build this project:

- Java
- Spring Boot / Spring Data JPA / Lombok / H2 Database 
- Postman

## License

**Free Software, Hell Yeah!**