/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carproject;

import java.util.ArrayList;



/**
 *
 * @author albert
 */
public class Car {
    
    private String model;
    private int year, milage;
    private double sellingPrice;
    private String features[], make[];
    
    public String[] getMake(){
    ArrayList<String> carManufacturer = new ArrayList<String>();
    carManufacturer.add("Ford");
    carManufacturer.add("Honda");
    carManufacturer.add("GM");
    carManufacturer.add("Chevrolet");
    carManufacturer.add("Volkswagon");
    carManufacturer.add("Audi");
    carManufacturer.add("Toyota");
    carManufacturer.add("Acura");
    carManufacturer.add("Dodge");

        
        return make;
    }
    
    public String getModel(){
        return model;
    }
    
    public String[] getFeatures(){
        return features;
    }
    
    public double getMilage(){
        if(milage <0 && milage >1000000){
            throw new IllegalArgumentException("Milage must be between 0, and 1 000 000 miles");
        }else{
        return milage;
        }
    }
    
    public double getSellingPrice(){
        return sellingPrice;
    }
    
    public int getYear(){
      if(year<1900 && year>2018){
          throw new IllegalArgumentException("year must be between 1900, and 2018");
      }else{
        return year;
      }
    }
    
    
    
    
    
}
