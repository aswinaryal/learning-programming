/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Opertations;

/**
 *
 * @author Ashwin
 */
public class Power extends CalculationCommand{

    @Override
    public int calculate(int num1, int num2) {
        int total = 1;
        for(int i=1;i<=num2;i++){
            total *= num1;
        }
        return total;
    }
    
}
