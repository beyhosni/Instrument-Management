# Instrument-Management
Mechanical instrument management application with Spring Boot, GraphQL, and PostgreSQL

L'architecture est basée sur le modèle suivant :

Controller : Les points d'entrée pour les requêtes GraphQL.
Service : La logique métier et les règles spécifiques à l'application.
Repository : La couche d'accès aux données (interagit avec la base PostgreSQL).
Models/Entities : Les objets de domaine mappés aux tables de la base de données.
GraphQL : Fichiers .graphqls pour définir les schémas et types GraphQL.

instrument-management-app/
├── src/
│   ├── main/
│   │   ├── java/com/example/instrumentmanagement/
│   │   │   ├── controller/
│   │   │   │   ├── InstrumentController.java
│   │   │   │   ├── CategoryController.java
│   │   │   ├── model/
│   │   │   │   ├── Instrument.java
│   │   │   │   ├── Category.java
│   │   │   │   ├── MaintenanceRecord.java
│   │   │   ├── repository/
│   │   │   │   ├── InstrumentRepository.java
│   │   │   │   ├── CategoryRepository.java
│   │   │   │   ├── MaintenanceRecordRepository.java
│   │   │   ├── service/
│   │   │   │   ├── InstrumentService.java
│   │   │   │   ├── CategoryService.java
│   │   │   │   ├── MaintenanceService.java
│   │   │   ├── graphql/
│   │   │   │   ├── InstrumentDataFetcher.java
│   │   │   │   ├── MutationResolver.java
│   │   │   │   ├── QueryResolver.java
│   │   │   ├── config/
│   │   │   │   ├── GraphQLConfig.java
│   │   │   └── InstrumentManagementApplication.java
│   │   └── resources/
│   │       ├── graphql/
│   │       │   ├── schema.graphqls
│   │       ├── application.properties
│   └── test/
│       └── java/com/example/instrumentmanagement/
│           └── service/
│               ├── InstrumentServiceTest.java
│               ├── CategoryServiceTest.java
│               ├── MaintenanceServiceTest.java
└── pom.xml
