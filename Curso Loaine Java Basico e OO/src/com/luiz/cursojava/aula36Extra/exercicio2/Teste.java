package com.luiz.cursojava.aula36Extra.exercicio2;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        // instanciando classe scanner
        Scanner entrada = new Scanner(System.in);

        // instanciando classe curso // construtor com parametros // setando valores
        // para Curso
        Curso curso = new Curso("Luiz", "22:30");

        // atribuindo valores a Classe Professor
        // relacionamento 1 = 1
        Professor professor = new Professor("Gerald", "Rivia", "carniceiro@blaviken.com");

        // setando valores da classe professor na classe Curso em tipo professor
        curso.setProfessor(professor);

        // instanciando array, para classes 1 = * sempre que se utilizar arrays eles
        // devem tbm ser instanciados
        // instanciando alunoS <--
        Aluno[] alunos = new Aluno[5];

        // atribuindo valores a Classe Aluno, que sera o tipo da variavel Alunos dentro
        // de Curso
        // for para percorrer o array de 5 posições
        for (int i = 0; i < 5; i++) {
            System.out.println("\n Aluno " + (i + 1) + ":\n");
            // instanciando um Aluno
            Aluno aluno = new Aluno();

            // setando nome de um aluno
            System.out.println("Entre com o nome");
            String nomeAluno = entrada.nextLine();
            aluno.setNome(nomeAluno);

            // setando matricula aluno
            System.out.println("Entre com a matricula do aluno: ");
            String matriculaAluno = entrada.nextLine();
            aluno.setMatricula(matriculaAluno);

            // setando nota1 aluno
            System.out.println("Entre com a nota 1: ");
            String nota1Aluno = entrada.nextLine();
            aluno.setNota1(nota1Aluno);

            // setando nota2 aluno
            System.out.println("Entre com a nota 2: ");
            String nota2Aluno = entrada.nextLine();
            aluno.setNota2(nota2Aluno);

            // setando nota3 aluno
            System.out.println("Entre com a nota 3: ");
            String nota3Aluno = entrada.nextLine();
            aluno.setNota3(nota3Aluno);

            // setando nota4 aluno

            System.out.println("Entre com a nota 4: ");
            String nota4Aluno = entrada.nextLine();
            aluno.setNota4(nota4Aluno);

            // setando nota5 aluno
            System.out.println("Entre com a nota 5: ");
            String nota5Aluno = entrada.nextLine();
            aluno.setNota4(nota5Aluno);

            // ----------------- //
            // colocando em aluno dentro de alunos posicao [i] com os dados
            alunos[i] = aluno;
        }

        // colocando a Classe instanciada e preenchida dentro de curso
        curso.setAlunos(alunos);

        // fechando estrada do scanner pq se n o vscode reclama '_'
        entrada.close();
        
    }
}
