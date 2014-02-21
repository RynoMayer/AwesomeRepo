/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.calculator.config;

import com.mycompany.calculator.service.CalculatorService;
import com.mycompany.calculator.service.Impl.CalculatorServiceImpl;
import org.springframework.context.annotation.Bean;

/**
 *
 * @author student
 */
//@Configuration
public class AppConfig {
    @Bean(name="Calc")
    public CalculatorService getService(){
        return new CalculatorServiceImpl();
    }
    

    /*@Bean(name="SuperCalc")
            public CalculatorService getServiceNew(){
            return new SuperCalc();
    } */
}
