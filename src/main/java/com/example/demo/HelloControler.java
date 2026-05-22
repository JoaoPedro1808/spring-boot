package com.example.demo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadora")
public class HelloControler {

    @GetMapping("/hello")
    public String hello() {
        return "Hello Word!!";
    }

    @GetMapping(value = "/somar/{valor1}/{valor2}", produces = MediaType.TEXT_PLAIN_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public double somar(@PathVariable double valor1, @PathVariable double valor2) {
        return valor1 + valor2;
    }

    @GetMapping("/substracao/{valor1}/{valor2}")
    public double substracao(@PathVariable double valor1, @PathVariable double valor2) {
        return valor1 - valor2;
    }

    @GetMapping("/multiplicacao/{valor1}/{valor2}")
    public double multiplicacao(@PathVariable double valor1, @PathVariable double valor2) {
        return valor1 * valor2;
    }

    @GetMapping("/divisao/{valor1}/{valor2}")
    public double divisao(@PathVariable double valor1, @PathVariable double valor2) {
        return valor1 / valor2;
    }
}
