package com.thoughtworks.davenkin.jbehave;

import junit.framework.Assert;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class CalculatorSteps
{

    public CalculatorSteps(Calculator calculator)
    {
        this.calculator = calculator;
    }

    private Calculator calculator;

    @Given("a calculator is initiated")
    public void init() {
        System.out.println("init");
    }

    @When("add $num1 and $num2")
    public void addNumbers(int num1, int num2) {
       calculator.add(num1, num2);
    }



}
