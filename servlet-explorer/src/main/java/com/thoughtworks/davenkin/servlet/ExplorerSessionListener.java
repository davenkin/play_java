package com.thoughtworks.davenkin.servlet;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import java.util.Date;

public class ExplorerSessionListener implements HttpSessionListener
{
    public void sessionCreated(HttpSessionEvent httpSessionEvent)
    {
        System.out.println(String.format("Session created at: %s", new Date(httpSessionEvent.getSession().getCreationTime()).toString()));

    }

    public void sessionDestroyed(HttpSessionEvent httpSessionEvent)
    {
        System.out.println(String.format("Session destroyed, last accessed at: %s",new Date(httpSessionEvent.getSession().getLastAccessedTime()).toString()));
    }
}
