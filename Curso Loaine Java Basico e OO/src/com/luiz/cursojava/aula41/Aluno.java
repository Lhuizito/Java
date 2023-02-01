package com.luiz.cursojava.aula41;

// herança
public class Aluno extends Pessoa {
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
        super.setCpf("3121");
        this.setCpf("312213");
    }

    // polimorfismo = 1 metodo faz varias coisas
    // metodo sobrescrito (override) de pessoa
    public String obterEtiquetaEndereco() {
        // return endereco;
        String s = "Endereco do Aluno: ";
        s += this.getEndereco();

        return s;
    }

    // dando override no metodo da classe abstrata pessoa
    // o metodo esta puxando THIS metodo para imprimir
    public void imprimirEndereco(){
        System.out.println(this.obterEtiquetaEndereco());
    };

}
