package com.merdes.equipe.code;

	class classeAtleta extends classeEquipe{
		private float altura;
		private float peso;
		private int vitorias;
		private int titulos;
		//private Veiculos veiculo; // Composição com a classe Veiculo
		
		//Construtor
		public classeAtleta(int id, String nome, int idade, String nacionalidade, float salario, float altura,float peso, int vitorias, int titulos) {
			super(id, nome, idade, nacionalidade, salario);
			this.altura = altura;
			this.peso = peso;
			this.vitorias = vitorias;
			this.titulos = titulos;
			
		}

		public float getAltura() {
			return altura;
		}

		public void setAltura(float altura) {
			this.altura = altura;
		}

		public float getPeso() {
			return peso;
		}

		public void setPeso(float peso) {
			this.peso = peso;
		}

		public int getVitorias() {
			return vitorias;
		}

		public void setVitorias(int vitorias) {
			this.vitorias = vitorias;
		}

		public int getTitulos() {
			return titulos;
		}

		public void setTitulos(int titulos) {
			this.titulos = titulos;
		}


	}