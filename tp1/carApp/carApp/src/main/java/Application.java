public class Application {
    public static void main(String[] args) {
        Car myCar = new Car("Sedan", "Bleu");
        Driver me = new Driver("John", 20);

        me.startCar();
        myCar.accelerate();
        me.switchSpeed(myCar, 80);
        myCar.slow();
        me.switchSpeed(myCar,30);
        me.stopCar();
        System.out.println("fini");
    }
}
