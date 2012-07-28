package com.thoughtworks.davenkin.servlet.domain;

public class Person
{
    private String name;
    private int age;
    private String occupation;

    public Person(String occupation, int age, String name)
    {
        this.occupation = occupation;
        this.age = age;
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public String getOccupation()
    {
        return occupation;
    }
}
