package me.davenkin.hibernate;

public enum GlobalIndicator
{
    Y("YES"),
    N("NO"),
    D("DETAIL");

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
