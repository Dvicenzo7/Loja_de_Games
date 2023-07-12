package com.devsuperios.dslist.controllers;

import com.devsuperios.dslist.dto.GameMinDTO;
import com.devsuperios.dslist.entities.Game;
import com.devsuperios.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
}
