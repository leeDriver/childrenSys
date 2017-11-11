package com.chillax.dto;

import java.util.Date;

public class Relation {
	

	
	private Integer rl_id;
	private Integer oprater_id;
	private String recevice;
	private String rl_type;
	private Date create_time;
	private Date update_time;
	public Integer getRl_id() {
		return rl_id;
	}
	public void setRl_id(Integer rl_id) {
		this.rl_id = rl_id;
	}
	public Integer getOprater_id() {
		return oprater_id;
	}
	public void setOprater_id(Integer oprater_id) {
		this.oprater_id = oprater_id;
	}
	public String getRecevice() {
		return recevice;
	}
	public void setRecevice(String recevice) {
		this.recevice = recevice;
	}
	public String getRl_type() {
		return rl_type;
	}
	public void setRl_type(String rl_type) {
		this.rl_type = rl_type;
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
