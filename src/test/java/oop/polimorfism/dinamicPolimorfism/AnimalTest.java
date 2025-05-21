package oop.polimorfism.dinamicPolimorfism;

public class AnimalTest {
    public void suneteAnimale(){
        Caine Azorel = new Caine();
        Azorel.scoateSunet();

        Pisica Tom = new Pisica();
        Tom.scoateSunet();

        Lup Wolf = new Lup();
        Wolf.scoateSunet();

        Animal Rex = new Animal();
        Rex.scoateSunet();
    }
}
