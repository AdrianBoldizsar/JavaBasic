package oop.polimorfism.staticPolimorfism;

import org.testng.annotations.Test;

public class CalculeTest {
    @Test
    public void testAdunare(){
        Calcule Adunare = new Calcule();
        System.out.println("Adunarea a doua int-uri este: " + Adunare.adunare(8,9));
        System.out.println("Adunarea a doua String-uri este: " + Adunare.adunare("8 adu","nare 9"));
        System.out.println("Adunarea a doua double-uri este: " + Adunare.adunare(8.8,9.9));
    }
}
