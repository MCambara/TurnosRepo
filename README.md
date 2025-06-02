# TurnosRepo

TurnosRepo es una librería Java para la gestión de turnos y registro de logs, diseñada para integrarse como dependencia en un proyecto principal. Utiliza Spring Data JPA para operaciones CRUD en bases de datos relacionales y Spring Data MongoDB para el almacenamiento de logs.

---

## Características

- **Gestión de Turnos:**  
  CRUD completo sobre la entidad `TurnoModel` con JPA y Hibernate.

- **Registro de Logs:**  
  Almacenamiento y consulta de logs en MongoDB usando `LogModel`.

- **Servicios desacoplados:**  
  Servicios y repositorios listos para inyección mediante Spring.

- **Estructuras personalizadas:**  
  Conversión a estructuras enlazadas propias (`ListaEnlazada`, `Opcion`) para uso interno.

---

## Tecnologías usadas

- Java 17  
- Spring Boot 3.2.5  
- Spring Data JPA (Jakarta Persistence API)  
- Spring Data MongoDB  
- MongoDB  
- MySQL u otra base de datos relacional compatible con JPA

---

## Instalación

Agrega la siguiente dependencia en el archivo `pom.xml` de tu proyecto principal:

```xml
<dependency>
    <groupId>umg.edu.gt.prograIII</groupId>
    <artifactId>TurnosRepo</artifactId>
    <version>1.6-SNAPSHOT</version>
</dependency>
