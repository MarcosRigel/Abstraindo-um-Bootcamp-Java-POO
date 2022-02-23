package br.com.dio.desafio.dominio;

public class Curso {
	
	private String titulo;
	private String descricao;
	private int cargaHoraria;
	
	public Curso() {
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	
	public void setCargaHoraria(int cargoHoraria) {
		this.cargaHoraria = cargoHoraria;
	}

	@Override
	public String toString() {
		return "Curso [titulo= " + titulo + 
				", descricao= " + descricao + 
				", cargoHoraria= " 
				+ cargaHoraria 
				+ "]";
	}
	
	
}
