# T1 - Desarrollo de Aplicaciones Web II

Proyecto realizado para la evaluación T1 del curso Desarrollo de Aplicaciones Web II.

## Integrantes

- Ignacio Rodrigo Machuca Gutierrez
- Carquin Hoyos Carlos Alonso
- Angélica Egas Quispe
- Jhaser Alexander Campos Castañeda

## APIs utilizadas

### Open Brewery DB

Se consume la API de cervecerías y se filtran los registros que cumplen con:

- brewery_type = micro
- state = California

Endpoint utilizado:

`https://api.openbrewerydb.org/v1/breweries`

### GitHub API

Se consume la lista de usuarios de GitHub y se filtran los usuarios que cumplen con:

- login con 5 caracteres o menos
- site_admin = false

Endpoint utilizado:

`https://api.github.com/users`

### Star Wars API

Se consume la primera página de personajes de Star Wars y se filtran los personajes que cumplen con:

- gender = female
- height mayor a 160

Endpoint utilizado:

`https://swapi.dev/api/people/`

## Tecnologías utilizadas

- Java 25
- Spring Boot 4.1.1
- Spring Cloud 2025.1.3
- OpenFeign
- Maven

## Trabajo en equipo

Cada integrante trabajó en una parte del proyecto y los cambios fueron integrados al repositorio usando Git y GitHub.
