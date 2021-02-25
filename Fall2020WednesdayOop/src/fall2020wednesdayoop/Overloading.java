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
public class Overloading {
    //method overloading
    public int square(int intValue){
        System.out.println("The square method with integer argument"+intValue);
        return(intValue*intValue);
    }
    public double square(double doubleValue){
        System.out.println("The square method with double argument"+doubleValue);
        return(doubleValue*doubleValue);
    
}
}