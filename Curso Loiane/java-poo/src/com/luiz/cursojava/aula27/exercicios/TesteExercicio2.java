package com.luiz.cursojava.aula27.exercicios;

public class TesteExercicio2 {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();

        // atributos da conta

        contaCorrente.nConta = 735745;
        contaCorrente.saldoConta = 200.00;
        contaCorrente.contaEspecial = false;
        contaCorrente.limiteConta = 300.00;

        //funcionalidades
        //sacar da conta corrente

        contaCorrente.saldoConta = contaCorrente.sacar(201);

        if(contaCorrente.saldoConta == 200.00){
            System.out.println("Sua conta não possui dinheiro suficiente!");
        } else {
            System.out.println("Novo valor da conta corrente apos saque: " + contaCorrente.saldoConta);
        }

        // deposito conta corrente 

        System.out.println("Atual valor da conta corrente: " + contaCorrente.saldoConta);
        
        contaCorrente.saldoConta = contaCorrente.depositar(200);
        System.out.println("Novo valor conta corrente apos deposito: " + contaCorrente.saldoConta);
        
        // consultar saldo

        contaCorrente.consultarSaldo();

        // verificação de cheque especial

        contaCorrente.verificaChequeEspecial();
      

    }
}
