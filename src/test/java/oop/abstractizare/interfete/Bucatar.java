package oop.abstractizare.interfete;

public class Bucatar implements GatesteInterface{

    @Override
    public void PregatesteMancarea(String tipDeMancare) {
        System.out.println("Bucatarul pregateste mancarea " + tipDeMancare);
    }
}
