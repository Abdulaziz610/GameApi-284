package com.gameApi.gameapi;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/player")
public class Player {
    @PostMapping
    public String yetAnotherMessage(){
        return "     ";
    }

}
