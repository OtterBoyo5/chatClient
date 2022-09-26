package models;

public abstract class Vehicle {

    protected String brand;

    protected Vehicle(String brand){
        this.brand = brand;
    }
    public String getBrand(){
        return brand;
    }

}
