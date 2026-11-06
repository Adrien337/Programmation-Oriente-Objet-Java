package POO.Exercice1;

public class ArticleStock {
    private static String nom;
    private static int quantite;
    // Constructor
    public ArticleStock(String nom, int quantite) {
        ArticleStock.nom = nom;
        ArticleStock.quantite = quantite;
    }
    public ArticleStock(String nom) {
        ArticleStock.nom = nom;
        ArticleStock.quantite = 0;
    }
    
    // Getter
    public String getNom() {
        return nom;
    }
    public int getQuantite() {
        return quantite;
    }
    // Setter
    public void approvisionner(int nb) {
        if (nb < 0) {
            System.out.println("Merci de ne pas mettre de nombre inférieur à 0.");
            return;
        } else {
            quantite += nb;
            return;
        }
    }
    public void expedier(int nb) {
        if (nb < 0) {
            System.out.println("Merci de ne pas mettre de nombre inférieur à 0.");
            return;
        } else {
            if (nb > quantite) {
                System.out.println("Erreur : stock insuffisant pour expédier " + nb + " unités.");
            } else {
            quantite -= nb;
            System.out.println("Expédition de " + nb + " unités validée." );
            return;
            }
        }
    }
}