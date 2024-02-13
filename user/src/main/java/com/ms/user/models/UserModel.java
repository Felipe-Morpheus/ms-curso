package com.ms.user.models;

import java.io.Serializable;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table( name = "TB_USERS")
public class UserModel implements Serializable {
	private static final long serialVersionUID = 1L;
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long useId;
	private String name;
	private String email;
	
	public UserModel () {
		
	}
	
	public UserModel(Long useId, String name, String email) {
		super();
		this.useId = useId;
		this.name = name;
		this.email = email;
	}

	public Long getUseId() {
		return useId;
	}

	public void setUseId(Long useId) {
		this.useId = useId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
}
