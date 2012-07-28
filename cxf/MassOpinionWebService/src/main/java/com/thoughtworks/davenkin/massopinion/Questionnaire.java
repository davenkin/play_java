package com.thoughtworks.davenkin.massopinion;

import java.util.ArrayList;

public class Questionnaire
{
    private String name;
    private ArrayList<String> options;

    public Questionnaire(ArrayList<String> options, String name)
    {
        this.options = options;
        this.name = name;
    }

    public Questionnaire()
    {

    }
    
    public Questionnaire(String name)
    {
        options = new ArrayList<String>();
        this.name = name;
    }
    
    public void addOption(String option)
    {
        options.add(option);
    }
}
