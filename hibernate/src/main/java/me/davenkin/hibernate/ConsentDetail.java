package me.davenkin.hibernate;

import java.io.Serializable;

public class ConsentDetail implements Serializable
 {
    private Long profileId;
    private ConsentChannel channel1;
    private ConsentIndicator consentIndicator;
    
    public ConsentDetail()
    {
    }


    public ConsentIndicator getConsentIndicator()
    {
        return consentIndicator;
    }

    public void setConsentIndicator(ConsentIndicator consentIndicator)
    {
        this.consentIndicator = consentIndicator;
    }

    public ConsentChannel getChannel1()
    {
        return channel1;
    }

    public void setChannel1(ConsentChannel channel1)
    {
        this.channel1 = channel1;
    }

    public Long getProfileId()
    {
        return profileId;
    }

    public void setProfileId(Long profileId)
    {
        this.profileId = profileId;
    }

}
