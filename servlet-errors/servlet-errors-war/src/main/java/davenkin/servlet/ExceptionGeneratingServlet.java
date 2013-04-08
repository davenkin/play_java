package davenkin.servlet;

/**
 * Created with IntelliJ IDEA.
 * User: davenkin
 * Date: 4/8/13
 * Time: 9:34 PM
 * To change this template use File | Settings | File Templates.
 */
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class
        ExceptionGeneratingServlet extends HttpServlet{

    public void doGet(HttpServletRequest request, HttpServletResponse response)
    {
throw new RuntimeException("this is a runtime exception")  ;
    }
}