package com.devsuperios.dslist.services;

import com.devsuperios.dslist.dto.GameDTO;
import com.devsuperios.dslist.dto.GameMinDTO;
import com.devsuperios.dslist.entities.Game;
import com.devsuperios.dslist.projections.GameMinProjection;
import com.devsuperios.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    @Autowired
    GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameMinDTO> findall(){
      List<Game> result =   gameRepository.findAll();
     return result.stream().map(x -> new GameMinDTO(x)).toList();
    }

    @Transactional(readOnly = true)
    public GameDTO findByid(Long id){
        Game result = gameRepository.findById(null).get();
        GameDTO dto = new GameDTO(result);
        return dto;
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO>  findByList(Long listId){
        List<GameMinProjection> result = gameRepository.searchByList(listId);
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }
}
