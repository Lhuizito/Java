package com.luiz.cursojava.aula36Extra;

public class Teste {
    public static void main(String[] args) {
        // instanciando classe
        Contato contato = new Contato();
        // setando valores a os atributos
        contato.setNome("Flavin");
        // contato.setTelefone("31 231232");

        // esse passo e logo apos criar a classe de contato
        // criando objeto endereco UM PARA UM 1 = 1  
        Endereco endereco = new Endereco();
        endereco.setNomeRua("Helio Viana");;
        endereco.setNumero("225");
        endereco.setComplemento("A");
        endereco.setCidade("BH");
        endereco.setCep("3184450");

        // criando objeto telefone para UM PARA MUITOS 1 = *
        Telefone telefone = new Telefone();
        telefone.setTipo("Celular");
        telefone.setDdd("31");
        telefone.setNumero("31313131");

        Telefone telefone2 = new Telefone();
        telefone2.setTipo("Casa");
        telefone2.setDdd("31");
        telefone2.setNumero("111111");

        Telefone[] telefones = new Telefone[2];
        telefones[0] = telefone;
        telefones[1] = telefone2;


        // setando Classe endereco na Classe contato (passo importante, depois de fazer as classes tem que setar !!!!!!!!)
        contato.setEndereco(endereco);
        // setando Classe telefone na Classe contato (passo mais importante)
        contato.setTelefones(telefones);


        // teste de saida console com verificação
        System.out.println(contato.getNome());
        // System.out.println(contato.getEndereco().getCidade()); (codigo perigoso!! precisamos fazer a verificação de ponteiro null)
        // System.out.println(contato.getTelefone());

        // verificacao de ponteiros nulo    
   
        if (contato != null && contato.getEndereco() != null){
            System.out.println(contato.getEndereco().getCidade());
        }

        if (contato != null && contato.getTelefones() != null){
            for (Telefone telefone3 : contato.getTelefones()) {
                System.out.println(telefone3.getDdd() + " " + telefone3.getNumero());
            }
        }

    }
}
