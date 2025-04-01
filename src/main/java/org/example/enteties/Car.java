package org.example.enteties;

public class Car {

    private String carId;

    private String brand;

    private String model;

    private double basePricePerDay;

    private boolean isaAvailable;

    public Car(String carId, String brand, String model, double basePricePerDay,boolean isaAvailable ){
       this.carId = carId;
       this.brand = model;
       this.model = model;
       this.basePricePerDay =basePricePerDay;
        this.isaAvailable = true;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public void setBrand(String brand){
        this.brand =brand;
    }

    public void setBasePricePerDay(double basePricePerDay) {
        this.basePricePerDay = basePricePerDay ;
    }

    public void setIsaAvailable(boolean isaAvailable) {
        this.isaAvailable = isaAvailable;
    }
    public String getCarId(){
        return carId ;
    }
    public String getBrand(){
        return brand ;
    }
    public String getModel(){
        return model;
    }
    public double calculatePrice(int rentalDays) {
        return basePricePerDay * rentalDays;
    }
    public boolean isIsaAvailable(){
        return isaAvailable;
    }
    public void rent(){
        isaAvailable = false;
    }
    public void returnCar(){
        isaAvailable = true;
    }

}
