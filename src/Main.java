import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição do curso JS");
        curso2.setCargaHoraria(4);

//        System.out.println(curso1);
//        System.out.println(curso2);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Descrição Mentoria Java");
        mentoria1.setData(LocalDate.now());

//        System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev vitor = new Dev();
        vitor.setNome("Vitor");
        vitor.inscreverBootcamp(bootcamp);

        Dev lucas = new Dev();
        lucas.setNome("Lucas");
        lucas.inscreverBootcamp(bootcamp);

        System.out.println("Conteudos inscritos Vitor: " + vitor.getConteudosInscritos());
        System.out.println("Conteudos inscritos Lucas: " + lucas.getConteudosInscritos());
        System.out.println("Conteudos concluidos Vitor: " + vitor.getConteudosConcluidos());
        System.out.println("Conteudos concluidos Lucas: " + lucas.getConteudosConcluidos());

        vitor.progredir();

        System.out.println("----------------------------------------------------");
        System.out.println("Conteudos inscritos Vitor: " + vitor.getConteudosInscritos());
        System.out.println("Conteudos inscritos Lucas: " + lucas.getConteudosInscritos());
        System.out.println("Conteudos concluidos Vitor: " + vitor.getConteudosConcluidos());
        System.out.println("Conteudos concluidos Lucas: " + lucas.getConteudosConcluidos());

        System.out.println("----------------------------------------------------");
        System.out.println("XP Vitor: " + vitor.calcularXP());
        System.out.println("XP Lucas: " + lucas.calcularXP());
    }
}
