package br.com.db1.controller;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class AlfredoController {

	private String nome;
	private Integer idade;
	private UF uf = UF.RS;
	
	public UF[]getListaUf(){
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
