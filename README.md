# Activité Pratique N°6 - Architectures Micro-services

Ce projet est divisé en deux parties, chacune correspondant à une branche différente :
- La partie 1 se trouve dans la branche `part1`.
- La partie 2 se trouve dans la branche `part2`.

## Partie 1

### Micro Service avec Web Service RESTFUL

1. Créer projet Maven bank-account-service
    ![Créer projet Maven bank-account-service](https://github.com/devAhansal/Activite-Pratique-N-6-Architectures-Micro-services/assets/81721069/4f09a7c7-30d8-4d79-b6c3-05a89fe9f434)

2. Créer projet avec les dépendances Spring Web, JPA, H2 database, Lombok, et Spring for GraphQL
    ![Créer projet avec les dépendances Spring Web, JPA, H2 database, Lombok, et Spring for GraphQL](https://github.com/devAhansal/Activite-Pratique-N-6-Architectures-Micro-services/assets/81721069/5d3ba835-da8a-4215-a70c-884e03ceb8f5)

3. Créer entité BankAccount dans nouveau package entities avec enum AccountType dans nouveau package AccountType
    ![Créer entité BankAccount dans nouveau package entities avec enum AccountType dans nouveau package AccountType](https://github.com/devAhansal/Activite-Pratique-N-6-Architectures-Micro-services/assets/81721069/3e74e332-d157-4a20-85d8-83097b04a218)

4. Ajouter interface BankAccountRepository dans repositories pour implémenter JPA
    ![Ajouter interface BankAccountRepository dans repositories pour implémenter JPA](https://github.com/devAhansal/Activite-Pratique-N-6-Architectures-Micro-services/assets/81721069/2cae94d8-b62c-4285-969f-7843c9deed41)

5. Ajouter un nouveau test CommandLineRunner pour ajouter les comptes bancaires
    ![Ajouter un nouveau test CommandLineRunner pour ajouter les comptes bancaires](https://github.com/devAhansal/Activite-Pratique-N-6-Architectures-Micro-services/assets/81721069/545ce48f-d657-4b0b-8a4e-2fb7e213745c)

6. Configurer H2 database
    ![Configurer H2 database](https://github.com/devAhansal/Activite-Pratique-N-6-Architectures-Micro-services/assets/81721069/7bb113db-89b9-4f1d-8b1d-bade6235f1de)

7. Les comptes créés en H2-db
    ![Les comptes créés en H2-db](https://github.com/devAhansal/Activite-Pratique-N-6-Architectures-Micro-services/assets/81721069/bb47329d-0cfe-4bf6-8fc5-accab1dc10a8)

8. Créer un RestAPI avec ajouter class AccountRestController dans package web pour consulter les comptes
    ![Créer un RestAPI avec ajouter class AccountRestController dans package web pour consulter les comptes](https://github.com/devAhansal/Activite-Pratique-N-6-Architectures-Micro-services/assets/81721069/a60f7739-c9e7-4e15-bacf-009811f02f2f)

9. Ajouter nouveau Endpoint pour enregistrer, modifier et supprimer le compte
    ![Ajouter nouveau Endpoint pour enregistrer, modifier et supprimer le compte](https://github.com/devAhansal/Activite-Pratique-N-6-Architectures-Micro-services/assets/81721069/e8e02524-8134-42e4-b6ca-1a0733be4fed)

10. Test API avec Postman
    ![Test API avec Postman](https://github.com/devAhansal/Activite-Pratique-N-6-Architectures-Micro-services/assets/81721069/4de0f8ec-8422-495c-81d9-69d338e05db0)

11. Ajouter la dépendance springdoc-openapi-starter-webmvc-ui pour documenter RestAPI
    ![Ajouter la dépendance springdoc-openapi-starter-webmvc-ui pour documenter RestAPI](https://github.com/devAhansal/Activite-Pratique-N-6-Architectures-Micro-services/assets/81721069/84701696-0c14-44ef-bf9d-21c442b602d4)

12. Interface Springdoc
    ![Interface Springdoc](https://github.com/devAhansal/Activite-Pratique-N-6-Architectures-Micro-services/assets/81721069/c861bbee-7191-4f42-a263-c182af0b0012)

13. Ajouter dépendance Spring Data REST pour simplifier la création d'API RESTful à partir des dépôts Spring Data, gérant automatiquement les opérations CRUD
    ![Ajouter dépendance Spring Data REST pour simplifier la création d'API RESTful à partir des dépôts Spring Data, gérant automatiquement les opérations CRUD](https://github.com/devAhansal/Activite-Pratique-N-6-Architectures-Micro-services/assets/81721069/13f90323-076b-4d2e-8977-70d8cf5a52ec)

14. Ajouter l'annotation RepositoryRestResource à BankAccountRepository pour que Spring démarre le service Rest API à entité BankAccount automatiquement
    ![Ajouter l'annotation RepositoryRestResource à BankAccountRepository pour que Spring démarre le service Rest API à entité BankAccount automatiquement](https://github.com/devAhansal/Activite-Pratique-N-6-Architectures-Micro-services/assets/81721069/868cda8e-70dc-4e9e-96b2-13bac95eb9c5)

15. Exemple de format réponse API généré par Spring Data REST avec pagination
    ![Exemple de format réponse API généré par Spring Data REST avec pagination](https://github.com/devAhansal/Activite-Pratique-N-6-Architectures-Micro-services/assets/81721069/ca1e2665-0212-4db8-9bc6-a0bf1ab8f23a)

16. Ajouter méthode findByType à BankAccountRepository
    ![Ajouter méthode findByType à BankAccountRepository](https://github.com/devAhansal/Activite-Pratique-N-6-Architectures-Micro-services/assets/81721069/443f5b39-626b-4488-b225-a56d87df17dd)

17. Créer interface projection associée à BankAccount nommée p1 avec Spring Data REST
    ![Créer interface projection associée à BankAccount nommée p1 avec Spring Data REST](https://github.com/devAhansal/Activite-Pratique-N-6-Architectures-Micro-services/assets/81721069/61b4b162-3a80-417e-93e6-96a612dc08af)

18. Écrire un service avec son implémentation et DTO response et request pour respecter les normes
    ![Écrire un service avec son implémentation et DTO response et request pour respecter les normes](https://github.com/devAhansal/Activite-Pratique-N-6-Architectures-Micro-services/assets/81721069/124093cd-4f60-4893-a1f8-351f3fce7a28)

19. Changer la méthode save en ajoutant service et DTO
    ![Changer la méthode save en ajoutant service et DTO](https://github.com/devAhansal/Activite-Pratique-N-6-Architectures-Micro-services/assets/81721069/885c03dc-2255-4f4e-98a8-ce41b2e3e6a1)

20. Créer AccountMapper pour convertir des objets d'un type à un autre (from BankAccount to BankAccountResponseDTO) en respectant les bonnes pratiques
    ![Créer AccountMapper pour convertir des objets d'un type à un autre (from BankAccount to BankAccountResponseDTO)](https://github.com/devAhansal/Activite-Pratique-N-6-Architectures-Micro-services/assets/81721069/2120e9a9-b65a-47b7-bd15-a96e6fd66c94)

21. Utilisation de mapper AccountMapper dans implémentation de service
    ![Utilisation de mapper AccountMapper dans implémentation de service](https://github.com/devAhansal/Activite-Pratique-N-6-Architectures-Micro-services/assets/81721069/91c3405c-e829-455d-a069-1635bd9f8662)

### Micro Service avec GraphQL Connector

22. Ajouter schéma GraphQL schema.graphqls pour intégrer GraphQL
    ![Ajouter schéma GraphQL schema.graphqls pour intégrer GraphQL](https://github.com/devAhansal/Activite-Pratique-N-6-Architectures-Micro-services/assets/81721069/0f8e8f3f-c10d-4690-9c68-7e1eeb5db5dd)

23. Ajouter les dépendances nécessaires pour GraphQL
    ![Ajouter les dépendances nécessaires pour GraphQL](https://github.com/devAhansal/Activite-Pratique-N-6-Architectures-Micro-services/assets/81721069/6ee9194a-3828-4af3-918f-5244a9e6d78a)

24. Ajouter un controller GraphQL contenant les champs de Query GraphQL comme méthode du même nom
    ![Ajouter un controller GraphQL contenant les champs de Query GraphQL comme méthode du même nom](https://github.com/devAhansal/Activite-Pratique-N-6-Architectures-Micro-services/assets/81721069/920b448a-7af4-4078-a180-00c00fd0ad7c)

25. Tester la méthode accountList
    ![Tester la méthode accountList](https://github.com/devAhansal/Activite-Pratique-N-6-Architectures-Micro-services/assets/81721069/2d3ba59b-e903-4757-8b06-e913eebb1bf8)

26. Tester la méthode accountById
    ![Tester la méthode accountById](https://github.com/devAhansal/Activite-Pratique-N-6-Architectures-Micro-services/assets/81721069/eaf40931-a18c-4c18-97b5-b7410b28d6d4)

27. Gestion des exceptions nécessitant la création d'un handler EXCEPTION
    ![Gestion des exceptions nécessitant la création d'un handler EXCEPTION](https://github.com/devAhansal/Activite-Pratique-N-6-Architectures-Micro-services/assets/81721069/3eecc563-381d-4900-b94e-967709b28972)

28. Ajouter mutation GraphQL addAccount pour ajouter nouveau client
    ![Ajouter mutation GraphQL addAccount pour ajouter nouveau client](https://github.com/devAhansal/Activite-Pratique-N-6-Architectures-Micro-services/assets/81721069/e19db89e-d85b-4f12-9dc2-0230dd1323dc)

29. Tester mutation addAccount
    ![Tester mutation addAccount](https://github.com/devAhansal/Activite-Pratique-N-6-Architectures-Micro-services/assets/81721069/d9ec55e8-854d-423a-8d21-ce6f3de9ce12)

30. Tester mutation addAccount avec des variables
    ![Tester mutation addAccount avec des variables](https://github.com/devAhansal/Activite-Pratique-N-6-Architectures-Micro-services/assets/81721069/3533bf2c-813a-457c-ac21-d32b7973a855)

31. Ajouter mutation GraphQL updateAccount et deleteAccount
    ![Ajouter mutation GraphQL updateAccount et deleteAccount](https://github.com/devAhansal/Activite-Pratique-N-6-Architectures-Micro-services/assets/81721069/f08888de-43f4-4898-95d6-faa68092c78c)

32. Tester updateAccount
    ![Tester updateAccount](https://github.com/devAhansal/Activite-Pratique-N-6-Architectures-Micro-services/assets/81721069/89c448c1-2277-4bcb-aaf8-1d72652436cf)

33. Ajouter nouvelle entité Customer et chaque Customer a un ou plusieurs BankAccount (oneToMany)
    ![Ajouter nouvelle entité Customer et chaque Customer a un ou plusieurs BankAccount (oneToMany)](https://github.com/devAhansal/Activite-Pratique-N-6-Architectures-Micro-services/assets/81721069/e758f1fc-2646-4992-a40d-c648cdddfd8f)

34. Créer des comptes avec des comptes avec CommandLineRunner
    ![Créer des comptes avec des comptes avec CommandLineRunner](https://github.com/devAhansal/Activite-Pratique-N-6-Architectures-Micro-services/assets/81721069/0d9137a6-5adb-4adc-9cfb-e4c79895b1a5)

35. Ajouter QueryMapping customer pour retourner la liste des clients
    ![Ajouter QueryMapping customer pour retourner la liste des clients](https://github.com/devAhansal/Activite-Pratique-N-6-Architectures-Micro-services/assets/81721069/98e7b338-25c3-4b34-ac21-19a39ff76e9a)

36. Tester QueryMapping customer
    ![Tester QueryMapping customer](https://github.com/devAhansal/Activite-Pratique-N-6-Architectures-Micro-services/assets/81721069/a1b15258-1a58-468d-91a3-328bb77cc2aa)

## Partie 2
![Creee  maven application bank-account-app pour crrer des micro services comme des modules](https://github.com/devAhansal/Activite-Pratique-N-6-Architectures-Micro-services/assets/81721069/e861b7ac-7a67-477b-a7a6-dbae41ee4c5b)
![et dans l'application on cree un module  customer-service  avec spring initializr](https://github.com/devAhansal/Activite-Pratique-N-6-Architectures-Micro-services/assets/81721069/82a3d7e8-cc1b-4507-bc72-c810780710b1)
![depedences de  customer-service ](https://github.com/devAhansal/Activite-Pratique-N-6-Architectures-Micro-services/assets/81721069/ef8e5ca6-c198-4d50-af68-8a76e92676fc)
![Ajouter aussi deux modules account-service et gateway-service est un Applications spring boot](https://github.com/devAhansal/Activite-Pratique-N-6-Architectures-Micro-services/assets/81721069/0e267d56-f62a-40f2-95dd-3b95d3ade5d5)
![depedences de  gateway-service](https://github.com/devAhansal/Activite-Pratique-N-6-Architectures-Micro-services/assets/81721069/bc10a86d-5ebd-48e9-9282-b78e913b0977)
![Ajouter aussi discovery-service avec ces dependeces](https://github.com/devAhansal/Activite-Pratique-N-6-Architectures-Micro-services/assets/81721069/0eb78071-7d44-4556-bcf2-57c31e7ae671)
![Ajouter aussi config-service avec ces dependeces](https://github.com/devAhansal/Activite-Pratique-N-6-Architectures-Micro-services/assets/81721069/0586be6f-9e70-41f0-afad-41a6f937367c)
![Application avec tous modules ](https://github.com/devAhansal/Activite-Pratique-N-6-Architectures-Micro-services/assets/81721069/1daebf92-a89b-4d3e-8d25-2612801d0ecb)
![dans le micro service customer-service on cree un entitie Customer avec CustomerRepository pour implement les methode JPA et RestContorller pour consulter costumers](https://github.com/devAhansal/Activite-Pratique-N-6-Architectures-Micro-services/assets/81721069/70b91486-8afd-4792-97b6-f9a3e7e3e263)
![Creation de customers avec CommandLineRunner](https://github.com/devAhansal/Activite-Pratique-N-6-Architectures-Micro-services/assets/81721069/f14ca380-2006-40ec-b6a5-ec92de0777b0)
![permier configuration de costumer-service](https://github.com/devAhansal/Activite-Pratique-N-6-Architectures-Micro-services/assets/81721069/9d658216-729c-4f86-99b3-b7dea74a5839)
![dans le micro service account-service on cree un entitie BankAccount avec BankAccountRepository pour implement les methode JPA et RestContorller pour consulter accountes](https://github.com/devAhansal/Activite-Pratique-N-6-Architectures-Micro-services/assets/81721069/047a3400-93bc-473a-afa5-0dfbe73b49c5)
![permier configuration de account-service](https://github.com/devAhansal/Activite-Pratique-N-6-Architectures-Micro-services/assets/81721069/a5de35c1-6d3c-4e3e-af67-6fb5a7eb6dd7)
![Creation de accounts avec CommandLineRunner](https://github.com/devAhansal/Activite-Pratique-N-6-Architectures-Micro-services/assets/81721069/9a3297e1-b9e7-495d-bab3-3f24c5869071)
![consultaion costumers et accounts](https://github.com/devAhansal/Activite-Pratique-N-6-Architectures-Micro-services/assets/81721069/e350cd43-33b1-4458-b8c4-d7bb816ade38)
![Ajouter le dependency springdoc-openapi-starter-webmvc-ui à account-service pour  documenté RestApi](https://github.com/devAhansal/Activite-Pratique-N-6-Architectures-Micro-services/assets/81721069/7593a357-837b-4aa9-a602-789ac7cc0f3e)
![springdoc inteface avec swagger pour account-service](https://github.com/devAhansal/Activite-Pratique-N-6-Architectures-Micro-services/assets/81721069/ca472c64-eb0d-445f-bd4a-60cbf6db545b)
![aussi Ajouter le dependency springdoc-openapi-starter-webmvc-ui à customer-service ](https://github.com/devAhansal/Activite-Pratique-N-6-Architectures-Micro-services/assets/81721069/af8b38c4-554f-41a1-bee6-5c2d8e05d425)
![springdoc inteface avec swagger pour customer-service](https://github.com/devAhansal/Activite-Pratique-N-6-Architectures-Micro-services/assets/81721069/45ab537d-4556-447a-aceb-04a3c643a684)
![Configuartion static de Spring cloud gateway](https://github.com/devAhansal/Activite-Pratique-N-6-Architectures-Micro-services/assets/81721069/2007d379-ecb6-4514-9e28-56f5d5228818)
![premiere pas pour config routes gateway dynamic est acitivé Discovery Service avec EurekaServer](https://github.com/devAhansal/Activite-Pratique-N-6-Architectures-Micro-services/assets/81721069/ec268b59-2d2b-47c7-a3de-03c402333823)
![Spring Eureka Server](https://github.com/devAhansal/Activite-Pratique-N-6-Architectures-Micro-services/assets/81721069/ce6e4104-5dc9-47a0-b7da-e9577bfcb2e6)
![consuler costumers avec dynamic routes gateway](https://github.com/devAhansal/Activite-Pratique-N-6-Architectures-Micro-services/assets/81721069/09099503-9917-4324-ab98-111d89f5c4ea)
![Active les service de actuator avec touts Endpoints pour Account-service et customer-service](https://github.com/devAhansal/Activite-Pratique-N-6-Architectures-Micro-services/assets/81721069/73f13811-4094-47a8-8264-6cb37eaf4344)
![ecemple actuator beans pour voir le nombre de classes techniques que spring va charge en memoire](https://github.com/devAhansal/Activite-Pratique-N-6-Architectures-Micro-services/assets/81721069/7fbf37b2-2e43-4954-a864-c3469fb9afcd)
![ajouter dependeces openfiegn pour cree une cummincation rest api entre les services](https://github.com/devAhansal/Activite-Pratique-N-6-Architectures-Micro-services/assets/81721069/da922111-78ff-45fe-bfde-2510f6cd709a)
![Activer openfiegn ](https://github.com/devAhansal/Activite-Pratique-N-6-Architectures-Micro-services/assets/81721069/4292c7b7-7d3b-4ac5-8d1f-a6849a921808)
![et voila utilisation de client rest declaratif avec openfiegn pour envoyer requet http à service CUSTOMER-SERVICE](https://github.com/devAhansal/Activite-Pratique-N-6-Architectures-Micro-services/assets/81721069/47e52204-af5b-4f3d-8177-a0ec69164926)
![affichage de account avec le customer ](https://github.com/devAhansal/Activite-Pratique-N-6-Architectures-Micro-services/assets/81721069/74a11570-31c9-4658-b85f-488722d1a8c1)
![Ajouter bibliothèque Resilience4j  pour utilise le modèle Circuit Breaker](https://github.com/devAhansal/Activite-Pratique-N-6-Architectures-Micro-services/assets/81721069/5f273cce-37d4-4f21-8d49-58665ba93d38)
![Utlisation de Circuit Breaker pour Empêche une application de continuer à appeler un service externe ou une fonctionnalité en cas d'échec répété alors on passe un circuit ouvert et de ce cas appel des default method](https://github.com/devAhansal/Activite-Pratique-N-6-Architectures-Micro-services/assets/81721069/a976cfcc-0d1e-4ada-9a43-4a80f7f36e6a)
![Voici exemple de CircuitBreaker en cas CUSTOMER-SERVICE pas active](https://github.com/devAhansal/Activite-Pratique-N-6-Architectures-Micro-services/assets/81721069/3b6f1b7d-96e1-4066-809d-0155c2b759e8)
![Pour creer un config-service on commancer par cree config-repo avec les config propretiers des services et aussi initilzi git et commiti premiere version](https://github.com/devAhansal/Activite-Pratique-N-6-Architectures-Micro-services/assets/81721069/86ceddcc-9699-4cbb-bb28-976f1f0bf3e0)
![activer config service avec ajouter le depot de configuration global](https://github.com/devAhansal/Activite-Pratique-N-6-Architectures-Micro-services/assets/81721069/7ec8e8b6-22e3-4b39-bd2e-724361348489)
![et voila un exemple de confugation de customer-service avec config service](https://github.com/devAhansal/Activite-Pratique-N-6-Architectures-Micro-services/assets/81721069/e24ecec8-ab4f-480d-b311-1d81b3dc2bd3)
![activer customer-service a checher config en config service](https://github.com/devAhansal/Activite-Pratique-N-6-Architectures-Micro-services/assets/81721069/513d6da5-c1d9-4a8d-8b03-cb4b817d9b17)
![Tester si les paramètres de configuration est importé](https://github.com/devAhansal/Activite-Pratique-N-6-Architectures-Micro-services/assets/81721069/fb507217-1dd4-4af5-9853-52ace3ba33eb)
![deuxième façon pour récupérer les paramètres](https://github.com/devAhansal/Activite-Pratique-N-6-Architectures-Micro-services/assets/81721069/6d02c02b-c265-41ba-a0b1-167c2d89bea6)
![Alors pour refresh les paramtere on doit change et commit avec git](https://github.com/devAhansal/Activite-Pratique-N-6-Architectures-Micro-services/assets/81721069/45543373-70bc-412d-8041-b06667f6f121)
![et apres envoyer requet post à actuator refresh ](https://github.com/devAhansal/Activite-Pratique-N-6-Architectures-Micro-services/assets/81721069/4821f4bf-7550-4383-a950-8cc8c052bb12)
![et avec RefrshScope je peut recupere le mise à jour de paramétres ](https://github.com/devAhansal/Activite-Pratique-N-6-Architectures-Micro-services/assets/81721069/e2b96efb-9a23-48f4-a51c-2f5fa46951ce)
![centraliser les paramètres commun entre les services dans config-repo](https://github.com/devAhansal/Activite-Pratique-N-6-Architectures-Micro-services/assets/81721069/0185a79c-a84d-411b-a0e7-b44368cc7ae0)
![utilisé a distance repot from github](https://github.com/devAhansal/Activite-Pratique-N-6-Architectures-Micro-services/assets/81721069/4dc94cf1-3841-4e22-a9a2-9ff818612ef4)
![avant demare Dockerfile on doit lancé maven pour deleting the target directory et recounstruite un nouveau  jar](https://github.com/devAhansal/Activite-Pratique-N-6-Architectures-Micro-services/assets/81721069/e22030d1-e4b2-4f6d-b3e2-997eb68217bd)
![demare le service avec le fechier  jar](https://github.com/devAhansal/Activite-Pratique-N-6-Architectures-Micro-services/assets/81721069/e72cb129-9201-4553-9776-4a5949eb9908)
![construire image à partir dockerfile ](https://github.com/devAhansal/Activite-Pratique-N-6-Architectures-Micro-services/assets/81721069/d9e06bd7-572d-4d19-8b46-bf3bdac81d2f)
![demare conteneur à partir ce image](https://github.com/devAhansal/Activite-Pratique-N-6-Architectures-Micro-services/assets/81721069/d2fe11de-27a1-4d28-9c34-580639fe832b)
![voila le conteneur](https://github.com/devAhansal/Activite-Pratique-N-6-Architectures-Micro-services/assets/81721069/c7189459-33c4-4111-987a-1ccf8772a216)
![manage multi-container Docker applications avec docker-compose yml](https://github.com/devAhansal/Activite-Pratique-N-6-Architectures-Micro-services/assets/81721069/03015edd-3c80-44fd-8c77-4d55bd744888)
![demarre docker compose](https://github.com/devAhansal/Activite-Pratique-N-6-Architectures-Micro-services/assets/81721069/0656e410-e8a4-480a-889a-07ba11239bc3)
![Containers](https://github.com/devAhansal/Activite-Pratique-N-6-Architectures-Micro-services/assets/81721069/3937efc0-fbdf-4674-ab88-4f182928ebbe)



