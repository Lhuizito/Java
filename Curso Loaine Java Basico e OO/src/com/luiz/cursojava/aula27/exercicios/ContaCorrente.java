package com.luiz.cursojava.aula27.exercicios;

public class ContaCorrente {
    int nConta;
    double saldoConta;
    boolean contaEspecial;
    double limiteConta;

    double sacar(double valorSaque){

        if(valorSaque < saldoConta){
            return saldoConta - valorSaque;
        } else {
            return  saldoConta;
        }

    }

    double depositar(double valorDeposito){
        return saldoConta + valorDeposito;
    }

    void consultarSaldo(){
        System.out.println("Saldo da conta corrente: " + saldoConta);
    }

    void verificaChequeEspecial(){
        if(contaEspecial){
            System.out.println("A conta está utilizando cheque especial");
        }else{
            System.out.println("A conta não esta utilizando cheque especial");
        }
    }

}
