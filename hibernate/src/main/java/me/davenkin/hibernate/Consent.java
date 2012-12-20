package me.davenkin.hibernate;

import java.util.List;

public class Consent
{
    private Long profileId;
    private GlobalIndicator globalIndicator;
    private List<ConsentDetail> consentDetails;

    public Consent()
    {

    }


    public Long getProfileId()
    {
        return profileId;
    }

    public void setProfileId(Long profileId)
    {
        this.profileId = profileId;
    }

    public GlobalIndicator getGlobalIndicator()
    {
        return globalIndicator;
    }

    public void setGlobalIndicator(GlobalIndicator globalIndicator)
    {
        this.globalIndicator = globalIndicator;
    }


    public List<ConsentDetail> getConsentDetails()
    {
        return consentDetails;
    }

    public void setConsentDetails(List<ConsentDetail> consentDetails)
    {
        this.consentDetails = consentDetails;
    }
}
