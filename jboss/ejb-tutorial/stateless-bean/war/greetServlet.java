import java.net.*;
import javax.ejb.*;
import javax.rmi.*;
import java.rmi.*;
import javax.naming.*;
import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class greetServlet extends HttpServlet
{
public void doPost
(HttpServletRequest req, HttpServletResponse res)
throws ServletException,IOException
{
res.setContentType("text/html");
PrintWriter out=res.getWriter();
try
{
Properties props=new Properties();
props.put(Context.INITIAL_CONTEXT_FACTORY, "org.jnp.interfaces.NamingContextFactory");
props.put(Context.PROVIDER_URL, "localhost:1099");
props.put(Context.URL_PKG_PREFIXES, "org.jboss.naming:org.jnp.interfaces");
System.out.println("Properties ok");
Context ctx=new InitialContext(props);
System.out.println("context ok");
greetHome home = (greetHome)
ctx.lookup("greetJndi");
System.out.println("home ok");
greetRemote remote=home.create();
System.out.println("remote ok");
String a = req.getParameter("text1");
String s = remote.greetme(a);
System.out.println(s);
out.println(s);
}
catch(Exception e)
{System.out.println(""+e);}
}
}
