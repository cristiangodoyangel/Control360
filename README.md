
# Control360 - Módulo Inventario

Sistema de gestión de inventario para la plataforma **Control360**, desarrollado en **Java 17** con **Spring Boot**, **Spring Data JPA**, **Eureka Client** y conexión a **SQL Server**.

## Tecnologías usadas

- Java 17
- Spring Boot 3.1.8
- Spring Data JPA
- Spring Cloud Netflix Eureka Client
- Hibernate + HikariCP
- SQL Server
- Maven
- IntelliJ IDEA

## Estructura del proyecto

```
control-inventario/
├── controllers/
├── models/
├── repositories/
├── resources/
│   └── application.properties
└── ControlInventarioApplication.java
```

## Configuración del archivo `application.properties`

```properties
spring.application.name=control-inventario
spring.datasource.url=jdbc:sqlserver://localhost:1433;databaseName=control360;encrypt=true;trustServerCertificate=true
spring.datasource.username=******
spring.datasource.password=********

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.SQLServerDialect
```

> Asegúrate de tener corriendo tu base de datos SQL Server y el servidor Eureka en el puerto 8761.

## Endpoints disponibles

| Método | Endpoint                         | Descripción            |
|--------|----------------------------------|------------------------|
| GET    | `/api/proveedores`              | Listar proveedores     |
| POST   | `/api/proveedores`              | Crear nuevo proveedor  |

## Ejecución

```bash
mvn spring-boot:run
```

www.cristiangodoyangel.dev
