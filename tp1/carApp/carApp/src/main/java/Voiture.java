public class Voiture {
    public static final int SPEED_MAX = 120;
    public static final int INCREMENT_SPEED = 10;
    public static final int SPEED_MINIMAL = 0;
    private String modele;
    private String couleur;
    private int vitesse;

    public Voiture(String model, String color) {
        this.modele = model;
        this.couleur = color;
        this.vitesse = SPEED_MINIMAL;
    }

    public int getVitesse() {
        return this.vitesse;
    }

    public void accelerer() {
        if (vitesse + INCREMENT_SPEED <= SPEED_MAX) {
            vitesse += INCREMENT_SPEED;
            // afficher détails
            System.out.println("Modèle : " + modele);
            System.out.println("Couleur : " + couleur);
            System.out.println("Vitesse actuelle : " + vitesse);
        } else {
            System.out.println("La vitesse maximale est atteinte.");
        }
    }

    public void ralentir() {
        if (vitesse - INCREMENT_SPEED >= SPEED_MINIMAL) {
            vitesse -= INCREMENT_SPEED;
            // afficher détails
            System.out.println("Modèle : " + modele);
            System.out.println("Couleur : " + couleur);
            System.out.println("Vitesse actuelle : " + vitesse);
        } else {
            System.out.println("La voiture est déjà à l'arrêt.");
        }
    }
}

