package com.gameApi.gameapi;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CopyOnWriteArrayList;

@RestController
@RequestMapping(path = "/api/v1/player")
public class PlayerController {

    CopyOnWriteArrayList<Player> listOfPlayers = new CopyOnWriteArrayList<>();
    @PostMapping
    public Player creatPlayer(Player incomingPlayer){
      //  Player newPlayer = new Player();
        listOfPlayers.add(incomingPlayer);
        return incomingPlayer;
    }
}
