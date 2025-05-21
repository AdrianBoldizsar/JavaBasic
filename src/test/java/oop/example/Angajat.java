package oop.example;

public class Angajat extends Persoana {
    public String companie;
    public Double salariu;
    public Integer experienta;

    public Angajat(String nume, String prenume, Integer varsta, String companie,
                   Double salariu, Integer experienta) {
        super(nume, prenume, varsta); //apelez constructorul parintelui;
        this.companie = companie;
        this.salariu = salariu;
        this.experienta = experienta;
    }
    public void infoAngajat(){
        System.out.println("Angajatul " + getNume() + " lucreaza la compania " + companie);
        System.out.println("Angajatul " + getPrenume() + " are salariul de " + salariu + " RON.");
        System.out.println("Varsta angajatului " + getNume() + " " + getPrenume() + " este " + getVarsta()
                + " si are o experienta de " + experienta + " ani.");
    }

    public String getCompanie() {
        return companie;
    }

    public void setCompanie(String companie) {
        this.companie = companie;
    }

    public Double getSalariu() {
        return salariu;
    }

    public void setSalariu(Double salariu) {
        this.salariu = salariu;
    }

    public Integer getExperienta() {
        return experienta;
    }

    public void setExperienta(Integer experienta) {
        this.experienta = experienta;
    }

    @Override
    public void doarme() {
        System.out.println("Angajatul trebuie sa doarma 8 ore pe noapte");
    }

    // Polimorfism dinamic ---> a treia implementare a metodei
    public void mananca(){
        System.out.println("Angajatul mananca in pauza");
    }

    public void marire(String grad){
        System.out.println("Angajatul este avansat la gradul de: " + grad);
    }

    public void marire(double procent){
        System.out.println("Angajatul primeste o marire de: " + procent + " %");
    }

    public void marire(String prima, int suma){
        System.out.println("Angajatul primeste o prima de: " + prima + " Cu valoare de: " + suma + " Euro");
    }
}
