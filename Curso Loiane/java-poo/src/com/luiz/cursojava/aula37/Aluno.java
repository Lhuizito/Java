package com.luiz.cursojava.aula37;
                    // herança
public class Aluno extends Pessoa {
    // atributos
    private String curso;
    private double[] notas ;

    //get and set

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

    public double calcularMedia(){
        return 0;
    }

    public boolean calcularAprovado(){
        return true;
    }
    
}
