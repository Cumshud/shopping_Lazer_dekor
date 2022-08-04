package com.example.shoppingg.dao.repository;

import com.example.shoppingg.dao.entity.ProdustDetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdustDetailRepository extends JpaRepository<ProdustDetailEntity, Integer> {

}
