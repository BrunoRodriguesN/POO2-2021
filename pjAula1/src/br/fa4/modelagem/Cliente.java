package br.fa4.modelagem;

/**
 * 
 * Modelagem conceitul de uma classe
 * @author Razak
 *
 */

public class Cliente {
	//Atributos
	private int ra;
	private String nome;
	private float valorMensalidade;
	
	//Métodos
	
	public Cliente(int ra, String nome, float valorMensalidade) {
		super();
		this.ra = ra;
		this.nome = nome;
		this.valorMensalidade = valorMensalidade;
	}
	
	
	public int getRa() {
		return ra;
	}
	
	public void setRa(int ra) {
		this.ra = ra;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getValorMensalidade() {
		return valorMensalidade;
	}
	public void setValorMensalidade(float valorMensalidade) {
		this.valorMensalidade = valorMensalidade;
	}
	
	
	
	
	

}
