package com.luiz.cursojava.aula43.exercicio36a43;

public class ContaEspecial extends ContaBancaria {

    ContaEspecial(String nomeCliente, String numConta, double saldo) {
        super(nomeCliente, numConta, saldo);
        //TODO Auto-generated constructor stub
    }

    private double limite;

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    @Override
    public String toString() {
      String s = "Conta especial [";
      s += " Limite: " + limite;
      s += super.toString();
      s += "]";
      return s;
    }

    public boolean sacar(double valorSaque) {

        double saldoComLimite = this.getSaldo() + this.getLimite();

        if ((saldoComLimite - valorSaque) >= 0) {
            this.setSaldo(this.getSaldo() - valorSaque);
            return true;
        }

        return false;
    }
}
