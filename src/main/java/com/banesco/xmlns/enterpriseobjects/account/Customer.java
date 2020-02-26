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
 * <p>Clase Java para Customer complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Customer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PersonInfo" type="{http://xmlns.banesco.com/EnterpriseObjects/Account}PersonInfo" minOccurs="0"/&gt;
 *         &lt;element name="CustId" type="{http://xmlns.banesco.com/EnterpriseObjects/Account}CustId" minOccurs="0"/&gt;
 *         &lt;element name="AffiliationTypeCustomer" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CustRoll" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustInfo" type="{http://xmlns.banesco.com/EnterpriseObjects/Account}CustInfo" minOccurs="0"/&gt;
 *         &lt;element name="AccessType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ValidateCustId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Customer", propOrder = {
    "personInfo",
    "custId",
    "affiliationTypeCustomer",
    "custRoll",
    "custInfo",
    "accessType",
    "validateCustId"
})
public class Customer {

    @XmlElement(name = "PersonInfo")
    protected PersonInfo personInfo;
    @XmlElement(name = "CustId")
    protected CustId custId;
    @XmlElement(name = "AffiliationTypeCustomer")
    protected Long affiliationTypeCustomer;
    @XmlElement(name = "CustRoll")
    protected String custRoll;
    @XmlElement(name = "CustInfo")
    protected CustInfo custInfo;
    @XmlElement(name = "AccessType")
    protected String accessType;
    @XmlElement(name = "ValidateCustId")
    protected String validateCustId;

    /**
     * Obtiene el valor de la propiedad personInfo.
     * 
     * @return
     *     possible object is
     *     {@link PersonInfo }
     *     
     */
    public PersonInfo getPersonInfo() {
        return personInfo;
    }

    /**
     * Define el valor de la propiedad personInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonInfo }
     *     
     */
    public void setPersonInfo(PersonInfo value) {
        this.personInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad custId.
     * 
     * @return
     *     possible object is
     *     {@link CustId }
     *     
     */
    public CustId getCustId() {
        return custId;
    }

    /**
     * Define el valor de la propiedad custId.
     * 
     * @param value
     *     allowed object is
     *     {@link CustId }
     *     
     */
    public void setCustId(CustId value) {
        this.custId = value;
    }

    /**
     * Obtiene el valor de la propiedad affiliationTypeCustomer.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAffiliationTypeCustomer() {
        return affiliationTypeCustomer;
    }

    /**
     * Define el valor de la propiedad affiliationTypeCustomer.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAffiliationTypeCustomer(Long value) {
        this.affiliationTypeCustomer = value;
    }

    /**
     * Obtiene el valor de la propiedad custRoll.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustRoll() {
        return custRoll;
    }

    /**
     * Define el valor de la propiedad custRoll.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustRoll(String value) {
        this.custRoll = value;
    }

    /**
     * Obtiene el valor de la propiedad custInfo.
     * 
     * @return
     *     possible object is
     *     {@link CustInfo }
     *     
     */
    public CustInfo getCustInfo() {
        return custInfo;
    }

    /**
     * Define el valor de la propiedad custInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link CustInfo }
     *     
     */
    public void setCustInfo(CustInfo value) {
        this.custInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad accessType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessType() {
        return accessType;
    }

    /**
     * Define el valor de la propiedad accessType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessType(String value) {
        this.accessType = value;
    }

    /**
     * Obtiene el valor de la propiedad validateCustId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidateCustId() {
        return validateCustId;
    }

    /**
     * Define el valor de la propiedad validateCustId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidateCustId(String value) {
        this.validateCustId = value;
    }

}
