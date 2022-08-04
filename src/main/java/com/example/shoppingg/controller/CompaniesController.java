package com.example.shoppingg.controller;

import com.example.shoppingg.service.CompaniesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(name = "/shopping")
public class CompaniesController {
    private CompaniesService companiesService;

    public CompaniesController(CompaniesService companiesService) {
        this.companiesService = companiesService;
    }
    @GetMapping("/bloggrid")
    public String title(Model model){
        model.addAttribute("blog",companiesService.getCompaniesParametr());
        return "bloggrid";
    }
}
