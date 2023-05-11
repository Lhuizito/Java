package Classes;

import java.time.LocalDate;

import Utils.ConversorDatas;

public class Lembrete implements Comparable<Lembrete> {

    // atributos encapsulados
    private String nome;
    private String descricao;
    private LocalDate data;

    // construtor

    /**
     * Construtor de lembrete.
     * <p>
     * Caso o nome seja vazio, branco ou null
     * ira disparar uma exception IllegalArgumentException.
     * <p>
     * Caso a data seja anterior a data atual do sistema ira disparar uma
     * IllegalArgumentException.
     * <p>
     * Caso a descrição tenha valor null ira disparar uma IllegalArgumentException.
     * 
     * @param nome      String
     * @param descricao String
     * @param data      LocalDate
     */
    public Lembrete(String nome, String descricao, LocalDate data) {

        // validação nome vazio
        if (nome.isEmpty() || nome.isBlank() || nome == null)
            throw new IllegalArgumentException("A string não pode estar vazia");
        else
            this.nome = nome;

        // validação data valida
        if (data.isBefore(LocalDate.now()))
            throw new IllegalArgumentException("A data e invalida");
        else
            this.data = data;

        if (descricao != null)
            this.descricao = descricao;
        else
            throw new IllegalArgumentException("A descrição tem valor null");

    }

    // #region métodos virtuais sobrescritos

    @Override
    public String toString() {

        StringBuilder str = new StringBuilder();

        str.append("\nData do lembrete: ");
        str.append(ConversorDatas.localDateParaStringPadraoBrasil(this.data));
        str.append("\nNome do lembrete: ");
        str.append(this.nome);
        str.append("\nDescrição: ");
        str.append(this.descricao);

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

    // #region getters

    /**
     * Retorna nome do lembrete
     * 
     * @return String nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * Retorna descrição do lembrete
     * 
     * @return String descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Retorna a data do lembrete no formato padrão do LocalDate
     * 
     * @return LocalDate (yyy/mm/dd)
     */
    public LocalDate getData() {
        return data;
    }

    // #endregion

}