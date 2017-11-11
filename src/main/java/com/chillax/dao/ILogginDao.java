package com.chillax.dao;

import java.util.List;

import com.chillax.dto.Logging;
import com.chillax.dto.User;

public interface ILogginDao {

	
	public void insertLoggin(Logging loggin);
	
	public List<Logging> getAllLogging();  
}
