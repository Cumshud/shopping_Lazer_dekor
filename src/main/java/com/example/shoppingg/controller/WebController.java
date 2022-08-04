package com.example.shoppingg.controller;

import com.example.shoppingg.service.MainService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/shopping")
public class WebController {
    MainService mainService;

    public WebController(MainService mainService) {
        this.mainService = mainService;
    }

    @GetMapping("/home")
    public String home(Model model){
//        List<ProdustEntity> produsEntities=mainService.getProdust();
//        model.addAttribute("produsts", produsEntities);
        return "home";
    }
    @GetMapping("/index")
    public String index(){

        return "index";
    }
    @GetMapping("/bloggrid")
    public String bloggrid(){

        return "bloggrid";
    }
//    @GetMapping("/about")
//    public String about(){
//
//        return "about";
//    }
    @GetMapping("/contact")
    public String contact(){

        return "contact";
    }
    @GetMapping("/prr")
    public String project(){

        return "project";
    }
    @GetMapping("/security")
    public String security(){

        return "security";
    }

    @GetMapping("/home/produst-details")
    public String homeProdustDetail(Model model){

        var ProdustDetail=mainService.getProdustDetails();
        model.addAttribute("produstDetails", ProdustDetail);
        return "produst-details";
    }

}
