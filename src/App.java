import java.util.Scanner;

import revisao.Aluno;
import revisao.Disciplina;
import revisao.Professor;

public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");

        Professor prof1 = new Professor();
        Professor prof2 = new Professor();

        Disciplina disc1 = new Disciplina();
        Disciplina disc2 = new Disciplina();
        disc1.setProfessor(prof1);
        disc2.setProfessor(prof1);

        disc1.getListaAlunos().add(new Aluno());
        disc1.getListaAlunos().add(new Aluno());
        //disc1.getListaAlunos().add("univille");
        //disc1.getListaAlunos().add(123456);
        //disc1.getListaAlunos().add(true);

        System.out.println();

        Scanner leitor = new Scanner(System.in);


    }
}
