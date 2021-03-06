
package com.godoro.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Hesap Makinesi", targetNamespace = "http://service.godoro.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Hesap_0020Makinesi {


    /**
     * 
     * @param sol
     * @param sag
     * @return
     *     returns int
     */
    @WebMethod(operationName = "Topla")
    @WebResult(name = "Toplam", targetNamespace = "")
    @RequestWrapper(localName = "Topla", targetNamespace = "http://service.godoro.com/", className = "com.godoro.service.Topla")
    @ResponseWrapper(localName = "ToplaResponse", targetNamespace = "http://service.godoro.com/", className = "com.godoro.service.ToplaResponse")
    @Action(input = "http://service.godoro.com/Hesap Makinesi/ToplaRequest", output = "http://service.godoro.com/Hesap Makinesi/ToplaResponse")
    public int topla(
        @WebParam(name = "sol", targetNamespace = "")
        int sol,
        @WebParam(name = "sag", targetNamespace = "")
        int sag);

    /**
     * 
     * @param sol
     * @param sag
     * @return
     *     returns int
     */
    @WebMethod(operationName = "Carp")
    @WebResult(name = "carpim", targetNamespace = "")
    @RequestWrapper(localName = "Carp", targetNamespace = "http://service.godoro.com/", className = "com.godoro.service.Carp")
    @ResponseWrapper(localName = "CarpResponse", targetNamespace = "http://service.godoro.com/", className = "com.godoro.service.CarpResponse")
    @Action(input = "http://service.godoro.com/Hesap Makinesi/CarpRequest", output = "http://service.godoro.com/Hesap Makinesi/CarpResponse")
    public int carp(
        @WebParam(name = "sol", targetNamespace = "")
        int sol,
        @WebParam(name = "sag", targetNamespace = "")
        int sag);

}
