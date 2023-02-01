package com.luiz.cursojava.aula33.exercicios;

public class Lampada {

    //atributos

    private String marca;
    private String nome;
    private String modelo;
    private double preco;
    private boolean ligada;

    //construtor

    public Lampada(String marca, String nome, String modelo, double preco, boolean ligada) {
        this.marca = marca;
        this.nome = nome;
        this.modelo = modelo;
        this.preco = preco;
        this.ligada = ligada;
    }

    //construtor vazio 

    public Lampada(){} 

    // get and set
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean getLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    // metodos

    public void Ligar() {
       setLigada(true);
    }

    public void Desligar() {
       setLigada(false);
    }

}
