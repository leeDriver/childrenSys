package com.chillax.dao;

import java.util.List;

import com.chillax.dto.Resource;

public interface IResourceDao {
	
	public void insertResouce(Resource res);
	
	public Resource getRecource(Integer id);
	
	
	public List<Resource> getHotList();
	
	public List<Resource> getSelectByUser(Integer u_id);

}
