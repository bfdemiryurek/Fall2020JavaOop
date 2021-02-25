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
public class Customer {
    
    private String clientFirstName,clientLastName;
    private LocalDate dateOfBirth;
    private String streetNo,streetName,province,postalCode,phNumber;
    private String employmentInfo;
    
    public String Identification(String ID, String drivingID){
    System.out.println(ID+drivingID);
    return ID+drivingID;
    }
    public Customer(String clientFirstName, String clientLastName, LocalDate dateOfBirth, String streetNo, String streetName, String province, String postalCode, String phNumber, String employmentInfo, String Identification) {
        this.clientFirstName = clientFirstName;
        this.clientLastName = clientLastName;
        this.dateOfBirth = dateOfBirth;
        this.streetNo = streetNo;
        this.streetName = streetName;
        this.province = province;
        this.postalCode = postalCode;
        this.phNumber = phNumber;
        this.employmentInfo = employmentInfo;
        
          if(employmentInfo.equals("Yes"))
          {
              System.out.println("Employed");
          }
          else
          {
              System.out.println("Unemployed");
          }
    }
    
}
