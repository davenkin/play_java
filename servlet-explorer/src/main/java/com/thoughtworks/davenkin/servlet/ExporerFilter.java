package com.thoughtworks.davenkin.servlet;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class ExporerFilter implements Filter
{
    public void init(FilterConfig filterConfig) throws ServletException
    {
        System.out.println(String.format("ExporerFilter initiated at %s", new Date().toString()));
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException
    {
        filterChain.doFilter(servletRequest,servletResponse);
        PrintWriter writer = servletResponse.getWriter();
        writer.println("<p>This is added by explorer filter</p>");
    }

    public void destroy()
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
