package com.luiz.cursojava.aula35;

public class Calculadora {

    public static int fibonnaci(int num) {

        if (num < 2) {
            return 1;
        }

        return fibonnaci(num - 1) + fibonnaci(num - 2);
    }

}
