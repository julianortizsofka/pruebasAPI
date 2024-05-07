# Pruebas API

**Fecha Inicio** : Q2 2024

**Participantes**:


Analista de automatización: Julian Alejandro Ortiz Medina - <julian.ortiz@sofka.com.co>



****

# Integración de casos prueba de la automatización en Azure

## Introducción
Se presenta un prueba de automatización de pruebas de API, por medio de Karate Framework, a la aplicación demoblaze.com

## Enfoque de integración
La automatización se centra en 4 escenarios
- Creación de un usuario nuevo 
- Intento de creación de un usuario ya registrado 
- Inicio de sesión con un usuario y contraseña correctas
- Inicio de sesión con un usuario y contraseña incorrectas

## Herramientas y tecnologías

| Herramienta/Tecnología | Descripción                                                                                           | Versión Utilizada |
|------------------------|-------------------------------------------------------------------------------------------------------|-------------------|
| Java                   | Lenguaje de programación para escribir los scripts de prueba debe ser mayor a Java 11.                | 17                |
| Karate Framework       | Framework de código abierto para pruebas automatizadas en Java, para prueba de API.                   | 1.4.1             | 
| Gradle                 | Herramienta de automatización de construcción, utilizada para compilar, probar y desplegar el código. | 8.7               |
| IntelliJ IDEA          | Entorno de desarrollo integrado (IDE) para el desarrollo de software.                                 | Última versión    |

## PASOS PARA LA EJECUCIÓN


### Comando para ejecutar TODOS los escenarios uno por uno
#### gradle test

También puede ejecutarse individualmente con cada escenario con el runner correspondiente

