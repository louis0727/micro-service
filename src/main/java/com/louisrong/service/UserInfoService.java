package com.louisrong.service;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.louisrongentity.Userinformation;


@ApplicationScoped
public class UserInfoService {
	
	private static Logger logger = LoggerFactory.getLogger(UserInfoService.class);
	
	
	@Inject
	private EntityManager em;
	
	UserInfoService(){}
	
	@Transactional(value=TxType.REQUIRED)
	public List<Userinformation> findAll(){
		TypedQuery<Userinformation> tq = em.createQuery("SELECT ui FROM Userinformation ui", Userinformation.class);
		return tq.getResultList();
	

	}
}
