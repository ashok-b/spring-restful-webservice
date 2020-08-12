# Building RESTful Web Services

## Output CURD JPA Operations with DB
#### POST 
http://localhost:7080/geolocation/create <br/>
{
    "id": 1,
    "longitude": 23.12345,
    "latitude": 36.4678,
    "userId": 4
}
#### GET 
http://localhost:7080/geolocation/list<br/>
[
    {
    "id": 1,
    "longitude": 23.12345,
    "latitude": 36.4678,
    "userId": 4
	}
]
#### PUT
http://localhost:7080/geolocation//update/1
{
        "id": 1,
        "longitude": 98.567412345,
        "latitude": 45.987654123,
        "userId": 45
}
#### DELETE
http://localhost:7080/geolocation/delete/1
{
        "id": 1,
        "longitude": 98.567412345,
        "latitude": 45.987654123,
        "userId": 45
}

## Output
Open URLs in the browser <br/>
http://localhost:8080/greeting?name=ashok<br/>
gives   
{"id":7,"message":"Hello ashok"}

http://localhost:8080/greeting?name<br/>
gives   
{"id":8,"message":"Hello World"}

http://localhost:8080/greeting<br/>
gives   
{"id":9,"message":"Hello World"}

