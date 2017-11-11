package com.chillax.service;

import java.util.List;  

import com.chillax.dto.User;
import com.chillax.dto.UserCommon;  
  
public interface IUserCommonService {  
      
    public UserCommon getUserById(int userId);
    
    public UserCommon login(String name,String pwd);  
    
    public void registered(UserCommon userCommon);  

}  