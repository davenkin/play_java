package me.davenkin.hibernate;

import org.springframework.orm.hibernate3.HibernateTemplate;

import java.util.List;

public class DefaultConsentDao implements ConsentDao
{
    private HibernateTemplate hibernateTemplate;
    public Consent findConsentById(Long id)
    {
        List list = hibernateTemplate.find(
                "from Consent where profileId=?",id
        );
        return (Consent) list.get(0);  //To change body of implemented methods use File | Settings | File Templates.
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate)
    {
        this.hibernateTemplate = hibernateTemplate;
    }
}
