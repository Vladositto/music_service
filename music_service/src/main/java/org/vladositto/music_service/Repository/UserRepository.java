package org.vladositto.music_service.Repository;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import org.vladositto.music_service.Domain.User;

@Repository
public class UserRepository {
	@PersistenceContext
	private EntityManager entityManager;

    public void createUser(User user) {
    	entityManager.persist(user);
    	entityManager.flush();
    }

	public User findByLogin(String login) {
		//return entityManager.find(User.class, login);
		Query query = entityManager.createQuery("SELECT s FROM User s where s.login =:login");
		query.setParameter("login", login);
		try {
		return (User) query.getSingleResult();}
		catch(NoResultException e) {
			return null;
		}

	}

}
