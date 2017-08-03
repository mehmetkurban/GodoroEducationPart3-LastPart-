
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

    private final static QName _Perform_QNAME = new QName("http://service.godoro.com/", "perform");
    private final static QName _PerformResponse_QNAME = new QName("http://service.godoro.com/", "performResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.godoro.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Perform }
     * 
     */
    public Perform createPerform() {
        return new Perform();
    }

    /**
     * Create an instance of {@link PerformResponse }
     * 
     */
    public PerformResponse createPerformResponse() {
        return new PerformResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Perform }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.godoro.com/", name = "perform")
    public JAXBElement<Perform> createPerform(Perform value) {
        return new JAXBElement<Perform>(_Perform_QNAME, Perform.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PerformResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.godoro.com/", name = "performResponse")
    public JAXBElement<PerformResponse> createPerformResponse(PerformResponse value) {
        return new JAXBElement<PerformResponse>(_PerformResponse_QNAME, PerformResponse.class, null, value);
    }

}
