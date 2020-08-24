
package projects;

import java.text.DecimalFormat;
import java.util.Timer;
import java.util.TimerTask;
import javafx.beans.property.IntegerProperty;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;




public class Satıs extends javax.swing.JFrame {
        ImageIcon a6_1 = new ImageIcon(getClass().getResource("/images/a6-1.jpg"));
        ImageIcon a6_2 = new ImageIcon(getClass().getResource("/images/a6-2.jpg"));
        ImageIcon a6_3 = new ImageIcon(getClass().getResource("/images/a6-3.jpg"));
        ImageIcon a6_1s = new ImageIcon(getClass().getResource("/images/a6-1s.jpg"));
        ImageIcon a6_2s = new ImageIcon(getClass().getResource("/images/a6-2s.jpg"));
        ImageIcon a6_3s = new ImageIcon(getClass().getResource("/images/a6-3s.jpg"));
        ImageIcon bmw1 = new ImageIcon(getClass().getResource("/images/bmw1.jpg"));
        ImageIcon bmw2 = new ImageIcon(getClass().getResource("/images/bmw2.jpg"));
        ImageIcon bmw3 = new ImageIcon(getClass().getResource("/images/bmw3.jpg"));
        ImageIcon bmw1s = new ImageIcon(getClass().getResource("/images/bmw1s.jpg"));
        ImageIcon bmw2s = new ImageIcon(getClass().getResource("/images/bmw2s.jpg"));
        ImageIcon bmw3s = new ImageIcon(getClass().getResource("/images/bmw3s.jpg"));
        ImageIcon passat1 = new ImageIcon(getClass().getResource("/images/passat1.jpg"));
        ImageIcon passat2 = new ImageIcon(getClass().getResource("/images/passat2.jpg"));
        ImageIcon passat3 = new ImageIcon(getClass().getResource("/images/passat3.jpg"));
        ImageIcon passat1s= new ImageIcon(getClass().getResource("/images/passat1s.jpg"));
        ImageIcon passat2s= new ImageIcon(getClass().getResource("/images/passat2s.jpg"));
        ImageIcon passat3s= new ImageIcon(getClass().getResource("/images/passat3s.jpg"));
        ImageIcon a3_1 = new ImageIcon(getClass().getResource("/images/a3-1.jpg"));
        ImageIcon a3_2 = new ImageIcon(getClass().getResource("/images/a3-2.jpg"));
        ImageIcon a3_3 = new ImageIcon(getClass().getResource("/images/a3-3.jpg"));
        ImageIcon a3_1s = new ImageIcon(getClass().getResource("/images/a3-1s.jpg"));
        ImageIcon a3_2s = new ImageIcon(getClass().getResource("/images/a3-2s.jpg"));
        ImageIcon a3_3s = new ImageIcon(getClass().getResource("/images/a3-3s.jpg"));
        ImageIcon i20_1 = new ImageIcon(getClass().getResource("/images/i20-1.jpg"));
        ImageIcon i20_1s = new ImageIcon(getClass().getResource("/images/i20-1s.jpg"));
        ImageIcon i20_2 = new ImageIcon(getClass().getResource("/images/i20-2.jpg"));
        ImageIcon i20_2s= new ImageIcon(getClass().getResource("/images/i20-2s.jpg"));
        ImageIcon golf= new ImageIcon(getClass().getResource("/images/golf.jpg"));
        ImageIcon golfs= new ImageIcon(getClass().getResource("/images/golfs.jpg"));
        ImageIcon chopper1= new ImageIcon(getClass().getResource("/images/chopper1.jpg"));
        ImageIcon chopper2= new ImageIcon(getClass().getResource("/images/chopper2.jpg"));
        ImageIcon chopper1s= new ImageIcon(getClass().getResource("/images/chopper1s.jpg"));
        ImageIcon chopper2s= new ImageIcon(getClass().getResource("/images/chopper2s.jpg"));
        ImageIcon bmw1000= new ImageIcon(getClass().getResource("/images/bmw1000.jpg"));
        ImageIcon bmw1000s= new ImageIcon(getClass().getResource("/images/bmw1000s.jpg"));
        ImageIcon ducati= new ImageIcon(getClass().getResource("/images/ducati.jpg"));
        ImageIcon ducatis= new ImageIcon(getClass().getResource("/images/ducatis.jpg"));
        ImageIcon alsat=new ImageIcon(getClass().getResource("/images/alsat.png"));
        ImageIcon geri=new ImageIcon (getClass().getResource("/images/geri.png"));
        ImageIcon geri2=new ImageIcon(getClass().getResource("/images/geri2.png"));
        static double price;
        static int a6sayac1=40,a6sayac2=60,a6sayac3=46,b520sayac1=50,b520sayac2=38,b520sayac3=68,passatsayac1=71,passatsayac2=63,passatsayac3=47;
        static int a3sayac1=39,a3sayac2=42,a3sayac3=63,golfsayac1=81,i20sayac1=47;
        static int chsayac1=100,chsayac2=65,ssayac1=90,ssayac2=52;
        
       
        String name,surname;
        Satılan frm = new Satılan();

