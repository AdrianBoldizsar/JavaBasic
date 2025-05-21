package oop.abstractizare.claseAbstracte;

import org.testng.annotations.Test;

public class AnimalTest {
    @Test
    public void testMethod(){

        System.out.println("Animal - Exemplul 1");
        Elefant Cici = new Elefant();
        Cici.mananca();
        Cici.infoAnimal();
        Cici.doarme();

        System.out.println("Animal - Exemplul 2");
        Crocodil Mimi = new Crocodil();
        Mimi.mananca();
        Mimi.setNume("Mimi");
        //se foloseste pt clasa privata, iar pt clasa publica se foloseste Mimi.Nume = "Mimi;
        Mimi.setCuloare("Verde");
        Mimi.setGreutate(98);
        Mimi.infoAnimal();
        Mimi.doarme();

        System.out.println("Animal - Exemplul 3");
        Dinozaur Gigi = new Dinozaur();
        Gigi.setNume("Gigi");
        Gigi.setGreutate(760);
        Gigi.setCuloare("Roz");
        Gigi.mananca();
        Gigi.infoAnimal();
        Gigi.doarme();

        //Clasa abstracta nu se poate instantia(sa faci un obiect)
        //Animal Animal = new Animal();



    }
}
