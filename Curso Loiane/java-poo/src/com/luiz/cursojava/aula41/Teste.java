package com.luiz.cursojava.aula41;

public class Teste { 
    public static void main(String[] args) {
        // pessoa virou uma classe abstrata, somente estamos definindo como essa classe pode ser se ela for Abstract. 
        // Pessoa pessoa = new Pessoa();
        Pessoa aluno = new Aluno();
        Pessoa professor = new Professor();

        // pessoa.setEndereco("Helio Viana, 1, Tupi B");
        aluno.setEndereco("Rua banana, 2, Zuzi B");
        professor.setEndereco("Muquirana, 3, hobitt");

        System.out.println(aluno.obterEtiquetaEndereco());
        System.out.println(professor.obterEtiquetaEndereco());
   
        aluno.imprimirEndereco();
        professor.imprimirEndereco();

        
    }
}
