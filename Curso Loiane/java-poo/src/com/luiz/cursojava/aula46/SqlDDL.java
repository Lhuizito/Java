package com.luiz.cursojava.aula46;

public interface SqlDDL {
    void create(String query);

    void alterar(String query);

    void drop(String query);
}
