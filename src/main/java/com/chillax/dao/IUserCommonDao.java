package com.chillax.dao;  
  

import java.util.List;  
import java.util.Map;  

import com.chillax.dto.User;
import com.chillax.dto.UserCommon;  

public interface IUserCommonDao {  
    
  public UserCommon queryByPrimaryKey(Integer id);  
  
  public UserCommon queryByAccountAndPassword(String acount_num,String passowrd);  
    
  public void insertUser(UserCommon user);  
  
  
  public List<UserCommon> queryUserByBatch(Map<String,Object> params);  

    
    
  public void updateByPrimaryKey(UserCommon user);  

  
    
}  