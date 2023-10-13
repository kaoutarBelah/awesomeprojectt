package com.example.Gestion_Abonnementtr.Service;

import com.example.Gestion_Abonnementtr.Repository.User_repository;
import com.example.Gestion_Abonnementtr.api.Model.Utilisateurr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class User_service {

    private User_repository user_repository;

    @Autowired
    public User_service(User_repository user_repository){
        this.user_repository = user_repository;
    }

    public List<Utilisateurr> getUser() {
        return user_repository.findAll();
    }

    public void addNewUtilisateur(Utilisateurr utilisateurr) {
        Optional<Utilisateurr> userOptional = user_repository.findByEmail(utilisateurr.getEmail());

        if (userOptional.isPresent()) {
            throw new IllegalStateException("Email is already taken.");
        }

        if (!utilisateurr.isAdmin()) {
            throw new IllegalStateException("Only admin users can register.");
        }

        user_repository.save(utilisateurr);
    }
}
