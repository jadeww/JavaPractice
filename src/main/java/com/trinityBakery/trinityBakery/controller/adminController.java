package com.trinityBakery.trinityBakery.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/admin")
public class adminController {

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String finishedProducLibrary() {
        return "Admin";
    }



}