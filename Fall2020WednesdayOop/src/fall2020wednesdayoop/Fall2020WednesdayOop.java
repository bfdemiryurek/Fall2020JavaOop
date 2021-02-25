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
public class Fall2020WednesdayOop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num;
        Scanner scn= new Scanner(System.in);
        System.out.print("Write the snow depth please: ");
        num=scn.nextInt();
        
        if(num>=30)
        {
          System.out.println("True");
        }
        else
        {
          System.out.println("False");  
        }
    }
    
}
