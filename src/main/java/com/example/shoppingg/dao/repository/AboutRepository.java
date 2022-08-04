package com.example.shoppingg.dao.repository;

import com.example.shoppingg.dao.entity.AboutEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface AboutRepository extends CrudRepository<AboutEntity,Integer> {
    @Override
    Optional<AboutEntity> findById(Integer integer);
}
