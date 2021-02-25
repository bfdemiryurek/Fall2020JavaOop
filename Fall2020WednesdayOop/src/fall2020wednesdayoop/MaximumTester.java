/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fall2020wednesdayoop;

import java.util.Scanner;

/**
 *
 * @author Lenova
 */
public class MaximumTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        Maximum mxm = new Maximum();
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the numbers");
        double number1 = scn.nextDouble();
        double number2 = scn.nextDouble();
        double number3 = scn.nextDouble();
        double result = mxm.max(number1,number2,number3);
        System.out.println("Maximum number is:" + result);
    
    
    
    
    }

}
