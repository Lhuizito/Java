package com.luiz.cursojava.aula36Extra.exercicio2;
            // essa classe sera utilizada como atributo para outra classe 
public class Professor {
    // atributos da classe
    private String nome;
    private String departamento;
    private String email;
    
    // construtor 
    Professor(String nome, String departamento, String email){
        this.nome = nome;
        this.departamento = departamento;
        this.email = email;
    }

    // get and setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
    


}
