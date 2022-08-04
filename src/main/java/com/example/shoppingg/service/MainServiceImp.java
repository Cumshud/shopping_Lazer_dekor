package com.example.shoppingg.service;

import com.example.shoppingg.dao.entity.ProdustDetailEntity;
import com.example.shoppingg.dao.entity.ProdustEntity;
import com.example.shoppingg.dao.repository.ProdustDetailRepository;
import com.example.shoppingg.dao.repository.ProdustRepository;
import com.example.shoppingg.mapping.ProdustMapper;
import com.example.shoppingg.model.Produst;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MainServiceImp implements MainService {

    private ProdustRepository produstRepository;

    private ProdustDetailRepository produstDetailRepository;

    public MainServiceImp(ProdustRepository produstRepository, ProdustDetailRepository produstDetailRepository) {
        this.produstRepository = produstRepository;
        this.produstDetailRepository = produstDetailRepository;
    }

    @Override
    public List<ProdustEntity> getProdust() {
//        List<Produst> produsts = new ArrayList<>();
//        Produst produst1 = new Produst("watch", 100.00, 2);
//        Produst produst2 = new Produst("appwatch", 200.00, 1);
//        produsts.add(produst1);
//        produsts.add(produst2);
        List<ProdustEntity> produsts = (List<ProdustEntity>) produstRepository.findAll();

        return produsts;
    }

    @Override
    public Produst getProdustByID(int id) {
       ProdustEntity produstEntity =
               produstRepository.findById(id).orElse(new ProdustEntity());
        return ProdustMapper.INSTANCE.entityToDto(produstEntity);
    }

    @Override
    public void saveProdust(Produst produst) {

    }

    @Override
    public void editProdust(Produst produst, int id) {

    }

    @Override
    public void deleteProdust(int id) {

    }

    @Override
    public ProdustEntity getProdustByNameAndId(String name, Integer id) {
        Optional<ProdustEntity> optionalProdustEntity =produstRepository.selectByNamejpql(name, id);
        if(!optionalProdustEntity.isPresent()){
            throw new RuntimeException();
        } return optionalProdustEntity.get();
    }

    @Override
    public List<ProdustDetailEntity> getProdustDetails() {
        return produstDetailRepository.findAll();
    }


    @Override
    public ProdustEntity getProdustByName(String name) {
        Optional<ProdustEntity> produstEntity = produstRepository.findByName(name);
        if (!produstEntity.isPresent()) {
            throw new RuntimeException();
        } else {
            return produstEntity.get();
        }


    }
}
