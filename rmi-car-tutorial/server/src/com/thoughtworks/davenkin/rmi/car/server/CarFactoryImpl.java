package com.thoughtworks.davenkin.rmi.car.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CarFactoryImpl extends UnicastRemoteObject implements CarFactory
{
    protected CarFactoryImpl() throws RemoteException
    {
        super();
    }

    @Override
    public Car createCar(int speed) throws RemoteException
    {
        return new Car(speed);
    }
}
