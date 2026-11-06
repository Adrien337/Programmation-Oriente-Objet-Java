package POO.Exercice5;

public class JournalEvenements {
    private static String logs;
    private static String niveauAlerte = "INFO";
    protected JournalEvenements(String logs) {
        JournalEvenements.logs = logs;
    }
    public static String getInstance(String log) {
        return null; // Je passe
    }
    public static String getNiveauAlerte() {
        return niveauAlerte;
    }
    public static void setNiveauAlerte(String niveau) {
        niveauAlerte = niveau;
        return;
    }
}
