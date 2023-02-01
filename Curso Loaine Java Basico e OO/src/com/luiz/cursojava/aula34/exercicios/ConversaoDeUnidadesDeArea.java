package com.luiz.cursojava.aula34.exercicios;

public class ConversaoDeUnidadesDeArea {

    public static double metroParaPes(double metros) {
        double totalPes = metros * 10.75;
        return totalPes;
    }

    public static double peParaCmQuadrado(double pe) {
        double totalCmQuadrados = pe * 929;
        return totalCmQuadrados;
    }

    public static double milhaParaAcres(double milha) {
        double totalAcres = milha * 640;
        return totalAcres;
    }

    public static double acreParaPes(double acres) {
        double totalPes = acres * 43.560;
        return totalPes;
    }
}
