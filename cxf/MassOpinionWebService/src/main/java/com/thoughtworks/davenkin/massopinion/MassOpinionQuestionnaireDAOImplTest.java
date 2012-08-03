package com.thoughtworks.davenkin.massopinion;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.FileRequestEntity;
import org.apache.commons.httpclient.methods.PostMethod;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class MassOpinionQuestionnaireDAOImplTest
{
    @Test
    public void test() throws IOException
    {
        HttpClient httpClient = new HttpClient();
        PostMethod postMethod = new PostMethod("http://localhost:8080/springws-demo");
        File file = new File(Thread.currentThread().getContextClassLoader().getResource("request.xml").getFile());
        postMethod.setRequestEntity(new FileRequestEntity(file,"text/xml"));
        int statusCode = httpClient.executeMethod(postMethod);
        String response = postMethod.getResponseBodyAsString();
        System.out.println(response);
        
    }
}