    public Satıs() {
        initComponents();
        panelAraba.setVisible(false);
        panelGenel.setVisible(true);
        panelSeçim.setVisible(true);
        panelMotor.setVisible(false);
        jLabel19.setIcon(alsat);
        jLabel20.setIcon(geri);
         jLabel24.setIcon(geri2);
         jLabel37.setIcon(geri2);
         jTextArea1.setEditable(false);
             SystemClass.addProduct(SystemClass.a6_1);
             SystemClass.addProduct(SystemClass.a6_2);
             SystemClass.addProduct(SystemClass.a6_3);
             SystemClass.addProduct(SystemClass.bmw_1);
             SystemClass.addProduct(SystemClass.bmw_2);
             SystemClass.addProduct(SystemClass.bmw_3);
             SystemClass.addProduct(SystemClass.passat_1);
             SystemClass.addProduct(SystemClass.passat_2);
             SystemClass.addProduct(SystemClass.passat_3);
             SystemClass.addProduct(SystemClass.a3_1);
             SystemClass.addProduct(SystemClass.a3_2);
             SystemClass.addProduct(SystemClass.a3_3);
             SystemClass.addProduct(SystemClass.golf);
             SystemClass.addProduct(SystemClass.i20_1);
             SystemClass.s_List.add(SystemClass.i20_2);
             SystemClass.addProduct(SystemClass.bmw1000); 
             SystemClass.addProduct(SystemClass.ducati); 
             SystemClass.addProduct(SystemClass.chopper2); 
             SystemClass.addProduct(SystemClass.chopper1); 
             SystemClass.addAraba(SystemClass.a6_2);
             SystemClass.addAraba(SystemClass.a6_3);
             SystemClass.addAraba(SystemClass.bmw_1);
             SystemClass.addAraba(SystemClass.bmw_2);
             SystemClass.addAraba(SystemClass.bmw_3);
             SystemClass.addAraba(SystemClass.passat_1);
             SystemClass.addAraba(SystemClass.passat_2);
             SystemClass.addAraba(SystemClass.passat_3);
             SystemClass.addAraba(SystemClass.a3_1);
             SystemClass.addAraba(SystemClass.a3_2);
             SystemClass.addAraba(SystemClass.a3_3);
             SystemClass.addAraba(SystemClass.golf);
             SystemClass.addAraba(SystemClass.i20_1);
             SystemClass.addAraba(SystemClass.i20_2);
             SystemClass.addMotor(SystemClass.bmw1000);
             SystemClass.addMotor(SystemClass.chopper1);
             SystemClass.addMotor(SystemClass.chopper2);
             SystemClass.addMotor(SystemClass.ducati);
             Timer a6Timer1=new Timer();
             Timer a6Timer2=new Timer();
             Timer a6Timer3=new Timer();
             Timer b520Timer1=new Timer();
             Timer b520Timer2=new Timer();
             Timer b520Timer3=new Timer();
             Timer passatTimer1=new Timer();
             Timer passatTimer2=new Timer();
             Timer passatTimer3=new Timer();
             Timer a3Timer1=new Timer();
             Timer a3Timer2=new Timer();
             Timer a3Timer3=new Timer();
             Timer golfTimer=new Timer();
             Timer i20Timer=new Timer();
             Timer chTimer1=new Timer();
             Timer chTimer2=new Timer();
             Timer ssTimer1=new Timer();
             Timer ssTimer2=new Timer();
                            
             TimerTask a6gorev1 =new TimerTask() {
       
         @Override
                    public void run() { 
                        if(a6sayac1>0)
                          a6sayac1--;
                           if(id1.getText().equalsIgnoreCase(Integer.toString(SystemClass.a6_1.getId()))){
                           timer1.setText(Integer.toString(a6sayac1)+" sn");
                           }
                           if(a6sayac1<=0){                            
                                  a6Timer1.cancel();
                                  if(id1.getText().equalsIgnoreCase(Integer.toString(SystemClass.a6_1.getId()))){
                                     
                                     jComboBox1.removeItem(Integer.toString(SystemClass.a6_1.getId()));
                                     
                                     timer1.setText("0"+" sn");
                                     foto1.setIcon(a6_1s);
                                  }
                                  SystemClass.delete(SystemClass.a6_1.getId());
                                  SystemClass.del_araba(SystemClass.a6_1.getId());
                                   jTextArea1.setText(SystemClass.a6_1.toString());
                           }
                             
                    }
             };
             a6Timer1.schedule(a6gorev1,0,1000);
             
             TimerTask a6gorev2 =new TimerTask() {
       
                    @Override
                    public void run() {                          
                         if(a6sayac2>0)  
                        a6sayac2--;
                         if(id2.getText().equalsIgnoreCase(Integer.toString(SystemClass.a6_2.getId()))){
                           timer2.setText(Integer.toString(a6sayac2)+" sn");
                         }
                           if(a6sayac2<=0){
                                  a6Timer2.cancel();
                                  if(id2.getText().equalsIgnoreCase(Integer.toString(SystemClass.a6_2.getId()))){
                                      jComboBox1.removeItem(Integer.toString(SystemClass.a6_2.getId()));
                                      
                                     
                                     foto2.setIcon(a6_2s);
                                     timer2.setText("0"+" sn");                                     
                                  }
                                  SystemClass.delete(SystemClass.a6_2.getId());
                                  SystemClass.del_araba(SystemClass.a6_2.getId());
                                  jTextArea1.setText(SystemClass.a6_2.toString());
                           }
                                   
                    }
             };
             a6Timer2.schedule(a6gorev2,0,1000);
             
             TimerTask a6gorev3 =new TimerTask() {
              
                    @Override
                    public void run() {  
                         if(a6sayac3>0)                        
                           a6sayac3--;
                            if(id3.getText().equalsIgnoreCase(Integer.toString(SystemClass.a6_3.getId()))){
                           timer3.setText(Integer.toString(a6sayac3)+" sn");
                            }
                           if(a6sayac3<=0){
                                  a6Timer3.cancel();
                                  if(id3.getText().equalsIgnoreCase(Integer.toString(SystemClass.a6_3.getId()))){
                                      jComboBox1.removeItem(Integer.toString(SystemClass.a6_3.getId()));
                                      
                                     foto3.setIcon(a6_3s);
                                     timer3.setText("0"+" sn");             
                                  }
                                  SystemClass.delete(SystemClass.a6_3.getId());
                                  SystemClass.del_araba(SystemClass.a6_3.getId());
                                  jTextArea1.setText(SystemClass.a6_3.toString());
                           }
                                 
                                                  
                    }
             };  
        a6Timer3.schedule(a6gorev3,0,1000);
                     TimerTask b520gorev1 =new TimerTask() {
               
                    @Override
                    public void run() { 
                         if(b520sayac1>0)
                           b520sayac1--;
                         if(id1.getText().equalsIgnoreCase(Integer.toString(SystemClass.bmw_1.getId()))){
                           timer1.setText(Integer.toString(b520sayac1)+" sn");
                         }
                         
                           if(b520sayac1<=0){
                                  b520Timer1.cancel();
                                  if(id1.getText().equalsIgnoreCase(Integer.toString(SystemClass.bmw_1.getId()))){
                                      jComboBox1.removeItem(Integer.toString(SystemClass.bmw_1.getId()));
                                      
                                     foto1.setIcon(bmw1s);
                                     timer1.setText("0"+" sn");                                   
                                  }
                                  SystemClass.delete(SystemClass.bmw_1.getId());
                                  SystemClass.del_araba(SystemClass.bmw_1.getId());
                                   jTextArea1.setText(SystemClass.bmw_1.toString());
                           }
                                                                                    
                    }
             };
             b520Timer1.schedule(b520gorev1,0,1000);
             
             TimerTask b520gorev2 =new TimerTask() {
                
                    @Override
                    public void run() {                          
                         if(b520sayac2>0)   
                        b520sayac2--;
                         if(id2.getText().equalsIgnoreCase(Integer.toString(SystemClass.bmw_2.getId()))){
                           timer2.setText(Integer.toString(b520sayac2)+" sn");
                         }
                           if(b520sayac2<=0){
                                  b520Timer2.cancel();
                                  if(id2.getText().equalsIgnoreCase(Integer.toString(SystemClass.bmw_2.getId()))){
                                      jComboBox1.removeItem(Integer.toString(SystemClass.bmw_2.getId())); 
                                      
                                     foto2.setIcon(bmw2s);
                                     timer2.setText("0"+" sn");
                                   
                                  }
                                  SystemClass.delete(SystemClass.bmw_2.getId());
                                  SystemClass.del_araba(SystemClass.bmw_2.getId());
                                  jTextArea1.setText(SystemClass.bmw_2.toString());
                           }
                                
                                                    
                    }
             };
             b520Timer2.schedule(b520gorev2,0,1000);
             
             TimerTask b520gorev3 =new TimerTask() {
              
                    @Override
                    public void run() {                          
                         if(b520sayac3>0)   
                        b520sayac3--;
                         if(id3.getText().equalsIgnoreCase(Integer.toString(SystemClass.bmw_3.getId()))){
                           timer3.setText(Integer.toString(b520sayac3)+" sn");
                         }
                           if(b520sayac3<=0){
                                  b520Timer3.cancel();
                                  if(id3.getText().equalsIgnoreCase(Integer.toString(SystemClass.bmw_3.getId()))){
                                      jComboBox1.removeItem(Integer.toString(SystemClass.bmw_3.getId()));
                                      
                                     foto3.setIcon(bmw3s);
                                     timer3.setText("0"+" sn");
                                         
                                  }
                                  SystemClass.delete(SystemClass.bmw_3.getId());
                                  SystemClass.del_araba(SystemClass.bmw_3.getId());
                                  jTextArea1.setText(SystemClass.bmw_3.toString());
                           }                        
                    }
             };  
        b520Timer3.schedule(b520gorev3,0,1000);
                     TimerTask passatgorev1 =new TimerTask() {
                
                    @Override
                    public void run() {                          
                         if(passatsayac1>0)  
                        passatsayac1--;
                         if(id1.getText().equalsIgnoreCase(Integer.toString(SystemClass.passat_1.getId()))){
                           timer1.setText(Integer.toString(passatsayac1)+" sn");
                         }
                           if(passatsayac1<=0){
                                  passatTimer1.cancel();
                                  if(id1.getText().equalsIgnoreCase(Integer.toString(SystemClass.passat_1.getId()))){
                                      jComboBox1.removeItem(Integer.toString(SystemClass.passat_1.getId()));
                                      
                                     foto1.setIcon(passat1s);
                                     timer1.setText("0"+" sn");
                     
                                  }
                                  SystemClass.delete(SystemClass.passat_1.getId());
                                  SystemClass.del_araba(SystemClass.passat_1.getId());
                                  jTextArea1.setText(SystemClass.passat_1.toString());
                           }                         
                    }
             };
             passatTimer1.schedule(passatgorev1,0,1000);
             
             TimerTask passatgorev2 =new TimerTask() {
                 
                    @Override
                    public void run() {                          
                         if(passatsayac2>0)   
                        passatsayac2--;
                         if(id2.getText().equalsIgnoreCase(Integer.toString(SystemClass.passat_2.getId()))){
                           timer2.setText(Integer.toString(passatsayac2)+" sn");
                         }
                           if(passatsayac2<=0){
                                  passatTimer2.cancel();
                                  if(id2.getText().equalsIgnoreCase(Integer.toString(SystemClass.passat_2.getId()))){
                                     jComboBox1.removeItem(Integer.toString(SystemClass.passat_2.getId())); 
                                     
                                     foto2.setIcon(passat2s);
                                     timer2.setText("0"+" sn");          
                                  }
                                  SystemClass.delete(SystemClass.passat_2.getId());
                                  SystemClass.del_araba(SystemClass.passat_2.getId());
                                  jTextArea1.setText(SystemClass.passat_2.toString()); 
                           }                 
                    }
             };
             passatTimer2.schedule(passatgorev2,0,1000);
             
             TimerTask passatgorev3 =new TimerTask() {
                
                    @Override
                    public void run() {                          
                         if(passatsayac3>0)  
                        passatsayac3--;
                         if(id3.getText().equalsIgnoreCase(Integer.toString(SystemClass.passat_3.getId()))){
                           timer3.setText(Integer.toString(passatsayac3)+" sn");
                         }
                           if(passatsayac3<=0){
                               
                                  passatTimer3.cancel();
                                  if(id3.getText().equalsIgnoreCase(Integer.toString(SystemClass.passat_3.getId()))){
                                     jComboBox1.removeItem(Integer.toString(SystemClass.passat_3.getId())); 
                                     
                                     foto3.setIcon(passat3s);
                                     timer3.setText("0"+" sn");
                     
                                  }
                                  SystemClass.delete(SystemClass.passat_3.getId());
                                  SystemClass.del_araba(SystemClass.passat_3.getId());
                                  jTextArea1.setText(SystemClass.passat_3.toString()); 
                           }
                         
                          
                    }
             };  
        passatTimer3.schedule(passatgorev3,0,1000);

                    TimerTask a3gorev1 =new TimerTask() {
                  
                    @Override
                    public void run() {                          
                         if(a3sayac1>0)  
                        a3sayac1--;
                           if(id4.getText().equalsIgnoreCase(Integer.toString(SystemClass.a3_1.getId()))){
                           timer4.setText(Integer.toString(a3sayac1)+" sn");
                           }
                           if(a3sayac1<=0){
                                  a3Timer1.cancel();
                                  if(id4.getText().equalsIgnoreCase(Integer.toString(SystemClass.a3_1.getId()))){
                                     
                                     jComboBox1.removeItem(Integer.toString(SystemClass.a3_1.getId()));
                                     
                                     timer4.setText("0"+" sn");
                                     foto4.setIcon(a3_1s);
                                  }
                                  SystemClass.delete(SystemClass.a3_1.getId());
                                  SystemClass.del_araba(SystemClass.a3_1.getId());
                                   jTextArea1.setText(SystemClass.a3_1.toString());
                           }
                             
                    }
             };  
                a3Timer1.schedule(a3gorev1,0,1000);
                    TimerTask a3gorev2 =new TimerTask() {
                  
                    @Override
                    public void run() { 
                         if(a3sayac2>0)
                           a3sayac2--;
                           if(id5.getText().equalsIgnoreCase(Integer.toString(SystemClass.a3_2.getId()))){
                           timer5.setText(Integer.toString(a3sayac2)+" sn");
                           }
                           if(a3sayac2<=0){
                                  a3Timer2.cancel();
                                  if(id5.getText().equalsIgnoreCase(Integer.toString(SystemClass.a3_2.getId()))){
                                     
                                     jComboBox1.removeItem(Integer.toString(SystemClass.a3_2.getId()));
                                     
                                     timer5.setText("0"+" sn");
                                     foto5.setIcon(a3_2s);
                                  }
                                  SystemClass.delete(SystemClass.a3_2.getId());
                                  SystemClass.del_araba(SystemClass.a3_2.getId());
                                   jTextArea1.setText(SystemClass.a3_2.toString());
                           }
                             
                    }
             };  
                a3Timer2.schedule(a3gorev2,0,1000); 
                    TimerTask a3gorev3 =new TimerTask() {
                  
                    @Override
                    public void run() {
                         if(a3sayac3>0)
                           a3sayac3--;
                           if(id6.getText().equalsIgnoreCase(Integer.toString(SystemClass.a3_3.getId()))){
                           timer6.setText(Integer.toString(a3sayac3)+" sn");
                           }
                           if(a3sayac3<=0){
                                  a3Timer3.cancel();
                                  if(id6.getText().equalsIgnoreCase(Integer.toString(SystemClass.a3_3.getId()))){
                                     
                                     jComboBox1.removeItem(Integer.toString(SystemClass.a3_3.getId()));
                                     
                                     timer6.setText("0"+" sn");
                                     foto6.setIcon(a3_3s);
                                  }
                                  SystemClass.delete(SystemClass.a3_3.getId());
                                  SystemClass.del_araba(SystemClass.a3_3.getId());
                                   jTextArea1.setText(SystemClass.a3_3.toString());
                           }
                             
                    }
             };  
                a3Timer3.schedule(a3gorev3,0,1000);
                    TimerTask golfgorev1 =new TimerTask() {
                  
                    @Override
                    public void run() { 
                         if(golfsayac1>0)
                           golfsayac1--;
                           if(id5.getText().equalsIgnoreCase(Integer.toString(SystemClass.golf.getId()))){
                           timer5.setText(Integer.toString(golfsayac1)+" sn");
                           }
                           if(golfsayac1<=0){
                                  golfTimer.cancel();
                                  if(id5.getText().equalsIgnoreCase(Integer.toString(SystemClass.golf.getId()))){
                                     
                                     jComboBox1.removeItem(Integer.toString(SystemClass.golf.getId()));
                                     
                                     timer5.setText("0"+" sn");
                                     foto5.setIcon(golfs);
                                  }
                                  SystemClass.delete(SystemClass.golf.getId());
                                  SystemClass.del_araba(SystemClass.golf.getId());
                                   jTextArea1.setText(SystemClass.golf.toString());
                           }
                             
                    }
             };  
                golfTimer.schedule(golfgorev1,0,1000);
                   TimerTask i20gorev1 =new TimerTask() {
                  
                    @Override
                    public void run() {  
                           if(i20sayac1>0)                        
                           i20sayac1--;
                           if(id4.getText().equalsIgnoreCase(Integer.toString(SystemClass.i20_1.getId()))){
                           timer4.setText(Integer.toString(i20sayac1)+" sn");
                           }
                           if(i20sayac1<=0){
                                  i20Timer.cancel();
                                  if(id4.getText().equalsIgnoreCase(Integer.toString(SystemClass.i20_1.getId()))){
                                     
                                     jComboBox1.removeItem(Integer.toString(SystemClass.i20_1.getId()));
                                     
                                     timer4.setText("0"+" sn");
                                     foto4.setIcon(i20_1s);
                                  }
                                  SystemClass.delete(SystemClass.i20_1.getId());
                                  SystemClass.del_araba(SystemClass.i20_1.getId());
                                   jTextArea1.setText(SystemClass.i20_1.toString());
                           }
                             
                    }
             };  
                i20Timer.schedule(i20gorev1,0,1000);                 
    
                     TimerTask chgorev1 =new TimerTask() {
                  
                    @Override
                    public void run() {
                        if(chsayac1>0)
                           chsayac1--;
                           if(id9.getText().equalsIgnoreCase(Integer.toString(SystemClass.chopper1.getId()))) {
                               timer9.setText(Integer.toString(chsayac1)+" sn");
                           }                  
                           if(chsayac1<=0){
                                  chTimer1.cancel();
                                 rbutch1.setVisible(false);
                                  if(id9.getText().equalsIgnoreCase(Integer.toString(SystemClass.chopper1.getId()))){
   
                                     timer9.setText("0"+" sn");
                                     foto9.setIcon(chopper1s);
                                  }
                                  SystemClass.delete(SystemClass.chopper1.getId());
                                  SystemClass.del_motor(SystemClass.chopper1.getId());
                                   jTextArea2.setText(SystemClass.chopper1.toString());
                           }
                             
                    }
             };  
                chTimer1.schedule(chgorev1,0,1000); 
                 TimerTask chgorev2 =new TimerTask() {
                  
                    @Override
                    public void run() {  
                        if(chsayac2>0)                        
                           chsayac2--;
                           if(id10.getText().equalsIgnoreCase(Integer.toString(SystemClass.chopper2.getId()))){
                               timer10.setText(Integer.toString(chsayac2)+" sn");
                           }
                           if(chsayac2<=0){
                                  chTimer2.cancel();
                                  rbutch2.setVisible(false);
                                  if(id10.getText().equalsIgnoreCase(Integer.toString(SystemClass.chopper2.getId()))){
                                                                        
                                     timer10.setText("0"+" sn");
                                     foto10.setIcon(chopper2s);
                                  }
                                  SystemClass.delete(SystemClass.chopper2.getId());
                                  SystemClass.del_motor(SystemClass.chopper2.getId());
                                   jTextArea2.setText(SystemClass.chopper2.toString());
                           }
                             
                    }
             };  
                chTimer2.schedule(chgorev2,0,1000);            
                 TimerTask ssgorev1 =new TimerTask() {
                  
                    @Override
                    public void run() {                          
                        if(ssayac1>0)   
                        ssayac1--;
                           if(id7.getText().equalsIgnoreCase(Integer.toString(SystemClass.bmw1000.getId()))){
                               timer7.setText(Integer.toString(ssayac1)+" sn");
                           }
                           if(ssayac1<=0){
                                  ssTimer1.cancel();
                                  rbuts1.setVisible(false);
                                  if(id7.getText().equalsIgnoreCase(Integer.toString(SystemClass.bmw1000.getId()))){
                                                                      
                                     timer7.setText("0"+" sn");
                                     foto7.setIcon(bmw1000s);
                                  }
                                  SystemClass.delete(SystemClass.bmw1000.getId());
                                  SystemClass.del_motor(SystemClass.bmw1000.getId());
                                   jTextArea2.setText(SystemClass.bmw1000.toString());
                           }                           
                    }
             };  
                ssTimer1.schedule(ssgorev1,0,1000);            
                 TimerTask ssgorev2 =new TimerTask() {
                  
                    @Override
                    public void run() {                          
                        if(ssayac2>0)   
                        ssayac2--;
                           if(id8.getText().equalsIgnoreCase(Integer.toString(SystemClass.ducati.getId()))){
                               timer8.setText(Integer.toString(ssayac2)+" sn");
                           }
                           if(ssayac2<=0){
                                  ssTimer2.cancel();
                                  rbuts2.setVisible(false);
                                  if(id8.getText().equalsIgnoreCase(Integer.toString(SystemClass.ducati.getId()))){
    
                                     timer8.setText("0"+" sn");
                                     foto8.setIcon(ducatis);
                                  }
                                  SystemClass.delete(SystemClass.ducati.getId());
                                  SystemClass.del_motor(SystemClass.ducati.getId());
                                   jTextArea2.setText(SystemClass.ducati.toString());
                           }
                             
                    }
             }; 
                  ssTimer2.schedule(ssgorev2,0,1000);            
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        jPanel4 = new javax.swing.JPanel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jOptionPane2 = new javax.swing.JOptionPane();
        jOptionPane4 = new javax.swing.JOptionPane();
        panelGenel = new javax.swing.JPanel();
        panelSeçim = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jOptionPane3 = new javax.swing.JOptionPane();
        panelAraba = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        panelTarz = new javax.swing.JPanel();
        panelSedan = new javax.swing.JPanel();
        panelSedan1 = new javax.swing.JPanel();
        panelSedan4 = new javax.swing.JPanel();
        foto3 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        id3 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        timer3 = new javax.swing.JLabel();
        teklif3 = new javax.swing.JLabel();
        km3 = new javax.swing.JLabel();
        mh3 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        panelSedan2 = new javax.swing.JPanel();
        foto1 = new javax.swing.JLabel();
        id1 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        timer1 = new javax.swing.JLabel();
        teklif1 = new javax.swing.JLabel();
        km1 = new javax.swing.JLabel();
        mh1 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        panelSedan3 = new javax.swing.JPanel();
        foto2 = new javax.swing.JLabel();
        id2 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        timer2 = new javax.swing.JLabel();
        teklif2 = new javax.swing.JLabel();
        km2 = new javax.swing.JLabel();
        mh2 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        panelHeçbek = new javax.swing.JPanel();
        panelHeçbek1 = new javax.swing.JPanel();
        panelHeçbek3 = new javax.swing.JPanel();
        foto5 = new javax.swing.JLabel();
        id5 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        timer5 = new javax.swing.JLabel();
        teklif5 = new javax.swing.JLabel();
        km5 = new javax.swing.JLabel();
        mh5 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        panelHeçbek4 = new javax.swing.JPanel();
        foto6 = new javax.swing.JLabel();
        id6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        timer6 = new javax.swing.JLabel();
        teklif6 = new javax.swing.JLabel();
        km6 = new javax.swing.JLabel();
        mh6 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        panelHeçbek2 = new javax.swing.JPanel();
        foto4 = new javax.swing.JLabel();
        id4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        timer4 = new javax.swing.JLabel();
        teklif4 = new javax.swing.JLabel();
        km4 = new javax.swing.JLabel();
        mh4 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        panelTeklif = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        isim = new javax.swing.JTextField();
        soyisim = new javax.swing.JTextField();
        teklifim = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        panelMotor = new javax.swing.JPanel();
        panelMotorSeçim = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        panelGeri = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        panelTeklifMotor = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        teklifim2 = new javax.swing.JTextField();
        soyisim2 = new javax.swing.JTextField();
        isim2 = new javax.swing.JTextField();
        jButton17 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel18 = new javax.swing.JLabel();
        panelTarzMotor = new javax.swing.JPanel();
        panelSport = new javax.swing.JPanel();
        panelSport1 = new javax.swing.JPanel();
        rbuts1 = new javax.swing.JRadioButton();
        foto7 = new javax.swing.JLabel();
        id7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        timer7 = new javax.swing.JLabel();
        teklif7 = new javax.swing.JLabel();
        km7 = new javax.swing.JLabel();
        mh7 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        panelSport2 = new javax.swing.JPanel();
        rbuts2 = new javax.swing.JRadioButton();
        foto8 = new javax.swing.JLabel();
        id8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        timer8 = new javax.swing.JLabel();
        teklif8 = new javax.swing.JLabel();
        km8 = new javax.swing.JLabel();
        mh8 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        panelChopper = new javax.swing.JPanel();
        panelchopper2 = new javax.swing.JPanel();
        rbutch1 = new javax.swing.JRadioButton();
        foto9 = new javax.swing.JLabel();
        id9 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        mh9 = new javax.swing.JLabel();
        km9 = new javax.swing.JLabel();
        teklif9 = new javax.swing.JLabel();
        timer9 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        panelchopper3 = new javax.swing.JPanel();
        rbutch2 = new javax.swing.JRadioButton();
        foto10 = new javax.swing.JLabel();
        id10 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        timer10 = new javax.swing.JLabel();
        teklif10 = new javax.swing.JLabel();
        km10 = new javax.swing.JLabel();
        mh10 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 252, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelGenel.setLayout(new java.awt.CardLayout());

        panelSeçim.setBorder(javax.swing.BorderFactory.createMatteBorder(20, 20, 20, 20, new java.awt.Color(0, 0, 0)));
        panelSeçim.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setText("jLabel20");
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
        panelSeçim.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 530, 140, 70));

        jButton1.setBackground(new java.awt.Color(0, 51, 102));
        jButton1.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 24)); // NOI18N
        jButton1.setText("Araba");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panelSeçim.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 332, 101));

        jButton2.setBackground(new java.awt.Color(255, 102, 0));
        jButton2.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 24)); // NOI18N
        jButton2.setText("Motor");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        panelSeçim.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, 332, 117));
        panelSeçim.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 4, 880, 630));
        panelSeçim.add(jOptionPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, -1, -1));

        panelGenel.add(panelSeçim, "card2");

        panelAraba.setBackground(new java.awt.Color(0, 102, 153));

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        jButton3.setText("Sedan");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Hatchback");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 466, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(137, 137, 137))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelTarz.setLayout(new java.awt.CardLayout());

        panelSedan.setBackground(new java.awt.Color(0, 102, 153));
        panelSedan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelSedan1.setBackground(new java.awt.Color(0, 102, 153));
        panelSedan1.setBorder(new javax.swing.border.MatteBorder(null));
        panelSedan1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelSedan4.setBackground(new java.awt.Color(255, 120, 0));
        panelSedan4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        panelSedan4.setMaximumSize(new java.awt.Dimension(160, 180));
        panelSedan4.setMinimumSize(new java.awt.Dimension(160, 180));
        panelSedan4.setPreferredSize(new java.awt.Dimension(160, 180));

        foto3.setText("jLabel1");

        jLabel39.setText("Teklif:");

        jLabel40.setText("KM:");

        id3.setText("a");

        jLabel44.setText("Motor Hacmi:");

        timer3.setText("jLabel5");

        teklif3.setText("jLabel6");

        km3.setText("jLabel7");

        mh3.setText("jLabel8");

        jLabel49.setText("TL");

        javax.swing.GroupLayout panelSedan4Layout = new javax.swing.GroupLayout(panelSedan4);
        panelSedan4.setLayout(panelSedan4Layout);
        panelSedan4Layout.setHorizontalGroup(
            panelSedan4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSedan4Layout.createSequentialGroup()
                .addGroup(panelSedan4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSedan4Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(panelSedan4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelSedan4Layout.createSequentialGroup()
                                .addGroup(panelSedan4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel39)
                                    .addComponent(jLabel40)
                                    .addComponent(id3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(41, 41, 41)
                                .addGroup(panelSedan4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(km3)
                                    .addGroup(panelSedan4Layout.createSequentialGroup()
                                        .addComponent(teklif3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(timer3)))
                            .addGroup(panelSedan4Layout.createSequentialGroup()
                                .addComponent(jLabel44)
                                .addGap(18, 18, 18)
                                .addComponent(mh3))))
                    .addGroup(panelSedan4Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(foto3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        panelSedan4Layout.setVerticalGroup(
            panelSedan4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSedan4Layout.createSequentialGroup()
                .addGroup(panelSedan4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(foto3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelSedan4Layout.createSequentialGroup()
                        .addGroup(panelSedan4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelSedan4Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(timer3))
                            .addGroup(panelSedan4Layout.createSequentialGroup()
                                .addContainerGap(106, Short.MAX_VALUE)
                                .addComponent(id3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelSedan4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel39)
                            .addComponent(teklif3)
                            .addComponent(jLabel49))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelSedan4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel40)
                            .addComponent(km3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelSedan4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(mh3))
                .addGap(5, 5, 5))
        );

        panelSedan1.add(panelSedan4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 230, 190));

        panelSedan2.setBackground(new java.awt.Color(255, 120, 0));
        panelSedan2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        panelSedan2.setMaximumSize(new java.awt.Dimension(160, 180));
        panelSedan2.setMinimumSize(new java.awt.Dimension(160, 180));
        panelSedan2.setPreferredSize(new java.awt.Dimension(160, 180));
        panelSedan2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        foto1.setText("jLabel1");
        panelSedan2.add(foto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 150, 100));

        id1.setText("a");
        panelSedan2.add(id1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 40, 20));

        jLabel29.setText("Teklif:");
        panelSedan2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel30.setText("KM:");
        panelSedan2.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jLabel31.setText("Motor Hacmi:");
        panelSedan2.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        timer1.setText("jLabel5");
        panelSedan2.add(timer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 40, -1));

        teklif1.setText("jLabel6");
        panelSedan2.add(teklif1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, -1, -1));

        km1.setText("jLabel7");
        panelSedan2.add(km1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, -1, -1));

        mh1.setText("jLabel8");
        panelSedan2.add(mh1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, -1, -1));

        jLabel50.setText("TL");
        panelSedan2.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, -1, -1));

        panelSedan1.add(panelSedan2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 190));

        panelSedan3.setBackground(new java.awt.Color(255, 120, 0));
        panelSedan3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        panelSedan3.setMaximumSize(new java.awt.Dimension(160, 180));
        panelSedan3.setMinimumSize(new java.awt.Dimension(160, 180));
        panelSedan3.setPreferredSize(new java.awt.Dimension(160, 180));

        foto2.setText("jLabel1");

        id2.setText("a");

        jLabel32.setText("Teklif:");

        jLabel33.setText("KM:");

        jLabel34.setText("Motor Hacmi:");

        timer2.setText("jLabel5");

        teklif2.setText("jLabel6");

        km2.setText("jLabel7");

        mh2.setText("jLabel8");

        jLabel48.setText("TL");

        javax.swing.GroupLayout panelSedan3Layout = new javax.swing.GroupLayout(panelSedan3);
        panelSedan3.setLayout(panelSedan3Layout);
        panelSedan3Layout.setHorizontalGroup(
            panelSedan3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSedan3Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(panelSedan3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(id2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22)
                .addGroup(panelSedan3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mh2)
                    .addComponent(km2)
                    .addComponent(timer2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelSedan3Layout.createSequentialGroup()
                        .addComponent(teklif2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel48)))
                .addGap(60, 60, 60))
            .addGroup(panelSedan3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(foto2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelSedan3Layout.setVerticalGroup(
            panelSedan3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSedan3Layout.createSequentialGroup()
                .addComponent(foto2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelSedan3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(timer2)
                    .addComponent(id2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelSedan3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSedan3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(teklif2)
                        .addComponent(jLabel48))
                    .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelSedan3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel33)
                    .addComponent(km2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelSedan3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mh2)
                    .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(5, 5, 5))
        );

        panelSedan1.add(panelSedan3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 240, 190));

        panelSedan.add(panelSedan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 770, -1));

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/audi.png"))); // NOI18N
        jButton6.setText("A6");
        jButton6.setMaximumSize(new java.awt.Dimension(75, 25));
        jButton6.setMinimumSize(new java.awt.Dimension(75, 25));
        jButton6.setPreferredSize(new java.awt.Dimension(75, 25));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        panelSedan.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 120, 30));

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bmw.png"))); // NOI18N
        jButton7.setText("Bmw 520");
        jButton7.setMaximumSize(new java.awt.Dimension(75, 25));
        jButton7.setMinimumSize(new java.awt.Dimension(75, 25));
        jButton7.setPreferredSize(new java.awt.Dimension(75, 25));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        panelSedan.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 120, 30));

        jButton8.setBackground(new java.awt.Color(255, 255, 255));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/vw.jpg"))); // NOI18N
        jButton8.setText("Passat");
        jButton8.setMaximumSize(new java.awt.Dimension(75, 25));
        jButton8.setMinimumSize(new java.awt.Dimension(75, 25));
        jButton8.setPreferredSize(new java.awt.Dimension(75, 25));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        panelSedan.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 120, 30));

        panelTarz.add(panelSedan, "card2");

        panelHeçbek.setBackground(new java.awt.Color(0, 102, 153));

        panelHeçbek1.setBackground(new java.awt.Color(0, 102, 153));
        panelHeçbek1.setBorder(new javax.swing.border.MatteBorder(null));
        panelHeçbek1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelHeçbek3.setBackground(new java.awt.Color(255, 102, 0));
        panelHeçbek3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        foto5.setText("jLabel1");

        id5.setText("jLabel1");

        jLabel41.setText("Teklif:");

        jLabel42.setText("KM:");

        jLabel43.setText("Motor Hacmi:");

        timer5.setText("jLabel5");

        teklif5.setText("jLabel6");

        km5.setText("jLabel7");

        mh5.setText("jLabel8");

        jLabel38.setText("TL");

        javax.swing.GroupLayout panelHeçbek3Layout = new javax.swing.GroupLayout(panelHeçbek3);
        panelHeçbek3.setLayout(panelHeçbek3Layout);
        panelHeçbek3Layout.setHorizontalGroup(
            panelHeçbek3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeçbek3Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(panelHeçbek3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelHeçbek3Layout.createSequentialGroup()
                        .addGroup(panelHeçbek3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel42)
                            .addComponent(jLabel43)
                            .addComponent(foto5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(id5))
                        .addContainerGap(69, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHeçbek3Layout.createSequentialGroup()
                        .addGroup(panelHeçbek3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelHeçbek3Layout.createSequentialGroup()
                                .addComponent(jLabel41)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(teklif5))
                            .addGroup(panelHeçbek3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(panelHeçbek3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(timer5)
                                    .addComponent(mh5)
                                    .addComponent(km5))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel38)
                        .addGap(55, 55, 55))))
        );
        panelHeçbek3Layout.setVerticalGroup(
            panelHeçbek3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeçbek3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(foto5, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelHeçbek3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timer5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelHeçbek3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teklif5)
                    .addComponent(jLabel38))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelHeçbek3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(km5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelHeçbek3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(mh5))
                .addContainerGap())
        );

        panelHeçbek1.add(panelHeçbek3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 270, 190));

        panelHeçbek4.setBackground(new java.awt.Color(255, 102, 0));
        panelHeçbek4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        foto6.setText("jLabel2");

        id6.setText("jLabel3");

        jLabel4.setText("Teklif:");

        jLabel5.setText("KM:");

        jLabel6.setText("Motor Hacmi:");

        timer6.setText("jLabel3");

        teklif6.setText("jLabel7");

        km6.setText("jLabel8");

        mh6.setText("jLabel9");

        jLabel46.setText("TL");

        javax.swing.GroupLayout panelHeçbek4Layout = new javax.swing.GroupLayout(panelHeçbek4);
        panelHeçbek4.setLayout(panelHeçbek4Layout);
        panelHeçbek4Layout.setHorizontalGroup(
            panelHeçbek4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeçbek4Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(panelHeçbek4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelHeçbek4Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(mh6))
                    .addGroup(panelHeçbek4Layout.createSequentialGroup()
                        .addGroup(panelHeçbek4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelHeçbek4Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(km6))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelHeçbek4Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(teklif6))
                            .addGroup(panelHeçbek4Layout.createSequentialGroup()
                                .addComponent(id6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                                .addComponent(timer6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel46))
                    .addComponent(foto6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        panelHeçbek4Layout.setVerticalGroup(
            panelHeçbek4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeçbek4Layout.createSequentialGroup()
                .addComponent(foto6, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelHeçbek4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id6)
                    .addComponent(timer6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelHeçbek4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(teklif6)
                    .addComponent(jLabel46))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelHeçbek4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(km6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelHeçbek4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(mh6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelHeçbek1.add(panelHeçbek4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, 260, 190));

        panelHeçbek2.setBackground(new java.awt.Color(255, 102, 0));
        panelHeçbek2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        panelHeçbek2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelHeçbek2.add(foto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 150, 90));

        id4.setText("jLabel7");
        panelHeçbek2.add(id4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 102, -1, -1));

        jLabel8.setText("Teklif:");
        panelHeçbek2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 124, -1, -1));

        jLabel9.setText("KM:");
        panelHeçbek2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 146, -1, -1));

        jLabel10.setText("Motor Hacmi:");
        panelHeçbek2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 168, -1, -1));

        timer4.setText("jLabel11");
        panelHeçbek2.add(timer4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, -1, -1));

        teklif4.setText("jLabel12");
        panelHeçbek2.add(teklif4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, -1, -1));

        km4.setText("jLabel13");
        panelHeçbek2.add(km4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, -1, -1));

        mh4.setText("jLabel17");
        panelHeçbek2.add(mh4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, -1, -1));

        jLabel45.setText("TL");
        panelHeçbek2.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, -1, -1));

        panelHeçbek1.add(panelHeçbek2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 190));

        jButton12.setBackground(new java.awt.Color(255, 255, 255));
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hyundai.jpg"))); // NOI18N
        jButton12.setText("I20");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setBackground(new java.awt.Color(255, 255, 255));
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/vw.jpg"))); // NOI18N
        jButton13.setText("Golf");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setBackground(new java.awt.Color(255, 255, 255));
        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/audi.png"))); // NOI18N
        jButton14.setText("A3");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelHeçbekLayout = new javax.swing.GroupLayout(panelHeçbek);
        panelHeçbek.setLayout(panelHeçbekLayout);
        panelHeçbekLayout.setHorizontalGroup(
            panelHeçbekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeçbekLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(172, 172, 172)
                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(170, 170, 170)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelHeçbekLayout.createSequentialGroup()
                .addComponent(panelHeçbek1, javax.swing.GroupLayout.PREFERRED_SIZE, 881, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        panelHeçbekLayout.setVerticalGroup(
            panelHeçbekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHeçbekLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelHeçbekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton12)
                    .addComponent(jButton13)
                    .addComponent(jButton14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelHeçbek1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelTarz.add(panelHeçbek, "card3");

        panelTeklif.setBackground(new java.awt.Color(0, 102, 153));
        panelTeklif.setBorder(new javax.swing.border.MatteBorder(null));
        panelTeklif.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setText("AD:");
        panelTeklif.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 30, 20));

        jLabel26.setText("SOYAD:");
        panelTeklif.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, 20));

        jLabel27.setText("Teklifim:");
        panelTeklif.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));
        panelTeklif.add(isim, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 80, 30));
        panelTeklif.add(soyisim, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 80, 30));

        teklifim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teklifimActionPerformed(evt);
            }
        });
        panelTeklif.add(teklifim, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 80, 30));

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        panelTeklif.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        panelTeklif.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 280, 130));

        jButton9.setText("Teklif Yap");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        panelTeklif.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, -1, -1));

        jLabel1.setText("Yapılan Son Satış");
        panelTeklif.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, -1, -1));

        jLabel2.setText("Araç Id Numarası");
        panelTeklif.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, 20));

        jPanel2.setBackground(new java.awt.Color(0, 102, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 0, 45, 42));

        javax.swing.GroupLayout panelArabaLayout = new javax.swing.GroupLayout(panelAraba);
        panelAraba.setLayout(panelArabaLayout);
        panelArabaLayout.setHorizontalGroup(
            panelArabaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelArabaLayout.createSequentialGroup()
                .addGroup(panelArabaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelArabaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelTarz, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelArabaLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelArabaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(panelTeklif, javax.swing.GroupLayout.PREFERRED_SIZE, 893, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelArabaLayout.setVerticalGroup(
            panelArabaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelArabaLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelTarz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelTeklif, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelGenel.add(panelAraba, "card3");

        panelMotor.setBackground(new java.awt.Color(255, 102, 0));

        panelMotorSeçim.setBackground(new java.awt.Color(255, 102, 0));

        jButton11.setText("Super Sport");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton15.setText("Chopper");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMotorSeçimLayout = new javax.swing.GroupLayout(panelMotorSeçim);
        panelMotorSeçim.setLayout(panelMotorSeçimLayout);
        panelMotorSeçimLayout.setHorizontalGroup(
            panelMotorSeçimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMotorSeçimLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(268, 268, 268)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(177, 177, 177))
        );
        panelMotorSeçimLayout.setVerticalGroup(
            panelMotorSeçimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMotorSeçimLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(panelMotorSeçimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        panelGeri.setBackground(new java.awt.Color(255, 102, 0));

        jLabel37.setText("   ");
        jLabel37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel37MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelGeriLayout = new javax.swing.GroupLayout(panelGeri);
        panelGeri.setLayout(panelGeriLayout);
        panelGeriLayout.setHorizontalGroup(
            panelGeriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGeriLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelGeriLayout.setVerticalGroup(
            panelGeriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel37, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        panelTeklifMotor.setBackground(new java.awt.Color(255, 102, 0));

        jLabel3.setText("AD:");

        jLabel16.setText("SOYAD:");

        jLabel17.setText("Teklifim:");

        jButton17.setText("Teklif Yap");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jLabel18.setText("Yapılan Son Satış:");

        javax.swing.GroupLayout panelTeklifMotorLayout = new javax.swing.GroupLayout(panelTeklifMotor);
        panelTeklifMotor.setLayout(panelTeklifMotorLayout);
        panelTeklifMotorLayout.setHorizontalGroup(
            panelTeklifMotorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTeklifMotorLayout.createSequentialGroup()
                .addGroup(panelTeklifMotorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelTeklifMotorLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton17))
                    .addGroup(panelTeklifMotorLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(panelTeklifMotorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelTeklifMotorLayout.createSequentialGroup()
                                .addGroup(panelTeklifMotorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16))
                                .addGap(18, 18, 18)
                                .addGroup(panelTeklifMotorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(soyisim2)
                                    .addComponent(isim2)))
                            .addGroup(panelTeklifMotorLayout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(18, 18, 18)
                                .addComponent(teklifim2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(109, 109, 109)
                .addGroup(panelTeklifMotorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(216, 216, 216))
        );
        panelTeklifMotorLayout.setVerticalGroup(
            panelTeklifMotorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTeklifMotorLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTeklifMotorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTeklifMotorLayout.createSequentialGroup()
                        .addGroup(panelTeklifMotorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(isim2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelTeklifMotorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(soyisim2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelTeklifMotorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(teklifim2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton17)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelTarzMotor.setBackground(new java.awt.Color(255, 120, 0));
        panelTarzMotor.setLayout(new java.awt.CardLayout());

        panelSport.setBackground(new java.awt.Color(255, 102, 0));

        panelSport1.setBackground(new java.awt.Color(0, 102, 153));
        panelSport1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        panelSport1.setMaximumSize(new java.awt.Dimension(280, 214));
        panelSport1.setMinimumSize(new java.awt.Dimension(218, 214));
        panelSport1.setPreferredSize(new java.awt.Dimension(280, 214));
        panelSport1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup1.add(rbuts1);
        panelSport1.add(rbuts1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));
        panelSport1.add(foto7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 150, 105));

        id7.setText("1016");
        panelSport1.add(id7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, -1));

        jLabel13.setText("Teklif:");
        panelSport1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, -1, -1));

        jLabel14.setText("KM:");
        panelSport1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, -1, -1));

        jLabel15.setText("Motor Hacmi:");
        panelSport1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, -1, -1));

        timer7.setText("timer");
        timer7.setMaximumSize(new java.awt.Dimension(50, 14));
        timer7.setMinimumSize(new java.awt.Dimension(50, 14));
        timer7.setPreferredSize(new java.awt.Dimension(50, 14));
        panelSport1.add(timer7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, -1, -1));

        teklif7.setText("teklif");
        teklif7.setMaximumSize(new java.awt.Dimension(50, 14));
        teklif7.setMinimumSize(new java.awt.Dimension(50, 14));
        teklif7.setPreferredSize(new java.awt.Dimension(50, 14));
        panelSport1.add(teklif7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 60, -1));

        km7.setText("kilo");
        km7.setMaximumSize(new java.awt.Dimension(50, 14));
        km7.setMinimumSize(new java.awt.Dimension(50, 14));
        km7.setPreferredSize(new java.awt.Dimension(50, 14));
        panelSport1.add(km7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, -1, -1));

        mh7.setText("motor");
        mh7.setMaximumSize(new java.awt.Dimension(50, 14));
        mh7.setMinimumSize(new java.awt.Dimension(50, 14));
        mh7.setPreferredSize(new java.awt.Dimension(50, 14));
        panelSport1.add(mh7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, -1, -1));

        jLabel51.setText("TL");
        panelSport1.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, -1, -1));

        panelSport2.setBackground(new java.awt.Color(0, 102, 153));
        panelSport2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        panelSport2.setMaximumSize(new java.awt.Dimension(280, 214));
        panelSport2.setMinimumSize(new java.awt.Dimension(218, 214));
        panelSport2.setPreferredSize(new java.awt.Dimension(280, 214));

        buttonGroup1.add(rbuts2);
        rbuts2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbuts2ActionPerformed(evt);
            }
        });

        id8.setText("1017");

        jLabel7.setText("Teklif:");

        jLabel11.setText("KM:");

        jLabel12.setText("Motor Hacmi:");

        timer8.setText("timer");
        timer8.setMaximumSize(new java.awt.Dimension(50, 14));
        timer8.setMinimumSize(new java.awt.Dimension(50, 14));
        timer8.setPreferredSize(new java.awt.Dimension(50, 14));

        teklif8.setText("teklif");
        teklif8.setMaximumSize(new java.awt.Dimension(50, 14));
        teklif8.setMinimumSize(new java.awt.Dimension(50, 14));
        teklif8.setPreferredSize(new java.awt.Dimension(50, 14));

        km8.setText("kilo");
        km8.setMaximumSize(new java.awt.Dimension(50, 14));
        km8.setMinimumSize(new java.awt.Dimension(50, 14));
        km8.setPreferredSize(new java.awt.Dimension(50, 14));

        mh8.setText("motor");
        mh8.setMaximumSize(new java.awt.Dimension(50, 14));
        mh8.setMinimumSize(new java.awt.Dimension(50, 14));
        mh8.setPreferredSize(new java.awt.Dimension(50, 14));

        jLabel52.setText("TL");

        javax.swing.GroupLayout panelSport2Layout = new javax.swing.GroupLayout(panelSport2);
        panelSport2.setLayout(panelSport2Layout);
        panelSport2Layout.setHorizontalGroup(
            panelSport2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSport2Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(rbuts2)
                .addGap(18, 18, 18)
                .addGroup(panelSport2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSport2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(mh8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelSport2Layout.createSequentialGroup()
                        .addGroup(panelSport2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelSport2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(id8))
                        .addGap(18, 18, 18)
                        .addGroup(panelSport2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(km8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelSport2Layout.createSequentialGroup()
                                .addGroup(panelSport2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(teklif8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(timer8, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE))
                                .addGap(3, 3, 3)
                                .addComponent(jLabel52))))
                    .addComponent(foto8, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        panelSport2Layout.setVerticalGroup(
            panelSport2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSport2Layout.createSequentialGroup()
                .addGroup(panelSport2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSport2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(foto8, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelSport2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(rbuts2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelSport2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(id8)
                    .addComponent(timer8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelSport2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(panelSport2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(teklif8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel52)))
                .addGap(18, 18, 18)
                .addGroup(panelSport2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(km8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelSport2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(mh8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelSportLayout = new javax.swing.GroupLayout(panelSport);
        panelSport.setLayout(panelSportLayout);
        panelSportLayout.setHorizontalGroup(
            panelSportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSportLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelSport1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 177, Short.MAX_VALUE)
                .addComponent(panelSport2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );
        panelSportLayout.setVerticalGroup(
            panelSportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSportLayout.createSequentialGroup()
                .addGroup(panelSportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelSport1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelSport2, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE))
                .addContainerGap())
        );

        panelTarzMotor.add(panelSport, "card2");

        panelChopper.setBackground(new java.awt.Color(255, 102, 0));

        panelchopper2.setBackground(new java.awt.Color(0, 102, 153));
        panelchopper2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        buttonGroup1.add(rbutch1);

        foto9.setText("jLabel19");

        id9.setText("1017");

        jLabel21.setText("Teklif:");

        jLabel22.setText("KM:");

        jLabel23.setText("Motor Hacmi:");

        mh9.setText("motor");

        km9.setText("kilo");

        teklif9.setText("teklif");

        timer9.setText("timer");
        timer9.setPreferredSize(new java.awt.Dimension(20, 5));

        jLabel53.setText("TL");

        javax.swing.GroupLayout panelchopper2Layout = new javax.swing.GroupLayout(panelchopper2);
        panelchopper2.setLayout(panelchopper2Layout);
        panelchopper2Layout.setHorizontalGroup(
            panelchopper2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelchopper2Layout.createSequentialGroup()
                .addGroup(panelchopper2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(panelchopper2Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(panelchopper2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(id9)
                            .addComponent(jLabel22)
                            .addComponent(jLabel23))
                        .addGap(29, 29, 29)
                        .addGroup(panelchopper2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mh9)
                            .addComponent(timer9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(km9, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelchopper2Layout.createSequentialGroup()
                                .addComponent(teklif9, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel53)))
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelchopper2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(rbutch1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(foto9, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        panelchopper2Layout.setVerticalGroup(
            panelchopper2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelchopper2Layout.createSequentialGroup()
                .addGroup(panelchopper2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelchopper2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(foto9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelchopper2Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(rbutch1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelchopper2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id9)
                    .addComponent(timer9, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelchopper2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addGroup(panelchopper2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(teklif9, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel53)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelchopper2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(km9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelchopper2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(mh9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelchopper3.setBackground(new java.awt.Color(0, 102, 153));
        panelchopper3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        panelchopper3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup1.add(rbutch2);
        panelchopper3.add(rbutch2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        foto10.setText("jLabel18");
        panelchopper3.add(foto10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 150, 93));

        id10.setText("1019");
        panelchopper3.add(id10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, -1));

        jLabel28.setText("Teklif:");
        panelchopper3.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 39, -1));

        jLabel35.setText("KM:");
        panelchopper3.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, -1, -1));

        jLabel36.setText("Motor Hacmi:");
        panelchopper3.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, -1, -1));

        timer10.setText("timer");
        timer10.setInheritsPopupMenu(false);
        panelchopper3.add(timer10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 51, -1));

        teklif10.setText("teklif");
        panelchopper3.add(teklif10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 60, -1));

        km10.setText("kilo");
        panelchopper3.add(km10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 51, -1));

        mh10.setText("motor");
        panelchopper3.add(mh10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 51, -1));

        jLabel54.setText("TL");
        panelchopper3.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, -1, -1));

        javax.swing.GroupLayout panelChopperLayout = new javax.swing.GroupLayout(panelChopper);
        panelChopper.setLayout(panelChopperLayout);
        panelChopperLayout.setHorizontalGroup(
            panelChopperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelChopperLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(panelchopper2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(panelchopper3, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );
        panelChopperLayout.setVerticalGroup(
            panelChopperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelChopperLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelChopperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelchopper2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelchopper3, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        panelTarzMotor.add(panelChopper, "card3");

        javax.swing.GroupLayout panelMotorLayout = new javax.swing.GroupLayout(panelMotor);
        panelMotor.setLayout(panelMotorLayout);
        panelMotorLayout.setHorizontalGroup(
            panelMotorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMotorLayout.createSequentialGroup()
                .addGroup(panelMotorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelGeri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelMotorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelMotorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelMotorSeçim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelTeklifMotor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelTarzMotor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        panelMotorLayout.setVerticalGroup(
            panelMotorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMotorLayout.createSequentialGroup()
                .addComponent(panelMotorSeçim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelTarzMotor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelTeklifMotor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(panelGeri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelGenel.add(panelMotor, "card4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGenel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelGenel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    panelTarz.setVisible(true);    
    panelHeçbek.setVisible(true);
    panelHeçbek1.setVisible(false);
    panelSedan.setVisible(false);
    panelTeklif.setVisible(false);
    panelSedan1.setVisible(false);   
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    panelTarz.setVisible(true);
    panelHeçbek.setVisible(false);
    panelSedan.setVisible(true);
    panelSedan1.setVisible(false);
    panelTeklif.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
       panelHeçbek1.setVisible(true);
       panelHeçbek2.setVisible(true);
       panelHeçbek3.setVisible(false);
       panelHeçbek4.setVisible(true);
       panelTeklif.setVisible(true);
       jComboBox1.removeAllItems();
       foto6.setIcon(i20_2s);
       jComboBox1.addItem(Integer.toString(SystemClass.i20_1.getId()));
       timer4.setText(Integer.toString(golfsayac1));
       if(i20sayac1<=0){
             foto4.setIcon(i20_1s);
       jComboBox1.removeItem(Integer.toString(SystemClass.i20_1.getId()));
       timer4.setText("0"+" sn");}
       else{
             foto4.setIcon(i20_1);}
       teklif4.setText(Double.toString(SystemClass.i20_1.getPrice()));
       km4.setText(SystemClass.i20_1.getKm());
       mh4.setText(SystemClass.i20_1.getMotor());
       id4.setText(Integer.toString(SystemClass.i20_1.getId())); 
       teklif6.setText(Double.toString(SystemClass.i20_2.getPrice()));
       km6.setText(SystemClass.i20_2.getKm());
       mh6.setText(SystemClass.i20_2.getMotor());
       id6.setText(Integer.toString(SystemClass.i20_2.getId())); 
       timer6.setText("0"+" sn");
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
    
    name =isim.getText();
    surname=soyisim.getText();
    Users u1 = new Users(name,surname);
    price= Double.parseDouble(teklifim.getText());

    if(Integer.parseInt((String)jComboBox1.getSelectedItem())==SystemClass.a6_1.getId()){   
    if(SystemClass.a6_1.price<Double.parseDouble(teklifim.getText()))
    {
       SystemClass.a6_1.setPrice(price);
       teklif1.setText(teklifim.getText());
       SystemClass.a6_1.setU1(u1);
       a6sayac1+=10;
       jOptionPane4.showMessageDialog(null,"Aracı için teklifiniz alınmıştır","Bilgilendirme mesajı",0, a6_1);
    }
    else
       jOptionPane4.showMessageDialog(null,"Lütfen Araç bilgilerinde yazandan daha fazla bir değer giriniz.","Bilgilendirme mesajı",0);
    }
    if(Integer.parseInt((String)jComboBox1.getSelectedItem())==SystemClass.a6_2.getId()){
    if(SystemClass.a6_2.price<Double.parseDouble(teklifim.getText()))
    {
       SystemClass.a6_2.setPrice(price);
       teklif2.setText(teklifim.getText());
       SystemClass.a6_2.setU1(u1);
       a6sayac2+=10;
       jOptionPane4.showMessageDialog(null,"Aracı için teklifiniz alınmıştır","Bilgilendirme mesajı",0, a6_2);
    }
     else
       jOptionPane4.showMessageDialog(null,"Lütfen Araç bilgilerinde yazandan daha fazla bir değer giriniz.","Bilgilendirme mesajı",0);
    }
    if(Integer.parseInt((String)jComboBox1.getSelectedItem())==SystemClass.a6_3.getId()){
    if(SystemClass.a6_3.price<Double.parseDouble(teklifim.getText()))
    {
       SystemClass.a6_3.setPrice(price);
       teklif3.setText(teklifim.getText());
       SystemClass.a6_3.setU1(u1);
       a6sayac3+=10;
       jOptionPane4.showMessageDialog(null,"Aracı için teklifiniz alınmıştır","Bilgilendirme mesajı",0, a6_3);
    }
     else
       jOptionPane4.showMessageDialog(null,"Lütfen Araç bilgilerinde yazandan daha fazla bir değer giriniz.","Bilgilendirme mesajı",0);
    }
    if(Integer.parseInt((String)jComboBox1.getSelectedItem())==SystemClass.bmw_1.getId()){
    if(SystemClass.bmw_1.price<Double.parseDouble(teklifim.getText()))
    {
       SystemClass.bmw_1.setPrice(price);
       teklif1.setText(teklifim.getText());
       SystemClass.bmw_1.setU1(u1);
       b520sayac1+=10;
       jOptionPane4.showMessageDialog(null,"Aracı için teklifiniz alınmıştır","Bilgilendirme mesajı",0,bmw1);
    }
     else
       jOptionPane4.showMessageDialog(null,"Lütfen Araç bilgilerinde yazandan daha fazla bir değer giriniz.","Bilgilendirme mesajı",0);
    }
    if(Integer.parseInt((String)jComboBox1.getSelectedItem())==SystemClass.bmw_2.getId()){
    if(SystemClass.bmw_2.price<Double.parseDouble(teklifim.getText()))
    {
       SystemClass.bmw_2.setPrice(price);
       teklif2.setText(teklifim.getText());
       SystemClass.bmw_2.setU1(u1);
       b520sayac2+=10;
       jOptionPane4.showMessageDialog(null,"Aracı için teklifiniz alınmıştır","Bilgilendirme mesajı",0, bmw2);
    }
     else
       jOptionPane4.showMessageDialog(null,"Lütfen Araç bilgilerinde yazandan daha fazla bir değer giriniz.","Bilgilendirme mesajı",0);
    }
    if(Integer.parseInt((String)jComboBox1.getSelectedItem())==SystemClass.bmw_3.getId()){
    if(SystemClass.bmw_3.price<Double.parseDouble(teklifim.getText()))
    {
       SystemClass.bmw_3.setPrice(price);
       teklif3.setText(teklifim.getText());
       SystemClass.bmw_3.setU1(u1);
       b520sayac3+=10;
       jOptionPane4.showMessageDialog(null,"Aracı için teklifiniz alınmıştır","Bilgilendirme mesajı",0, bmw3);
    }
     else
       jOptionPane4.showMessageDialog(null,"Lütfen Araç bilgilerinde yazandan daha fazla bir değer giriniz.","Bilgilendirme mesajı",0);
    }
    if(Integer.parseInt((String)jComboBox1.getSelectedItem())==SystemClass.passat_1.getId()){
    if(SystemClass.passat_1.price<Double.parseDouble(teklifim.getText()))
    {
       SystemClass.passat_1.setPrice(price);
       teklif1.setText(teklifim.getText());
       SystemClass.passat_1.setU1(u1);
       passatsayac1+=10;
       jOptionPane4.showMessageDialog(null,"Aracı için teklifiniz alınmıştır","Bilgilendirme mesajı",0, passat1);
    }
     else
       jOptionPane4.showMessageDialog(null,"Lütfen Araç bilgilerinde yazandan daha fazla bir değer giriniz.","Bilgilendirme mesajı",0);
    }
    if(Integer.parseInt((String)jComboBox1.getSelectedItem())==SystemClass.passat_2.getId()){
    if(SystemClass.passat_2.price<Double.parseDouble(teklifim.getText()))
    {
       SystemClass.passat_2.setPrice(price);
       teklif2.setText(teklifim.getText());
       SystemClass.passat_2.setU1(u1);
       passatsayac2+=10;
       jOptionPane4.showMessageDialog(null,"Aracı için teklifiniz alınmıştır","Bilgilendirme mesajı",0, passat2);
    }
     else
       jOptionPane4.showMessageDialog(null,"Lütfen Araç bilgilerinde yazandan daha fazla bir değer giriniz.","Bilgilendirme mesajı",0);
    }
    if(Integer.parseInt((String)jComboBox1.getSelectedItem())==SystemClass.passat_3.getId()){
    if(SystemClass.passat_3.price<Double.parseDouble(teklifim.getText()))
    {
       SystemClass.passat_3.setPrice(price);
       teklif3.setText(teklifim.getText());
       SystemClass.passat_3.setU1(u1);
       passatsayac3+=10;
       jOptionPane4.showMessageDialog(null,"Aracı için teklifiniz alınmıştır","Bilgilendirme mesajı",0,passat3);
    }
     else
       jOptionPane4.showMessageDialog(null,"Lütfen Araç bilgilerinde yazandan daha fazla bir değer giriniz.","Bilgilendirme mesajı",0);
    }
    if(Integer.parseInt((String)jComboBox1.getSelectedItem())==SystemClass.a3_1.getId()){
    if(SystemClass.a3_1.price<Double.parseDouble(teklifim.getText()))
    {
       SystemClass.a3_1.setPrice(price);
       teklif4.setText(teklifim.getText());
       SystemClass.a3_1.setU1(u1);
       a3sayac1+=10;
       jOptionPane4.showMessageDialog(null,"Aracı için teklifiniz alınmıştır","Bilgilendirme mesajı",0, a3_1);
    }
     else
       jOptionPane4.showMessageDialog(null,"Lütfen Araç bilgilerinde yazandan daha fazla bir değer giriniz.","Bilgilendirme mesajı",0);
    }
    if(Integer.parseInt((String)jComboBox1.getSelectedItem())==SystemClass.a3_2.getId()){
    if(SystemClass.a3_2.price<Double.parseDouble(teklifim.getText()))
    {
       SystemClass.a3_2.setPrice(price);
       teklif5.setText(teklifim.getText());
       SystemClass.a3_2.setU1(u1);
       a3sayac2+=10;
       jOptionPane4.showMessageDialog(null,"Aracı için teklifiniz alınmıştır","Bilgilendirme mesajı",0, a3_2);
    }
     else
       jOptionPane4.showMessageDialog(null,"Lütfen Araç bilgilerinde yazandan daha fazla bir değer giriniz.","Bilgilendirme mesajı",0);
    }   
    if(Integer.parseInt((String)jComboBox1.getSelectedItem())==SystemClass.a3_3.getId()){
    if(SystemClass.a3_3.price<Double.parseDouble(teklifim.getText()))
    {
       SystemClass.a3_3.setPrice(price);
       teklif6.setText(teklifim.getText());
       SystemClass.a3_3.setU1(u1);
       a3sayac3+=10;
       jOptionPane4.showMessageDialog(null,"Aracı için teklifiniz alınmıştır","Bilgilendirme mesajı",0, a3_3);
    }
     else
       jOptionPane4.showMessageDialog(null,"Lütfen Araç bilgilerinde yazandan daha fazla bir değer giriniz.","Bilgilendirme mesajı",0);
    }
    if(Integer.parseInt((String)jComboBox1.getSelectedItem())==SystemClass.i20_1.getId()){
    if(SystemClass.i20_1.price<Double.parseDouble(teklifim.getText()))
    {
       SystemClass.i20_1.setPrice(price);
       teklif4.setText(teklifim.getText());
       SystemClass.i20_1.setU1(u1);
       i20sayac1+=10;
       jOptionPane4.showMessageDialog(null,"Aracı için teklifiniz alınmıştır","Bilgilendirme mesajı",0, i20_1);
    }
     else
       jOptionPane4.showMessageDialog(null,"Lütfen Araç bilgilerinde yazandan daha fazla bir değer giriniz.","Bilgilendirme mesajı",0);
    }
    if(Integer.parseInt((String)jComboBox1.getSelectedItem())==SystemClass.golf.getId()){
    if(SystemClass.golf.price<Double.parseDouble(teklifim.getText()))
    {
       SystemClass.golf.setPrice(price);
       teklif4.setText(teklifim.getText());
       SystemClass.golf.setU1(u1);
       golfsayac1+=10;
       jOptionPane4.showMessageDialog(null,"Aracı için teklifiniz alınmıştır","Bilgilendirme mesajı",0,golf);
    }
     else
       jOptionPane4.showMessageDialog(null,"Lütfen Araç bilgilerinde yazandan daha fazla bir değer giriniz.","Bilgilendirme mesajı",0);
    } 
    isim.setText("");
    soyisim.setText("");
    teklifim.setText("");
    
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       jComboBox1.removeAllItems();
       jComboBox1.addItem(Integer.toString(SystemClass.a6_1.getId()));
       jComboBox1.addItem(Integer.toString(SystemClass.a6_2.getId()));
       jComboBox1.addItem(Integer.toString(SystemClass.a6_3.getId()));
       panelSedan1.setVisible(true);
       panelSedan2.setVisible(true);
       panelSedan3.setVisible(true);
       panelSedan4.setVisible(true);
       panelHeçbek1.setVisible(false);
       panelTeklif.setVisible(true);
       timer1.setText(Integer.toString(a6sayac1));
       timer2.setText(Integer.toString(a6sayac2));
       timer3.setText(Integer.toString(a6sayac3));
       if(a6sayac1<=0){
            foto1.setIcon(a6_1s);
            jComboBox1.removeItem(Integer.toString(SystemClass.a6_1.getId()));
            timer1.setText("0"+" sn");}
       else{
           foto1.setIcon(a6_1);}
       if(a6sayac2<=0){
            foto2.setIcon(a6_2s);
            jComboBox1.removeItem(Integer.toString(SystemClass.a6_2.getId()));
            timer2.setText("0"+" sn");}
       else{
           foto2.setIcon(a6_2);}
       if(a6sayac3<=0){
             foto3.setIcon(a6_3s);
            jComboBox1.removeItem(Integer.toString(SystemClass.a6_3.getId()));
            timer3.setText("0"+" sn");}
       else{
           foto3.setIcon(a6_3);}
       teklif1.setText(Double.toString(SystemClass.a6_1.getPrice()));
       km1.setText(SystemClass.a6_1.getKm());
       mh1.setText(SystemClass.a6_1.getMotor());
       id1.setText(Integer.toString(SystemClass.a6_1.getId()));
       teklif2.setText(Double.toString(SystemClass.a6_2.getPrice()));
       km2.setText(SystemClass.a6_2.getKm());
       mh2.setText(SystemClass.a6_2.getMotor());
       id2.setText(Integer.toString(SystemClass.a6_2.getId()));
       teklif3.setText(Double.toString(SystemClass.a6_3.getPrice()));
       km3.setText(SystemClass.a6_3.getKm());
       mh3.setText(SystemClass.a6_3.getMotor());
       id3.setText(Integer.toString(SystemClass.a6_3.getId()));
       
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       jComboBox1.removeAllItems();
       //jTextArea1.setText("");
       jComboBox1.addItem(Integer.toString(SystemClass.bmw_1.getId()));
       jComboBox1.addItem(Integer.toString(SystemClass.bmw_2.getId()));
       jComboBox1.addItem(Integer.toString(SystemClass.bmw_3.getId()));
        panelSedan1.setVisible(true);
       panelHeçbek1.setVisible(false);
       panelTeklif.setVisible(true);
       timer1.setName(Integer.toString(b520sayac1));
        timer2.setText(Integer.toString(b520sayac2));
       timer3.setText(Integer.toString(b520sayac3));
        if(b520sayac1<=0){
            foto1.setIcon(bmw1s);
         jComboBox1.removeItem(Integer.toString(SystemClass.bmw_1.getId()));
        timer1.setText("0"+" sn");}
       else{
           foto1.setIcon(bmw1);
       }
       if(b520sayac2<=0){
            foto2.setIcon(bmw2s);
             jComboBox1.removeItem(Integer.toString(SystemClass.bmw_2.getId()));
             timer2.setText("0"+" sn");
       }
       else{
           foto2.setIcon(bmw2);}
       if(b520sayac3<=0){
            foto3.setIcon(bmw3s);
        jComboBox1.removeItem(Integer.toString(SystemClass.bmw_3.getId()));
       timer3.setText("0"+" sn");}
       else{
           foto3.setIcon(bmw3);}
       teklif1.setText(Double.toString(SystemClass.bmw_1.getPrice()));
       km1.setText(SystemClass.bmw_1.getKm());
       mh1.setText(SystemClass.bmw_1.getMotor());
       id1.setText(Integer.toString(SystemClass.bmw_1.getId()));
       teklif2.setText(Double.toString(SystemClass.bmw_2.getPrice()));
       km2.setText(SystemClass.bmw_2.getKm());
       mh2.setText(SystemClass.bmw_2.getMotor());
       id2.setText(Integer.toString(SystemClass.bmw_2.getId()));
       teklif3.setText(Double.toString(SystemClass.bmw_3.getPrice()));
       km3.setText(SystemClass.bmw_3.getKm());
       mh3.setText(SystemClass.bmw_3.getMotor());
       id3.setText(Integer.toString(SystemClass.bmw_3.getId()));
      
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
       jComboBox1.removeAllItems();
       jComboBox1.addItem(Integer.toString(SystemClass.passat_1.getId()));
       jComboBox1.addItem(Integer.toString(SystemClass.passat_2.getId()));
       jComboBox1.addItem(Integer.toString(SystemClass.passat_3.getId()));
       panelSedan1.setVisible(true);
       panelHeçbek1.setVisible(false);
       panelTeklif.setVisible(true);
       timer1.setText(Integer.toString(passatsayac1));
       timer2.setText(Integer.toString(passatsayac2));
       timer3.setText(Integer.toString(passatsayac3));
        if(passatsayac1<=0){
            foto1.setIcon(passat1s);
         jComboBox1.removeItem(Integer.toString(SystemClass.passat_1.getId()));
        timer1.setText("0"+" sn");}
       else{
           foto1.setIcon(passat1);}
       if(passatsayac2<=0){
            foto2.setIcon(passat2s);
        jComboBox1.removeItem(Integer.toString(SystemClass.passat_2.getId()));
       timer2.setText("0"+" sn");}
       else{
           foto2.setIcon(passat2);}
       if(passatsayac3<=0){
            foto3.setIcon(passat3s);
        jComboBox1.removeItem(Integer.toString(SystemClass.passat_3.getId()));
       timer3.setText("0"+" sn");}
       else{
           foto3.setIcon(passat3);}
       teklif1.setText(Double.toString(SystemClass.passat_1.getPrice()));
       km1.setText(SystemClass.passat_1.getKm());
       mh1.setText(SystemClass.passat_1.getMotor());
       id1.setText(Integer.toString(SystemClass.passat_1.getId()));
       teklif2.setText(Double.toString(SystemClass.passat_2.getPrice()));
       km2.setText(SystemClass.passat_2.getKm());
       mh2.setText(SystemClass.passat_2.getMotor());
       id2.setText(Integer.toString(SystemClass.passat_2.getId()));
       teklif3.setText(Double.toString(SystemClass.passat_3.getPrice()));
       km3.setText(SystemClass.passat_3.getKm());
       mh3.setText(SystemClass.passat_3.getMotor());
       id3.setText(Integer.toString(SystemClass.passat_3.getId()));
      
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
       panelHeçbek1.setVisible(true);
       panelHeçbek2.setVisible(false);
       panelHeçbek3.setVisible(true);
       panelHeçbek4.setVisible(false);
       panelTeklif.setVisible(true);
       jComboBox1.removeAllItems();
       jComboBox1.addItem(Integer.toString(SystemClass.golf.getId()));
       timer5.setText(Integer.toString(golfsayac1));
       if(golfsayac1<=0){
            foto5.setIcon(golfs);
       jComboBox1.removeItem(Integer.toString(SystemClass.golf.getId()));
       timer5.setText("0"+" sn");}
       else{
           foto5.setIcon(golf);}
       teklif5.setText(Double.toString(SystemClass.golf.getPrice()));
       km5.setText(SystemClass.golf.getKm());
       mh5.setText(SystemClass.golf.getMotor());
       id5.setText(Integer.toString(SystemClass.golf.getId()));
           
       
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
       panelHeçbek1.setVisible(true);
       panelHeçbek2.setVisible(true);
       panelHeçbek3.setVisible(true);
       panelHeçbek4.setVisible(true);
       panelTeklif.setVisible(true);
       jComboBox1.removeAllItems();
       jComboBox1.addItem(Integer.toString(SystemClass.a3_1.getId()));
       jComboBox1.addItem(Integer.toString(SystemClass.a3_2.getId()));
       jComboBox1.addItem(Integer.toString(SystemClass.a3_3.getId()));

       timer4.setText(Integer.toString(a3sayac1));
       timer5.setText(Integer.toString(a3sayac2));
       timer6.setText(Integer.toString(a3sayac3));
       if(a3sayac1<=0){
            foto4.setIcon(a3_1s);
            jComboBox1.removeItem(Integer.toString(SystemClass.a3_1.getId()));
       timer4.setText("0"+" sn");}
       else{
           foto4.setIcon(a3_1);}
       if(a3sayac2<=0){
            foto5.setIcon(a3_2s);
            jComboBox1.removeItem(Integer.toString(SystemClass.a3_2.getId()));
       timer5.setText("0"+" sn");}
       else{
           foto5.setIcon(a3_2);}
       if(a3sayac3<=0){
             foto6.setIcon(a3_3s);
            jComboBox1.removeItem(Integer.toString(SystemClass.a3_3.getId()));
       timer6.setText("0"+" sn");}
       else{
           foto6.setIcon(a3_3);}
       teklif4.setText(Double.toString(SystemClass.a3_1.getPrice()));
       km4.setText(SystemClass.a3_1.getKm());
       mh4.setText(SystemClass.a3_1.getMotor());
       id4.setText(Integer.toString(SystemClass.a3_1.getId()));
       teklif5.setText(Double.toString(SystemClass.a3_2.getPrice()));
       km5.setText(SystemClass.a3_2.getKm());
       mh5.setText(SystemClass.a3_2.getMotor());
       id5.setText(Integer.toString(SystemClass.a3_2.getId()));
       teklif6.setText(Double.toString(SystemClass.a3_3.getPrice()));
       km6.setText(SystemClass.a3_3.getKm());
       mh6.setText(SystemClass.a3_3.getMotor());
       id6.setText(Integer.toString(SystemClass.a3_3.getId()));   
    }//GEN-LAST:event_jButton14ActionPerformed

    private void teklifimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teklifimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teklifimActionPerformed

    private void rbuts2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbuts2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbuts2ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
      panelSport.setVisible(true);
      panelTarzMotor.setVisible(true);
      panelChopper.setVisible(false);
      panelTeklifMotor.setVisible(true);
      id7.setText(Integer.toString(SystemClass.bmw1000.getId()));
      teklif7.setText(Double.toString(SystemClass.bmw1000.price));
      km7.setText(SystemClass.bmw1000.getKm());
      mh7.setText(SystemClass.bmw1000.getMotor());
      if(ssayac1<=0){
      foto7.setIcon(bmw1000s);
      timer7.setText("0"+"sn");}
      else{
      foto7.setIcon(bmw1000);
      timer7.setText(Integer.toString(ssayac1));}
      id8.setText(Integer.toString(SystemClass.ducati.getId()));
      teklif8.setText(Double.toString(SystemClass.ducati.price));
      km8.setText(SystemClass.ducati.getKm());
      mh8.setText(SystemClass.ducati.getMotor());
      if(ssayac2<=0){
      foto8.setIcon(ducatis);
      timer8.setText("0"+" sn");}
      else{
      foto8.setIcon(ducati);
      timer8.setText(Integer.toString(ssayac2));}
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
      panelSport.setVisible(false);
      panelTarzMotor.setVisible(true);
      panelChopper.setVisible(true);
      panelTeklifMotor.setVisible(true);
      panelchopper2.setVisible(true);
      panelchopper2.setVisible(true);
      id9.setText(Integer.toString(SystemClass.chopper1.getId()));
      teklif9.setText(Double.toString(SystemClass.chopper1.price));
      km9.setText(SystemClass.chopper1.getKm());
      mh9.setText(SystemClass.chopper1.getMotor());
      if(chsayac1<=0){
      foto9.setIcon(chopper1s);
      timer9.setText("0"+" sn");}
      else{
      foto9.setIcon(chopper1);
      timer9.setText(Integer.toString(chsayac1));}
      id10.setText(Integer.toString(SystemClass.chopper2.getId()));
      teklif10.setText(Double.toString(SystemClass.chopper2.price));
      km10.setText(SystemClass.chopper2.getKm());
      mh10.setText(SystemClass.chopper2.getMotor());
      if(chsayac2<=0){
      foto10.setIcon(chopper2s);
      timer10.setText("0"+" sn");}
      else{
      foto10.setIcon(chopper2);
      timer9.setText(Integer.toString(chsayac1));}
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
    name =isim2.getText();
    surname=soyisim2.getText();
    Users u1 = new Users(name,surname);
    price= Double.parseDouble(teklifim2.getText());

    if(rbutch1.isSelected()){   
    if(SystemClass.chopper1.price<Double.parseDouble(teklifim2.getText()))
    {
       SystemClass.chopper1.setPrice(price);
       teklif9.setText(teklifim2.getText());
       SystemClass.chopper1.setU1(u1);
       chsayac1+=5;
       jOptionPane4.showMessageDialog(null,"Aracı için teklifiniz alınmıştır","Bilgilendirme mesajı",0,chopper1);      
    }
    else
       jOptionPane4.showMessageDialog(null,"Lütfen Araç bilgilerinde yazandan daha fazla bir değer giriniz.","Bilgilendirme mesajı",0);
    } 
     if(rbutch2.isSelected()){   
    if(SystemClass.chopper2.price<Double.parseDouble(teklifim2.getText()))
    {
       SystemClass.chopper2.setPrice(price);
       teklif10.setText(teklifim2.getText());
       SystemClass.chopper2.setU1(u1);
       chsayac2+=5;
       jOptionPane4.showMessageDialog(null,"Aracı için teklifiniz alınmıştır","Bilgilendirme mesajı",0, chopper2);
    }
    else
       jOptionPane4.showMessageDialog(null,"Lütfen Araç bilgilerinde yazandan daha fazla bir değer giriniz.","Bilgilendirme mesajı",0);
    } 
      if(rbuts1.isSelected()){   
    if(SystemClass.bmw1000.price<Double.parseDouble(teklifim2.getText()))
    {
       SystemClass.bmw1000.setPrice(price);
       teklif7.setText(teklifim2.getText());
       SystemClass.bmw1000.setU1(u1);
       ssayac1+=5;
       jOptionPane4.showMessageDialog(null,"Aracı için teklifiniz alınmıştır","Bilgilendirme mesajı",0,bmw1000);
    }
    else
       jOptionPane4.showMessageDialog(null,"Lütfen Araç bilgilerinde yazandan daha fazla bir değer giriniz.","Bilgilendirme mesajı",0);
    } 
       if(rbuts2.isSelected()){   
    if(SystemClass.ducati.price<Double.parseDouble(teklifim2.getText()))
    {
       SystemClass.ducati.setPrice(price);
       teklif8.setText(teklifim2.getText());
       SystemClass.ducati.setU1(u1);
       ssayac2+=5;
        jOptionPane4.showMessageDialog(null,"Aracı için teklifiniz alınmıştır","Bilgilendirme mesajı",0,ducati);
    }
    else
       jOptionPane4.showMessageDialog(null,"Lütfen Araç bilgilerinde yazandan daha fazla bir değer giriniz.","Bilgilendirme mesajı",0);
    } 
    isim2.setText("");
    soyisim2.setText("");
    teklifim2.setText("");
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        panelAraba.setVisible(true);
        panelSeçim.setVisible(false);
        panelHeçbek.setVisible(false);
        panelSedan.setVisible(false);
        panelSedan1.setVisible(false);
        panelHeçbek1.setVisible(false);
        panelTeklif.setVisible(false);
        panelTarz.setVisible(false);
        panelMotor.setVisible(false);
        jOptionPane3.showMessageDialog(null,"Satılan araba başı komisyon oranımız 0.002'dir.\nYapılan her yüksek teklif için sayaç 10 saniye uzayacaktır","BİLGİLENDİRME",0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        panelAraba.setVisible(false);
        panelSeçim.setVisible(false);
        panelMotor.setVisible(true);
        panelTarzMotor.setVisible(false);
        panelMotorSeçim.setVisible(true);
        panelTeklifMotor.setVisible(false);
        panelGeri.setVisible(true);
        jOptionPane3.showMessageDialog(null,"Satılan motorsiklet başı komisyon oranımız 0.001'dir.\nYapılan her yüksek teklif için sayaç 5 saniye uzayacaktır","BİLGİLENDİRME",0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        this.dispose();
        new Menu().setVisible(true);
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
       panelAraba.setVisible(false);
       panelGenel.setVisible(true);
       panelSeçim.setVisible(true);
       panelHeçbek.setVisible(false);
    }//GEN-LAST:event_jLabel24MouseClicked

    private void jLabel37MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel37MouseClicked
       panelAraba.setVisible(false);
       panelGenel.setVisible(true);
       panelSeçim.setVisible(true);
       panelHeçbek.setVisible(false);
       panelMotor.setVisible(false);
    }//GEN-LAST:event_jLabel37MouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Satıs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Satıs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Satıs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Satıs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Satıs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel foto1;
    private javax.swing.JLabel foto10;
    private javax.swing.JLabel foto2;
    private javax.swing.JLabel foto3;
    private javax.swing.JLabel foto4;
    private javax.swing.JLabel foto5;
    private javax.swing.JLabel foto6;
    private javax.swing.JLabel foto7;
    private javax.swing.JLabel foto8;
    private javax.swing.JLabel foto9;
    private javax.swing.JLabel id1;
    private javax.swing.JLabel id10;
    private javax.swing.JLabel id2;
    private javax.swing.JLabel id3;
    private javax.swing.JLabel id4;
    private javax.swing.JLabel id5;
    private javax.swing.JLabel id6;
    private javax.swing.JLabel id7;
    private javax.swing.JLabel id8;
    private javax.swing.JLabel id9;
    private javax.swing.JTextField isim;
    private javax.swing.JTextField isim2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JOptionPane jOptionPane2;
    private javax.swing.JOptionPane jOptionPane3;
    private javax.swing.JOptionPane jOptionPane4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JLabel km1;
    private javax.swing.JLabel km10;
    private javax.swing.JLabel km2;
    private javax.swing.JLabel km3;
    private javax.swing.JLabel km4;
    private javax.swing.JLabel km5;
    private javax.swing.JLabel km6;
    private javax.swing.JLabel km7;
    private javax.swing.JLabel km8;
    private javax.swing.JLabel km9;
    private javax.swing.JLabel mh1;
    private javax.swing.JLabel mh10;
    private javax.swing.JLabel mh2;
    private javax.swing.JLabel mh3;
    private javax.swing.JLabel mh4;
    private javax.swing.JLabel mh5;
    private javax.swing.JLabel mh6;
    private javax.swing.JLabel mh7;
    private javax.swing.JLabel mh8;
    private javax.swing.JLabel mh9;
    private javax.swing.JPanel panelAraba;
    private javax.swing.JPanel panelChopper;
    private javax.swing.JPanel panelGenel;
    private javax.swing.JPanel panelGeri;
    private javax.swing.JPanel panelHeçbek;
    private javax.swing.JPanel panelHeçbek1;
    private javax.swing.JPanel panelHeçbek2;
    private javax.swing.JPanel panelHeçbek3;
    private javax.swing.JPanel panelHeçbek4;
    private javax.swing.JPanel panelMotor;
    private javax.swing.JPanel panelMotorSeçim;
    private javax.swing.JPanel panelSedan;
    private javax.swing.JPanel panelSedan1;
    private javax.swing.JPanel panelSedan2;
    private javax.swing.JPanel panelSedan3;
    private javax.swing.JPanel panelSedan4;
    private javax.swing.JPanel panelSeçim;
    private javax.swing.JPanel panelSport;
    private javax.swing.JPanel panelSport1;
    private javax.swing.JPanel panelSport2;
    private javax.swing.JPanel panelTarz;
    private javax.swing.JPanel panelTarzMotor;
    private javax.swing.JPanel panelTeklif;
    private javax.swing.JPanel panelTeklifMotor;
    private javax.swing.JPanel panelchopper2;
    private javax.swing.JPanel panelchopper3;
    private javax.swing.JRadioButton rbutch1;
    private javax.swing.JRadioButton rbutch2;
    private javax.swing.JRadioButton rbuts1;
    private javax.swing.JRadioButton rbuts2;
    private javax.swing.JTextField soyisim;
    private javax.swing.JTextField soyisim2;
    private javax.swing.JLabel teklif1;
    private javax.swing.JLabel teklif10;
    private javax.swing.JLabel teklif2;
    private javax.swing.JLabel teklif3;
    private javax.swing.JLabel teklif4;
    private javax.swing.JLabel teklif5;
    private javax.swing.JLabel teklif6;
    private javax.swing.JLabel teklif7;
    private javax.swing.JLabel teklif8;
    private javax.swing.JLabel teklif9;
    private javax.swing.JTextField teklifim;
    private javax.swing.JTextField teklifim2;
    private javax.swing.JLabel timer1;
    private javax.swing.JLabel timer10;
    private javax.swing.JLabel timer2;
    private javax.swing.JLabel timer3;
    private javax.swing.JLabel timer4;
    private javax.swing.JLabel timer5;
    private javax.swing.JLabel timer6;
    private javax.swing.JLabel timer7;
    private javax.swing.JLabel timer8;
    private javax.swing.JLabel timer9;
    // End of variables declaration//GEN-END:variables
}
