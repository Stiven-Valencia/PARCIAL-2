////Ejercicio 5: Implementar Pruebas con StepVerifier y si funciona
//package com.example.parcial2.controller;
//
//import com.example.parcial2.Controllers.ProductoController;
//import com.example.parcial2.Producto;
//import org.junit.jupiter.api.Test;
//import org.springframework.boot.test.context.SpringBootTest;
//import reactor.core.publisher.Flux;
//import reactor.test.StepVerifier;
//import org.springframework.beans.factory.annotation.Autowired;
//
//@SpringBootTest
//public class ProductoControllerTest {
//    @Autowired
//    private ProductoController productoController;
//
//    @Test
//    public void testListaProductos() {
//        Flux<Producto> productos = productoController.listarProductos();
//
//        StepVerifier.create(productos)
//                .expectNextMatches(p -> p.getNombre().equals("Laptop"))
//                .expectNextMatches(p -> p.getNombre().equals("Mouse"))
//                .expectNextMatches(p -> p.getNombre().equals("Teclado"))
//                .verifyComplete();
//    }
//}
//