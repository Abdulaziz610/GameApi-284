package com.gameApi.gameapi.Controllers;


import com.gameApi.gameapi.Models.Player;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@RestController
@RequestMapping(path = "/api/v1/player")
@CrossOrigin("*")
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
        Player existingPlayer = listOfPlayers.stream().filter(
                (currPlayer) -> {
                    return currPlayer.id.equals(id);
                }
        ).findFirst().get();
        return existingPlayer;
    }

    @PutMapping(path = "/{id}")
        public Player updateSpecificPlayer(@PathVariable String id, @RequestBody Player incomingPlayer){
        Player existingPlayer = getSpecificPlayer(id);
        existingPlayer.name = incomingPlayer.name;
        return existingPlayer;
    }
    @DeleteMapping(path = "/{id}")
    public Player removePlayer(@PathVariable String id){
        Player existingPlayer = getSpecificPlayer(id);
        listOfPlayers.remove(existingPlayer);
        return existingPlayer;
    }
}
