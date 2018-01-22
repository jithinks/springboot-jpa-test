package com.jks.startup.springbootjpatest.controller;

import com.jks.startup.springbootjpatest.jpa.MagazineRepo;
import com.jks.startup.springbootjpatest.model.Magazine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/magazine")
public class MagazineController {

    @Autowired
    MagazineRepo magazineRepo;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(){
        return "success..";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Magazine> list(){
        return magazineRepo.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Magazine findOne(@PathVariable Long id){
        return magazineRepo.findOne(id);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Magazine save(@RequestBody Magazine magazine){
        return magazineRepo.saveAndFlush(magazine);
    }

}
