package com.example.shoppingg.dao.repository;

import com.example.shoppingg.dao.entity.Ucerr;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
    @Repository
    public interface UserRepository extends JpaRepository<Ucerr,Long> {
        Optional<Ucerr> findByEmailAndPassword(String email, String password);
        Optional<Ucerr>findByEmail(String email);
    }

