package src.br.com.dio.bootcamp;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        // 1. Criar Conteúdos
        Curso cursoJava = new Curso();
        cursoJava.setTitulo("Java POO");
        cursoJava.setDescricao("Aprendendo os pilares da OO");
        cursoJava.setCargaHoraria(8);

        Mentoria mentoriaJava = new Mentoria();
        mentoriaJava.setTitulo("Mentoria de Java");
        mentoriaJava.setDescricao("Dúvidas sobre o desafio");
        mentoriaJava.setData(LocalDate.now());

        // 2. Criar o Bootcamp
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp Java");
        bootcamp.getConteudos().add(cursoJava);
        bootcamp.getConteudos().add(mentoriaJava);

        // 3. Criar e inscrever um Dev
        Dev devRafael = new Dev();
        devRafael.setNome("Rafael");
        devRafael.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdos Inscritos Rafael: " + devRafael.getConteudosInscritos());
        
        // 4. Simular Progressão
        devRafael.progredir();
        devRafael.progredir();
        
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Rafael: " + devRafael.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Rafael: " + devRafael.getConteudosConcluidos());
        System.out.println("XP Total: " + devRafael.calcularTotalXp());
    }
}