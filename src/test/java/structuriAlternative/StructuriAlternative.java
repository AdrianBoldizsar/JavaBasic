package structuriAlternative;

import org.testng.annotations.Test;

public class StructuriAlternative {
    @Test
    public void testMetod() {
        verificareNumar(5);
        verificareNumar(2);

        verificareNumarParImparPozitivNegativ(8);
        verificareNumarParImparPozitivNegativ(11);
        verificareNumarParImparPozitivNegativ(-7);
        verificareNumarParImparPozitivNegativ(-8);
        verificareNumarParImparPozitivNegativ(0);

        System.out.println("Evaluarea elevului este: " + evaluareNota('A'));
        System.out.println("Evaluarea elevului este: " + evaluareNota('B'));
        System.out.println("Evaluarea elevului este: " + evaluareNota('D'));

    }
//   IF ELSE - structura de control, folosita pentru a evalua o conditite booleana
//        si pt a executa un block de cod daca aceasta conditie este adevarata
//
//    if(conditie){
//       block de cod ce va fi executat daca conditia este adevarata
//    }
//    else{
//       block de cod care va fi executat daca conditia de la 'if' este falsa
//    }

    public void verificareNumar(int numar) {
        if (numar > 3) {
            System.out.println("Numarul " + numar + " este mai mare decat 3");
        } else {
            System.out.println("Numarul " + numar + " este mai mic decat 3");
        }
    }

//   ELSE IF - daca 'if' este folosit la prima conditie pe care o evaluam,
//           - 'else if' este folosit pt conditii suplimentare atunci canc 'if' este fals
//           - 'else' este folosit pt a executa un block de cod atunci cand toate conditiile de mai sus sunt false
//           - este indicat sa folosesti 'if' si 'else if' impreuna daca ai mai multe conditii de evaluat

    public void verificareNumarParImparPozitivNegativ (int valoare) {
        if(valoare > 0) {
            if (valoare % 2 == 0) {
                System.out.println("Numarul " + valoare + " este par si pozitiv");
            } else {
                System.out.println("Numarul " + valoare + " este impar si pozitiv");
            }
        }else if (valoare < 0){
            if (valoare % 2 == 0) {
                System.out.println("Numarul " + valoare + " este par si negativ");
            } else {
                System.out.println("Numarul " + valoare + " este impar si negativ");
            }
        }else {
            System.out.println("Numarul " + valoare + " este zero");
        }
    }

//  SWITCH - structura de control care permite evaluarea unei expresii si
//           executarea unuia din mai multe block-uri de cod
//         - este folosit cand sunt mai multe cazuri posibile si fiecare caz este asociat unui block de cod specific
//
//    switch(expresia){
//        case valoareaUnu : - block de cod pt cazul in care expresia are valoarea 'valoareaUnu'
//        break;
//
//        case valoareaDoi : - block de cod pt cazul in care expresia are valoarea 'valoareaDoi'
//        break;
//
//        ...alte cazuri posibile
//
//        default : - block de cod care se executa daca niciunul dintre cazuri nu se potriveste
//    }
    public String evaluareNota(char nota) {
        switch(nota){
            case 'A':
                return "Nota este excelent!";
            case 'B':
                return "Nota este foarte bine!";
            case 'C':
                return "Nota este bine!";
            case 'D':
                return "Nota este satisfacator";
            default:
                return nota + " Nu este un calificativ acceptat";
        }
    }
}
