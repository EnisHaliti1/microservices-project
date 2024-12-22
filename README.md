This project is a microservices-based Library Book Lending System. It consists of User Service, Book Service, and Reviews Service, which handle user management, book information, and reviews respectively. The API Gateway serves as the entry point, routing requests to the appropriate services. The system allows users to view book details, manage user accounts, and submit reviews for books. The services are containerized using Docker, and the application supports secure authentication with OAuth2.

Implemented items from assignement
Basics:

  3 microservices with 1 MongoDB and 2 MySQL
  API gateway with OAuth2 secured/unsecured endpoints
  Docker Compose deployment with Github Actions

Technologies:

  Backend:

  Spring Boot: Framework for microservices implementation.
  Spring Cloud Gateway: Handles API Gateway routing and filters.
  OAuth2: Used for secure authentication and authorization.

  Databases:

  MySQL: Used for the user-service and book-service.
  MongoDB: Used for the reviews-service.

  Deployment:
  Docker Compose

Endpoints:

  user-service:
    POST /api/users -> create a user
    GET /api/users/all -> get all users
    GET /api/users/(name) -> get users by name
    DELETE /api/users/{id} -> delete a user

  book-service:
    POST /api/books -> create a book
    GET /api/books/all -> get all books
    GET /api/books/(titles) -> get books by title

  reviews-service:
    POST /api/reviews -> create a review
    GET /api/reviews/book/{bookId} -> get reviews by book id
    GET /api/reviews//user/{userId} -> get reviews by user id


Docker Compose stucture

microservices with the gateway:
   
![afbeelding](https://github.com/user-attachments/assets/8592b98d-3748-49cc-afbb-18c9cb564a9d)
![afbeelding](https://github.com/user-attachments/assets/4c08899d-70ae-4bbb-bf85-ec4100c4e6a7)
![afbeelding](https://github.com/user-attachments/assets/31c8686e-8899-4047-a8d3-4479f8ca4de9)
![afbeelding](https://github.com/user-attachments/assets/0bd48049-64f5-4621-96a3-bb297874ccf7)

databases with their volumes:
![afbeelding](https://github.com/user-attachments/assets/daeb6c7b-9473-46b3-9763-8fabdf22bf9e)
![afbeelding](https://github.com/user-attachments/assets/816bd646-0ffc-4d25-b691-551b2a5f5749)
![afbeelding](https://github.com/user-attachments/assets/84846546-953c-4a39-bb35-71adbd003341)




Postman Screenshots:

user-service:
![afbeelding](https://github.com/user-attachments/assets/415f923b-933e-4627-a9f2-5b293786e9e2)
![afbeelding](https://github.com/user-attachments/assets/b20e861e-2d3d-4eab-b448-a4e781586d36)
![afbeelding](https://github.com/user-attachments/assets/abbcfaa3-da57-41b7-aa94-2218719a87a8)
![afbeelding](https://github.com/user-attachments/assets/48004dcf-1db8-449a-90c6-6fcbc54f613d)


book-service:
![afbeelding](https://github.com/user-attachments/assets/374f8cdc-dc5b-430d-9fcb-d9eaeac4765c)
![afbeelding](https://github.com/user-attachments/assets/91fc252d-cc65-4d1b-a757-de18ebd3fd25)
![afbeelding](https://github.com/user-attachments/assets/68726811-543c-456f-973f-ef496bdb25bd)


reviews-service:
![afbeelding](https://github.com/user-attachments/assets/89fed651-8950-40e8-bdff-b83c1a67472a)
![afbeelding](https://github.com/user-attachments/assets/97f0965e-bfd2-4035-8b8c-b1f8b4747f03)
![afbeelding](https://github.com/user-attachments/assets/995d8872-3e92-4281-9661-287b52842bf6)










