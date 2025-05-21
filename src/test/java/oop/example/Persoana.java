package oop.example;

public abstract class Persoana {


    private String nume;
    private String prenume;
    private Integer varsta;

    public Persoana(String nume, String prenume, Integer varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }

    public void infoPersoana() {
        System.out.println("Numele persoanei este: " + nume);
        System.out.println("Prenumele persoanei este: " + prenume);
        System.out.println("Varsta persoanei este: " + varsta);
    }

    //fortam implementarea actiunii in clasele copil prin abstractizarea metodei
    public abstract void doarme();

    public String getNume() {

        return nume;
    }

    public String getPrenume() {

        return prenume;
    }

    public Integer getVarsta() {

        return varsta;
    }

    public void setNume(String nume) {

        this.nume = nume;
    }

    // Polimorfism dinamic ---> prima implementare a metodei
    public void mananca(){
        System.out.println("Persoana mananca de plictiseala");
    }

    public void invata(){
        System.out.println("Studentul invata cand vrea");
    }

    public void invata(String curs){
        System.out.println("Studentul invata pentru cursul: " + curs);
    }

    public void invata(int ore){
        System.out.println("Studentul invata: " + ore + "ore");
    }
}
