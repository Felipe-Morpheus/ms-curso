package com.ms.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.user.models.UserModel;
import com.ms.user.producers.UserProducer;
import com.ms.user.repositories.UserRepository;

import jakarta.transaction.Transactional;

@Service
public class UserService {

	// Injeção de Dependência
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	UserProducer userProducer;

	// MéTODOS
	@Transactional
	public UserModel save(UserModel userModel) {
		
		userModel = userRepository.save(userModel);
		userProducer.publishMessageEmail(userModel);
		
		return userModel;
	}

	public List<UserModel> getAllUsers() {
		return userRepository.findAll();
	}

}
