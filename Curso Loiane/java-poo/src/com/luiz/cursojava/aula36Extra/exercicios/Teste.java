package com.luiz.cursojava.aula36Extra.exercicios;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {

        // entrada de dados
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome da agenda: ");
        String nomeAgenda = scanner.nextLine();

        // instanciando classe Agenda com parametros passados pelo usuario
        Agenda agenda = new Agenda(nomeAgenda);

        // instanciando classe array

        Contato[] contatos = new Contato[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Entre com os dados do contato " + (i + 1));
            Contato c = new Contato();

            System.out.println("Entre com o nome: ");
            String nomeContato = scanner.nextLine();
            c.setNome(nomeContato);

            System.out.println("Entre com o telefone: ");
            String telefone = scanner.nextLine();
            c.setEmail(telefone);

            System.out.println("Entre com o email: ");
            String email = scanner.nextLine();
            c.setEmail(email);

            contatos[i] = c;

        }

        // dando set (colocando Classe dentro da classe)
        agenda.setContatos(contatos);

        if(agenda != null){
            System.out.println(agenda.obterInfo());
        }
      
        scanner.close();
    }
}
