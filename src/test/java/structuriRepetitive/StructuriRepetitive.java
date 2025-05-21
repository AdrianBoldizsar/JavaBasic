package structuriRepetitive;

import org.testng.annotations.Test;

import java.lang.module.FindException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class StructuriRepetitive {

    @Test
    public void testMethod() {
        colegiDeCursArray();
        colegiDeCursLista();
        afisareHashMap();
        afisareHashMapDoi();

// ARRAYS -= multimi, structuri de date care stocheata o colectie de elemente de acelasi tip, fie primitive,
//           fie obiecte gen String
//        - dimensiunea este fixa, odata ce este creata multimea(the array) dimensiunea nu se poate schimba
//        - elementele trebuie sa fie de acelasi tip si accesul la ele se face prin indexul acestora

    }

    public void colegiDeCursArray() {

// cream o multime de Stringuri

        String[] colegi = new String[6];
        colegi[0] = "Marius";
        colegi[1] = "Eugen";
        colegi[2] = "Hilda";
        colegi[3] = "Gigi";
        colegi[4] = "Sanziana";
        colegi[5] = "Gabi";
        System.out.println("Exemplu multimi");   // sa printeze ceva sa vedem de unde incepe metoda in consola

// FOR - structura de control utiliza pt a itera o secventa de instructiuni sau pt a parcurge un anumit interval de valori
//      for (initializare; conditie; incrementare){
//          block de cod care va fi executat repetat
//      }

        for (int index = 0; index < colegi.length; index++) {
            System.out.println("Numele colegului de la numarul " + index + " este " + colegi[index]);
        }
    }

    public void colegiDeCursLista() {

// Listele - o colectie ordonata de elemente de acelasi tip
//           - elementele sunt adaugate in ordinea in care sunt adaugate
//           - afisarea se face tot prin index
//           - elementele unei liste pot fi parcurse folosind bucle sau iteratori
//           - in liste sunt permise elemente duplicate
//           - in java sunt mai multe clase care implementeaza listele, cele mai folosite sunt ArrayList si LinkedList

        List<String> colegiLista = new ArrayList<>();
        colegiLista.add("Maria");
        colegiLista.add("Marius");
        colegiLista.add("Petronelda");
        colegiLista.add("Calin");
        colegiLista.add("Adrian");
        colegiLista.add("Dorin");

// WHILE - structura de control utilizata pt a executa repetat un block de cod atata timp cat o anumita conditie este adevarata
//       - in timp ce 'for' este utilizata pt a itera printr-o secventa de instructiuni un numar cunoscut de iteratii,
//         'while' este folosita cand nr de iteratii nu este cunoscut in avans, dar se stie conditia
//
//            initializare index
//            while(conditia){
//            block de cod care va fi executat atata timp cat conditia este adevarata
//            increment/decrement
//            }

        System.out.println("Exemplu liste");  // sa printeze ceva sa vedem de unde incepe urmatoarea metoda in consola

        int index = 0;
        while (index < colegiLista.size()) {
            System.out.println("Numele colegului de la numarul " + index + " este " + colegiLista.get(index));
            index++;
        }

    }

    public void afisareHashMap() {
        System.out.println("Exemplu HashMap");  // sa printeze ceva sa vedem de unde incepe urmatoarea metoda in consola

// HASH MAP - ofera o implemantare a unei colectii de tip pereche (cheie-valoare)
//          - tot un fel de lista numai ca are doua elemente unul 'cheie' si altul 'valoare'
//          - intr-un 'hashmap' cheile sunt unicate, nu exista du[licate si fiecare cheie poate fi asociata  cu cel mult o valoare
//
        HashMap<String, String> categoriiObiecte = new HashMap<>();
        categoriiObiecte.put("Fructe","Mar");
        categoriiObiecte.put("Animale","Urs");
        categoriiObiecte.put("Flori","Papadie");

// FOREACH - structura de control, cunoscuta si ca 'Enhanced FOR LOOP'
//         - se utilizeaza pt a itera o colectie fara sa fie nevoie de un interator explicit sau sa se lucreze cu indici
//         - 'foreach' nu mai este in versiounile noi si se foloste de intelliJ tot ca 'for'
//
//           for(tip element numeElemet: colectia){
//                block de cod care o sa fie executat pt fiecare element din colectie
//           }

        for(String key: categoriiObiecte.keySet()){
            System.out.println("Categoria este " + key + ", Valoarea este " + categoriiObiecte.get(key));
        }
    }

    public void afisareHashMapDoi(){
        System.out.println("Exemplu HashMapDoi");  // sa printeze ceva sa vedem de unde incepe urmatoarea metoda in consola

        HashMap<String, List<String>>tariOrase=new HashMap<>();

// Adaugam 3 seturi de liste pe care le vom folosi in HashMap

        List<String> oraseRomania = new ArrayList<>();
        oraseRomania.add("Bucuresti");
        oraseRomania.add("Cluj-Napoca");
        oraseRomania.add("Sighetu-Marmatiei");

        List<String> oraseSpania = new ArrayList<>();
        oraseSpania.add("Madrid");
        oraseSpania.add("Barcelona");
        oraseSpania.add("Sevilia");

        List<String> oraseAnglia = new ArrayList<>();
        oraseAnglia.add("Londra");
        oraseAnglia.add("Belfast");
        oraseAnglia.add("Liverpool");

// Adaugam valorile in HashMap

        tariOrase.put("Romania", oraseRomania);
        tariOrase.put("Spania", oraseSpania);
        tariOrase.put("Anglia", oraseAnglia);

        for(String key: tariOrase.keySet()){
            System.out.println("Tara este " + key + ", Orasele sunt " + tariOrase.get(key));
        }
    }

}
