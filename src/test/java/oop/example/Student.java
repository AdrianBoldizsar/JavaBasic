package oop.example;

public class Student extends Persoana{
    private String facultate;
    private String cursuri;
    private Boolean bursa;

    public Student(String nume, String prenume, Integer varsta, String facultate, String cursuri, Boolean bursa) {
        super(nume, prenume, varsta); //apelez constructorul parintelui;
        this.facultate = facultate;
        this.cursuri = cursuri;
        this.bursa = bursa;
    }

    public void infoStudent() {
        System.out.println("Studentul " + getNume() + " este student la facultatea " + facultate);
        System.out.println("Studentul " + getPrenume() + " are cursuri de " + cursuri);
        System.out.println("Varsta studentului " + getNume() + " " + getPrenume() + " este " + getVarsta() + " si are/nu are bursa " + bursa);
    }

    @Override
    public void doarme() {
        System.out.println("Studentul trebuie sa doarma ca sa poata invata");
    }

    // Polimorfism dinamic ---> a doua implementare a metodei
    public void mananca(){
        System.out.println("Studentul mananca de foame");
    }

    public String getFacultate() {
        return facultate;
    }

    public String getCursuri() {
        return cursuri;
    }

    public Boolean getBursa() {
        return bursa;
    }

    public void setFacultate(String facultate) {
        this.facultate = facultate;
    }

    public void setCursuri(String cursuri) {
        this.cursuri = cursuri;
    }

    public void setBursa(Boolean bursa) {
        this.bursa = bursa;
    }

}
