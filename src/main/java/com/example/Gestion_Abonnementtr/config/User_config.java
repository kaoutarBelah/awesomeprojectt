package com.example.Gestion_Abonnementtr.config;

import com.example.Gestion_Abonnementtr.Repository.User_repository;
import com.example.Gestion_Abonnementtr.api.Model.Utilisateurr;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

import static java.lang.Boolean.FALSE;

@Configuration
public class User_config {
    @Bean
    CommandLineRunner commandLineRunner(User_repository repository){
        return args ->{
            Utilisateurr user1=new Utilisateurr("user1","prenom1","user1@gmail.com","123",FALSE);
            Utilisateurr user2=new Utilisateurr("user2","prenom2","user2@gmail.com","123",FALSE);
            Utilisateurr user3=new Utilisateurr("user3","prenom3","user3@gmail.com","123",FALSE);
            Utilisateurr user4=new Utilisateurr("user4","prenom4","user5@gmail.com","123",FALSE);
            repository.saveAll(
                    List.of(user1,user2,user3,user4)
            );
        };
    }

}
