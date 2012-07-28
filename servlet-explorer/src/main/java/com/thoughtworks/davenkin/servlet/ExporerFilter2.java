package com.thoughtworks.davenkin.servlet;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class ExporerFilter2 implements Filter
{
    public void init(FilterConfig filterConfig) throws ServletException
    {
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException
    {
        System.out.println(String.format("ExporerFilter2 called at %s", new Date().toString()));
        PrintWriter writer = servletResponse.getWriter();
        writer.println("<p>This is added by explorer filter2</p>");

        filterChain.doFilter(servletRequest,servletResponse);
    }

    public void destroy()
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
