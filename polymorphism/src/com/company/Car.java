package com.company;

public class Car {
    private String name;
    private boolean engine;
    private int clinders;
    private int wheels;

    public Car(String name, int clinders) {
        this.name = name;
        this.engine = true;
        this.clinders = clinders;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getClinders() {
        return clinders;
    }

    public int getWheels() {
        return wheels;
    }
    public void startEngine()
    {
        System.out.println("engine started");
    }

    public void accelerate()
    {
        System.out.println("accelarion is done");
    }

    public void brake()
    {
        System.out.println("brake applies");
    }

}


public class Bolero extends Car
{
    private String name;
    private int Cylinders;

    public Bolero(String name, int clinders) {
        super(name, clinders);
    }

    @Override
    public void accelerate()
    {
        System.out.println("Bolero applied the brakes");
    }




}



public class Duster extends Car{
    private String name;
    private int Cylinders;
    public Duster(String name, int clinders) {
        super(name, clinders);
    }

    @Override
    public void accelerate()
    {
        System.out.println("Duster applied the barakes");
    }

}
