package com.thoughtworks.davenkin.servlet.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.util.Date;

public class ExplorerServletContextListener implements ServletContextListener
{
    public void contextInitialized(ServletContextEvent servletContextEvent)
    {
        servletContextEvent.getServletContext().log(String.format("Context created: %s", new Date().toString()));
        servletContextEvent.getServletContext().setAttribute("contextAttrCreateTime", new Date());
    }

    public void contextDestroyed(ServletContextEvent servletContextEvent)
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
