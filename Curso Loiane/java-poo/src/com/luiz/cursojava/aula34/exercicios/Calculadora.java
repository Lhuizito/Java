package com.luiz.cursojava.aula34.exercicios;

public class Calculadora {
    private static int factorialTotal = 1;

    public static double somar(double numero1, double numero2) {
        return (numero1 + numero2);
    }

    public static double subtrair(double numero1, double numero2) {
        return (numero1 - numero2);
    }

    public static double dividir(double numero1, double numero2) {
        return (numero1 / numero2);
    }

    public static double potencializar(double base, double expoente) {

        return Math.pow(base, expoente);
    }

    public static int factorial(int factorial) {

        // int number=4;//It is the number to calculate factorial
        for (int i = 1; i <= factorial; i++) {
           factorialTotal = factorialTotal * i;
        }
        return factorialTotal;
    }

}
