package com.example.shoppingg.service;

import com.example.shoppingg.dao.entity.Ucerr;
import com.example.shoppingg.dao.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmailChecking {
    @Autowired
    private UserRepository userRepository;

    public Optional<Ucerr> checkEmail(Ucerr ucerr){
        Optional<Ucerr> user1 =userRepository.findByEmail(ucerr.getEmail());
        return user1;
    }
}