package com.luiz.cursojava.aula27.exercicios;

public class Lampada {
    boolean ligada;

    void ligar(){
        ligada = true;
    }

    void desligar(){
        ligada = false;
    }

    void mostrarEstado(){
        if(ligada){
            System.out.println("Estado da lampada: Ligada");
          }else{
            System.out.println("Estado da lampada: Desligada");
          }
    }

    // um metodo dentro de outro metodo serve para quando mudar o processo não precisar mudar duas vezes em um mesmo lugar
    
    void mudarEstadoLampada(){
        if(ligada){
            desligar();
        } else{
           ligar();
        }
    }
}
