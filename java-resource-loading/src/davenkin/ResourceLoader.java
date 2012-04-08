package davenkin;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ResourceLoader
{
    public static void main(String[] args) throws IOException
    {
        ResourceLoader resourceLoader = new ResourceLoader();
        resourceLoader.loadProperties1();
        resourceLoader.loadProperties2();
        resourceLoader.loadProperties3();
        resourceLoader.loadProperties4();
        resourceLoader.loadProperties5();
        resourceLoader.loadProperties6();
    }

    public void loadProperties1() throws IOException
    {
        InputStream input = null;
        try
        {
            input = Class.forName("davenkin.ResourceLoader").getResourceAsStream("/resources/config.properties");
        } catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        printProperties(input);
    }

    public void loadProperties2() throws IOException
    {
        InputStream input = null;

        input = this.getClass().getResourceAsStream("/resources/config.properties");
        printProperties(input);
    }

    public void loadProperties3() throws IOException
    {
        InputStream input = this.getClass().getResourceAsStream("resources/config.properties");
        printProperties(input);
    }

    public void loadProperties4() throws IOException
    {
        InputStream input = this.getClass().getClassLoader().getResourceAsStream("resources/config.properties");
        printProperties(input);
    }

    public void loadProperties5() throws IOException
    {
        InputStream input = ClassLoader.getSystemResourceAsStream("resources/config.properties");
        printProperties(input);
    }

    public void loadProperties6() throws IOException
    {
        InputStream input = ClassLoader.getSystemClassLoader().getResourceAsStream("resources/config.properties");

        printProperties(input);
    }

    private void printProperties(InputStream input) throws IOException
    {
        Properties properties = new Properties();
        properties.load(input);
        System.out.println(properties.getProperty("name"));
    }
}
