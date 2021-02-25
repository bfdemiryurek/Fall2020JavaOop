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
public class Account {
    private String firstName,lastName;
    double balance;

    public Account(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Account(String firstName, String lastName, double balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if(!firstName.matches("[a-z A-Z_]+")){
            throw new IllegalArgumentException("Invalid character in the first name");
        }else{
            this.firstName = firstName;
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if(!lastName.matches("[a-z A-Z_]+")){
            throw new IllegalArgumentException("Invalid character in the last name");
        }else{
            this.lastName = lastName;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString(){
        return("First Name:"+getFirstName()+" Last Name:"+getLastName()+" Balance:"+getBalance());
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
