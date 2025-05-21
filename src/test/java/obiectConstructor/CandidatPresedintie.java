package obiectConstructor;

public class CandidatPresedintie {
    public String nume;
    public Integer numarVoturi;

    public CandidatPresedintie(Integer numarVoturi, String nume) {
        this.numarVoturi = validareNumarVoturi(numarVoturi);
        this.nume = verificaNume(nume);
    }

    // o metoda pentru validarea numelui
    public String verificaNume(String nume) {
        if (nume == null || nume.isEmpty()) {
            return "Necunoscut";
        }
        return nume;
    }

    // o metoda pentru validarea nr de voturi
    public Integer validareNumarVoturi(Integer numarVoturi) {
        if (numarVoturi <= 1000) {
            return 0;
        }
        return numarVoturi;
    }

    public Integer getNumarVoturi() {
        return numarVoturi;
    }

    public String getNume() {
        return nume;
    }
}
