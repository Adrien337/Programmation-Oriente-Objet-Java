package POO.Exercice2;

public class Thermostat extends AppareilConnecte{
    public Thermostat(String piece) {
        super(piece);
    }
    
    @Override
    public String diagnostiquer() {
        return "Le thermostat de " + piece + " régule à température de 20°C.";
    }
    public static String activerModeEco() {
        return "Le thermostat de " + piece + " passe en mode économique.";
    }
}
