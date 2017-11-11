package com.chillax.dto;

import java.util.Date;

public class Logging {

	private Integer l_id;

	private String l_name;

	private String l_class;
	private Integer l_user_id;
	private Date create_time;
	private Date update_time;

	public Integer getL_id() {
		return l_id;
	}

	public void setL_id(Integer l_id) {
		this.l_id = l_id;
	}

	public String getL_name() {
		return l_name;
	}

	public void setL_name(String l_name) {
		this.l_name = l_name;
	}

	public String getL_class() {
		return l_class;
	}

	public void setL_class(String l_class) {
		this.l_class = l_class;
	}

	public Integer getL_user_id() {
		return l_user_id;
	}

	public void setL_user_id(Integer l_user_id) {
		this.l_user_id = l_user_id;
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