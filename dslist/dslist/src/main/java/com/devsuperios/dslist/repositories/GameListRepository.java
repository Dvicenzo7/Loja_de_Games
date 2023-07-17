package com.devsuperios.dslist.repositories;

import com.devsuperios.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {


}
