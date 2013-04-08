  <%@ page isErrorPage="true" import="java.io.PrintWriter" %>

  <html><body>

  <h1 style="color: red">Error</h1>

  <pre>
  <%
  exception.printStackTrace(new PrintWriter(out));
  %>
  </pre>

  </body></html>