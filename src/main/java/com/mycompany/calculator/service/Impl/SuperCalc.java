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
public class SuperCalc implements CalculatorService{
    public int add(int a, int b)
    {
        System.out.println("Super Calc");
        return a+b;
    
    }
    
}