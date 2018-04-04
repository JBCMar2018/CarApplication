package me.afua.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
* This is the bare minimum - create an app that allows you to start, stop and accelerate cars.
*
* */
public class SimpleCarApp {
    public static void main(String[] args) throws InterruptedException {


        Scanner sc = new Scanner(System.in);
        //Slight curveball: Modify this example so that it accepts user input for both cars! Change the output so that they can go at either the same or different speeds.

        //Set up the first car
        Car aCar = new Car();
        aCar.setBrand("Honda");
        aCar.setSpeed(60);
        aCar.setColour("red");
        aCar.accelerate(10);

        //Set up the second car
        System.out.println("Enter details for the second car. \n");

        Car anotherCar = new Car();
        System.out.println("Enter the car brand:");
        anotherCar.setBrand(sc.nextLine());
        System.out.println("Enter the car speed:");
        anotherCar.setSpeed(sc.nextInt());
        sc.nextLine();
        System.out.println("Enter the car colour:");
        anotherCar.setColour(sc.nextLine());

        //Make the first car pass the second car (see the definition of the carPass method below)
        System.out.println(carPass(aCar,anotherCar));

        MotorCycle mc = new MotorCycle();
        mc.doWheelie();


    }

    public static void simulateTraffic(ArrayList<Vehicle> allVehicles)
    {
        Collections.shuffle(allVehicles);
        for(Vehicle eachVehicle : allVehicles)
        {
            if(eachVehicle.getClass().getSimpleName().toLowerCase()=="car")
            {
                System.out.println("The car is moving at "+eachVehicle.getSpeed()+ " which is within the speed limit.");
            }

       }

    }


    public static String carPass(Vehicle firstVehicle, Vehicle secondVehicle)
    {
        //This mehod takes two existing objects, create other objects to identify them, and then displays a string depending on the
        //comparative speeds of each car.

        //Create two objects to compare speeds
        Vehicle fasterCar = new Vehicle(); //For the faster vehicle
        Vehicle slowerCar = new Vehicle(); //For the slower vehicle
        boolean samespeed = false; //Checks to see if both cars are going at the same speed. Assumes they are not.
        String showThis = "";


        if(firstVehicle.getSpeed()>secondVehicle.getSpeed())
        {
            fasterCar = firstVehicle;
            slowerCar = secondVehicle;

        }
        else
        {
            if(firstVehicle.getSpeed()==secondVehicle.getSpeed())
            {
                //Sets the 'flag' if both vehicles are going at the same speed.
                samespeed = true;
            }
            else
            {
                fasterCar = secondVehicle;
                slowerCar = firstVehicle;
            }

        }

        if(samespeed)
            return "Both cars are going at the same speed";
        else
            return "The "+fasterCar.getColour()+" "+fasterCar.getBrand()+" passed "+"the "+slowerCar.getColour()+" "+slowerCar.getBrand();
    }


}

