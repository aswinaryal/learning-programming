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
public class CalculationCommandFactory {

    public static CalculationCommand getCommand(String operation) {
        if (operation.equals("+")) {
            return new Addition();
        } else if (operation.equals("-")) {
            return new Subtraction();
        } else if (operation.equals("*")) {
            return new Multiplication();
        } else if (operation.equals("/")) {
            return new Division();
        }else if(operation.equals("^")){
            return new Power();
        }
        return null;
    }
}
