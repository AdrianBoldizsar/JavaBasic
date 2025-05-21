package oop;

public class TeorieOOP {
    //OOP=programare orientata pe obiect(object oriented programming)
    //Patru principii importante: mostenire, incapsulare, polimorfism si abstractizare;

    //Mostenirea in Java este conceptul prin care o clasa (clasa copil) mosteneste o alta clasa(clasa parinte);
    //In momentul in care o clasa mosteneste alta clasa, clasa copil are vizibilitate asupra variabilelor/metodelor din clasa parinte;
    //In java se poate mosteni o singura clasa cu ajutorul cuvantului cheie "extends";
    //In momentul in care o clasa mosteneste o alta clasa, clasa copil apeleaza constructorul din parinte
    //si constructorul din clasa parinte spre copil se apeleaza cu cuvantul cheie "super";

    //Incapsularea= procesul prin care tinem private anumite informatii in asa fel incat acestea sa nu poata fi modificate;
    //Ca sa putem face informatiile private vom face variabilele/metodele din "public" in "private";
    //MODIFICATORI DE ACCES:
    //public= codul se poate accesa de oriunde si din orice clasa;
    //private= codul se poate accesa doar din clasa unde s-a scris codul;
    //protected= codul se poate accesa doar din pachetul in care s-a scris codul, dar si de catre subclase(conceptul oop de mostenire);
    //default= codul se poate accesa doar din pachetul in care s-a scris codul;
    //Ca sa extragem(modicam) o valoare a unei variabile private ne folosim de metode de get/set(getter si setter);

    //POLIMORFISM=conceptul prin care definim mai multe implementari pentru o metoda
    //Este de doua tipuri: Static(overloading) si Dinamic(overriding)
    //Polimorfism Dinamic(overriding)=intr-o ierarhie de clase obtinute prin mostenire o metoda poate avea implementari diferite
    //Polimorfism Static(overloading)=posibilitatea prin care o metoda are mai multe implementari prin diferentierea tipului sau nr de parametrii

    //Abstractizare = este procesul de reducere a complexitatii prin ascunderea detaliilor de implimentare si expunerea doar a functionalitatii
    //Se realizeaza prin clase abstracte si/sau interfete

    //Clasele abstracte = se declara folosind cuvantul cheie 'abstract'
    //Pot contine atat metode abstracte (fara corp/cod sau implementare) cat si metode concrete (metodele obijnuite, cu implementare)
    //Nu pot fi instantiate (nu poti sa faci un obiect din clasa abstracta)
    //Poate fi utilizata numai ca superclasa pentru alte clase care extind clasa abstracta
    //Poate avea variabile si atribute ca si o clasa normala

    //Interfata = e un protocol pe care clasele trebuie sa il implementeze(ofera raspuns la lipsa mostenirii multiple)
    //O clasa poate mostenii mai multe interfete
    //Contine doar metode abstracte *interfata poate sa contina si metode cu implementare dar pot sa ai doua tipuri de metode(default:public void sau static void)
    //Interfetele pot extinde alte interfete
    //Ai cuvantul cheie 'interface'
    //Putem sa mostenim o interfata cu cuvantul cheie 'implements'
}
