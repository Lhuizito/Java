package com.luiz.cursojava.aula36Extra.exercicios;

public class Contato {

    // atributos

    private String nome;
    private String telefone;
    private String email;

    // construtor vazio

    Contato() {
    }

    // get and set

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // metodos

    public String obterInfo(){
        return "Nome: " + nome + "\n" + 
                "Telefone: " + telefone + "\n" +
                 "Email: " + email;
    }

}


