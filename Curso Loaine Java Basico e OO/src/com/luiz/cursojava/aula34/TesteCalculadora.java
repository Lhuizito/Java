package com.luiz.cursojava.aula34;

public class TesteCalculadora {

    static int resultadoSoma;
    public static void main(String[] args) {
        
        // instanciando classe NAO estatica
        // MinhaCalculadora calc = new MinhaCalculadora(); 

        MinhaCalculadora.soma(1,2);

    }

    static int soma2Valores(int num1, int num2){
        return MinhaCalculadora.soma(num1, num2);
    }
}
