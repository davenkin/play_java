package com.thoughtworks.davenkin.servlet;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.MalformedURLException;

public class ExplorerServlet extends HttpServlet
{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
    {
        getServletContext().log("Starting to handle request for ExplorerServlet");
        generateOutput(request, response);

    }

    private void generateOutput(HttpServletRequest request, HttpServletResponse response) throws IOException
    {
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<body>");

        displayClientInfo(request, out);

        displayServerInfo(out);

        out.println("</body>");
        out.println("</html>");
    }

    private void displayServerInfo(PrintWriter out) throws MalformedURLException
    {
        out.print("<h1>Server Info:</h1>");
        out.print(String.format("<p>Init servlet param: %s</p>", this.getServletConfig().getInitParameter("servlet-param")));
        out.print(String.format("<p>Init context param: %s</p>", this.getServletContext().getInitParameter("myEmail")));
        out.print(String.format("<p>Servlet Name: %s</p>", this.getServletName()));
        out.print(String.format("<p>Server: %s</p>", this.getServletContext().getServerInfo()));
        out.print(String.format("<p>Servlet Context Name: %s</p>", this.getServletContext().getServletContextName()));
        out.print(String.format("<p>Servlet Context Path: %s</p>", this.getServletContext().getContextPath()));
        out.print(String.format("<p>web.xml real path: %s</p>", this.getServletContext().getRealPath("/WEB-INF/web.xml")));
        out.print(String.format("<p>web.xml resource path: %s</p>", this.getServletContext().getResource("WEB-INF/web.xml")));
        out.print(String.format("<p>foo.txt resource path: %s</p>", this.getServletContext().getResource("WEB-INF/classes/foo.txt")));
        out.print(String.format("<p>Current Thread: %s</p>", Thread.currentThread().toString()));
    }

    private void displayClientInfo(HttpServletRequest request, PrintWriter out)
    {
        out.print("<h1>Client Info:</h1>");

        out.print("<h4>Cookies:</h4>");
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies)
        {
            out.print(String.format("<p>%s: %s</p>", cookie.getName(), cookie.getValue()));
        }

        out.print(String.format("<p>====================</p>"));
        out.print(String.format("<p>Context Path: %s</p>", request.getContextPath()));
        out.print(String.format("<p>Method type: %s</p>", request.getMethod()));
        out.print(String.format("<p>Local Port: %d</p>", request.getLocalPort()));
        out.print(String.format("<p>Remote Port: %d</p>", request.getRemotePort()));
        out.print(String.format("<p>Request URI: %s</p>", request.getRequestURI()));
        out.print(String.format("<p>Request URL: %s</p>", request.getRequestURL().toString()));
    }
}
