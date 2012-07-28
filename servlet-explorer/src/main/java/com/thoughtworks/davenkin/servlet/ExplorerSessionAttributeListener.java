package com.thoughtworks.davenkin.servlet;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

public class ExplorerSessionAttributeListener implements HttpSessionAttributeListener
{
    public void attributeAdded(HttpSessionBindingEvent httpSessionBindingEvent)
    {
        System.out.println(String.format("Session Attribute added: %s = %s",httpSessionBindingEvent.getName(), httpSessionBindingEvent.getValue().toString()));

    }

    public void attributeRemoved(HttpSessionBindingEvent httpSessionBindingEvent)
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void attributeReplaced(HttpSessionBindingEvent httpSessionBindingEvent)
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
