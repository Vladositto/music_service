package org.vladositto.music_service.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

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
		return entityManager.find(User.class, login);

	}

}
