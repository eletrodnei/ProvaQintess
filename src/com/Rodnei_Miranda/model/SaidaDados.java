package com.Rodnei_Miranda.model;

public class SaidaDados {

	private double resultado;

	private String nmSubproduto;

	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}

	public String getNmSubproduto() {
		return nmSubproduto;
	}

	public void setNmSubproduto(String nmSubproduto) {
		this.nmSubproduto = nmSubproduto;
	}

	@Override
	public String toString() {
		return "SaidaDados [resultado=" + resultado + ", nmSubproduto=" + nmSubproduto + "]";
	}

}
