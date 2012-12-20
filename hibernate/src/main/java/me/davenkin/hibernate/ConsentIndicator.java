package me.davenkin.hibernate;

public enum ConsentIndicator
{
    Y("YES"),
    N("NO");

    private String name;

    ConsentIndicator(String indicator)
    {
        this.name = indicator;
    }

}
