package POO.Exercice4;

public class BatterieInterne {
    private static int capaciteMah;
    public BatterieInterne(int capaciteMah) { // capaciteMax ?
        BatterieInterne.capaciteMah = capaciteMah;
    }
    protected static int getCapaciteMah() {
        return capaciteMah;
    }
}
