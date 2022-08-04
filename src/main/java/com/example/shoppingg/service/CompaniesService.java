package com.example.shoppingg.service;

import com.example.shoppingg.dao.repository.CompaniesRepository;
import com.example.shoppingg.mapping.CompaniesMapper;
import com.example.shoppingg.model.CompaniesDto;
import org.springframework.stereotype.Service;

@Service
public class CompaniesService {
    private CompaniesRepository companiesRepository;

    public CompaniesService(CompaniesRepository companiesRepository) {
        this.companiesRepository = companiesRepository;
    }

    public CompaniesDto getCompaniesParametr(){
        return CompaniesMapper.INSTANCE.companiesToDto(companiesRepository.findById(1).get());
    }
}
