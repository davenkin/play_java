package com.thoughtworks.davenkin;

import javax.jws.WebService;

@WebService(endpointInterface = "com.thoughtworks.davenkin.HelloWorld")
public class HelloWorldImpl implements HelloWorld
{
    public String getHelloWorldAsString(String name)
    {
        return "Hello" + name;
    }
}
