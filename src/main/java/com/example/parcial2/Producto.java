//Ejercicio 2: Crear un CRUD Básico de Productos
//Ejercicio 4: Crear un Endpoint Reactivo con WebFlux
package com.example.parcial2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Producto {
    private String id;
    private String nombre;
    private double precio;
}
