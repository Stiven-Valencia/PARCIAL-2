//Ejercicio 3: Implementar Internacionalización (i18n)
package com.example.parcial2.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;
import java.lang.String;

@RestController
@RequestMapping("/api")
public class SaludoController {

    @Autowired
    private MessageSource messageSource;

    @GetMapping("/saludo")

    public String obtenerSaludo( Locale locale) {
        return messageSource.getMessage("saludo", null, locale);
    }
}
//Ejercicio 1: Crear un Endpoint Simple

//package com.example.parcial2.Controllers;
//
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/api")
//public class SaludoController {
//
//    @GetMapping("/saludo")
//    public String obtenerSaludo() {
//        return "¡Hola, API RESTful!";
//    }
//}