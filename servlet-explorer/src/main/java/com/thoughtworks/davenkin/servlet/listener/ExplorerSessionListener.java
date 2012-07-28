package com.thoughtworks.davenkin.servlet.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import java.util.Date;

public class ExplorerSessionListener implements HttpSessionListener
{
    public void sessionCreated(HttpSessionEvent httpSessionEvent)
    {
        httpSessionEvent.getSession().getServletContext().log(String.format("Session created at: %s", new Date(httpSessionEvent.getSession().getCreationTime()).toString()));
    }

    public void sessionDestroyed(HttpSessionEvent httpSessionEvent)
    {
        httpSessionEvent.getSession().getServletContext().log(String.format("Session destroyed at: %s", new Date(httpSessionEvent.getSession().getCreationTime()).toString()));
    }
}
