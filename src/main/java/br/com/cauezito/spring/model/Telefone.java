package br.com.cauezito.spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity	
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Telefone {
	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String tipo;
	private String numero;
	
	@ManyToOne(optional = false)
	private Usuario usuario;
}
