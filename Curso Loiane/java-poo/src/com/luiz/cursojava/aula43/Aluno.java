package com.luiz.cursojava.aula43;

import java.util.Arrays;

// herança
public class Aluno {
    // atributos
    private String curso;
    private double[] notas;

    // construtor
    Aluno() {
        super();
    }

    public Aluno(String nome, String endereco, String telefone, String curso) {
    }

    // get and set

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double calcularMedia() {
        return 0;
    }

    public boolean calcularAprovado() {
        return true;
    }

    public void metodoQualquer() {
        // super.setCpf("3121");
        // this.setCpf("312213");
    }

    // polimorfismo = 1 metodo faz varias coisas
    // metodo sobrescrito (override) de pessoa
    public String obterEtiquetaEndereco() {
        // return endereco;
        String s = "Endereco do Aluno: ";
        // s += this.getEndereco();

        return s;
    }

    // dando override no metodo da classe abstrata pessoa
    // o metodo esta puxando THIS metodo para imprimir
    public void imprimirEndereco(){
        System.out.println(this.obterEtiquetaEndereco());
    }

    @Override
    public String toString() {
        return "Aluno [curso=" + curso + ", notas=" + Arrays.toString(notas) + "]";
    }

    @Override //  igual  somente em nome do curso
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        
        Aluno other = (Aluno) obj;
      
        if (curso.equalsIgnoreCase(other.getCurso())){
            return true;
        }

        return false;
    }

    // public String toString(){

    //     String s = curso + "\n";

    //     for (double nota : notas){
    //         s += nota + " ";
    //     }

    //     return s;
    // }

    

    


        



}
