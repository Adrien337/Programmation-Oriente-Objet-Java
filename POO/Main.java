package POO;

import POO.Exercice1.ArticleStock;
import POO.Exercice2.AppareilConnecte;
import POO.Exercice2.CameraSecurite;
import POO.Exercice2.Thermostat;
import POO.Exercice3.AppartementLocatif;
import POO.Exercice3.ChambreHotel;
import POO.Exercice4.Smartphone;
import POO.Exercice5.JournalEvenements;

public class Main {
    public static void main(String[] args) {
        Exercice1();
        Exercice2();
        Exercice3();
        Exercice4();
        Exercice5();
    }

    public static void Exercice1() {
        ArticleStock article = new ArticleStock("Clavier mécanique");
        article.approvisionner(15);
        // System.out.println(article.getQuantite()); // 15
        article.expedier(6);
        // System.out.println(article.getQuantite()); // 9
        article.expedier(12);
        // System.out.println(article.getQuantite()); // Erreur}
    }
    public static void Exercice2() {
        AppareilConnecte appareil = new AppareilConnecte("Couloir");
        AppareilConnecte thermostat = new Thermostat("Salon");
        AppareilConnecte camera = new CameraSecurite("Entrée");
        // System.out.println(appareil.diagnostiquer());
        // System.out.println(thermostat.diagnostiquer());
        // System.out.println(thermostat.activerModeEco()); // Fonctionne pas
        // System.out.println(camera.diagnostiquer());
    }
    public static void Exercice3() {
        ChambreHotel chambre = new ChambreHotel("CH-101", 85.0, 12.5);
        // System.out.println(chambre.decrire());
        // System.out.println(chambre.calculerPrixSejour(4)); // 390

        AppartementLocatif appart = new AppartementLocatif("APT-4B",110.0,50.0);
        // System.out.println(appart.decrire());
        // System.out.println(appart.calculerPrixSejour(4)); // 490
    }
    public static void Exercice4() {
        Smartphone telephone = new Smartphone("Pixel Pro", 5000);
        // System.out.println(telephone.obtenirFicheTechnique());
    }
    public static void Exercice5() {
        // String journal1 = JournalEvenements.getInstance("null");
        // journal1.setNiveauAlerte("CRITIQUE");
        // String journal2 = JournalEvenements.getInstance("journal1");
        // journal2.getNiveauAlerte();
        // System.out.println(journal1 == journal2);
    }
}
