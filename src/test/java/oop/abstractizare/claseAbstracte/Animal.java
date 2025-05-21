package oop.abstractizare.claseAbstracte;

public abstract class Animal {
    //metode private
    private String Culoare;
    private String Nume;
    private int Greutate;

    //Aceleasi metode dar publice
    //public String Culoare;
    //public String Nume;
    //public int Greutate;

    public abstract void mananca();

    public abstract void infoAnimal();

    public String getCuloare() {
        return Culoare;
    }

    public void setCuloare(String culoare) {
        Culoare = culoare;
    }

    public int getGreutate() {
        return Greutate;
    }

    public void setGreutate(int greutate) {
        Greutate = greutate;
    }

    public String getNume() {
        return Nume;
    }

    public void setNume(String nume) {
        Nume = nume;
    }

    public void doarme(){
        System.out.println("Toate animalele au nevoie de somn");
    }
}
