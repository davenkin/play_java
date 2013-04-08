package com.thoughtworks.davenkin;

import v1.Animal;
import v1.Zoo;
import v1.ZooInfo;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;
import java.io.StringWriter;

/**
 * Created with IntelliJ IDEA.
 * User: davenkin
 * Date: 1/17/13
 * Time: 10:24 PM
 * To change this template use File | Settings | File Templates.
 */
public class JndiContext {

    public void createName() throws NamingException {
        Context context = new InitialContext();
        context.bind("/config/applicationName", "MyApp");
    }
    public String getName() throws NamingException {
        Context context = new InitialContext();
        return (String) context.lookup("/config/applicationName");
    }

    public static void main(String args[]) throws Exception {
//        org.jnp.server.Main.main(args);
//        JndiContext context = new JndiContext();
//        context.createName();
//        System.out.println(context.getName());
       JAXBContext context = JAXBContext.newInstance(ZooInfo.class);
        Marshaller marshaller = context.createMarshaller();
        final StringWriter stringWriter = new StringWriter();

        // Create the sample object we wish to transform into XML
        Zoo javaObject = new Zoo();
        javaObject.setZooId(123);
        javaObject.setZooName("asd");
        Animal animal = new Animal();
        animal.setAnimalName("name");
        animal.setAnimalType("type");
        javaObject.getAnimals().add(animal);

        ZooInfo zooInfo = new ZooInfo();
        zooInfo.setCity("city");
        zooInfo.setZoo(javaObject);

        // Marshal the javaObject and write the XML to the stringWriter
        marshaller.marshal(zooInfo, stringWriter);
        System.out.println(stringWriter.toString());


    }
}
