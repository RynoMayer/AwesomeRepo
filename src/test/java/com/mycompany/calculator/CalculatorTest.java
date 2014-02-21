/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculator;

import com.mycompany.calculator.config.AppConfig;
import com.mycompany.calculator.service.CalculatorService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;
import static org.testng.AssertJUnit.assertEquals;
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
         assertEquals("Addition failed",service.add(2,5),7);
        
     }
     @Test()
     public void multiply(){
         Assert.assertEquals(service.multiply(2.5, 3.7),9.25);
     }
     public void equals(){
         Assert.assertSame(service.equals('y', 'y'),true);
     }
     public void assertTruth(){
         Assert.assertTrue(service.assertTruth(false));
     }
     public void assertFalse(){
         Assert.assertFalse(service.assertFalse(true));
     }
     public void isNotNull(){
         Assert.assertNull(service.isNotNull("hello"));
     }
     public void assertFail(){
         Assert.fail();
     }
     //@Ignore("this has been already tested, thus i will ignore it")
     @Test(timeOut = 1000 )
     public void adds(){
         assertEquals("Addition failed",service.add(5,5),10);
     }
     
     //@Test (expectedExceptions=IndexOutOfBoundsException.class)
     public void verifyArrayContent() throws Exception{
         String[] arrayUneven = new String[] {"1","3","5"};
         String[] arrayEven = new String[] {"2", "4", "6"};
         Assert.assertTrue(service.arrayTest(arrayUneven, arrayEven));
         Thread.sleep(0);
     }
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        service = (CalculatorService)ctx.getBean("Calc");
        //service = new CalculatorServiceImpl();
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        System.out.println("After has been invoked due to multiply taking long");
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}