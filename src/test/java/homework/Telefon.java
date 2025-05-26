package homework;

public abstract class Telefon {
    //de facut un exemplu OOP asemanator cu exemplul de la curs;
    //trebuie sa folosim:
    //mostenire;
    //incapsulare;
    //polimorfism;
    //abstractizare(clase abstracte si interfete);
    public String colour;
    public String model;
    public Integer internalStorage;

    public Telefon(String colour, String model, Integer internalStorage) {
        this.colour = colour;
        this.model = model;
        this.internalStorage = internalStorage;
    }
    public void phoneInfo(){
        System.out.println("The colour of the phone is: " + colour);
        System.out.println("The model of the phone is: " + model);
        System.out.println("The internal storage of the phone is: " + internalStorage);
    }
    public void rings(){
        System.out.println("The phone rings: ring ring");
    }
    public abstract void volumeUp();
    public abstract void volumeOff();

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getInternalStorage() {
        return internalStorage;
    }

    public void setInternalStorage(Integer internalStorage) {
        this.internalStorage = internalStorage;
    }

}
