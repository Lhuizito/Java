package com.luiz.cursojava.aula36Extra.exercicio1;

public class Agenda {

    // atributos
    private Contato[] contatos;
    private String nome;

    // construtor
    Agenda() {
    }

    Agenda(String nome){
        this.nome = nome;
    }

    // get and set

    public Contato[] getContatos() {
        return contatos;
    }

    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // metodos

  public String obterInfo(){
    String info = "Nome da agenda: " + nome + "\n";

    if(contatos != null){
        for (Contato c: contatos){
            info += c.obterInfo() + "\n";
        }
    }
    
    return info;
  }

}
