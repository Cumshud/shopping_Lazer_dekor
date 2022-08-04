package com.example.shoppingg.controller;

import com.example.shoppingg.dao.entity.ProdustEntity;
import com.example.shoppingg.model.Produst;
import com.example.shoppingg.service.MainService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/main")
public class MainController {

    private MainService mainService;

    public MainController(MainService mainService) {
        this.mainService = mainService;
    }


    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "name") String name, @RequestParam(value = "surname") String surname) {
        System.out.println(name + surname);
        return "Hello " + surname + " " + name + "!";
    }

    @GetMapping("/test")
    public String test() {
        return "Testing";
    }

    @PostMapping("/save")
    public void save(@RequestBody Produst produst) {
        System.out.println(produst);
    }

//    @PutMapping("/edit")
//    public void save(@RequestBody Produst produst){
//        System.out.println(produst);
//    }

    @PatchMapping("/aa")
    public String chance() {
        return "x";
    }

    @DeleteMapping
    public void delete() {
        System.out.println("delete");
    }

    @GetMapping("/get-produst")
    public List<ProdustEntity> getProdust() {

        return mainService.getProdust();
    }

    @GetMapping("/get-produst/{name}")
    public ProdustEntity getProdustByName(@PathVariable String name) {
        System.out.println(name);
        return mainService.getProdustByName(name);
    }

    @GetMapping("/get-produst/{name}/id/{id}")
    public ProdustEntity getProdust(@PathVariable("name") String name,
                                    @PathVariable Integer id) {
       return mainService.getProdustByNameAndId(name, id);
    }
    @PostMapping("/save-produst")
    public String saveProdust(@RequestBody Produst produst){
        System.out.println(produst.getNname());
        mainService.saveProdust(produst);
        return " ";
    }

    @GetMapping("/produst/id/{id}")
    public Produst getProdustByID(@PathVariable Integer id){
        return mainService.getProdustByID(id);
    }
}


