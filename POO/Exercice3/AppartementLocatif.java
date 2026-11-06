package POO.Exercice3;

public class AppartementLocatif extends Hebergement{
    private static double tarifJournalier;
    private static double fraisMenageFixes;
    public AppartementLocatif(String reference, double tarifJournalier, double fraisMenageFixes) {
        super(reference, tarifJournalier);
        AppartementLocatif.fraisMenageFixes = fraisMenageFixes;
        AppartementLocatif.reference = reference;
        AppartementLocatif.tarifJournalier = tarifJournalier;
    }

    @Override
    public double calculerPrixSejour(int nb_nuits) {
        double prix;
        prix = ((tarifJournalier * nb_nuits) + fraisMenageFixes);
        return prix;
    }
    
}
