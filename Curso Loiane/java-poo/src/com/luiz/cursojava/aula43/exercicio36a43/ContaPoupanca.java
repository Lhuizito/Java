package com.luiz.cursojava.aula43.exercicio36a43;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria {

    ContaPoupanca(String nomeCliente, String numConta, double saldo) {
        super(nomeCliente, numConta, saldo);
        //TODO Auto-generated constructor stub
    }

    private int diaRendimento;

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }
    

    @Override
    public String toString() {
      String s = "ContaPoupanca [";
      s += " diaRendimento: " + diaRendimento;
      s += super.toString();
      s += "]";
      return s;
    }

    public boolean calcularNovoSaldo(double taxaRendimento){

        Calendar hoje = Calendar.getInstance();

        if(diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)){
         this.setSaldo(this.getSaldo() + this.getSaldo() * taxaRendimento);
         return true;
        }
        return false;
    }
}
