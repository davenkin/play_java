package com.thoughtworks.davenkin.servlet.filter;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class PostExplorerFilter implements Filter
{
    private FilterConfig config;

    public void init(FilterConfig filterConfig) throws ServletException
    {
        this.config = filterConfig;
        filterConfig.getServletContext().log(String.format("PostExplorerFilter initiated at %s", new Date().toString()));
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException
    {
        filterChain.doFilter(servletRequest,servletResponse);
        PrintWriter writer = servletResponse.getWriter();
        writer.println("<p>This is added by post explorer filter</p>");
        config.getServletContext().log(String.format("PostExplorerFilter doFilter called at %s", new Date().toString()));
    }

    public void destroy()
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
