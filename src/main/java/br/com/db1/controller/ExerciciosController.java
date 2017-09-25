package br.com.db1.controller;

public class ExerciciosController {

	private Double primeiroNumero;
	private Double segundoNumero;
	private Double resposta;
	
	public ExerciciosController() { //set errado?????Resolver
		setPrimeiroNumero(10d);
		setSegundoNumero(20d);
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
}
