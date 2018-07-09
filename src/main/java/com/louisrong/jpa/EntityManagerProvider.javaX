package com.louisrong.jpa;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@ApplicationScoped
public class EntityManagerProvider {

	@PersistenceContext(unitName = "basic")
	private EntityManager em;

	@Produces
	@RequestScoped
	public EntityManager getEntityManager() {
		return em;
	}
}

