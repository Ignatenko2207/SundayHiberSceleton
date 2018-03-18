package org.itstep.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table( name = "accounts" )
public class Account {

	@Id
	@Column( name="login", length=100)
	private String login;
	
	@Column( name="password", length=50, nullable=false)
	private String password;
	
	@Column( name="first_name", length=100, nullable=false)
	private String firsName;
	
	@Column( name="second_name", length=100)
	private String secondName;
	
	public Account() {
	}

	public Account(String login, String password, String firsName, String secondName) {
		this.login = login;
		this.password = password;
		this.firsName = firsName;
		this.secondName = secondName;
	}
	
	
}
