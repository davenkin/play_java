package com.thoughtworks.davenkin.servlet.filter;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class PreExplorerFilter implements Filter
{
    private FilterConfig config;

    public void init(FilterConfig filterConfig) throws ServletException
    {
        this.config = filterConfig;
        filterConfig.getServletContext().log(String.format("PreExplorerFilter initiated at %s", new Date().toString()));
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException
    {
        config.getServletContext().log(String.format("PreExplorerFilter doFilter called at %s", new Date().toString()));
        PrintWriter writer = servletResponse.getWriter();
        writer.println("<p>This is added by pre explorer filter</p>");

        filterChain.doFilter(servletRequest,servletResponse);
    }

    public void destroy()
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
