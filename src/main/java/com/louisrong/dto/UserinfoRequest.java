package com.louisrong.dto;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import lombok.Data;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class UserinfoRequest {

	
	@XmlElement(name = "id")
	private String id;

	@XmlElement(name = "avatarUrl")
	private String avatarUrl;

	@XmlElement(name = "company")
	private String company;

	@XmlElement(name = "firstName")
	private String firstName;

	@XmlElement(name = "lastName")
	private String lastName;

	@XmlElement(name = "login")
	private String login;

	@XmlElement(name = "password")
	private String password;

	@XmlElement(name = "twitter")
	private String twitter;
	
	public UserinfoRequest() {
		
	} 
	
}
