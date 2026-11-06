package POO.Exercice3;

public class ChambreHotel extends Hebergement{
    private static double supplementPetitDejeuner;
    public ChambreHotel(String reference, double tarifJournalier, double supplementPetitDejeuner){
        super(reference, tarifJournalier);
        ChambreHotel.supplementPetitDejeuner = supplementPetitDejeuner;
        ChambreHotel.reference = reference;
        ChambreHotel.tarifJournalier = tarifJournalier;
    }

    @Override
    public double calculerPrixSejour(int nb_nuits) {
        double prix;
        prix = ((tarifJournalier + supplementPetitDejeuner) * nb_nuits);
        return prix;
    }
}
