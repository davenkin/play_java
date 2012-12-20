package me.davenkin.hibernate;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Unit test for simple App.
 */
@ContextConfiguration(locations = {
        "classpath:applicationContext.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class AppTest {

    @Autowired
    private ConsentDao consentDao;

    @Test
    public void test()
    {
        Consent consentById = consentDao.findConsentById(3L);
        System.out.println(consentById.getProfileId());
        System.out.println(consentById.getGlobalIndicator());
        System.out.println(consentById.getConsentDetails().size());
    }

}
