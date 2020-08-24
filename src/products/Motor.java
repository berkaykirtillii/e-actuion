
package products;

import java.text.DecimalFormat;
import projects.Azamihız;
import projects.Users;



public class Motor extends Motorlu implements Azamihız {
    private String tarz;
    private Users u1;
    private Product p1;
    private static DecimalFormat df = new DecimalFormat(".##");
        public Motor(String tarz, String km, String motor, double price, String brand, int id,String name,String surname) {
        super(km, motor, price, brand, id);
        this.tarz = tarz;
        u1= new Users(name,surname);
        p1 =new Product(price,brand,id) {
            @Override
            public double komisyon() {
                return price;
            }
        };
        

    }

    @Override
    public double komisyon() {
        double komisyon;
        return komisyon=price*1.001;
    }

    public String getTarz() {
        return tarz;
    }

    public void setTarz(String tarz) {
        this.tarz = tarz;
    }

    public Users getU1() {
        return u1;
    }

    public void setU1(Users u1) {
        this.u1 = u1;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
        @Override
    public int azamihız(double motor) {
             int hız;
        if(motor<=1.3&&motor>1.0)
            hız=320;
        else if(motor<=1.0&&motor>0.9)
            hız=299;
        else if(motor<=0.9 &&motor>0.8)
            hız=210;
        else
            hız=180;
        return hız;   
    }
            @Override
    public String toString() {
        return   p1.toString()+"\ntarz=" + tarz + "\nalıcı=" + u1.toString()+"\nfiyat="+df.format(komisyon())+
                "\nAzami HIz="+ azamihız(Double.parseDouble(getMotor()))+"\n\n";
    }


    
}
