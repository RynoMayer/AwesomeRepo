/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.calculator.service.Impl;

import com.mycompany.calculator.service.CalculatorService;
import java.util.Arrays;

/**
 *
 * @author student
 */
public class CalculatorServiceImpl implements CalculatorService{
       
    public int add(int a, int b)
    {
        System.out.println("Original Calc");
        return a+b;
    
    }
    public double multiply(double a, double b)
    {
        return a*b;
    }
    public boolean equals(char a, char b){
        return a==b;
    }
    public boolean assertTruth(boolean condition){
        
        return condition;
    }
    public boolean assertFalse(boolean cond){
        return cond;
    }
    public boolean isNotNull(String msg){
        if(msg!=null)
        return true;
        else
            return false;
    }
    public boolean arrayTest(String[] array1, String[] array2){
            return Arrays.equals(array1, array2);
    }
    
}
