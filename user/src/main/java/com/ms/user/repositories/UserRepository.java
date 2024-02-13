package com.ms.user.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ms.user.models.UserModel;

public interface UserRepository extends JpaRepository<UserModel, Long> {

	//Optional<UserModel> findById(Long id);
}
