/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carproject;

import java.time.LocalDate;
import java.time.Month;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jon
 */
public class CarTest {
    Car validCar;
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        validCar = new Car("Honda", "Civic", 2000, 10000, 9999.99, new String[]{"feature1", "feature2"});
    }
    
    @After
    public void tearDown() {
    }
    
    
    /*
    * Test valid car method
    */
    @Test
    public void testInvalidCar() {
        System.out.println("Test creation of invalid Car");
        try
        {
            Car invalidCar = new Car("Honda", "Civic", 2000, 10000, 9999.99, new String[]{"feature1", "feature2"});    
            fail("the invalid postal code should have thrown an exception");
        }
        catch (IllegalArgumentException e)
        {            
        }
    }
       
    /*
    * test make
    */
    @Test
    public void testGetMake() {
        System.out.println("getMake");
        String expResult = "Civic";
        String result = validCar.getMake();
        assertEquals(expResult, result);
    }
     
    /*
    * test car model
    */
    @Test
    public void testGetModel() {
        System.out.println("getModel");
        String expResult = "Honda";
        String result = validCar.getModel();
        assertEquals(expResult, result);
    }

    /*
    * Test car year
    */
    @Test
    public void testGetYear() {
        System.out.println("getYear");
        int expResult = 2000;
        int result = validCar.getYear();
        assertEquals(expResult, result);
    }
    
        
    /*
    * test miliage
    */
    @Test
    public void testGetMiliage() {
        System.out.println("getMiliage");
        int expResult = 10000;
        int result = validCar.getMiliage();
        assertEquals(expResult, result);
    }
    
    /*
    * test selling price
    */
    @Test
    public void testGetSellingPrice() {
        System.out.println("getSellingPrice");
        double expResult = 9999.99;
        double result = validCar.getMiliage();
        assertEquals(expResult, result, 0);
    }
    
    /*
    * test get features
    */
    @Test
    public void testGetFeatures() {
        System.out.println("getFeatures");
        String expResult[] = {"feature1", "feature2"};
        String result[] = validCar.getFeatures();
        assertArrayEquals(expResult, result);
    }
    
    /*
    * test set make
    */
    @Test
    public void testSetMake() {
        System.out.println("setMake");
        String make = "Toyota";
        validCar.setMake(make);
        assertEquals(make, validCar.getMake());
    }
    
    /*
    * test set model
    */
    @Test
    public void testSetModel() {
        System.out.println("setModel");
        String model = "Camery";
        validCar.setModel(model);
        assertEquals(model, validCar.getMake());
    }
    
    /*
    * test set model
    */
    @Test
    public void testSetYear() {
        System.out.println("setYear");
        int year = 2001;
        validCar.setYear(year);
        assertEquals(year, validCar.getYear());
    }
    
    /*
    * test set model
    */
    @Test
    public void testSetMilage() {
        System.out.println("setMilage");
        int milage = 120000;
        validCar.setMilage(milage);
        assertEquals(milage, validCar.getMilage(), 0);
    }
    
    /*
    * test set model
    */
    @Test
    public void testSetSellingPrice() {
        System.out.println("setSellingPrice");
        double sellingPrice = 11999.99;
        validCar.setSellingPrice(sellingPrice);
        assertEquals(sellingPrice, validCar.getSellingPrice(), 0);
    }
    
    /*
    * test set features
    */
    @Test
    public void testSetFeatures() {
        System.out.println("setSetFeatures");
        String features[] = {"feature1", "feature2", "feature3"};
        validCar.setFeatures(features);
        assertArrayEquals(features, validCar.getFeatures());
    }
}
