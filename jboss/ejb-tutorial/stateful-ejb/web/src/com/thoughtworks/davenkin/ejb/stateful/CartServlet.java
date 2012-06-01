package com.thoughtworks.davenkin.ejb.stateful;

import javax.ejb.*;
import java.rmi.*;
import javax.rmi.*;
import javax.naming.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class CartServlet extends HttpServlet
{
    CartHome home;

    public void init(ServletConfig config)
            throws ServletException
    {
        super.init(config);
        try
        {
            Properties props = new Properties();
            props.put(Context.INITIAL_CONTEXT_FACTORY,
                    "org.jnp.interfaces.NamingContextFactory");
            props.put(Context.PROVIDER_URL, "localhost:1099");
            props.put(Context.URL_PKG_PREFIXES,
                    "org.jboss.naming:org.jnp.interfaces");
            System.out.println("Properties ok");
            Context ctx = new InitialContext(props);
            System.out.println("context ok");
            home = (CartHome) ctx.lookup("cartJndi");
            System.out.println("Home ready");
        } catch (Exception e1)
        {
            System.out.println("" + e1);
        }

    }

    public void doPost
            (HttpServletRequest request,
             HttpServletResponse response)
            throws ServletException, IOException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
//------------------------------------------
        String s1 = request.getParameter("combo1");
        HttpSession bag = request.getSession(true);
        String ids = bag.getId();// session id
        try
        {
            CartRemote remote =
                    (CartRemote) bag.getValue(ids);
            if (remote == null)
            {
                remote = home.create(ids);
                bag.putValue(ids, remote);
            }
            remote.addbooks(s1);
            Vector vector1 = remote.getbooks();
            System.out.println(vector1.toString());
            out.println(ids);
            out.println("<br>");
            out.println(vector1.toString());

        } catch (Exception e1)
        {
            System.out.println(" " + e1);
        }
    }

}
