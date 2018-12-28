package com.demo.springbootemployee.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

    Logger logger = LoggerFactory.getLogger(WelcomeRestController.class);



    @GetMapping("/welcome")
    public String index() {
        logger.debug("WelcomeControler");
        return "Hello World!";
    }
}
