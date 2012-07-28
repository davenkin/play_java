package com.thoughtworks.davenkin.servlet.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import java.util.Date;

public class ExplorerRequestListener implements ServletRequestListener
{
    public void requestDestroyed(ServletRequestEvent servletRequestEvent)
    {
    }

    public void requestInitialized(ServletRequestEvent servletRequestEvent)
    {
        servletRequestEvent.getServletContext().log(String.format("Request created: %s", new Date().toString()));
    }
}
