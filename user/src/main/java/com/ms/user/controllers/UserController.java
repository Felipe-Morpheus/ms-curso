package com.ms.user.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ms.user.dtos.UserRecordDto;
import com.ms.user.models.UserModel;
import com.ms.user.service.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/users")
public class UserController {

	// Injeção de Dependência
	@Autowired
	UserService userService;

	// Método POST para salvar um usuário
	@PostMapping
	public ResponseEntity<UserModel> saveUser(@RequestBody @Valid UserRecordDto userRecordDto) {
		var userModel = new UserModel();
		BeanUtils.copyProperties(userRecordDto, userModel); // Conversão de DTO para model
		return ResponseEntity.status(HttpStatus.CREATED).body(userService.save(userModel));
	}

	// Método GET para recuperar todos os usuários
	@GetMapping
	public ResponseEntity<List<UserModel>> getAllUsers() {
		List<UserModel> users = userService.getAllUsers();
		return ResponseEntity.ok(users);
	}

}