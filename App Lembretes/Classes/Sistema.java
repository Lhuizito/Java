package Classes;

import java.time.LocalDate;
import java.util.Map;
import java.util.TreeMap;

public class Sistema {

    // atributo
    private TreeMap<LocalDate, Lembrete> mapListas = new TreeMap<LocalDate, Lembrete>(); // <= teste
    // private TreeMap<LocalDate, ArrayList<Lembrete>> mapLembretes = new
    // TreeMap<LocalDate, ArrayList<Lembrete>>();

    public Sistema() {
    }

    public void adicionarLembrete(Lembrete lembrete) {

        LocalDate dataChave = lembrete.getData();

        mapListas.put(dataChave, lembrete);
    }

    public void funcionaPrintPFVR() {
        System.out.println("Printando");
        System.out.println("\nPrintando");
        System.out.println("\nPrintando\n");

        for (Map.Entry<LocalDate, Lembrete> m : mapListas.entrySet()) {
            System.out.println(m.getKey() + "\n" + m.getValue());
        }
    }

}
