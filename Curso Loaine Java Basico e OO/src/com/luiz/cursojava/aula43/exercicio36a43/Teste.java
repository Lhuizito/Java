package com.luiz.cursojava.aula43.exercicio36a43;

public class Teste {
    public static void main(String[] args) {
        System.out.println("*** Teste ContaBancaria ***");
        ContaBancaria contaSimples = new ContaBancaria("Jorge", "312-d", 0);

        contaSimples.depositar(400);
        System.out.println("Atual: " + contaSimples.getSaldo());

        realizarSaque(contaSimples, 30);
        realizarSaque(contaSimples, 380);

        System.out.println("\n\n\n\n *** Teste ContaPoupanca ***");
        ContaPoupanca contaPoupanca = new ContaPoupanca("Luiz", "55-d", 30);
        contaPoupanca.setDiaRendimento(31);

        contaPoupanca.depositar(100);
        System.out.println("Atual: " + contaSimples.getSaldo());

        realizarSaque(contaPoupanca, 50);
        realizarSaque(contaPoupanca, 70);

        if (contaPoupanca.calcularNovoSaldo(0.5)) {
            System.out.println("Novo rendimento aplicado! Novo saldo e de: " + contaPoupanca.getSaldo());
        } else {
            System.out.println("Hoje nao e dia de rendimento!");
        }

        System.out.println("\n\n\n\n *** Teste ContaEspeciaa ***");
        ContaEspecial contaEspecial = new ContaEspecial("Lior", "321312", 100);
        contaEspecial.setLimite(50);

        realizarSaque(contaPoupanca, 50);
        realizarSaque(contaPoupanca, 70);
        realizarSaque(contaPoupanca, 80);

        System.out.println(contaEspecial);

    }

    public static void realizarSaque(ContaBancaria conta, double valor) {
        if (conta.sacar(valor)) {
            System.out.println("Saque sucedido! Total: " + conta.getSaldo());
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

}
