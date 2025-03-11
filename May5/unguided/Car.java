package May5.unguided;

public class Car {
    private String model;
    private Engine engine;
    private Transmission transmission;

    //constructor buat inisialisasi model, engine, dan transmission
    public Car(String model, Engine engine, Transmission transmission) {
        this.model = model;
        this.engine = engine;
        this.transmission = transmission;
    }

    //method buat nyalain mobil
    public void startCar() {
        engine.start();
        System.out.println("Car model: " + model + " is ready to drive");
    }

    //method buat pindah gear
    public void shiftGear(int gear) {
        transmission.shiftGear(gear);
    }

    //method buat stop mobilnya
    public void stopCar() {
        engine.stop();
        System.out.println("Car model: " + model + " has stopped");
    }
}
