//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.02.24 a las 10:07:43 PM VET 
//


package com.banesco.xmlns.enterpriseobjects.account;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para BankAcctStatus complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BankAcctStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BankAcctStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StatusDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BankAcctBlockType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BankAcctBlockCause" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankAcctStatus", propOrder = {
    "bankAcctStatusCode",
    "statusDesc",
    "bankAcctBlockType",
    "bankAcctBlockCause"
})
public class BankAcctStatus {

    @XmlElement(name = "BankAcctStatusCode")
    protected String bankAcctStatusCode;
    @XmlElement(name = "StatusDesc")
    protected String statusDesc;
    @XmlElement(name = "BankAcctBlockType")
    protected String bankAcctBlockType;
    @XmlElement(name = "BankAcctBlockCause")
    protected String bankAcctBlockCause;

    /**
     * Obtiene el valor de la propiedad bankAcctStatusCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAcctStatusCode() {
        return bankAcctStatusCode;
    }

    /**
     * Define el valor de la propiedad bankAcctStatusCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAcctStatusCode(String value) {
        this.bankAcctStatusCode = value;
    }

    /**
     * Obtiene el valor de la propiedad statusDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusDesc() {
        return statusDesc;
    }

    /**
     * Define el valor de la propiedad statusDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusDesc(String value) {
        this.statusDesc = value;
    }

    /**
     * Obtiene el valor de la propiedad bankAcctBlockType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAcctBlockType() {
        return bankAcctBlockType;
    }

    /**
     * Define el valor de la propiedad bankAcctBlockType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAcctBlockType(String value) {
        this.bankAcctBlockType = value;
    }

    /**
     * Obtiene el valor de la propiedad bankAcctBlockCause.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAcctBlockCause() {
        return bankAcctBlockCause;
    }

    /**
     * Define el valor de la propiedad bankAcctBlockCause.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAcctBlockCause(String value) {
        this.bankAcctBlockCause = value;
    }

}
