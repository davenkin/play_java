package com.thoughtworks.davenkin.rmi.car.server;

import java.io.Serializable;

public class Car implements Serializable
{
    private int speed;

    public Car(int speed)
    {
        this.speed = speed;
    }
    
    public void run()
    {
        System.out.println("I am running at a speed of "+ speed + " per hour!");
    }
}
