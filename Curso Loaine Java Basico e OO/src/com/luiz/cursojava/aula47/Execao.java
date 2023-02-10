package com.luiz.cursojava.aula47;

public class Execao {

    public static void main(String[] args) {

        try {

            int[] vetor = new int[4];

            System.out.println("Antes da exception");

            vetor[4] = 1;

            System.out.println("Esse texto nao sera impresso");

        } catch (ArrayIndexOutOfBoundsException execption) {
            System.out.println("Execao ao acessar um indice de vetor que nao existe");
        }

        System.out.println("Sera impresso dps da execption");

    }
}
