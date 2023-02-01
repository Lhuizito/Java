package com.luiz.cursojava.aula27.exercicios;

public class exercicio1 {
    public static void main(String[] args) {
      Lampada lampada = new Lampada();

      lampada.ligar();
      lampada.mostrarEstado();

      lampada.desligar();
      lampada.mostrarEstado();

      lampada.mudarEstadoLampada();
      lampada.mostrarEstado();

    }
}
