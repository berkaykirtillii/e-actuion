
package products;

import java.text.DecimalFormat;
import projects.Azamihız;
import projects.Users;



public class Araba extends Motorlu implements Azamihız{
    private String Tür;
    private Users u1;
    private Product p1;
    private static DecimalFormat df = new DecimalFormat(".##");
 
    public Araba(String Tür,  String km, String motor, double price, String brand, int id, String name,String surname) {
        super(km, motor, price, brand, id);
        this.Tür = Tür;
        u1=new Users(name,surname);
        p1 =new Product(price,brand,id) {
            @Override
            public double komisyon() {
             return price; 
                    
            }
        };
    }
       public void setPrice(double price) {
        this.price = price;
    }

    public void setP1(Product p1) {
        this.p1 = p1;
    }
  
    public void setTür(String Tür) {
        this.Tür = Tür;
    }

    public void setU1(Users u1) {
        this.u1 = u1;
    }
        
    public Users getU1() {
        return u1;
    }

    public double getPrice() {
        return price;
    }
    
  public String getTür() {
        return Tür;
    }

    @Override
    public int azamihız(double motor) {
     int hız;
        if(motor<=3.0&&motor>2.0)
            hız=300;
        else if(motor<=2.0&&motor>1.8)
            hız=250;
        else if(motor==1.8&&motor>1.6)
            hız=200;
        else
            hız=180;
        return hız;   
    }
    @Override
    public double komisyon() {
        double komisyon;
       return komisyon=price*1.002;
    }
        @Override
    public String toString() {
        return   p1.toString()+"\nTür=" + Tür + "\nalıcı=" + u1.toString() + "\nkomisyonlu fiyat="+df.format(komisyon())+
                "\nAzami HIz="+ azamihız(Double.parseDouble(getMotor()))+"\n\n";
    }


    
}
