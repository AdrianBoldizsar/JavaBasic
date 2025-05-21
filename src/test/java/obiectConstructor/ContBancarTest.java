package obiectConstructor;

import org.testng.annotations.Test;

public class ContBancarTest {
    @Test

    public void metodaContBancarTest() {
        System.out.println("====Exemplul 1 ====");
        ContBancar contValid = new ContBancar("Maria", 150.65);
        contValid.infoCont();
        System.out.println("====Exemplul 2 ====");
        ContBancar contInvalid = new ContBancar("Ana", 84.5);
        contInvalid.infoCont();
    }
}
