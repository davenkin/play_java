package me.davenkin.hibernate;

import static me.davenkin.hibernate.GlobalIndicator.N;
import static me.davenkin.hibernate.GlobalIndicator.Y;

public class ConsentValidator
{
    public void validate(Consent consent) throws Exception
    {
        if ((consent.getGlobalIndicator().equals(Y) || consent.getGlobalIndicator().equals(N)) && !consent.getConsentDetails().isEmpty())
        {
            throw new RuntimeException();
        }



    }
}
