package me.davenkin.hibernate;

import java.util.Set;

public class Consent
{
    private Long profileId;
    private GlobalIndicator globalIndicator;
    private Set<ConsentDetail> consentDetails;

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


    public Set<ConsentDetail> getConsentDetails()
    {
        return consentDetails;
    }

    public void setConsentDetails(Set<ConsentDetail> consentDetails)
    {
        this.consentDetails = consentDetails;
    }
}
