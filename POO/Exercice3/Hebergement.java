package POO.Exercice3;

public abstract class Hebergement {
    protected static String reference;
    protected static double tarifJournalier;
    public Hebergement(String reference, double tarifJournalier2) {
        Hebergement.reference = reference;
        Hebergement.tarifJournalier = tarifJournalier2;
    }
    public abstract double calculerPrixSejour(int nb_nuits);
    public String decrire() {
        return "Hébergement " + reference + "\n" + //
        "Tarif de base : " + tarifJournalier + "€/nuit";
    }
    
}
