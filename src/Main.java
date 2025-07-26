import br.com.dio.challenge.dominio.Bootcamp;
import br.com.dio.challenge.dominio.Curso;
import br.com.dio.challenge.dominio.Dev;
import br.com.dio.challenge.dominio.Mentoria;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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

        Dev devSyb = new Dev();
        devSyb.setNome("Sybilla");
        devSyb.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Sybilla:" + devSyb.getConteudosInscritos());
        devSyb.progredir();
        devSyb.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Sybilla:" + devSyb.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Sybilla:" + devSyb.getConteudosConcluidos());
        System.out.println("XP:" + devSyb.calcularTotalXp());

        System.out.println("-------");

        Dev devArthur = new Dev();
        devArthur.setNome("Arthur");
        devArthur.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Arthur:" + devArthur.getConteudosInscritos());
        devArthur.progredir();
        devArthur.progredir();
        devArthur.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Arthur:" + devArthur.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Arthur:" + devArthur.getConteudosConcluidos());
        System.out.println("XP:" + devArthur.calcularTotalXp());

    }
}