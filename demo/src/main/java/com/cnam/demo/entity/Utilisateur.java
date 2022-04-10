package com.cnam.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Utilisateur {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private Integer id;
	
	private String nom;
	
	private String prenom;
	
	private String email;
	
	
	
	
	
	

}
