package com.thoughtworks.davenkin.servlet;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ExplorerServletContextListener implements ServletContextListener
{
    public void contextInitialized(ServletContextEvent servletContextEvent)
    {
        servletContextEvent.getServletContext().setAttribute("parameterFromContextListener", "This string attribute is set in ExplorerServletContextListener");
    }

    public void contextDestroyed(ServletContextEvent servletContextEvent)
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
