package Classes;

import java.time.LocalDate;

import Utils.ConversorDatas;

public class Lembrete implements Comparable<Lembrete> {

    // atributos
    private String nome;
    private String descricao;
    private LocalDate data;

    // construtor
    public Lembrete(String nome, String descricao, LocalDate data) {

        // validacao nome vazio
        if (nome.isEmpty() || nome.isBlank())
            throw new IllegalArgumentException("A string não pode estar vazia");
        else
            this.nome = nome;

        // validacao data valida
        if (data.isBefore(LocalDate.now()))
            throw new IllegalArgumentException("A data e invalida");
        else
            this.data = data;

        this.descricao = descricao;

    }

    // #region metodos virtuais
    @Override
    public String toString() {

        StringBuilder str = new StringBuilder();
        str.append("-----------------------------------");
        str.append("\nData do lembrete: ");
        str.append(ConversorDatas.localDateParaStringPadraoBrasil(this.data));
        str.append("\nNome do lembrete: ");
        str.append(this.nome);
        str.append("\nDescrição: ");
        str.append(this.descricao);
        str.append("\n-----------------------------------");

        return str.toString();
    }

    @Override
    public int compareTo(Lembrete o) {
        if (this.data.isBefore(o.data)) {
            return -1;
        } else if (this.data.isAfter(o.data)) {
            return 1;
        } else {
            return 0;
        }
    }

    // #endregion

    // #region setters
    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public LocalDate getData() {
        return data;
    }
    // #endregion

}