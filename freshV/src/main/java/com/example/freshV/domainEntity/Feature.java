package com.example.freshV.domainEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Feature {
  private Long id;
  private String tittle;
  private String description;
  private String status;
  
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
public Long getId() {
	return id;
}

public String getTittle() {
	return tittle;
}
public void setId(Long id) {
	this.id = id;
}

public void setTittle(String tittle) {
	this.tittle = tittle;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
}
