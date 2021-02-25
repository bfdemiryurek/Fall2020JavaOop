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
public class Car {
    private String make,model,transmission,color,engine,vinNumber;
    private int year;
    private double price;

    //
    public Car(String make, String model, String vinNumber, double price) {
        this.make = make;
        this.model = model;
        this.vinNumber = vinNumber;
        this.price = price;
    }

    //
    public Car(String make, String model, String transmission, String color, String engine, String vinNumber, int year, double price) {
        this.make = make;
        this.model = model;
        this.transmission = transmission;
        this.color = color;
        this.engine = engine;
        this.vinNumber = vinNumber;
        this.year = year;
        this.price = price;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getVinNumber() {
        return vinNumber;
    }

    public void setVinNumber(String vinNumber) {
        this.vinNumber = vinNumber;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    
    @Override
    public String toString()
    {
        return("Make:"+getMake()+"\n"+
               "Model:"+getModel()+"\n"+
               "Transmission:" +getTransmission()+"\n"+
               "Color:"+getColor()+"\n"+
               "Engine:"+getEngine()+"\n"+
               "VinNumber:"+getVinNumber()+"\n"+
               "Year:"+getYear()+"\n"+
               "Price:$"+getPrice()+"\n");
    }
    
}
