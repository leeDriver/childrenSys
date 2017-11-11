package com.chillax.dao;

import java.util.List;

import com.chillax.dto.Comment;

public interface ICommentDao {

	
	public void insertComment(Comment loggin);
	
	public List<Comment> getCurrentByUserComment(Integer c_id);  
}
