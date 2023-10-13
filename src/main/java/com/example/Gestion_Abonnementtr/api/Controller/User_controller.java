package com.example.Gestion_Abonnementtr.api.Controller;

import com.example.Gestion_Abonnementtr.Service.User_service;
import com.example.Gestion_Abonnementtr.api.Model.Utilisateurr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="api/v1/Gestion_Abonnement")
public class User_controller {
    private final User_service user_service;

    @Autowired
    public User_controller(User_service userService) {
        this.user_service = userService;
    }
    @GetMapping
    public List<Utilisateurr> getUser(){
        return user_service.getUser();
    }
    @PostMapping
    public void RegisterNewUtilisateur(@RequestBody Utilisateurr utilisateurr){
        user_service.addNewUtilisateur(utilisateurr);
    }
}
