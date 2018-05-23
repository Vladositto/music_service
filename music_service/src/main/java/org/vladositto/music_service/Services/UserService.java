package org.vladositto.music_service.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.vladositto.music_service.Domain.User;
import org.vladositto.music_service.Repository.UserRepository;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class UserService {
	@Autowired
	UserRepository userRepository;

	public void add(final User user) {
		userRepository.createUser(user);
	}

	public boolean isLoginUsed(final String login) {
		return userRepository.findByLogin(login) != null;
	}

	public boolean login(final String login, final String password) {
		User user = userRepository.findByLogin(login);
		return user != null && user.getPassword() != null && user.getPassword().equals(password);

	}

	public boolean isAdmin(final String login) {
				User user = userRepository.findByLogin(login);
				return user.isAdmin();

	}
}
