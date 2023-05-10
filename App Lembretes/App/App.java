package App;

import java.time.LocalDate;
import java.util.Scanner;

import Classes.Lembrete;
import Utils.ConversorDatas;

public class App {

    public static void main(String[] args) {

        LocalDate data = ConversorDatas.stringParaDataPadraoJava("11/05/2023");

        Lembrete teste = new Lembrete("Assistencia", "Tudo sobre a assitencia", data);
        System.out.println(teste);
    }

    // scanner de input
    static Scanner teclado = new Scanner(System.in);

    // #region Menus do sistema

    /**
     * Menu principal do aplicativo
     * 
     * @return int Opcao valida escolhida pelo usuario
     */
    public static int menuPrincipal() {

        limparTela();
        System.out.println("==========================");
        System.out.println("        Lembretes");
        System.out.println("==========================");
        System.out.println("1 - Lista de lembretes");
        System.out.println("2 - Criar lembrete");
        System.out.println("0 - Sair");

        System.out.print("\nDigite o numero da opção: ");
        int opcao = Integer.parseInt(teclado.nextLine());
        return opcao;
    }

    // to do
    // to do
    // to do
    // to do
    // to do
    public static Lembrete criarLembrete() { // validacao
        boolean eValido = false;
        LocalDate dataSistema = LocalDate.now();
        String nomeLembrete = null;
        String descLembrete = null;
        LocalDate dataFormatada = null;

        limparTela();
        System.out.println("==========================");
        System.out.println("         Criacao");
        System.out.println("==========================");

        // validacao do nome
        while (!eValido) {
            System.out.println("Insira o nome do lembrete: ");
            nomeLembrete = teclado.nextLine();

            if (nomeLembrete.isEmpty() || nomeLembrete.isBlank())
                System.out.println("O nome não pode ser vazio");
            else
                eValido = true;
        }

        System.out.println("Insira a descrição do lembrete: ");
        descLembrete = teclado.nextLine();

        // validacao da data
        while (!eValido) {

            System.out.println("Insira uma data");
            String dataLembrete = teclado.nextLine();

            if (dataLembrete.matches("([0-9]{2})/([0-9]{2})/([0-9]{4})")) { // verificacao regex de string valida

                dataFormatada = ConversorDatas.stringParaDataPadraoJava(dataLembrete); // string para data

                if (!dataFormatada.isBefore(dataSistema)) // verifica se e uma data antiga invalida
                    eValido = true;
                else
                    System.out.println("\nData invalida! Insira uma data valida.\nErro: O dia inserido ja passou!");

            } else {
                limparTela();
                System.out.println(
                        "\nData invalida! Insira uma data valida no sistema.\nErro: O formato da data é: dd/mm/yyyy");
            }

        }

        return new Lembrete(nomeLembrete, descLembrete, dataFormatada);
    }

    public static boolean removerLembrete() {
        return false;
    }

    public static void mostrarLembretes() {

    }

    /**
     * "Limpa" a tela (codigos de terminal VT-100)
     * 
     * @author João Caram Santos - Professor PUC Minas
     */
    public static void limparTela() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    // #endregion

}
