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
import java.io.IOException;

public class
        ErrorCodeGeneratingServlet extends HttpServlet{

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
response.sendError(500,"The server is taking on a strike");
    }
}