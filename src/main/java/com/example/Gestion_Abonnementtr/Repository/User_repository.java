package com.example.Gestion_Abonnementtr.Repository;

import com.example.Gestion_Abonnementtr.api.Model.Utilisateurr;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface User_repository extends JpaRepository<Utilisateurr, Integer> {
    Optional<Utilisateurr> findByEmail(String email);
}
