package com.example.shoppingg.dao.repository;

import com.example.shoppingg.dao.entity.ProdustEntity;
import com.example.shoppingg.model.Produst;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProdustRepository extends CrudRepository<ProdustEntity, Integer> {
    Optional<ProdustEntity> findByName(String name);
    @Query(value="select * from produst where name=? and id=?", nativeQuery = true)
    Optional<ProdustEntity> selectByName(String name, Integer id);

    @Query(value="select p from ProdustEntity p where p.name=:name and p.id=:id", nativeQuery = false)
    Optional<ProdustEntity> selectByNamejpql(String name, Integer id);

}
