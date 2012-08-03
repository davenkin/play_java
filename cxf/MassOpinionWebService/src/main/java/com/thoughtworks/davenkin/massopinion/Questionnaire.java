package com.thoughtworks.davenkin.massopinion;

import java.util.ArrayList;

public class Questionnaire
{
    private String name;
    private ArrayList<String> options;

    public Questionnaire()
    {

    }
    
    public Questionnaire(String name, ArrayList<String> options)
    {
        this.name = name;
        this.options = options;
    }
    public Questionnaire(String name)
    {
        this.name = name;
        this.options = new ArrayList<String>();
    }
    
    public void addOption(String option)
    {
        options.add(option);
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
