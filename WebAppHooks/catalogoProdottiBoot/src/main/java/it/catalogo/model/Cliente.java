package it.catalogo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cliente {

	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "cognome")
	private String cognome;
	
	@Column(name = "storicospesa")
	private Integer storicospesa;	//numero di soldi mai spesi sul sito

	
	
	public Cliente() {
		super();
	}



	public Cliente(Integer id, String nome, String cognome, Integer storicospesa) {
		super();
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.storicospesa = storicospesa;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getCognome() {
		return cognome;
	}



	public void setCognome(String cognome) {
		this.cognome = cognome;
	}



	public Integer getStoricospesa() {
		return storicospesa;
	}



	public void setStoricospesa(Integer storicospesa) {
		this.storicospesa = storicospesa;
	}


	
	
	
}
