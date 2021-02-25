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
public class TimeToSkiTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        TimeToSki tks = new TimeToSki();
        System.out.println("Enter snow depth");
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        if(tks.timeToSki(a)){
            System.out.println("With "+a+" of snow, you can ski!");
        }
        else{
            System.out.println("Not enough snow to ski");
        }
        
    }
    
}
