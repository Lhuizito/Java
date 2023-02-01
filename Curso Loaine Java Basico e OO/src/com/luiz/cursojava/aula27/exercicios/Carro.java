package com.luiz.cursojava.aula27.exercicios;

public class Carro {
    String marca;
    String modelo;
    int nPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    // metodos

    // void e o tipo de retorno
    
    void exibirAutonomia(){
        System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + " Km");
    }

    // metodo com retorno 

    double obterAutonomia(){
        System.out.println("Metodo obeterAutonomia chamado.");
        return capCombustivel * consumoCombustivel;
    }

    double calcularCombustivel(double km){
        double qtdcombustivel = km / consumoCombustivel;
        
        return qtdcombustivel;
    }

}

