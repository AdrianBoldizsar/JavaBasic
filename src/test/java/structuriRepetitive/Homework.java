package structuriRepetitive;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Homework {

    @Test
    public void testHomework(){
        masini();
        materiale();
    }

// 1 - faceti o metoda care sa gaseasca un cuvant dintr-o list si cand il gaseste sa il printeze in consola
//   - lista de fructe, masini, etc

    public void masini(){
        List<String> masiniLista = new ArrayList<>();
        masiniLista.add("Toyota");
        masiniLista.add("Volkswagen");
        masiniLista.add("Jeep");
        masiniLista.add("BMW");
        masiniLista.add("Audi");
        masiniLista.add("Dacia");

        System.out.println("Masini");  // printeaza ceva in consola sa vedem de unde incepe urmatoarea metoda

        int index = 0;
        while (index < masiniLista.size()) {
            System.out.println("Marca masinii de la pozitia " + index + " este " + masiniLista.get(index));
            index++;
        }
    }

// 2 - faceti o metoda care sa gaseasca un cuvant dintr-un HashMap si cand il gaseste sa il printeze in consola
//   - HashMap de obiecte, materiale, etc

    public void materiale(){
        System.out.println("Materiale");  // printeaza ceva in consola sa vedem de unde incepe urmatoarea metoda

        HashMap<String, List<String>> tariOrase=new HashMap<>();

// Adaugam 3 seturi de liste pe care le vom folosi in HashMap

        List<String> dimensiuniFier = new ArrayList<>();
        dimensiuniFier.add("6mm/75cm");
        dimensiuniFier.add("8mm/12m");
        dimensiuniFier.add("12mm/12m");

        List<String> dimensiuniLemn = new ArrayList<>();
        dimensiuniLemn.add("3cm/20cm/4m");
        dimensiuniLemn.add("5cm/30cm/6m");
        dimensiuniLemn.add("15cm/15cm/5m");

        List<String> dimensiuniPiatra = new ArrayList<>();
        dimensiuniPiatra.add("25-30mm");
        dimensiuniPiatra.add("10-50mm");
        dimensiuniPiatra.add("8-12mm");

// Adaugam valorile in HashMap

        tariOrase.put("Lemn", dimensiuniLemn);
        tariOrase.put("Fier", dimensiuniFier);
        tariOrase.put("Piatra", dimensiuniPiatra);

        for(String key: tariOrase.keySet()){
            System.out.println("Materialul este " + key + ", Dimensiunile sunt " + tariOrase.get(key));
        }
    }
}
