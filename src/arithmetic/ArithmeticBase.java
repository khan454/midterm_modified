/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;

import java.util.Scanner;

/**
 * This class takes String input plus,minus,divide and times from user and
 * execute the operation
 *
 * @author sivagamasrinivasan date 06/20
 */
public class ArithmeticBase {
    
    private double x, y;

    public double calculate(double x, double y) {
        
        System.out.println("Here is the output for all operations involving " 
                + x + " and " + y);
        
        for (int i = 0; i < Operators.values().length; i++) {
            if (i == 0) {
                System.out.println("Addition: " + (x + y));
            } else if (i == 1) {
                System.out.println("Subtraction: " + (x - y)); 
            } else if (i == 2) {
                System.out.println("Multiplication: " + (x * y)); 
            } else if (i == 3) {
                System.out.println("Division: " + (x / y)); 
            }
        }
        return 0;
    }
}
