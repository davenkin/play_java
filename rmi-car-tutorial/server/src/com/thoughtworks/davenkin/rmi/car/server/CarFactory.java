package com.thoughtworks.davenkin.rmi.car.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CarFactory extends Remote
{
    public Car createCar(int speed) throws RemoteException;
}
