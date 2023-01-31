package com.luiz.cursojava.aula43.exercicio36a43;

public class ContaBancaria {

    // atributos
    private String nomeCliente;
    private String numConta;
    private double saldo;

    // construtor
    ContaBancaria(String nomeCliente, String numConta, double saldo){
        this.nomeCliente = nomeCliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    // get and set
    
    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double depositar(double valorDeposito){

        return this.saldo = this.saldo + valorDeposito;
    }

    // metodos 

    public boolean sacar(double valorSaque){

        if((this.saldo - valorSaque) >= 0){
           this.saldo = this.saldo - valorSaque;
           return true;
        } 

        return false;
    }


    @Override
    public String toString() {
        return "ContaBancaria [nomeCliente=" + nomeCliente + ", numConta=" + numConta + ", saldo=" + saldo + "]";
    }

}
