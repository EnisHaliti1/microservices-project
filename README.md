Het gekozen thema is een bibliotheek boeken uitleensysteem. Dit systeem maakt het mogelijk voor gebruikers om boeken te bekijken, reviews te lezen of toe te voegen, en gebruikersinformatie te beheren. 
Het systeem is modulair opgezet met behulp van microservices en bevat een API Gateway voor communicatie en authenticatie.

Het project bestaat uit de volgende onderdelen:

User-Service: Beheert gebruikersinformatie, zoals naam, email...
Database: MySQL is gekozen omdat gebruikersgegevens eenvoudig en gestructureerd zijn.

Book-Service: Beheert boekgegevens, zoals titel en auteur.
Database: MySQL is gekozen omdat het goed werkt voor gestructureerde gegevens zoals boekenlijsten.

Reviews-Service: Beheert reviews die gebruikers over boeken kunnen schrijven.
Database: MongoDB is gekozen vanwege de flexibiliteit in het opslaan van ongestructureerde gegevens zoals tekstuele reviews. 

API Gateway: Verzorgt de routing tussen de microservices en handelt authenticatie en autorisatie af met behulp van Google OAuth2.

![afbeelding](https://github.com/user-attachments/assets/0fb97bc6-a9b8-4801-a99d-0070f981c631)
![afbeelding](https://github.com/user-attachments/assets/d07f0588-60a7-4f94-8b7a-9956ff2ddf2f)
![afbeelding](https://github.com/user-attachments/assets/a1eacae8-23ea-47dc-a8b1-728695d0abb3)
![afbeelding](https://github.com/user-attachments/assets/ff01e41f-50f6-4693-8600-9996b0bd233b)
