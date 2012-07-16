package com.thoughtworks.davenkin;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface HelloWorld
{
    @WebMethod
    public String getHelloWorldAsString(String name);
}
