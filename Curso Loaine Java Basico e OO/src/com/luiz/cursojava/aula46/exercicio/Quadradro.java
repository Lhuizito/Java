package com.luiz.cursojava.aula46.exercicio;

public class Quadradro extends Figura2D {
    private int lado;

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        
        return lado * lado;
    }
    
}
