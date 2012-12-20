package me.davenkin.hibernate;

public enum ConsentIndicator
{
    Y("Y"),
    N("N");

    private String name;

    ConsentIndicator(String indicator)
    {
        this.name = indicator;
    }

    public String getName()
    {
        return name;
    }
}
