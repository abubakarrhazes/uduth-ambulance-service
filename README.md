Ambulance Provider Service - Usmanu Danfodio University Teaching Hospital, Sokoto
Overview

This project is a backend service designed to manage an ambulance provider system for Usmanu Danfodio University Teaching Hospital (UDUTH). The system allows users to create accounts, sign in, request ambulances, and manage other essential operations related to ambulance services.
Features

    User Registration: Users can create an account with their details.
    User Authentication: Users can sign in securely using their credentials.
    Request Ambulance: Users can request an ambulance service in case of an emergency.
    Ambulance Management: Admins can manage ambulance availability, assign drivers, and track ambulances.
    User Profiles: Users can view and update their personal details.

Technology Stack

    Backend: Java Spring Boot
    Database: PostgreSQL
    Authentication: Spring Security
    Build Tool: Maven
    Deployment: Render

Installation
Prerequisites

    Java 11+
    Maven
    PostgreSQL

Steps to Install

    Clone the repository:

    bash

git clone https://github.com/abubakarrhazes/uduth-ambulance-service
cd uduth-ambulance-service

Configure the application properties:

Edit the src/main/resources/application.properties file with your database and other configuration details.

Build the project:

bash

mvn clean install

Run the application:

bash

mvn spring-boot:run

The service will be available at http://localhost:8080.
