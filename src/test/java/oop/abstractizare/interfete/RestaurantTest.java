package oop.abstractizare.interfete;

import org.testng.annotations.Test;

public class RestaurantTest {
    @Test
    public void activitateRestaurant (){
        Bucatar Ion = new Bucatar();
        Ion.PregatesteMancarea("Mititei");

        Chelner Petre = new Chelner();
        Petre.PrimesteComanda(3);
        Petre.ServesteMancarea("Mici", "Ileana");
        Petre.CurataMasa(14);
        Petre.SpalaVase();

        Ospatar Vasile = new Ospatar();
        Vasile.PrimesteComanda(5);
        Vasile.ServesteMancarea("Mamaliga", "Anuta");

        AsistentBucatar Maria = new AsistentBucatar();
        Maria.CurataMasa(6);
        Maria.SpalaVase();
    }
}
