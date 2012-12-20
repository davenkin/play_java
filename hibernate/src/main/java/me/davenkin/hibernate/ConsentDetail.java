package me.davenkin.hibernate;

public class ConsentDetail
{
    private String channel;
    private ConsentIndicator consentIndicator;
    
    public ConsentDetail()
    {
    }


    public String getChannel()
    {
        return channel;
    }

    public void setChannel(String channel)
    {
        this.channel = channel;
    }

    public ConsentIndicator getConsentIndicator()
    {
        return consentIndicator;
    }

    public void setConsentIndicator(ConsentIndicator consentIndicator)
    {
        this.consentIndicator = consentIndicator;
    }
}
