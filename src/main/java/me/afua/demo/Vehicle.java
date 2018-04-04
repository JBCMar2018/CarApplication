package me.afua.demo;

public class Vehicle {
    private int weight;
    private String brand;
    private int speed;
    private String colour;

    public Vehicle() {
    }

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    /*Non getter/setter methods are listed below this point */
    public String started()
    {
        return "This vehicle has started";

    }

    public String stopped()
    {
        return "This vehicle has stopped";
    }


    public void accelerate(int byAmount)
    {
        this.speed+=byAmount;
    }

    public void decelerate(int byAmount)
    {
       this.speed-=byAmount;
    }

    public String hasPassed(Vehicle v)
    {
      return this.brand+" has passed the "+v.getBrand();
    }


}
