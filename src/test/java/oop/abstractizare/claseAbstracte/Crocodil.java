package oop.abstractizare.claseAbstracte;

public class Crocodil extends Animal{

    @Override
    public void mananca() {
        System.out.println("Crocodilul mananca oameni");
    }

    @Override
    public void infoAnimal() {
        System.out.println("Crocodilul de culoarea " + getCuloare() + " se numeste " + getNume() + " si are " + getGreutate() + " kg");
    }
}
