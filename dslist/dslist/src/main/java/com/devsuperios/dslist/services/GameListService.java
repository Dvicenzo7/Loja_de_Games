package com.devsuperios.dslist.services;

import com.devsuperios.dslist.dto.GameListDTO;
import com.devsuperios.dslist.dto.GameMinDTO;
import com.devsuperios.dslist.entities.Game;
import com.devsuperios.dslist.entities.GameList;
import com.devsuperios.dslist.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findall(){
        List<GameList> result =   gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();
    }
}
