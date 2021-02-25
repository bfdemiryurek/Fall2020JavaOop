/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fall2020wednesdayoop;

import java.time.LocalDate;

/**
 *
 * @author Lenova
 */
public class Employee {
    
    private String firstName,lastName,address,phNumber,employeeId;
    private LocalDate dateOfBirth;
    private int age;

    public Employee(String firstName, String lastName, String address, String phNumber, String employeeId, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phNumber = phNumber;
        this.employeeId = employeeId;
        this.dateOfBirth = dateOfBirth;
    }

    

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if(!firstName.matches("[a-z A-Z_]+")){
            System.out.println("Enter the letters only");
        }
        else
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

   public void setAge(int age) {
        this.age = age;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhNumber() {
        return phNumber;
    }

    public void setPhNumber(String phNumber) {
        this.phNumber = phNumber;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    
    
   public String toString(){
       return(getAddress()+" "+getEmployeeId());
   } 
    
    
    
    
}
