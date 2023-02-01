package com.luiz.cursojava.aula26;

public class TesteCarro {
    public static void main(String[] args) {

        Carro van = new Carro();
        //atributos
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.nPassageiros = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;
 
        System.out.println(van.modelo);
        System.out.println(van.marca); 

        van.exibirAutonomia();
        
        double autonomia = van.obterAutonomia();
        System.out.println("A autonomia do carro é: " + autonomia);
        
    }
}
