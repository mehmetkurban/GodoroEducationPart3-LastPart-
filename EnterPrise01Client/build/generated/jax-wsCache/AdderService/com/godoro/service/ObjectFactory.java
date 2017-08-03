
package com.godoro.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.godoro.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Carp_QNAME = new QName("http://service.godoro.com/", "Carp");
    private final static QName _CarpResponse_QNAME = new QName("http://service.godoro.com/", "CarpResponse");
    private final static QName _Topla_QNAME = new QName("http://service.godoro.com/", "Topla");
    private final static QName _ToplaResponse_QNAME = new QName("http://service.godoro.com/", "ToplaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.godoro.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Carp }
     * 
     */
    public Carp createCarp() {
        return new Carp();
    }

    /**
     * Create an instance of {@link CarpResponse }
     * 
     */
    public CarpResponse createCarpResponse() {
        return new CarpResponse();
    }

    /**
     * Create an instance of {@link Topla }
     * 
     */
    public Topla createTopla() {
        return new Topla();
    }

    /**
     * Create an instance of {@link ToplaResponse }
     * 
     */
    public ToplaResponse createToplaResponse() {
        return new ToplaResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Carp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.godoro.com/", name = "Carp")
    public JAXBElement<Carp> createCarp(Carp value) {
        return new JAXBElement<Carp>(_Carp_QNAME, Carp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CarpResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.godoro.com/", name = "CarpResponse")
    public JAXBElement<CarpResponse> createCarpResponse(CarpResponse value) {
        return new JAXBElement<CarpResponse>(_CarpResponse_QNAME, CarpResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Topla }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.godoro.com/", name = "Topla")
    public JAXBElement<Topla> createTopla(Topla value) {
        return new JAXBElement<Topla>(_Topla_QNAME, Topla.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ToplaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.godoro.com/", name = "ToplaResponse")
    public JAXBElement<ToplaResponse> createToplaResponse(ToplaResponse value) {
        return new JAXBElement<ToplaResponse>(_ToplaResponse_QNAME, ToplaResponse.class, null, value);
    }

}
