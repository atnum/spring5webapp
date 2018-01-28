package com.anup.controller;

import com.anup.domain.Apple;
import com.anup.repositories.AppleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppleController {

    @Autowired
    private AppleRepository appleRepository;

    @RequestMapping("/apple")
    public Iterable<Apple> getApple(){
        return appleRepository.findAll();
    }
}
