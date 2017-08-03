
package com.godoro.service;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;

@WebService(serviceName = "Friend")
public class Friend {

   
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    @WebMethod(operationName = "Perfom")
    public @WebResult(name="İsim") String perfom (@WebParam(name="Tek")String input){
        
        return "Space"+input;
    }
}
