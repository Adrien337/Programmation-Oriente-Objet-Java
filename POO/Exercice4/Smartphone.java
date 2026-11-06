package POO.Exercice4;

public class Smartphone {
    private static String modele;
    private static BatterieInterne batterie;
    public Smartphone(String modele, int batterie) {
        Smartphone.modele = modele;
        Smartphone.batterie = new BatterieInterne(batterie);
    }
    public String obtenirFicheTechnique() {
        return "Smartphone " + modele + " équipé d'une batterie scellée de " + batterie.getCapaciteMah() + " mAh.";
    }
}
