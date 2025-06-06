package oop.example;

import org.testng.annotations.Test;

public class OOPTest {
    @Test
    public void oopExampleTest(){
        System.out.println("===Exemplu student===");
        Student Ionel = new Student("Popescu","Ionel",20,"Facultatea de Constructii",
                "Rezistenta materialelor",true);
        Ionel.infoStudent();
        Ionel.setNume("Porumbescu");
        Ionel.infoPersoana();
        Ionel.infoStudent();
        Ionel.mananca();
        Ionel.invata();
        Ionel.invata(8);
        Ionel.invata("Informatica");


        System.out.println("===Exemplu angajat===");
        Angajat Teodor = new Angajat("Ionescu","Teodor",30,"Oracle",
                7500.0,4);
        Teodor.infoAngajat();
        Teodor.setSalariu(3500.0);
        Teodor.infoPersoana();
        Teodor.infoAngajat();
        Teodor.mananca();
        Teodor.marire("Mediu");
        Teodor.marire(10.5);
        Teodor.marire("vechime", 10000);
    }
}
