# Projeto Fórmula 1

Este projeto simula uma equipe de Fórmula 1, utilizando conceitos de programação orientada a objetos. O código inclui classes para atletas, circuitos, equipes, mecânicos e veículos, permitindo a representação de uma equipe completa de corrida.

## Estrutura do Projeto

A estrutura do projeto é organizada da seguinte forma:

/src └── /com └── /merdes └── /equipe └── /code ├── classeAtleta.java ├── classeCircuito.java ├── classeEquipe.java ├── classeMecanico.java ├── classePrincipal.java └── classeVeiculo.java


## Classes

### `classeAtleta`
Representa um atleta da equipe. Herda da classe `classeEquipe` e possui atributos como:
- **altura**: Altura do atleta.
- **peso**: Peso do atleta.
- **vitorias**: Número de vitórias.
- **titulos**: Número de títulos.

### `classeCircuito`
Representa um circuito de corrida. Possui atributos:
- **id**: Identificador do circuito.
- **nome**: Nome do circuito.
- **pais**: País onde está localizado.
- **record**: Recorde do circuito.

### `classeEquipe`
Classe base que contém informações gerais sobre a equipe, incluindo:
- **id**: Identificador da equipe.
- **nome**: Nome da equipe.
- **idade**: Idade do atleta.
- **nacionalidade**: Nacionalidade do atleta.
- **salario**: Salário do atleta.

### `classeMecanico`
Representa um mecânico da equipe. Herda da classe `classeEquipe` e possui:
- **especialidade**: Especialidade do mecânico.
- **anosExperiencia**: Anos de experiência do mecânico.

### `classePrincipal`
Classe principal que contém o método `main`, onde a execução do programa começa.

### `classeVeiculo`
Representa um veículo da equipe, com atributos:
- **id**: Identificador do veículo.
- **numero**: Número do carro.
- **modelo**: Modelo do veículo.

## Como Rodar o Projeto

1. **Clone o repositório**:
   ```bash
   git clone https://github.com/seu-usuario/seu-repositorio.git

2. Compile os arquivos Java: Navegue até o diretório do projeto e compile:
   javac src/com/merdes/equipe/code/*.java
   
3.Execute o projeto: Execute a classe principal:
   java com.merdes.equipe.code.classePrincipal

