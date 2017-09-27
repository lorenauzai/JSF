package br.com.db1.controller;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class AlfredoController {

	private String nome;
	private Integer idade;
	private UF uf = UF.RS;
	private Double exercicio6;
	private Double exercicio6Formatado;

	public void formatar() {
		exercicio6Formatado = exercicio6;
	}

	public Double getExercicio6() {
		return exercicio6;
	}

	public void setExercicio6(Double exercicio6) {
		this.exercicio6 = exercicio6;
	}

	public Double getExercicio6Formatado() {
		return exercicio6Formatado;
	}

	public void setExercicio6Formatado(Double exercicio6Formatado) {
		this.exercicio6Formatado = exercicio6Formatado;
	}

	public UF[] getListaUf() {
		return uf.values();
	}

	public UF getUf() {
		return uf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public void exibirDadosAlfredo() {
		setNome("Alfredo Frederico Pereira da Silva Junior");
		setIdade(199);
	}

}
