
package products;


public abstract class Product {
    public double price;
    public String brand;
    private int id,lastID;

    public Product(double price, String brand, int id) {
        this.price = price;
        this.brand = brand;
        this.id = id;
        //lastID++;
    }

    public double getPrice() {
        return price;
    }

    //public void setPrice(double price) {
      //  this.price = price;
    //}

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLastID() {
        return lastID;
    }

    public void setLastID(int lastID) {
        this.lastID = lastID;
    }
        @Override
    public String toString() {
        return   "Marka=" + brand + "\nid=" + id  ;
    }
     public abstract double komisyon();
    
    
}
