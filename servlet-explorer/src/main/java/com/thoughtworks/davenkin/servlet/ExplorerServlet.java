package com.thoughtworks.davenkin.servlet;

import com.thoughtworks.davenkin.servlet.domain.Person;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;

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
        Person person = new Person("scientist", request.getParameter("Age"), request.getParameter("Name"));
        if (request.getSession().getAttribute("persons") == null)
        {
            request.getSession().setAttribute("persons", new ArrayList<Person>());
        }
        List<Person> persons = (List<Person>) request.getSession().getAttribute("persons");
        persons.add(person);

        request.getSession().setAttribute("persons", persons);
        out.println("<p>Persons in session:</p>");
        for (Person aPerson : persons)
        {
            out.print(String.format("<p>%s</p>", aPerson.toString()));
        }

        request.getSession().setAttribute("dd", person);

        displayClientInfo(request, out);

        displayServerInfo(out);
        out.print("<form name=\"input\" action=\"ServletInfo\" method=\"get\">");
        out.print("Name: <input type=\"text\" name=\"Name\"  /><br />");
        out.print("Age:<input type = \"text\" name = \"Age\"  / ><br / >");
        out.print("<input type = \"submit\" value = \"Submit\" / >");
        out.print("</form >");

        out.print(String.format("<p>====================</p>"));
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
        out.print(String.format("<p>====================</p>"));
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
