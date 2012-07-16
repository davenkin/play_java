package com.thoughtworks.davenkin;


import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HelloWorldClient
{
    public static void main(String[] args) throws IOException
    {
        HttpClient httpClient = new DefaultHttpClient();
        HttpPost post = new HttpPost("http://localhost:9999/ws/hello");
        StringEntity entity = new StringEntity("<?xml version=\"1.0\" ?>\n" +
                "\t<S:Envelope xmlns:S=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" +
                "\t\t<S:Body>\n" +
                "\t\t\t<ns2:getHelloWorldAsString xmlns:ns2=\"http://davenkin.thoughtworks.com/\">\n" +
                "\t\t\t\t<arg0>mkyong</arg0>\n" +
                "\t\t\t</ns2:getHelloWorldAsString>\n" +
                "\t\t</S:Body>\n" +
                "\t</S:Envelope>");
        entity.setContentType("text/xml");
        post.setEntity(entity);
        HttpResponse response;
        response = httpClient.execute(post);
        BufferedReader br = new BufferedReader(
                new InputStreamReader((response.getEntity().getContent())));

        String output;
        System.out.println("Output from Server .... \n");
        while ((output = br.readLine()) != null)
        {
            System.out.println(output);
        }

        httpClient.getConnectionManager().shutdown();
    }

}
