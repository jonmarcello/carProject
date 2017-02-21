/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carproject;

import java.time.LocalDate;
import java.util.ArrayList;



/**
 *
 * @author albert
 */
public class Car {
    String carManufacturer[] = {"honda","gm","volkswagon", "audi"};
    private String model, make;
    private int year, milage;
    private double sellingPrice;
    private String features[];
    
    public Car(String make,String model, int year, int milage, double sellingPrice, String[] features){
     this.make = make;
     this.model = model;
     setYear(year);
     this.milage = milage;
     this.sellingPrice = sellingPrice;
     this.features = features;
    }
    
    public String getMake(){    
        return make;
    }
    
    
    public String getModel(){
        return model;
    }
    
    public String[] getFeatures(){
        return features;
    }
    
    public double getSellingPrice(){
        return sellingPrice;
    }
    
    public int getMilage(){
        return milage;
    }
    
    public int getYear(){
        return year;
    }
    
    public void setMilage(){
        if(milage <0 && milage >1000000){
            throw new IllegalArgumentException("Milage must be between 0, and 1 000 000 miles");
        }else{
        this.milage = milage;
        }
    }
    public void setYear(int year){
        
      if(year>1900 && year<LocalDate.now().getYear() + 1){
        this.year = year; 
      }else{
      throw new IllegalArgumentException("year must be between 1900, and 2018");
      }
    
    
    
    
      
    }
    
    
    
    
    
}
