//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.03.10 at 06:04:40 PM VET 
//


package com.banesco.xmlns.enterpriseobjects.msgrqhdr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VBProtocol complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VBProtocol"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VBProtocolInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TransactionInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VBProtocol", propOrder = {
    "vbProtocolInd",
    "transactionInd"
})
public class VBProtocol {

    @XmlElement(name = "VBProtocolInd", defaultValue = "false")
    protected Boolean vbProtocolInd;
    @XmlElement(name = "TransactionInd", defaultValue = "false")
    protected Boolean transactionInd;

    /**
     * Gets the value of the vbProtocolInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVBProtocolInd() {
        return vbProtocolInd;
    }

    /**
     * Sets the value of the vbProtocolInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVBProtocolInd(Boolean value) {
        this.vbProtocolInd = value;
    }

    /**
     * Gets the value of the transactionInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTransactionInd() {
        return transactionInd;
    }

    /**
     * Sets the value of the transactionInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTransactionInd(Boolean value) {
        this.transactionInd = value;
    }

}
