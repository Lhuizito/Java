package com.luiz.cursojava.aula34.exercicios;

public class Contador {

    private static int contStatico = 0;

    Contador() {
        contStatico++;
    }

    public static void zerarContador() {
        contStatico = 0;
    }

    public static void incrementarContador() {
        contStatico += 1;
    }

    private static int retornarValorContador() {
        return contStatico;
    }

    public static String mostrarNumeroContador() {
        return "O valor total do contador é: " + retornarValorContador();
    }
}
