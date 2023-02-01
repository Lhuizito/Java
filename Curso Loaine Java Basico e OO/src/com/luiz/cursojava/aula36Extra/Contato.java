package com.luiz.cursojava.aula36Extra;

public class Contato {
    //atributos
    private String nome;
    private Endereco endereco;
    private Telefone[] telefones;
    //construtor
    Contato(){}
    //get and set
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    public Telefone[] getTelefones() {
        return telefones;
    }
    public void setTelefones(Telefone[] telefones) {
        this.telefones = telefones;
    }

    

    
    
    


}
