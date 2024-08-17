package com.merdes.equipe.code;
	
	public class classeMecanico extends classeEquipe{
		private String especialidade;
		private int anosExperiencia;
		
		public classeMecanico(int id, String nome, int idade, String nacionalidade, float salario, String especialidade,int anosExperiencia) {
			super(id, nome, idade, nacionalidade, salario);
			this.anosExperiencia;
			this.especialidade;
			// TODO Auto-generated constructor stub
		}

		public String getEspecialidade() {
			return especialidade;
		}

		public void setEspecialidade(String especialidade) {
			this.especialidade = especialidade;
		}

		public int getAnosExperiencia() {
			return anosExperiencia;
		}

		public void setAnosExperiencia(int anosExperiencia) {
			this.anosExperiencia = anosExperiencia;
		}
		 
		 

		 
	}
		 
		