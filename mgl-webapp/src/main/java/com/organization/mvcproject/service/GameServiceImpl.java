package com.organization.mvcproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.organization.mvcproject.model.Game;
import com.organization.mvcproject.repository.MockGameDAO;

@Service
public class GameServiceImpl implements GameService {

	/**
	 * TODO 2.0 The class that interacts with persistent data is called a Data Access Object(DAO)
	 *  or a Repository class. The private static list is mocking our persistance of games.
	 *   
	 *  Move this list, and methods operating on this list to an appropriately named package and class.
	 */
	@Autowired
	private MockGameDAO gameDao;


	@Override
	public List<Game> retrieveAllGames() {
		return gameDao.retrieveAllGames();
	}

	@Override
	public Game saveGame(Game game) {
		return gameDao.saveGame(game);
	}
	
	@Override
	public Game updateGame(Game game) {
		return gameDao.updateGame(game);
	}
	@Override
	public boolean deleteGame(Long id) {
		return false;
	}


}