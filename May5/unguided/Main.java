package May5.unguided;

public class Main {
    public static void main(String[] args) {
        //buat engine baru
        Engine engine = new Engine(" V8");

        //buat transmission baru
        Transmission transmission = new Transmission("Automatic");

        //buat mobil dengan engine dan transmission 
        Car car = new Car("Toyota Land Cruiser", engine, transmission);

        //buat driver baru
        Driver driver = new Driver("Messi");

        //driver mengendarai mobil sejauh 100 km
        driver.driverCar(car, 100);

        //driver parkir mobil
        driver.parkCar(car);
    }
}
