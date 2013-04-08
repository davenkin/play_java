package com.thoughtworks.davenkin;


import org.junit.Ignore;
import org.junit.Test;

import java.io.*;
import java.util.Scanner;

import static junit.framework.Assert.assertEquals;

@Ignore
public class StringManipulatorTest
{


    @Test
    public void shouldNotContainCarriageReturnCharWhenReadLine() throws IOException
    {
        InputStream inputStream = this.getClass().getResourceAsStream("/foo.txt");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String aString = bufferedReader.readLine();
        System.out.print(aString);
        assertEquals(4, aString.length());
    }

    @Test
    public void readFileAsStream() throws IOException
    {
        FileInputStream fileInputStream = new FileInputStream("/Users/twer/projects/github/java/JavaBasics/src/main/resources/foo.txt");
        int aChar;

        StringBuilder stringBuilder = new StringBuilder();
        byte[] bytes = new byte[100];
        fileInputStream.read(bytes);
        System.out.print(bytes[2]);
        System.out.print(bytes.toString());
        while ((aChar = fileInputStream.read()) != -1)
        {
            stringBuilder.append((char) aChar);
            System.out.print(aChar);
        }
        String str = stringBuilder.toString();
        System.out.print(str.length());
        System.out.println(System.setProperty("file.encoding", "UTF-8"));

    }

    @Test
    public void unicode()
    {
        char pi = '\u03c0';
        System.out.println(pi);
    }

    @Test
    public void testScanner()
    {
        Scanner s = new Scanner("123 asdf sd 45 789 sdf asdfl,sdf.sdfl,asdf    ......asdfkl    las");
        System.out.println(s.nextInt());
    }
}
