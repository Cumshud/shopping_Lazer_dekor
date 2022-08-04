package com.example.shoppingg.dao.repository;

import com.example.shoppingg.dao.entity.CompaniesEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CompaniesRepository extends CrudRepository<CompaniesEntity,Integer> {
    @Override
    Optional<CompaniesEntity> findById(Integer integer);
}
