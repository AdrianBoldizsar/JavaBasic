package oop.abstractizare.interfete;

public class Ospatar implements ServesteInterface{
    @Override
    public void PrimesteComanda(int numarComanda) {
        System.out.println("Ospatarul preia comanda cu numarul " + numarComanda);
    }

    @Override
    public void ServesteMancarea(String tipMancare, String numeClient) {
        System.out.println("Ospatarul duce mancarea " + tipMancare + " la clientul " + numeClient);
    }
}
