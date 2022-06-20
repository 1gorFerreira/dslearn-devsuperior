package com.devsuperior.dslearnbds.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dslearnbds.entities.User;
import com.devsuperior.dslearnbds.repositories.UserRepository;
import com.devsuperior.dslearnbds.services.exceptions.ForbiddenException;
import com.devsuperior.dslearnbds.services.exceptions.UnauthorizedException;

@Service
public class AuthService {

	@Autowired
	private UserRepository userRepository;
	
	//Verifica quem é o usuário que está autenticado e devolve a entidade dele;
	@Transactional(readOnly = true)
	public User authenticated() {
		try {
			String username = SecurityContextHolder.getContext().getAuthentication().getName();
			return userRepository.findByEmail(username);
		}
		catch(Exception e) {
			throw new UnauthorizedException("Invalid user");	
		}
	}
	
	//Verifica se o id procurado no findById é do próprio usuário ou se ele é admin;
	public void validateSelfOrAdmin(Long userId) {
		User user = authenticated();
		if(!user.getId().equals(userId) && !user.hasAdmin("ROLE_ADMIN")) {
			throw new ForbiddenException("Access denied");
		}
	}
}
