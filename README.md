## About application
This project allows you to store data about films and their directors


## Running the application locally

---

First of all you need database, you need to run from root
> docker-compose up

Next there are several ways to run a Spring Boot application on your local machine. One way is to execute the main method in the de.codecentric.springbootsample.Application class from your IDE.

Alternatively you can use the Spring Boot Maven plugin like so:

> mvn spring-boot:run

## Api examples

- GET http://localhost:8080/api/movies

Returns all movies from database:

```
[
  {
    "movie": {
      "id": 1,
      "title": "Example movie",
      "year": 2018,
      "director": 1,
      "length": "02:30:00",
      "rating": 8
    }
  }
]
```

- GET http://localhost:8080/api/movies/:id

Get information about film by id
```
{
"movie": {
"id": 1,
"title": "Example movie",
"year": 2018,
"director": 1,
"length": "02:30:00",
"rating": 8
}
}
```
If not found returns 404 (Not Found).

- POST http://localhost:8080/api/movies

Create new film
Need to add this to request body:
```
{
"movie": {
"id": 1,
"title": "Example movie",
"year": 2018,
"director": 1,
"length": "02:30:00",
"rating": 8
}
}
```

Return format:
```
{
"movie": {
"id": 1,
"title": "Example movie",
"year": 2018,
"director": 1,
"length": "02:30:00",
"rating": 8
}
}
```

- POST http://localhost:8080/api/movies/:id
Add to request body:
```
{
"movie": {
"id": 1,
"title": "Example movie",
"year": 2018,
"director": 1,
"length": "02:30:00",
"rating": 8
}
}
```
Response:
```
{
"movie": {
"id": 1,
"title": "Example movie",
"year": 2018,
"director": 1,
"length": "02:30:00",
"rating": 8
}
}
```

- DELETE http://localhost:8080/api/movies/:id


Same methods exists for directors