import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setTitulo("curso java");
		curso1.setDescricao("descricao curso java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("curso js");
		curso2.setDescricao("descricao curso js");
		curso2.setCargaHoraria(4);
		
		Conteudo conteudo = new Curso();
		Conteudo conteudo1 = new Mentoria();
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("mentoria de java");
		mentoria.setDescricao("descri��o mentoria java");
		mentoria.setData(LocalDate.now());
		
//		System.out.println(curso1);
//		System.out.println(curso2);
//		System.out.println(mentoria);
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descri��o Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devRigel = new Dev();
		devRigel.setNome("Marcos Rigel");
		devRigel.inscreverBootcamp(bootcamp);
		System.out.println("Conte�dos Inscritos Rigel:" + devRigel.getConteudoInscritos());
		devRigel.progredir();
		devRigel.progredir();
		System.out.println("-");
		System.out.println("Conte�dos Inscritos Rigel:" + devRigel.getConteudoInscritos());
		System.out.println("Conte�dos Conclu�dos Rigel:" + devRigel.getConteudosConcluidos());
		System.out.println("XP:" + devRigel.calcularTotalXp());
		
		System.out.println("-----------------");
		
		Dev devJoao = new Dev();
		devJoao.setNome("Joao");
		devJoao.inscreverBootcamp(bootcamp);
		System.out.println("Conte�dos Inscritos Jo�o" + devJoao.getConteudoInscritos());
		devJoao.progredir();
		devJoao.progredir();
		devJoao.progredir();
		System.out.println("-");
		System.out.println("Conte�dos Inscritos Jo�o" + devJoao.getConteudoInscritos());
		System.out.println("Conte�dos Conclu�dos Jo�o:" + devJoao.getConteudosConcluidos());
		System.out.println("XP:" + devJoao.calcularTotalXp());

		
		
		
		
	}
    
}