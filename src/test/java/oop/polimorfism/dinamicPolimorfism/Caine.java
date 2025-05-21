package oop.polimorfism.dinamicPolimorfism;

public class Caine extends Animal {
    public void scoateSunet(){
        // A doua implementare a metodei
        System.out.println("Cainele face HamHam");
        super.scoateSunet();
    }
}
