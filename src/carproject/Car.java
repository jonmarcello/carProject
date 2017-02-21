/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carproject;

import java.time.LocalDate;

/**
 *
 * @author albert
 */
public class Car {
    
    private String make, model, features;
    private int year, milage;
    private double sellingPrice;
    
    public String getMake(){
        return make;
    }
    
    public String getModel(){
        return model;
    }
    
    public String getFeatures(){
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
