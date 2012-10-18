package com.thoughtworks.davenkin;

import java.io.*;

public class StringManipulator
{
    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println(reader.read());
//        System.out.println(reader.readLine());
//        System.out.println(System.in.read());

//        String name = reader.getClass().getName();
//        System.out.print(name);
        BufferedReader bufferedReader = new BufferedReader(new StringReader("dfsdfs\nsdfsdfs"));
        System.out.print(bufferedReader.readLine());
        String str = "的";
        byte[] bytes = str.getBytes();
        File file = new File("/Users/twer/aa");
        file.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write(bytes);
        fileOutputStream.flush();
        fileOutputStream.close();
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        System.out.println(contextClassLoader.toString());
        ClassLoader parent = contextClassLoader.getParent();
        System.out.println(parent.toString());

        StringManipulator stringManipulator = new StringManipulator();
        stringManipulator.packageInfo();
    }

    private void packageInfo() throws ClassNotFoundException, IllegalAccessException, InstantiationException
    {
        System.out.println("===========");
        System.out.println(this.getClass().getClassLoader().toString());
        System.out.println(Thread.currentThread().getContextClassLoader().toString());
        System.out.println(ClassLoader.getSystemClassLoader().toString());

        Package aPackage = this.getClass().getPackage();
        MyClassLoader myClassLoader = new MyClassLoader();
        Class aClass =  myClassLoader.loadClass("com.thoughtworks.davenkin.AA");
        Object dd =  aClass.newInstance();
        System.out.println(dd.getClass().getClassLoader());
    }


}
