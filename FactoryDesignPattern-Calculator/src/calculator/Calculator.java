//Design Pattern are mainly of: 
//Creational Design Pattern
//Structural Design Pattern
//Behavioural Design Pattern
//
//This is demonstration of factory design pattern and factory design pattern is a creational design pattern since it creates a new object on the fly every time.

package calculator;

import Opertations.Calculation;
import Opertations.CalculationCommand;
import Opertations.CalculationCommandFactory;
import java.util.Scanner;

public class Calculator { //Calculator Build using concept of OOP

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Calculation calculation = new Calculation();
        do {
            System.out.println("Enter first Number: ");
            int number1 = scanner.nextInt();
            System.out.println("Enter second Number: ");
            int number2 = scanner.nextInt();
            System.out.println("Enter Operation: ");
            String operation = scanner.next();
            CalculationCommand cal = CalculationCommandFactory.getCommand(operation);
            int result = cal.calculate(number1, number2);
            System.out.println("The Result is: "+result);
            System.out.println("========Choose Operation======");
            System.out.println("Press 1 for continue..!");
            System.out.println("Press 2 for exit..!");
            int chooseOperation = scanner.nextInt();
            if(chooseOperation == 2){
                System.exit(0);
            }
            
        } while (true);

    }

}
