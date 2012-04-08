package com.thoughtworks.davenkin.jbehave;

import com.sun.tools.internal.xjc.reader.dtd.bindinfo.BIInterface;

public class Calculator
{
    private int result;

    public Calculator()
    {
        
    }

    public void add(int num1, int num2)
    {
        result = (num1 + num2);
    }

    public int getResult()
    {
        return result;
    }
}
