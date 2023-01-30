package com.luiz.cursojava.aula33.exercicios;

public class TesteLampada {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();

        lampada.setMarca("Philips");
        lampada.setModelo("Led");
        lampada.setNome("Ultra led Philips");
        lampada.setPreco(25.99);
        lampada.setLigada(false);

        System.out.println("Estado original da lampada " + lampada.getLigada());
        lampada.Ligar();
        System.out.println("Estado da lampada apos ligar " + lampada.getLigada());
        lampada.Desligar();
        System.out.println("Estado da lampada apos desligar " + lampada.getLigada());
        
    }
}
