
package com.godoro.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(name = "Hesap Makinesi")
public class Adder {
    
    @WebMethod(operationName = "Topla")
    public @WebResult(name="Toplam") int add (@WebParam(name="sol")int left,@WebParam(name="sag")int right){
        
        return left+right;
    }
    
    @WebMethod(operationName = "Carp")
    public @WebResult(name="carpim") int multiply(@WebParam(name="sol")int left,@WebParam(name="sag")int right){
        
        return left*right;
    }
    
}
