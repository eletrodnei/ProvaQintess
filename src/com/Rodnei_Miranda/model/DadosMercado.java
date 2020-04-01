package com.Rodnei_Miranda.model;


public class DadosMercado {

	private int idPreco;

	private int nuPrazoDiasCorridos;

	private int vlPreco;

	private int other;

	public int getIdPreco() {
		return idPreco;
	}

	public void setIdPreco(int idPreco) {
		this.idPreco = idPreco;
	}

	public int getNuPrazoDiasCorridos() {
		return nuPrazoDiasCorridos;
	}

	public void setNuPrazoDiasCorridos(int nuPrazoDiasCorridos) {
		this.nuPrazoDiasCorridos = nuPrazoDiasCorridos;
	}

	public int getVlPreco() {
		return vlPreco;
	}

	public void setVlPreco(int vlPreco) {
		this.vlPreco = vlPreco;
	}

	public int getOther() {
		return other;
	}

	public void setOther(int other) {
		this.other = other;
	}

	@Override
	public String toString() {
		return "DadosMercado [idPreco=" + idPreco + ", nuPrazoDiasCorridos=" + nuPrazoDiasCorridos + ", vlPreco="
				+ vlPreco + ", other=" + other + "]";
	}
	
	
	

}
