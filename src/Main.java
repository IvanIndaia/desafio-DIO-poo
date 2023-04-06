import br.com.dio.desafio.dominio.*;

import java.time.*;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Java Script");
        curso2.setDescricao("Curso de JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Mentoria Java POO");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Bootcamp Java Developer");
        bootcamp1.setDescricao("Desenvolvimento Java");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(mentoria);

        Dev devIvan = new Dev();
        devIvan.setNome("Ivan Alex");
        devIvan.inscreverBootcamp(bootcamp1);
        System.out.println("Conteúdos Inscritos: "+ devIvan.getConteudosInscritos());

        System.out.println("=====");
        devIvan.progredir();
        devIvan.progredir();
        devIvan.progredir();
        System.out.println("Conteúdos Inscritos: "+ devIvan.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos: "+ devIvan.getConteudosConcluidos());
        System.out.println("XP: "+ devIvan.calcularTotalXP());

        System.out.println("---------------------------------");
        Dev devCamila = new Dev();
        devIvan.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp1);
        System.out.println("Conteúdos Inscritos: "+ devCamila.getConteudosInscritos());

        System.out.println("=====");
        devCamila.progredir();
        System.out.println("Conteúdos Inscritos: "+ devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos: "+ devCamila.getConteudosConcluidos());
        System.out.println("XP: "+ devCamila.calcularTotalXP());


    }
}