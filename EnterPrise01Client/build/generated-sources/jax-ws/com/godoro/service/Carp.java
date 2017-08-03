
package com.godoro.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Carp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Carp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sol" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="sag" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Carp", propOrder = {
    "sol",
    "sag"
})
public class Carp {

    protected int sol;
    protected int sag;

    /**
     * Gets the value of the sol property.
     * 
     */
    public int getSol() {
        return sol;
    }

    /**
     * Sets the value of the sol property.
     * 
     */
    public void setSol(int value) {
        this.sol = value;
    }

    /**
     * Gets the value of the sag property.
     * 
     */
    public int getSag() {
        return sag;
    }

    /**
     * Sets the value of the sag property.
     * 
     */
    public void setSag(int value) {
        this.sag = value;
    }

}
