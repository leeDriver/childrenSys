package com.chillax.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.chillax.dto.Relation;


public interface IRelationDao {

	
	public void insertComment(Relation relation);
	
	public void deleteByPrimaryKey(Integer rl_id);  
	
	public List<Relation> getUSerRelavtion(@Param("c_id")Integer c_id ,@Param("rl_type")String type);  
	
	public List<Relation> getCurrentByUserComment(Map paramMap);  
}
