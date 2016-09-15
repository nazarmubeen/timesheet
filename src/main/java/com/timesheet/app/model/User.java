package com.timesheet.app.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long user_id;	
	@NotNull
	private String email_id;
	@NotNull
	private String password;
	@NotNull
	private String name;
	
	@NotNull
	private String created_date;
	
	@NotNull
	private String modified_date;

	
	
	public User( String email_id, String password, String name, String created_date2, String modified_date2) {
		super();
	
		this.email_id = email_id;
		this.password = password;
		this.name = name;
		this.created_date = created_date2;
		this.modified_date = modified_date2;
	}
	
	

	public User( String email_id, String password, String name, String modified_date) {
		super();
		this.email_id = email_id;
		this.password = password;
		this.name = name;
		this.modified_date = modified_date;
	}

	public User()
	{
		
	}
	
	 public User(int user_id) { 
		    this.user_id = user_id;
		  }
	 
	  public User(String email_id, String name) {
		    this.email_id = email_id;
		    this.name = name;
		  }


	public long getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCreated_date() {
		return created_date;
	}

	public void setCreated_date(String created_date) {
		this.created_date = created_date;
	}

	public String getModified_date() {
		return modified_date;
	}

	public void setModified_date(String modified_date) {
		this.modified_date = modified_date;
	}
	
	
	

}
