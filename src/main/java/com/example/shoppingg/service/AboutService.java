package com.example.shoppingg.service;

import com.example.shoppingg.dao.repository.AboutRepository;
import com.example.shoppingg.mapping.AboutMapper;
import com.example.shoppingg.model.AboutDto;
import org.springframework.stereotype.Service;

@Service
public class AboutService {
    private AboutRepository aboutRepository;

    public AboutService(AboutRepository aboutRepository) {
        this.aboutRepository = aboutRepository;
    }

    public AboutDto getAboutParametr(){
        return AboutMapper.INSTANCE.aboutToDto(aboutRepository.findById(1).get());
    }
}
