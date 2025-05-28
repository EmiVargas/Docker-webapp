package com.example.dockerwebapp.controller;

import com.example.dockerwebapp.model.User;
import com.example.dockerwebapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserRepository usuarioRepository;

    @GetMapping("/")
    public String homePage(Model model) {
        List<User> usuarios = usuarioRepository.findAll();
        model.addAttribute("usuarios", usuarios);
        model.addAttribute("dbHost", "mysql-server"); // Para mostrar en la página
        model.addAttribute("dbName", "webapp_db"); // Para mostrar en la página
        return "index"; // Nombre de la plantilla Thymeleaf (index.html)
    }
}