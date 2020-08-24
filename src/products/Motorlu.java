
package products;


public abstract class Motorlu extends Product{
       private String km;
       private String motor;

    public Motorlu(String km, String motor, double price, String brand, int id) {
        super(price, brand, id);
        this.km = km;
        this.motor = motor;
    }

    public String getKm() {
        return km;
    }

    public void setKm(String km) {
        this.km = km;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
        @Override
    public String toString() {
        return  "km=" + km + "\nmotor=" + motor ;
    }   
    
}
