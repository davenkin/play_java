package com.thoughtworks.davenkin.servlet.domain;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;
import java.io.Serializable;

public class Person implements HttpSessionBindingListener, Serializable
{
    private String name;
    private String age;
    private String occupation;

    public Person(String occupation, String age, String name)
    {
        this.occupation = occupation;
        this.age = age;
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public String getAge()
    {
        return age;
    }

    public String getOccupation()
    {
        return occupation;
    }
    
    @Override
    public String toString()
    {
        return String.format("Person: Name = %s, Age = %s, Occupation = %s", name, age, occupation);
    }

    public void valueBound(HttpSessionBindingEvent httpSessionBindingEvent)
    {
        httpSessionBindingEvent.getSession().getServletContext().log(String.format("Person bound to session: %s", this.toString()));
    }

    public void valueUnbound(HttpSessionBindingEvent httpSessionBindingEvent)
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
