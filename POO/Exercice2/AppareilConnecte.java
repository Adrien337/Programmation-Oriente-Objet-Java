package POO.Exercice2;

public class AppareilConnecte {
    protected static String piece;
    public AppareilConnecte(String piece) {
        AppareilConnecte.piece = piece;
    }
    public String diagnostiquer() {
        return "L'appareil situé dans " + piece + " fonctionne normalement.";
    }
}
