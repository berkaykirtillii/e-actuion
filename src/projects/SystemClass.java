/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projects;

import java.util.ArrayList;
import products.Araba;

import products.Motor;
import products.Motorlu;
import products.Product;


/**
 *
 * @author Berkay
 */
public class SystemClass {
    public static ArrayList<Product> productList = new ArrayList<Product>();
    public static ArrayList<Motor> m_List = new ArrayList<Motor>();
    public static ArrayList<Araba> a_List = new ArrayList<Araba>();
    public static ArrayList<Product> s_List=new ArrayList<Product>();
    public static ArrayList<Motor> sm_List = new ArrayList<Motor>();
    public static ArrayList<Araba> sa_List = new ArrayList<Araba>();    
             public static Araba a6_1=new Araba("Sedan", "92300", "2.0", 213400, "Audi_A6", 1001, "Berkay", "Kırtıllı");
             public static Araba a6_2=new Araba("Sedan", "193400", "1.6", 78700, "Audi_A6", 1002, "Cemil", "Uysal");
             public static Araba a6_3=new Araba("Sedan", "140990", "1.6", 84500, "Audi_A6", 1003, "Ahmet", "Gümüş");
             public static Araba bmw_1=new Araba("Sedan", "70000", "1.8", 134400, "BMW_520", 1004, "Fatma", "Yılmaz");
             public static Araba bmw_2=new Araba("Sedan", "320500", "3.0", 52000, "BMW_520", 1005, "Celal", "Bayrak");
             public static Araba bmw_3=new Araba("Sedan", "2300", "2.0", 271000, "BMW_520", 1006, "Emine", "Yüksek");
             public static Araba passat_1=new Araba("Sedan", "102100", "1.8", 99900, "Passat", 1007, "Burak", "Sönmez");
             public static Araba passat_2=new Araba("Sedan", "35750", "1.6", 167450, "Passat", 1008, "Cihan", "Demir");
             public static Araba passat_3=new Araba("Sedan", "0", "2.0", 256200, "Passat", 1009, "Ekin", "Yurt");
             public static Araba a3_1=new Araba("HatchBack", "11250", "1.6", 108500, "Audi_A3", 1010, "Berkay", "Kırtıllı");
             public static Araba a3_2=new Araba("HatchBack", "132000", "1.4", 64300, "Audi_A3", 1011, "Buse", "Cankurtaranoglu");
             public static Araba a3_3=new Araba("HatchBack", "108000", "1.6", 59150, "Audi_A3", 1012, "Yusuf", "Bilgiç");
             public static Araba golf=new Araba("HatchBack", "14000", "1.8", 152540, "Golf", 1013, "Evren", "Aykaç");
             public static Araba i20_1=new Araba("HatchBack", "123400", "1.1",32000, "I20", 1014, "Burcu", "Soylu");
             public static Araba i20_2=new Araba("HatchBack", "98400", "1.3", 39500, "I20", 1015, "Bülent","Polat");
             public static Motor chopper1=new Motor("chopper", "62500", "0.8", 37400, "Kuba", 3001, "Acun", "Ilıcalı");
             public static Motor chopper2=new Motor("chopper", "9820", "0.9", 78000, "harley-Davidson", 3002, "Berkay", "Kırtıllı");
             public static Motor bmw1000=new Motor("Super Sport", "17500", "1.0",73600 , "BMW1000RR", 3003, "Abdullah", "Atasoy");
             public static Motor ducati=new Motor("Super Sport", "18350", "1.3", 86750, "Ducati1399", 3004, "Furkan", "Yörük");
       
    public static void addProduct(Product p1){                   
        productList.add(p1);
    }
    public static void addMotor(Motor m1){
        m_List.add(m1);
    }
    public static void addAraba(Araba a1){
 
                   
        a_List.add(a1);
    }
   
    
    public static String search(int id){
        for(int i=0;i<s_List.size();i++)
        {
               if(s_List.get(i).getId()==id)
                   return s_List.get(i).toString();                            
        }
      return null;
    }
        public static String searchpro(int id){
        for(int i=0;i<productList.size();i++)
        {
               if(productList.get(i).getId()==id)
                   return productList.get(i).toString();                            
        }
      return null;
    }
    
        public static void delete(int id){
            for(int i=0;i<productList.size();i++){
                
                if(productList.get(i).getId()==id){
                     s_List.add(productList.get(i));
                     productList.remove(i);  
                }                 
            }
        }
         public static void del_araba(int id){
            for(int i=0;i<a_List.size();i++){
                
                if(a_List.get(i).getId()==id){
                     sa_List.add(a_List.get(i));
                     a_List.remove(i);  
                }    
            }
        }
        
         public static void del_motor(int id){
            for(int i=0;i<m_List.size();i++){
                
                if(m_List.get(i).getId()==id){
                    sm_List.add(m_List.get(i));
                    m_List.remove(i);  
                }
            }
        }
         public static String showSatılanAraba(){
           String outputA="Satılan Arabalar\n\n";
             for(int i=0;i<sa_List.size();i++){
                 outputA+=sa_List.get(i).toString();
             }
             return outputA;
         }
         public static String showSatılanMotor(){
          String outputM="Satılan Motorlar\n\n";
         for(int i=0;i<sm_List.size();i++){
                 outputM+=sm_List.get(i).toString();
             }  
         return outputM;
         }
         public static String showİhaledekiAraba(){
             String outputA="İhaledeki Arabalar\n\n";
             for(int i=0;i<a_List.size();i++){
                 outputA+=a_List.get(i).toString();
             }
              return outputA;
         }
          public static String showİhaledekiMotor(){
             String outputM="İhaledeki Motorlar\n\n";
             for(int i=0;i<m_List.size();i++){
                 outputM+=m_List.get(i).toString();
             }
              return outputM;
         }
         public static String showSat(){
             String outputA="Satılan Arabalar\n\n";
             for(int i=0;i<sa_List.size();i++){
                 outputA+=sa_List.get(i).toString();
             }
             String outputM="Satılan Motorlar\n\n";
             for(int i=0;i<sm_List.size();i++){
                 outputM+=sm_List.get(i).toString();
             }
               return outputA+outputM;      
         }
         public static String showPro(){
             String outputA="İhaledeki Arabalar\n\n";
             for(int i=0;i<a_List.size();i++){
                 outputA+=a_List.get(i).toString();
             }
             String outputM="İhaledeki Motorlar\n\n";
             for(int i=0;i<m_List.size();i++){
                 outputM+=m_List.get(i).toString();
             }
             return outputA+outputM;
         }
         public static String showAraba(){
             String outputA="İhaledeki Arabalar\n\n";
             for(int i=0;i<a_List.size();i++){
                 outputA+=a_List.get(i).toString();
             }
             String outputM="Satılan Arabalar\n\n";
             for(int i=0;i<sa_List.size();i++){
                 outputM+=sa_List.get(i).toString();
             }
             return outputA+outputM;
         }
         public static String showMotor(){
             String outputA="İhaledeki Motorlar\n\n";
             for(int i=0;i<m_List.size();i++){
                 outputA+=m_List.get(i).toString();
             }
             String outputM="Satılan Motorlar\n\n";
             for(int i=0;i<sm_List.size();i++){
                 outputM+=sm_List.get(i).toString();
             }
             return outputA+outputM;
         }             
         
         
    }

