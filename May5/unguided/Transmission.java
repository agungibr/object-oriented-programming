package May5.unguided;

public class Transmission {
    private String type;

    //constructor buat inisialisasi transmission type
    public Transmission(String type) {
        this.type = type;
    }

    //method buat pindah gear
    public void shiftGear(int gear) {
        System.out.println("Shifted to gear: " + gear + " (Transmission type: " + type + ")"); 
    }
}
