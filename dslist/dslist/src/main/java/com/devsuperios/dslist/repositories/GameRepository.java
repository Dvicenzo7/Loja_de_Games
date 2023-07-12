package com.devsuperios.dslist.repositories;

import com.devsuperios.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
