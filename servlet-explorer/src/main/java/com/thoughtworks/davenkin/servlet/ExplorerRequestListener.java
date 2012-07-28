package com.thoughtworks.davenkin.servlet;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class ExplorerRequestListener implements ServletRequestListener
{
    public void requestDestroyed(ServletRequestEvent servletRequestEvent)
    {
        System.out.println(String.format("Request created: %s", servletRequestEvent.getServletRequest().getLocalAddr()));

    }

    public void requestInitialized(ServletRequestEvent servletRequestEvent)
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
