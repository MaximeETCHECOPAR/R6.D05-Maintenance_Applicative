public class Car {
    public static final int SPEED_MAX = 120;
    public static final int INCREMENT_SPEED = 10;
    public static final int SPEED_MINIMAL = 0;
    private String model;
    private String color;
    private int speed;

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
        this.speed = SPEED_MINIMAL;
    }

    static void changeSpeed(Car car, int newSpeed) {
        if (car.getSpeed() >= newSpeed) {
            while (car.getSpeed() > newSpeed) {
                car.slow();
            }
        } else  {
            while (car.getSpeed() < newSpeed) {
                car.accelerate();
            }
        }
    }

    public int getSpeed() {
        return this.speed;
    }

    public void accelerate() {
        if (speed + INCREMENT_SPEED <= SPEED_MAX) {
            speed += INCREMENT_SPEED;
            // afficher détails
            printStatus();
        } else {
            System.out.println("La vitesse maximale est atteinte.");
        }
    }

    private void printStatus() {
        System.out.println("Modèle : " + model);
        System.out.println("Couleur : " + color);
        System.out.println("Vitesse actuelle : " + speed);
    }

    public void slow() {
        if (speed - INCREMENT_SPEED >= SPEED_MINIMAL) {
            speed -= INCREMENT_SPEED;
            // afficher détails
            printStatus();
        } else {
            System.out.println("La voiture est déjà à l'arrêt.");
        }
    }
}

