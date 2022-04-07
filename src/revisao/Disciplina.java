package revisao;

import java.util.ArrayList;

//POJO - Plain old java object
public class Disciplina {
    //Atributo instância
    private String nome;
    private Professor professor;
    private ArrayList<Aluno> listaAlunos = new ArrayList<Aluno>();
    
    //ENCAPSULAMENTO
    public String getNome() {
        return nome;
    }
    public ArrayList<Aluno> getListaAlunos() {
        return listaAlunos;
    }
    public void setListaAlunos(ArrayList<Aluno> listaAlunos) {
        this.listaAlunos = listaAlunos;
    }
    public Professor getProfessor() {
        return professor;
    }
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}