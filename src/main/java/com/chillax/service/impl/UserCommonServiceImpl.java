package com.chillax.service.impl;


import java.util.List;  
 
import javax.annotation.Resource;  
 
import org.springframework.stereotype.Service;

import com.chillax.dao.IUserCommonDao;
import com.chillax.dao.IUserDao;  
import com.chillax.dto.User;
import com.chillax.dto.UserCommon;
import com.chillax.service.IUserCommonService; 
 
@Service("userCommonService")  
public class UserCommonServiceImpl implements IUserCommonService {  
   @Resource  
   private IUserCommonDao userDao;

	@Override
	public UserCommon getUserById(int userId) {
		
		return userDao.queryByPrimaryKey(userId);
	}
	
	@Override
	public UserCommon login(String name, String pwd) {
		
		return userDao.queryByAccountAndPassword(name, pwd);
	}

	@Override
	public void registered(UserCommon userCommon) {
		
		userDao.insertUser(userCommon);;
	}  
     
}  