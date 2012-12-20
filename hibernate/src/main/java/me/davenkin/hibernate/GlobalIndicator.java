package me.davenkin.hibernate;

public enum GlobalIndicator
{
    Y("Y"),
    N("N"),
    D("D");

    private String name;

    GlobalIndicator(String indicator)
    {
        this.name = indicator;
    }

    public String getName()
    {
        return name;
    }
}
