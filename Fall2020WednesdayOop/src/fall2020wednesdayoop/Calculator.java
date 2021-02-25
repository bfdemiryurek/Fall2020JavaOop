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
public class Calculator {
    public int Sum(int num1, int num2, int result){
        result=num1+num2;
        System.out.println("Sum of the integers are:"+result);
        return(result);
    }
    public double Sum(double num1, double num2, double result){
        result=num1+num2;
        System.out.println("Sum of the doubles are:"+result);
        return(result);
    }
        public int Sub(int num1, int num2, int result){
        result=num1-num2;
        System.out.println("Sum of the integers are:"+result);
        return(result);
    }
    public double Sub(double num1, double num2, double result){
        result=num1-num2;
        System.out.println("Sum of the doubles are:"+result);
        return(result);
    }
    public int Mult(int num1, int num2, int result){
        result=num1*num2;
        System.out.println("Sum of the integers are:"+result);
        return(result);
    }
    public double Mult(double num1, double num2, double result){
        result=num1*num2;
        System.out.println("Sum of the doubles are:"+result);
        return(result);
    }
    public int Div(int num1, int num2, int result){
        result=num1/num2;
        System.out.println("Sum of the integers are:"+result);
        return(result);
    }
    public double Div(double num1, double num2, double result){
        result=num1/num2;
        System.out.println("Sum of the doubles are:"+result);
        return(result);
    }
}
