# Utiliser une image OpenJDK légère comme base
FROM openjdk:17-jdk-slim

# Créer un volume pour les fichiers temporaires
VOLUME /tmp

# Copier le fichier JAR généré dans le conteneur
COPY ./target/Social_Serice-0.0.1-SNAPSHOT.jar /app/social-service.jar

# Définir la commande d'entrée pour exécuter l'application
ENTRYPOINT ["java", "-jar", "/app/social-service.jar"]
