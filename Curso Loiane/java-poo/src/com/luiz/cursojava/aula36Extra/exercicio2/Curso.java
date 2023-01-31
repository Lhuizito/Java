package com.luiz.cursojava.aula36Extra.exercicio2;
            
public class Curso {
    // atributos da classe 
    private String nome;
    private String horario;
    private Professor professor;
    private Aluno[] alunos;
    
    // construtor
    Curso(String nome, String horario){
        this.nome = nome;
        this.horario = horario;
    }

    // construtores 
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    

}
