package com.luiz.cursojava.aula30;

public class Carro {
    //atributos

    String marca;
    String modelo;
    int nPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    
    // this referencia ao atributo 
                    // sem o this referencia ao paramentro
    public Carro(String marca, String modelo, int nPassageiros, double capCombustivel, double consumoCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.nPassageiros = nPassageiros;
        this.capCombustivel = capCombustivel;
        this.consumoCombustivel = consumoCombustivel;
    }

    // construtor vazio

    public Carro() {}



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
