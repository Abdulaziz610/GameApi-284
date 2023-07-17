package com.gameApi.gameapi;


import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@RestController
@RequestMapping(path = "/api/v1/player")
public class PlayerController {

    CopyOnWriteArrayList<Player> listOfPlayers = new CopyOnWriteArrayList<>();
    @PostMapping
    public Player creatPlayer(@RequestBody Player incomingPlayer){
      //  Player newPlayer = new Player();
        listOfPlayers.add(incomingPlayer);
        return incomingPlayer;
    }

    @GetMapping
    public List<Player> getAllPLayers(){
        return listOfPlayers;
    }

    @GetMapping(path = "/{id}")
    public Player getSpecificPlayer(@PathVariable String id){
        return new Player();

    }
}
