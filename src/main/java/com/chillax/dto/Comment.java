package com.chillax.dto;

import java.util.Date;

public class Comment {


	
	private Integer c_id;
	private String accountNum;
	private Integer c_author_id;
	private String content;
	private Date create_time;
	private Date update_time;
	public Integer getC_id() {
		return c_id;
	}
	public void setC_id(Integer c_id) {
		this.c_id = c_id;
	}
	public String getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	public Integer getC_author_id() {
		return c_author_id;
	}
	public void setC_author_id(Integer c_author_id) {
		this.c_author_id = c_author_id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public Date getUpdate_time() {
		return update_time;
	}
	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
	}
	
	
	
}
