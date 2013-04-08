package com.thoughtworks.davenkin;


import v3.Animal;
import v3.Zoo;
import v3.ZooInfo;
import v3.ZooInfoV3;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;

/**
 * Created with IntelliJ IDEA.
 * User: davenkin
 * Date: 1/19/13
 * Time: 1:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class MainV3 {

    public static void main(String args[]) throws Exception {
//        org.jnp.server.Main.main(args);
//        JndiContext context = new JndiContext();
//        context.createName();
//        System.out.println(context.getName());
        JAXBContext context = JAXBContext.newInstance(ZooInfoV3.class);
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

        ZooInfoV3 zooInfo = new ZooInfoV3();
        zooInfo.setCity("city");
        zooInfo.setZoo(javaObject);

        // Marshal the javaObject and write the XML to the stringWriter
        marshaller.marshal(zooInfo, stringWriter);
        System.out.println(stringWriter.toString());


    }
}
