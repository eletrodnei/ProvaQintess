package com.Rodnei_Miranda.model;

import java.util.Date;

public class Operacoes {
	private int cdOperacao;
	private Date dtInicio;
	private Date dtFim;
	private String nmEmpresa;
	private String nmMesa;
	private String nmEstrategia;
	private String nmCentralizador;
	private String nmGestor;
	private String nmSubgestor;
	private String nmSubproduto;
	private String nmCaracteristica;
	private String cdAtivoObjeto;
	private long quantidade;
	private long idPreco;
	
	
	
	public int getCdOperacao() {
		return cdOperacao;
	}



	public void setCdOperacao(int cdOperacao) {
		this.cdOperacao = cdOperacao;
	}






	public Date getDtInicio() {
		return dtInicio;
	}



	public void setDtInicio(Date dtInicio) {
		this.dtInicio = dtInicio;
	}



	public Date getDtFim() {
		return dtFim;
	}



	public void setDtFim(Date dtFim) {
		this.dtFim = dtFim;
	}



	public String getNmEmpresa() {
		return nmEmpresa;
	}



	public void setNmEmpresa(String nmEmpresa) {
		this.nmEmpresa = nmEmpresa;
	}



	public String getNmMesa() {
		return nmMesa;
	}



	public void setNmMesa(String nmMesa) {
		this.nmMesa = nmMesa;
	}



	public String getNmEstrategia() {
		return nmEstrategia;
	}



	public void setNmEstrategia(String nmEstrategia) {
		this.nmEstrategia = nmEstrategia;
	}



	public String getNmCentralizador() {
		return nmCentralizador;
	}



	public void setNmCentralizador(String nmCentralizador) {
		this.nmCentralizador = nmCentralizador;
	}



	public String getNmGestor() {
		return nmGestor;
	}



	public void setNmGestor(String nmGestor) {
		this.nmGestor = nmGestor;
	}



	public String getNmSubgestor() {
		return nmSubgestor;
	}



	public void setNmSubgestor(String nmSubgestor) {
		this.nmSubgestor = nmSubgestor;
	}



	public String getNmSubproduto() {
		return nmSubproduto;
	}



	public void setNmSubproduto(String nmSubproduto) {
		this.nmSubproduto = nmSubproduto;
	}



	public String getNmCaracteristica() {
		return nmCaracteristica;
	}



	public void setNmCaracteristica(String nmCaracteristica) {
		this.nmCaracteristica = nmCaracteristica;
	}



	public String getCdAtivoObjeto() {
		return cdAtivoObjeto;
	}



	public void setCdAtivoObjeto(String cdAtivoObjeto) {
		this.cdAtivoObjeto = cdAtivoObjeto;
	}



	public long getQuantidade() {
		return quantidade;
	}



	public void setQuantidade(long quantidade) {
		this.quantidade = quantidade;
	}



	public long getIdPreco() {
		return idPreco;
	}



	public void setIdPreco(long idPreco) {
		this.idPreco = idPreco;
	}



	@Override
	public String toString() {
		return "Operações [cd_Operacao=" + cdOperacao + ", dt_Inicio=" + dtInicio + ", dt_Fim="
				+ dtFim + ", nm_Empresa=" + nmEmpresa + ", nm_Mesa=" + nmMesa +","
						+ " nm_Estrategia=" + nmEstrategia +", nm_Centralizador=" +nmCentralizador +","
								+ " nm_Gestor=" +nmGestor +" nm_Subgestor=" +nmSubgestor +" nm_Subproduto=" +
						 nmSubproduto +" nm_Caracteristica=" + nmCaracteristica +" cd_Ativo_Objeto=" +
								cdAtivoObjeto +" quantidade=" + quantidade +" id_Preco=" + idPreco +"]";
	}
		

}
