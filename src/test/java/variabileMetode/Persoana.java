package variabileMetode;

import org.testng.annotations.Test;

public class Persoana {
    // Clasa = in java este o structura care defineste atat atributele/variabile cat si metodele unui obiect
    //       - transpunerea din viata reala in programare

    // Tipurile de date in java sunt de doua feluri:
    //   *primitive - stocheaza direct valoarea si sunt 8 tipuri de date
    //           - byte (8 bits)
    //           - short (16 bits)
    //           - int (32 bits)
    //           - long (64 bits)
    //           - double (numere zecimale 10.54)
    //           - float (numere zecimale, dar cu precizie mai mica decat double)
    //           - char (caractere individuale, in general litere)
    //           - boolean (valori logice, true/false)
    //   *de referinta (neprimitive) - stocheaza doar referinta(adresa in memorie) catre un obiect
    //                               - clase
    //                               - interfete
    //                               - array

    // Variabile:
    // *Globale (de instanta) - sunt proprii fiecarei instante
    // *Locale - din interiorul metodelor

    // Metodele = un bloc de cod care indeplineste o functie specifica (cand ne referim la o metoda ne referim la o actiune, un comportament)
    // *metode fara return (sau void) - ruleaza logica din interior si nu returneaza nimic
    //      public(modificator de acces: public, private, protected) void test(numele metodei) () {
    //             logica(corpul metodei)
    //      }

    // *metode cu return - sa returneze un rezultat
    //      public(modificator de acces: public, private, protected) int(tipul returnat:int, String, boolean) test(numele metodei) () {
    //             logica(corpul metodei)
    //             return(la valoarea de tipul returnat)
    //      }

    // declaram variabile de instanta(globale):
    String numelePersoanei = "Popescu";
    String prenumelePersoanei = "Ion";
    char sexulPersoanei = 'M';
    int anDeNastere = 1991;

    // metoda de test
    @Test
    public void afisareVariabileGlobaleTest () {
        System.out.println("Persoane are numele: " + numelePersoanei);
        System.out.println("Persoane are prenumele: " + prenumelePersoanei);
        System.out.println("Persoane e de sexul: " + sexulPersoanei);
    }

    @Test
    public void afisareVariabileLocaleTest () {
    // declaram variabile locale(in interiorul metodei):
        int varstaPersoanei = 33;
        double inaltimeaPersoanei = 184.32;
        String adresaPersoanei = "Romania";
        System.out.println("Persoane are varsta: " + varstaPersoanei);
        System.out.println("Persoane are inaltimea: " + inaltimeaPersoanei);
        System.out.println("Persoana are adresa: " + adresaPersoanei);
    // aici se pot afisa si variabilele globale declarate in clasa:
        System.out.println("Persoane are numele: " + numelePersoanei);
        System.out.println("Persoane are prenumele: " + prenumelePersoanei);
        System.out.println("Persoane e de sexul: " + sexulPersoanei);
    }

    @Test
    public void afisareDetaliiProfesionale () { // metoda care afiseaza din alte metode
        System.out.println("Varsta actuala este: " + calculeazaVarsta(2025));
        System.out.println("Persoana este adulta: " + esteAdult(calculeazaVarsta(2025)));
    }

    public int calculeazaVarsta(int anActual) {
        return anActual - anDeNastere;
    }

    public boolean esteAdult(int varsta){
        return varsta >= 18;
    }


}
