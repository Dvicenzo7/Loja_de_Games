package com.devsuperios.dslist.controllers;

import com.devsuperios.dslist.dto.GameDTO;
import com.devsuperios.dslist.dto.GameMinDTO;
import com.devsuperios.dslist.entities.Game;
import com.devsuperios.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games") //TODO para colocar na url
public class GameController {

    @Autowired
    GameService gameService;

    @GetMapping
    public List<GameMinDTO> findAll(){
        List<GameMinDTO> result = gameService.findall();
        return result;
    }

    @GetMapping(value = "/{id}")
    public GameDTO findByid(@PathVariable Long id){
        GameDTO result = gameService.findByid(id);
        return result;
    }
}
