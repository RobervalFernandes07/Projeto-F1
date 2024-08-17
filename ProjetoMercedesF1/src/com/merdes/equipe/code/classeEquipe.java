package com.merdes.equipe.code;
// Classe Pai

 class classeEquipe {
	 private int id;
	 private String nome;
	 private int idade;
	 private String nacionalidade;
	 private float salario;
	 
	 public classeEquipe(int id , String nome , int idade , String nacionalidade , float salario) {
	 this.id = id;
	 this.nome = nome;
	 this.idade = idade;
	 this.nacionalidade = nacionalidade;
	 this.salario = salario;
	 
	 // Getters e Setters
	 
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
	
		public int getIdade() {
			return idade;
		}
	
		public void setIdade(int idade) {
			this.idade = idade;
		}
	
		public String getNacionalidade() {
			return nacionalidade;
		}
	
		public void setNacionalidade(String nacionalidade) {
			this.nacionalidade = nacionalidade;
		}
	
		public float getSalario() {
			return salario;
		}
	
		public void setSalario(float salario) {
			this.salario = salario;
			
		}
 }