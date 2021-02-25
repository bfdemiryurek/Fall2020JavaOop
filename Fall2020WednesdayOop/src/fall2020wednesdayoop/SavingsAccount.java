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
public class SavingsAccount extends Account{
    
    public SavingsAccount(String firstName, String lastName, double balance) {
        super(firstName, lastName, balance);
        
    }
    

    
        public void deposit(double deposit){
        if(deposit < 0){
            throw new IllegalArgumentException("Cannot deposit a negative number");
        }
        balance += deposit;   
    }
    
    public void withdraw(int withdraw){
        if(withdraw<0){
            throw new IllegalArgumentException("Cannot withdraw a negative amount");
        }else if(withdraw>balance){
            throw new IllegalArgumentException("Not Sufficient Funds to withdraw");
        }
        balance -= withdraw;
    }
}
