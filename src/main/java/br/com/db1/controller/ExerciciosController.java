package br.com.db1.controller;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class ExerciciosController {

	private Double primeiroNumero;
	private Double segundoNumero;
	private Double resposta;
	private String palavra;
	private String respostaText;
	private String numero;
	private Double respostaFormatado;

	public Double getRespostaFormatado() {
		return respostaFormatado;
	}

	public void setRespostaFormatado(Double respostaFormatado) {
		this.respostaFormatado = respostaFormatado;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getRespostaText() {
		return respostaText;
	}

	public void setRespostaText(String respostaText) {
		this.respostaText = respostaText;
	}

	public String getPalavra() {
		return palavra;
	}

	public void setPalavra(String palavra) {
		this.palavra = palavra;
	}

	public Double getPrimeiroNumero() {
		return primeiroNumero;
	}

	public void setPrimeiroNumero(Double primeiroNumero) {
		this.primeiroNumero = primeiroNumero;
	}

	public Double getSegundoNumero() {
		return segundoNumero;
	}

	public void setSegundoNumero(Double segundoNumero) {
		this.segundoNumero = segundoNumero;
	}

	public Double getResposta() {
		return resposta;
	}

	public void setResposta(Double resposta) {
		this.resposta = resposta;
	}

	public void exibirSoma() {
		getPrimeiroNumero();
		resposta = (primeiroNumero + segundoNumero);
		setResposta(resposta);
	}

	public void exibirSubtracao() {
		resposta = (primeiroNumero - segundoNumero);
		setResposta(resposta);
	}

	public void exibirMultiplicacao() {
		resposta = (primeiroNumero * segundoNumero);
		setResposta(resposta);
	}

	public void exibirDivisao() {
		resposta = (primeiroNumero / segundoNumero);
		setResposta(resposta);
	}

	public void exibirMaiscula() {
		setRespostaText(palavra.toUpperCase());
	}

	public void exibirMinuscula() {
		setRespostaText(palavra.toLowerCase());
	}

	public void exibirFormatado() {
		resposta = Double.parseDouble(numero);
		setRespostaFormatado(resposta);
	}
}
