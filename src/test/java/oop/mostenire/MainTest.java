package oop.mostenire;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MainTest extends BaseTest {
    @BeforeClass
    public void InitTest() {
        System.out.println("Initializare MainTest=Copil");
    }

    @Test
    public void mainTest() {
        System.out.println("Executare Maintest=Copil");
    }
}
