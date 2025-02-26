// Ejercicio 2: Crear un CRUD Básico de Productos
//package com.example.parcial2;
//
//import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//@Service
//@RestController
//public class ProductoService {
//    private final Map<String, Producto> productos = new HashMap<>();
//
//    public List<Producto> listarProductos() {
//        return new ArrayList<>(productos.values());
//    }
//
//    public Producto obtenerProducto(String id) {
//        return productos.get(id);
//    }
//
//    public Producto agregarProducto(Producto producto) {
//        productos.put(producto.getId(), producto);
//        return producto;
//    }
//
//    public Producto actualizarProducto(String id, Producto producto) {
//        productos.put(id, producto);
//        return producto;
//    }
//
//    public void eliminarProducto(String id) {
//        productos.remove(id);
//    }
//}