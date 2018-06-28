package com.louisrong.dto;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import lombok.Data;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class UserinfoResponse implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3636259616174003948L;

	
	@XmlElement(name = "userinfoDtos",nillable = true)
	private List<UserinfoDto> userinfoDtos;
	
	public UserinfoResponse() {
		
	} 
	
}
