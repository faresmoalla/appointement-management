package com.bezkoder.springjwt.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RendezVous implements Serializable {
	
	
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
 
	private Long idRendezVous;
	
	
	@Temporal(TemporalType.DATE)
	private Date dateRendezVous;
	
	private String nom;
	private String prenom;
	private String tel;
	private String email;
	
	@ManyToOne
	@JsonIgnore
    private User user;
	

	


//@Temporal(TemporalType.DATE)
//private String DateNaissance;


		

}
