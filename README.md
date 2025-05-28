# Aplicación Web Dockerizada con Spring Boot y MySQL

Esta es una aplicación web simple desarrollada con Java Spring Boot que se conecta a una base de datos MySQL para mostrar una lista de usuarios. Todo el entorno está contenerizado usando Docker y orquestado con Docker Compose.

---

## Tecnologías Utilizadas

*   Java 21
*   Spring Boot
    *   Spring Web
    *   Spring Data JPA
    *   Thymeleaf
    * Lombok
*   MySQL 8.0
*   Docker
*   Docker Compose
*   Maven

---
## Prerrequisitos

*   Docker
*   Docker Compose
*   (Opcional) Un cliente SQL como MySQL Workbench para interactuar directamente con la base de datos.

---
## Cómo funciona

1.  **Clonar el Repositorio:**
    ```bash
    git clone https://github.com/EmiVargas/Docker-webapp.git
    ```

2. **Levantar los Servicios con Docker Compose:**
    Desde la raíz del proyecto (donde se encuentra el archivo `docker-compose.yml`), ejecutar:
    
```bash
    docker-compose up -d --build
```

3. **Acceder a la Aplicación:**
    Abrir el navegador en:
    [http://localhost:8090](http://localhost:8090)

4. **Acceder a la Base de Datos (Opcional):**
    Puedes conectarte a la base de datos MySQL usando un cliente SQL con los siguientes parámetros:
    *   **Host:** `localhost`
    *   **Puerto:** `3306`
    *   **Usuario:** `root`
    *   **Contraseña:** `pass_local` 

## Estructura del Proyecto (Puntos Clave)

*   `src/`: Código fuente de la aplicación Spring Boot.
*   `pom.xml`: Archivo de configuración de Maven para el proyecto Java.
*   `Dockerfile`: Define cómo construir la imagen Docker para la aplicación Spring Boot.
*   `docker-compose.yml`: Define y orquesta los servicios de la aplicación (app Java y MySQL).

---
