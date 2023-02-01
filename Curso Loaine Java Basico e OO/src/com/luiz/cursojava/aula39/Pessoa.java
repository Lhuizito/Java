package com.luiz.cursojava.aula39;

public class Pessoa {
    private String nome;
    private String endereco;
    private String telefone;
    private String cpf;
    // modificador padrão do java (sem nada) e visivel somente dentro do pacote
    // private somente dentro do arquivo podemos acessar o atributo
    // public todos podem ver
    // protected somente as heranças e o arquivo podem acessar
    public String nomeVisibilidade;

    // construtor 

    Pessoa(){}
    Pessoa(String nome, String endereco, String telefone){
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    
}
