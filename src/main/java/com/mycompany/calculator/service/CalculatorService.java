/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.calculator.service;

/**
 *
 * @author student
 */
public interface CalculatorService {
    int add(int a,int b);
    double multiply(double a, double b);
    boolean equals(char a, char b);
    boolean assertTruth(boolean condition);
    boolean assertFalse(boolean cond);
}
