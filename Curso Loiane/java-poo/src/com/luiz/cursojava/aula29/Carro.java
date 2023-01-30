package com.luiz.cursojava.aula29;

public class Carro {
    String marca;
    String modelo;
    int nPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    // contrutor 

    Carro(){
        System.out.println("Classe carro instanciada! ");

        // ja podemos inicializar variaveis pre definidas no construtor

        nPassageiros = 4;
    }

    // construtor com parametros

    Carro(String marca_, String modelo_, int nPassageiros_, double capCombustivel_, double consumoCombustivel_){
        marca = marca_;
        modelo = modelo_;
        nPassageiros = nPassageiros_;
        capCombustivel = capCombustivel_;
        consumoCombustivel = consumoCombustivel_;
    }


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
