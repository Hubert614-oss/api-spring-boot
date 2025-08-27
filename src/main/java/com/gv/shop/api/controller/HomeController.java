package com.gv.shop.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

@RestController
public class HomeController {

    @Operation(summary = "Page d'accueil", description = "Vérifie que l'API fonctionne")
    @ApiResponse(responseCode = "200", description = "Succès")
    @GetMapping("/")
    public String home() {
        return "\uD83D\uDE80 API is running!";
    }

    @Operation(summary = "Hello World", description = "Test simple")
    @ApiResponse(responseCode = "200", description = "Succès")
    @GetMapping("/hello")
    public String hello() {
        return "Hello World from spring boot!";
    }
}
