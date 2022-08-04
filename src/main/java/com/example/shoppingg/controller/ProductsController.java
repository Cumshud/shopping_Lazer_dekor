package com.example.shoppingg.controller;

import com.example.shoppingg.service.ProductsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductsController {
    private ProductsService productsService;

    public ProductsController(ProductsService productsService) {
        this.productsService = productsService;
    }

    @GetMapping("/shopping/project")
    public String bayramdekor(Model model){
        model.addAttribute("bayramdekoru", productsService.getByBayramdekorlari());
        model.addAttribute("meisetdekoru", productsService.getByMeisetdekorlari());
        return "project";
    }
//    @GetMapping("/shopping/projectt")
//    public String meisetdekor(Model model){
//        model.addAttribute("meisetdekoru", productsService.getByMeisetdekorlari());
//        return "project";
//    }

}
