package com.thoughtworks.davenkin.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

public class ExplorerServlet extends HttpServlet
{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
    {
        getServletContext().log("abcdedf");
        PrintWriter out = response.getWriter();
        this.getServletContext().setAttribute("ContextAttibuteAddedFromServlet", "This is the context attribute added from Explorer Servlet");
        request.setAttribute("RequestAttibuteAddedFromServlet", "This is the request attribute added from Explorer Servlet");
        if (request.getSession().getAttribute("SessionAttributeAddedByServlet") == null)
        {

            out.print(String.format("<p>Session attribute not added: SessionAttributeAddedByServlet = %s </p>", request.getSession().getAttribute("SessionAttributeAddedByServlet")));
            request.getSession().setAttribute("SessionAttributeAddedByServlet", "This is the session attribute added by servlet");
        } else
        {

            out.print(String.format("<p>Session attribute added: SessionAttributeAddedByServlet = %s </p>", request.getSession().getAttribute("SessionAttributeAddedByServlet")));
        }

        out.println("<html>");
        out.println("<body>");
        out.print(String.format("<p>Servlet Info: %s</p>", this.getServletInfo()));
        out.print(String.format("<p>Server Info: %s</p>", this.getServletContext().getServerInfo()));
        out.print(String.format("<p>Servlet Context Name: %s</p>", this.getServletContext().getServletContextName()));


        out.print(String.format("<p>Servlet Context Path: %s</p>", this.getServletContext().getContextPath()));

        out.print(String.format("<p>web.xml real path: %s</p>", this.getServletContext().getRealPath("/WEB-INF/web.xml")));
        out.print(String.format("<p>web.xml resource path: %s</p>", this.getServletContext().getResource("WEB-INF/web.xml")));
        out.print(String.format("<p>foo.txt resource path: %s</p>", this.getServletContext().getResource("WEB-INF/classes/foo.txt")));


        if (this.getServletContext() == this.getServletConfig().getServletContext())
        {
            out.print("<p>The ServletContext directly accessed from the HttpServlet and that from the ServletConfig is the same.</p>");
        } else
        {
            out.print("<p>The ServletContext directly accessed from the HttpServlet and that from the ServletConfig is NOT the same.</p>");
        }

        if (this.getServletContext().getAttribute("Servlet") == null)
        {
            this.getServletContext().setAttribute("Servlet", this);
        } else
        {
            if (this == this.getServletContext().getAttribute("Servlet"))
            {
                out.print("<p>The same servlet from last request.</p>");

            } else
            {
                out.print("<p>A different servlet from last request.</p>");
            }

        }

        out.print(String.format("<p>Current Thread: %s</p>", Thread.currentThread().hashCode()));


//        InputStream resourceAsStream = this.getServletContext().getResourceAsStream("/WEB-INF/web.xml");
        InputStream resourceAsStream = this.getServletContext().getResourceAsStream("/WEB-INF/classes/foo.txt");
//        InputStream resourceAsStream = this.getServletContext().getResourceAsStream("/WEB-INF/classes/applicationContext.xml");
        StringBuilder builder = new StringBuilder();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(resourceAsStream);
        int input = bufferedInputStream.read();
        while (input != -1)
        {
            builder.append((char) input);
            input = bufferedInputStream.read();
        }
        out.print(String.format("<p>web.xml: %s</p>", builder.toString()));
        out.print(String.format("<p>my email from context param: %s</p>", this.getServletContext().getInitParameter("myEmail")));
        out.print(String.format("<p>servlet param: %s</p>", this.getServletConfig().getInitParameter("servlet-param")));
        out.print(String.format("<p>listener attribute: %s</p>", this.getServletConfig().getServletContext().getAttribute("parameterFromContextListener")));


        out.println("</body>");
        out.println("</html>");
    }
}
