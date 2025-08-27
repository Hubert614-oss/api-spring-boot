# 🚀 API Backend - Spring Boot + PostgreSQL + Docker

Ce projet est une API backend développée avec **Java Spring Boot**, utilisant **PostgreSQL** comme base de données et déployée avec **Docker Compose**.

---

## 📌 Fonctionnalités
- Gestion des utilisateurs (CRUD)
- Authentification JWT
- Connexion avec une base PostgreSQL
- Conteneurisation avec Docker

---

## 🛠️ Technologies utilisées
- [Spring Boot](https://spring.io/projects/spring-boot)  
- [PostgreSQL](https://www.postgresql.org/)  
- [Docker](https://www.docker.com/)  
- [Maven](https://maven.apache.org/)  

---

## ⚙️ Installation et exécution

### 1️⃣ Cloner le projet
```bash
git clone https://github.com/ton-compte/ton-repo.git
cd ton-repo

## Lancer avec Docker
- docker-compose up --build

➡️ L’API sera disponible sur : http://localhost:8080
➡️ La base PostgreSQL sera accessible sur : localhost:5432


## Structure du projet

📦 backend-api
 ┣ 📂 src
 ┃ ┣ 📂 main
 ┃ ┃ ┣ 📂 java/com/example/demo
 ┃ ┃ ┃ ┣ 📂 controller
 ┃ ┃ ┃ ┣ 📂 model
 ┃ ┃ ┃ ┣ 📂 repository
 ┃ ┃ ┃ ┣ 📂 service
 ┃ ┃ ┣ 📂 resources
 ┃ ┃ ┃ ┣ application.yml
 ┣ 📜 docker-compose.yml
 ┣ 📜 Dockerfile
 ┣ 📜 pom.xml
 ┗ 📜 README.md


🧪 Tests

Lancer les tests avec :

- mvn test

🤝 Contribution

## Les contributions sont les bienvenues !

##Forker le projet

- Créer une branche (git checkout -b feature/ma-fonctionnalite)
- Commit (git commit -m "Ajout d'une nouvelle fonctionnalité")
- Push (git push origin feature/ma-fonctionnalite)
- Créer une Pull Request