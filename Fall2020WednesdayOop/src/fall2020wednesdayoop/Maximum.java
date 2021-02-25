/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fall2020wednesdayoop;

/**
 *
 * @author Lenova
 */
public class Maximum {
    // methods with multiple parameters
    
    
    public double max(double num1, double num2, double num3){
        double maxValue = num1;
        // Assume num1 is the greatest number of all three
        if(num2> maxValue){
            maxValue = num2;
        } // end of if
    // to determine the num2's value 
   if(num3> maxValue){
            maxValue = num3;        
    }// end of if
   // determine the value of num3
   return maxValue;
    }
}
