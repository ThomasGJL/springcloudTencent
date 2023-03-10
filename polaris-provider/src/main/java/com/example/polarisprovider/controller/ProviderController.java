package com.example.polarisprovider.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/home")
@RestController
@Slf4j
public class ProviderController {

    @GetMapping("/index")
    public String index() {

        log.info("home page");

        return "success";
    }

}
