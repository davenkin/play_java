package com.thoughtworks.davenkin.jbehave;

import junit.framework.Assert;
import org.jbehave.core.annotations.Then;

public class CalculatorSteps2
{
    private Calculator calculator;

    public CalculatorSteps2(Calculator calculator)
    {
        this.calculator = calculator;
    }

    @Then("the result will be $total")
    public void assertResult(int total)
    {
        Assert.assertEquals(total, calculator.getResult());
    }

    @Then("i am satisfied")
    public void aa()
    {
        System.out.println("ddddddd");
    }
}
