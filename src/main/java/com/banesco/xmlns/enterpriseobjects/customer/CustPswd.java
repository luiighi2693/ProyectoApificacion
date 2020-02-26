//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.02.24 a las 10:07:43 PM VET 
//


package com.banesco.xmlns.enterpriseobjects.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CustPswd complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CustPswd"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BankPswd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BankPswdType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BankPswdStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BankPswdStatDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CryptType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CryptPswd" type="{http://xmlns.banesco.com/EnterpriseObjects/Customer}CryptPswd" minOccurs="0"/&gt;
 *         &lt;element name="Param" type="{http://xmlns.banesco.com/EnterpriseObjects/Customer}Param" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustPswd", propOrder = {
    "bankPswd",
    "bankPswdType",
    "bankPswdStatus",
    "bankPswdStatDesc",
    "cryptType",
    "cryptPswd",
    "param"
})
public class CustPswd {

    @XmlElement(name = "BankPswd")
    protected String bankPswd;
    @XmlElement(name = "BankPswdType")
    protected String bankPswdType;
    @XmlElement(name = "BankPswdStatus")
    protected String bankPswdStatus;
    @XmlElement(name = "BankPswdStatDesc")
    protected String bankPswdStatDesc;
    @XmlElement(name = "CryptType")
    protected String cryptType;
    @XmlElement(name = "CryptPswd")
    protected CryptPswd cryptPswd;
    @XmlElement(name = "Param")
    protected Param param;

    /**
     * Obtiene el valor de la propiedad bankPswd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankPswd() {
        return bankPswd;
    }

    /**
     * Define el valor de la propiedad bankPswd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankPswd(String value) {
        this.bankPswd = value;
    }

    /**
     * Obtiene el valor de la propiedad bankPswdType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankPswdType() {
        return bankPswdType;
    }

    /**
     * Define el valor de la propiedad bankPswdType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankPswdType(String value) {
        this.bankPswdType = value;
    }

    /**
     * Obtiene el valor de la propiedad bankPswdStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankPswdStatus() {
        return bankPswdStatus;
    }

    /**
     * Define el valor de la propiedad bankPswdStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankPswdStatus(String value) {
        this.bankPswdStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad bankPswdStatDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankPswdStatDesc() {
        return bankPswdStatDesc;
    }

    /**
     * Define el valor de la propiedad bankPswdStatDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankPswdStatDesc(String value) {
        this.bankPswdStatDesc = value;
    }

    /**
     * Obtiene el valor de la propiedad cryptType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCryptType() {
        return cryptType;
    }

    /**
     * Define el valor de la propiedad cryptType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCryptType(String value) {
        this.cryptType = value;
    }

    /**
     * Obtiene el valor de la propiedad cryptPswd.
     * 
     * @return
     *     possible object is
     *     {@link CryptPswd }
     *     
     */
    public CryptPswd getCryptPswd() {
        return cryptPswd;
    }

    /**
     * Define el valor de la propiedad cryptPswd.
     * 
     * @param value
     *     allowed object is
     *     {@link CryptPswd }
     *     
     */
    public void setCryptPswd(CryptPswd value) {
        this.cryptPswd = value;
    }

    /**
     * Obtiene el valor de la propiedad param.
     * 
     * @return
     *     possible object is
     *     {@link Param }
     *     
     */
    public Param getParam() {
        return param;
    }

    /**
     * Define el valor de la propiedad param.
     * 
     * @param value
     *     allowed object is
     *     {@link Param }
     *     
     */
    public void setParam(Param value) {
        this.param = value;
    }

}
