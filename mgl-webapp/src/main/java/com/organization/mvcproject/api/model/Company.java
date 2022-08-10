package com.organization.mvcproject.api.model;

import java.util.List;

import com.organization.mvcproject.model.GameImpl;

public interface Company {

	void setId(Long id);
	
	String getName();
	
	void setName(String name);
	
	List<GameImpl> getGamesMade();
	
	void setGamesMade(List<GameImpl> gamesMade);
	
	Long getId();
}
