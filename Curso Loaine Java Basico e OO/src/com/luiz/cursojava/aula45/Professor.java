package com.luiz.cursojava.aula45;

public class Professor extends Pessoa {

    private double salario;
    private String nomeCurso;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    // metodos

    public double calcularSalarioLiquido() {
        return 0;
    }

    // metodo polimorfizado e sobrescrito de pessoa
    // as classes estão herdando de pessoa o metodo que está sendo sobrescrito na classe atual
    public String obterEtiquetaEndereco() {
        // return endereco;
        String s = "Endereco do Professor: ";
        s += this.getEndereco();

        return s;
    }
}
