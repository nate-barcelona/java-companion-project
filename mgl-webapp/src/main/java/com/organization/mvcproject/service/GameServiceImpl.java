package com.organization.mvcproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.organization.mvcproject.api.dao.MockGameDAO;
import com.organization.mvcproject.api.model.Game;
import com.organization.mvcproject.api.service.GameService;
import com.organization.mvcproject.dao.MockGameDAOLoopsImpl;


@Service
public class GameServiceImpl implements GameService {

	@Autowired
	private MockGameDAOLoopsImpl mockGameDAO; 

	@Override
	public List<Game> retrieveAllGames() {
		return mockGameDAO.retrieveAllGames();
	}

	@Override
	public Game saveGame(Game game) {
		return mockGameDAO.saveGame(game);
	}
	
	@Override
	public Game findGameById(Long id) {
		return mockGameDAO.findGameById(id);
	}

	@Override
	public boolean deleteGame(Long id) {
		return mockGameDAO.deleteGame(id); 
	}

	@Override
	public List<Game> findGamesByGenre(String genre) {
		return mockGameDAO.findGamesByGenre(genre);
	}
}
	