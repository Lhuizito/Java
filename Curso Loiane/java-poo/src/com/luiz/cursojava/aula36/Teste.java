package com.luiz.cursojava.aula36;

public class Teste {
    public static void main(String[] args) {

        Contato contato = new Contato();

        contato.setNome("Tyrion");
        // contato.setEndereco("Kings Landing");
        // contato.setTelefone("31 313131");

        // relacionamnto tem um endereco 
        Endereco end = new Endereco();
        end.setNomeRua("Sapucai");
        end.setNumero("31");
        end.setComplemento("-");
        end.setCidade("Bh");
        end.setEstado("Mg");
        end.setCep("31311313");

        contato.setEndereco(end);

        // relacionamnto tem varios
        Telefone telefone = new Telefone();
        telefone.setTipo("Celular");
        telefone.setDdd("31 ");
        telefone.setNumero("31998548184");

        Telefone telefone2 = new Telefone();
        telefone2.setTipo("Casa");
        telefone2.setDdd("31 ");
        telefone2.setNumero("31313311131");

        Telefone[] telefones = new Telefone[2];
        telefones[0] = telefone;
        telefones[1] = telefone2;

        contato.setTelefones(telefones);

        // contato.setTelefone(telefone);

        // teste saida no console
        System.out.println(contato.getNome());

        // verifica referencia se a referencia de memoria existe

        if (contato != null && contato.getEndereco() != null){
            System.out.println(contato.getEndereco().getCidade());
        }

        if(contato != null && contato.getTelefones() != null){
            for (Telefone t: contato.getTelefones()){
                System.out.println(t.getDdd() + "" + t.getNumero());
            }
        }

    }
}
