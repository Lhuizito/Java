package com.luiz.cursojava.aula26;

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
}
