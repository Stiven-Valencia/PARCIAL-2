# API RESTful con Spring Boot

## 📌 Requisitos

- Java 17+
- Spring Boot 3+
- Maven o Gradle
- Postman o navegador para probar los endpoints

## 🚀 Instalación y Ejecución

1. **Clonar el repositorio**
   ```bash
   git clone <URL_DEL_REPOSITORIO>
   cd <NOMBRE_DEL_PROYECTO>
   ```

2. **Compilar el proyecto**
   ```bash
   mvn clean install
   ```
   o si usas Gradle:
   ```bash
   gradle build
   ```

3. **Ejecutar la aplicación**
   ```bash
   mvn spring-boot:run
   ```
   o con Gradle:
   ```bash
   gradle bootRun
   ```

4. **Probar los endpoints**
   - Verificar si la API está corriendo: [http://localhost:8080](http://localhost:8080)
   - Endpoints disponibles:
     - **GET** `/api/saludo` → Devuelve `"¡Hola, API RESTful!"`
     - **POST** `/api/productos` → Agregar un producto
     - **GET** `/api/productos` → Listar todos los productos
     - **GET** `/api/productos/{id}` → Obtener un producto por ID
     - **PUT** `/api/productos/{id}` → Actualizar un producto
     - **DELETE** `/api/productos/{id}` → Eliminar un producto
     
## 🌍 Internacionalización
Para obtener el saludo en diferentes idiomas, añade `?lang=es` o `?lang=en` en la URL.

Ejemplo:
```bash
curl -H "Accept-Language: en" http://localhost:8080/api/saludo
```

## 🔬 Pruebas
Para ejecutar las pruebas con JUnit y StepVerifier:
```bash
mvn test
```

## 📂 Estructura del Proyecto
```
/src/main/java/com/tuempresa/api
  ├── controllers
  │   ├── SaludoController.java
  │   ├── ProductoController.java
  ├── models
  │   ├── Producto.java
  ├── services
  │   ├── ProductoService.java
  ├── Application.java
```


¡Listo! nuestra API ya está corriendo exitosamente. 
