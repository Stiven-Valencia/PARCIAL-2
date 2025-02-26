package com.example.parcial2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//Ejercicio 3: Implementar Internacionalización (i18n)
@ComponentScan(basePackages = {
		"com.example.parcial2",       // Escanea el paquete raíz
		"com.example.parcial2.Controllers", // Escanea el paquete de controladores
		"configuracion"               // Escanea el paquete de configuración
})
public class Parcial2Application {

	public static void main(String[] args) {
		SpringApplication.run(Parcial2Application.class, args);
	}

}
