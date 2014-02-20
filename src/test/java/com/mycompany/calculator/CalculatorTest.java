/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculator;

import com.mycompany.calculator.service.CalculatorService;
import com.mycompany.calculator.service.Impl.CalculatorServiceImpl;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
/**
 *
 * @author ryno
 */
public class CalculatorTest {
    
    public static CalculatorService service;
    
    public CalculatorTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void add(){
         Assert.assertEquals(service.add(2,5),7);
     }
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
        service = new CalculatorServiceImpl();
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}