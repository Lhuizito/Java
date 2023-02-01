package com.luiz.cursojava.aula33;

public class TesteCalculadora {
    public static void main(String[] args) {
        
        // instanciando classe nao estatica

        MinhaCalculadora calc = new MinhaCalculadora();


        calc.soma(1,2);
        calc.soma(1.0,2.0);
    }
}
