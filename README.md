# Instrument-Management
Mechanical instrument management application with Spring Boot, GraphQL, and PostgreSQL

L'architecture est basée sur le modèle suivant :

Controller : Les points d'entrée pour les requêtes GraphQL.
Service : La logique métier et les règles spécifiques à l'application.
Repository : La couche d'accès aux données (interagit avec la base PostgreSQL).
Models/Entities : Les objets de domaine mappés aux tables de la base de données.
GraphQL : Fichiers .graphqls pour définir les schémas et types GraphQL.

controller/ : Contient les points d'entrée pour les requêtes GraphQL.

InstrumentController.java : Gère les requêtes pour les instruments.
CategoryController.java : Gère les catégories d'instruments.
model/ : Contient les entités qui représentent les tables de la base de données.

Instrument.java : Classe représentant un instrument.
Category.java : Classe représentant une catégorie.
MaintenanceRecord.java : Classe représentant un enregistrement de maintenance.
repository/ : Interfaces pour l'accès aux données (couche repository).

InstrumentRepository.java : Interface pour gérer les opérations CRUD pour les instruments.
CategoryRepository.java : Interface pour les catégories.
MaintenanceRecordRepository.java : Interface pour les enregistrements de maintenance.
service/ : Couche métier où la logique de gestion est implémentée.

InstrumentService.java : Logique métier pour les instruments.
CategoryService.java : Logique métier pour les catégories.
MaintenanceService.java : Logique métier pour les enregistrements de maintenance.
graphql/ : Contient les résolveurs de requêtes et de mutations pour GraphQL.

InstrumentDataFetcher.java : Gère la récupération des données pour les instruments.
MutationResolver.java : Définit les mutations (ajout, mise à jour, suppression).
QueryResolver.java : Définit les requêtes pour récupérer les données.
config/ : Fichiers de configuration pour GraphQL.

GraphQLConfig.java : Configure GraphQL et enregistre les résolveurs.
resources/graphql/schema.graphqls : Fichier de schéma GraphQL définissant les types, les requêtes, et les mutations.

application.properties : Fichier de configuration de l'application, avec les paramètres de la base de données PostgreSQL.

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
