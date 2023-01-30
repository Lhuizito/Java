package com.luiz.cursojava.aula25;

public class Carro {
    String marca;
    String modelo;
    int nPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    //metodos
    // void e o tipo de retorno
    
    void exibirAutonomia(){
        System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + " Km");
    }
}
