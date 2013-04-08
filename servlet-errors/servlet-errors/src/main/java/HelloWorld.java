import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created with IntelliJ IDEA.
 * User: davenkin
 * Date: 1/4/13
 * Time: 9:12 PM
 * To change this template use File | Settings | File Templates.
 */
public class HelloWorld {
    private final static Logger logger= LoggerFactory.getLogger(HelloWorld.class);

    public String sayHello(){
        logger.info("Saying hello.");
        return "Hello.";
    }


}
