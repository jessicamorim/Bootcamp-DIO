package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setTitulo("curso java");
		curso1.setDescricao("descrição curso java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("curso js");
		curso2.setDescricao("descrição curso js");
		curso2.setCargaHoraria(4);
		
		Conteudo conteudo = new Curso();
		Conteudo conteudo1 = new Mentoria();
		
		List<String> palavras = new ArrayList<>();
			
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("mentoria de java");
		mentoria.setDescricao("descrição mentoria java");
		mentoria.setData(LocalDate.now());
		
		/*System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);*/
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devCamila = new Dev();
		devCamila.setNome("Camila");
		devCamila.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos Camila" + devCamila.getConteudosInscritos());
		devCamila.progredir();
		devCamila.progredir();
		System.out.println("Conteudos Inscritos Camila" + devCamila.getConteudosInscritos());
		System.out.println("Conteudos Concluídos Camila" + devCamila.getConteudosConcluidos());
		System.out.println("XP:" + devCamila.calcularTotalXp());
		
		System.out.println("----------");
		
		Dev devJessica = new Dev();
		devJessica.setNome("Jéssica");
		devJessica.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos Jéssica" + devJessica.getConteudosInscritos());
		devJessica.progredir();
		devJessica.progredir();
		devJessica.progredir();
		System.out.println("Conteudos Inscritos Jéssica" + devJessica.getConteudosInscritos());
		System.out.println("Conteudos Concluídos Jéssica" + devJessica.getConteudosConcluidos());
		System.out.println("XP:" + devJessica.calcularTotalXp());
		
		
	}
}

