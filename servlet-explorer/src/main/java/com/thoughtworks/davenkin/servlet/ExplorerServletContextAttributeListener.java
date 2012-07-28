package com.thoughtworks.davenkin.servlet;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

public class ExplorerServletContextAttributeListener implements ServletContextAttributeListener
{
    public void attributeAdded(ServletContextAttributeEvent servletContextAttributeEvent)
    {
        System.out.println(String.format("Context Attribute added: %s = %s",servletContextAttributeEvent.getName(), servletContextAttributeEvent.getValue().toString()));
    }

    public void attributeRemoved(ServletContextAttributeEvent servletContextAttributeEvent)
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void attributeReplaced(ServletContextAttributeEvent servletContextAttributeEvent)
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
