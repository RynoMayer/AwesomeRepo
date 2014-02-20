/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.calculator.service.Impl;

import com.mycompany.calculator.service.CalculatorService;

/**
 *
 * @author student
 */
public class CalculatorServiceImpl implements CalculatorService{
    
    private int num1;
    private int num2;
    CalculatorServiceImpl()
    {   
    }
    
    CalculatorServiceImpl(int n1, int n2)
    {
        num1 = n1;
        num2 = n1;
    }
    
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
        
        if(condition==true)
        return true;
        else
            return false;
    }
    public boolean assertFalse(boolean cond){
        if(cond==true)
            return true;
        else
           return false;
    }
    public boolean isNull(Object e){
        if(e.num1==null)
        return true;
    }
}
