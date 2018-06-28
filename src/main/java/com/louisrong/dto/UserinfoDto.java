package com.louisrong.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import com.louisrongentity.Userinformation;

import lombok.Data;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class UserinfoDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7745555787800642440L;

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
	
	public UserinfoDto(Userinformation entity) {
		
		this.id =  entity.getId();
		this.avatarUrl = entity.getAvatarUrl();
		this.company = entity.getCompany();
		this.firstName = entity.getFirstName();
		this.lastName = entity.getLastName();
		this.login = entity.getLogin();
		this.password = entity.getPassword();
		this.twitter = entity.getTwitter();

	}	
}
