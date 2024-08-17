package com.merdes.equipe.code;
// Essa deve declarar tudo oque pede , não herdara da classe pai 
public class classeCircuito {
	private int id;
	private String nome;
	private String pais;
	private int record;
	
	// Método construtor
	public classeCircuito(int id, String nome, String pais, int record) {
		super();
		this.id = id;
		this.nome = nome;
		this.pais = pais;
		this.record = record;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public int getRecord() {
		return record;
	}

	public void setRecord(int record) {
		this.record = record;
	}
	
	
	
	
	

}
