package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {
	
	private int cargaHoraria;
	
	public Curso() {
	}
	
	@Override
	public double calcularXp() {
		return XP_PADRAO * cargaHoraria;
	}
	
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	
	public void setCargaHoraria(int cargoHoraria) {
		this.cargaHoraria = cargoHoraria;
	}

	@Override
	public String toString() {
		return "Curso [titulo= " + getTitulo() + 
				", descricao= " + getDescricao() + 
				", cargoHoraria= " 
				+ cargaHoraria 
				+ "]";
	}


	
}
