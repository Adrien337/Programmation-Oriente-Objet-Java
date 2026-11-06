package POO.Exercice2;

public class CameraSecurite extends AppareilConnecte{
    public CameraSecurite(String piece) {
        super(piece);
    }

    @Override
    public String diagnostiquer() {
        return "La caméra de " + piece + " filme en haute définition.";
    }
}
