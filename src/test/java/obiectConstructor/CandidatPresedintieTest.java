package obiectConstructor;

import org.testng.annotations.Test;

public class CandidatPresedintieTest {
    @Test

    public void verificatPresedinte() {
        System.out.println("====Exemplul 1 ====");
        CandidatPresedintie candidatPromitator = new CandidatPresedintie(5000, "Nicusor Gheorghe");
        System.out.println("Numele candidatului promitator este " + candidatPromitator.getNume() + " si are " + candidatPromitator.getNumarVoturi() + " voturi ");

        System.out.println("====Exemplul 2 ====");
        CandidatPresedintie candidatNepromitator = new CandidatPresedintie(1500, "Simion Dan");
        System.out.println("Numele candidatului nepromitator este " + candidatNepromitator.getNume() + " si are " + candidatNepromitator.getNumarVoturi() + " voturi ");

        System.out.println("====Exemplul 3 ====");
        CandidatPresedintie candidatNecunoscut = new CandidatPresedintie(0, " 0000 ");
        System.out.println("Numele candidatului necunoscut este " + candidatNecunoscut.getNume() + " si are " + candidatNecunoscut.getNumarVoturi() + " voturi ");
    }
}
