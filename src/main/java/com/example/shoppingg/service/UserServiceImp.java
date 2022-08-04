package com.example.shoppingg.service;

import com.example.shoppingg.dao.entity.Role;
import com.example.shoppingg.dao.entity.Ucerr;
import com.example.shoppingg.dao.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImp implements UserService{

    private UserRepository userRepository;

    public UserServiceImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Ucerr save(Ucerr ucerr) {
        Ucerr newUcerr =new Ucerr(ucerr.getFirstName(), ucerr.getLastName(), ucerr.getEmail(), ucerr.getPassword(),
                List.of(new Role("UCER")));
        return userRepository.save(newUcerr);
    }

    public Optional<Ucerr> login(String email, String password){
        Optional<Ucerr> ucer=userRepository.findByEmailAndPassword(email,password);
        return ucer;
    }
}

