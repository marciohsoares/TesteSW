package com.junit.avaliacao;

public class Alunos {
	
	private String nome;
	private Double n1,n2,n3,n4;
	
	
	public Alunos(Double n1,Double n2,Double n3,Double n4) {
		super();
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
		this.n4 = n4;
	}
	
	public Double getNotas(){
		return (getN1()+getN2()+getN3()+getN4())/4;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getN1() {
		return n1;
	}
	public void setN1(Double n1) {
		this.n1 = n1;
	}
	public Double getN2() {
		return n2;
	}
	public void setN2(Double n2) {
		this.n2 = n2;
	}
	public Double getN3() {
		return n3;
	}
	public void setN3(Double n3) {
		this.n3 = n3;
	}
	public Double getN4() {
		return n4;
	}
	public void setN4(Double n4) {
		this.n4 = n4;
	}

	
	
}
