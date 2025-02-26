//Ejercicio 4: Crear un Endpoint Reactivo con WebFlux
package com.example.parcial2.Controllers;

import com.example.parcial2.Producto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {

    @GetMapping
    public Flux<Producto> listarProductos() {
        return Flux.just(
                new Producto("1", "Laptop", 1200.0),
                new Producto("2", "Mouse", 25.0),
                new Producto("3", "Teclado", 45.0)
        );
    }
}

//Ejercicio 2: Crear un CRUD Básico de Productos

//package com.example.parcial2.Controllers;
//
//import com.example.parcial2.Producto;
//import com.example.parcial2.ProductoService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//@RestController
//@RequestMapping("/api/productos")
//public class ProductoController {
//
//    @Autowired
//    private ProductoService productoService;
//
//    @GetMapping
//    public List<Producto> listarProductos() {
//        return productoService.listarProductos();
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<Producto> obtenerProducto(@PathVariable String id) {
//        Producto producto = productoService.obtenerProducto(id);
//        return (producto != null) ? ResponseEntity.ok(producto) : ResponseEntity.notFound().build();
//    }
//
//    @PostMapping
//    public Producto agregarProducto(@RequestBody Producto producto) {
//        return productoService.agregarProducto(producto);
//    }
//
//
//    @PutMapping("/{id}")
//    public ResponseEntity<Producto> actualizarProducto(@PathVariable String id, @RequestBody Producto producto) {
//        return ResponseEntity.ok(productoService.actualizarProducto(id, producto));
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> eliminarProducto(@PathVariable String id) {
//        productoService.eliminarProducto(id);
//        return ResponseEntity.noContent().build();
//    }
//}