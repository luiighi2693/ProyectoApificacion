//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.02.24 a las 10:07:43 PM VET 
//


package com.banesco.xmlns.enterpriseobjects.organization;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para IncAgrmt complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="IncAgrmt"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Division" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrigDt" type="{http://xmlns.banesco.com/EnterpriseObjects/Organization}datePattern" minOccurs="0"/&gt;
 *         &lt;element name="DueDt" type="{http://xmlns.banesco.com/EnterpriseObjects/Organization}datePattern" minOccurs="0"/&gt;
 *         &lt;element name="OutstandingCap" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaidUpCap" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AuthorizedCap" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncAgrmt", propOrder = {
    "division",
    "origDt",
    "dueDt",
    "outstandingCap",
    "paidUpCap",
    "authorizedCap"
})
public class IncAgrmt {

    @XmlElement(name = "Division")
    protected String division;
    @XmlElement(name = "OrigDt")
    protected String origDt;
    @XmlElement(name = "DueDt")
    protected String dueDt;
    @XmlElement(name = "OutstandingCap")
    protected String outstandingCap;
    @XmlElement(name = "PaidUpCap")
    protected String paidUpCap;
    @XmlElement(name = "AuthorizedCap")
    protected String authorizedCap;

    /**
     * Obtiene el valor de la propiedad division.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDivision() {
        return division;
    }

    /**
     * Define el valor de la propiedad division.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDivision(String value) {
        this.division = value;
    }

    /**
     * Obtiene el valor de la propiedad origDt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigDt() {
        return origDt;
    }

    /**
     * Define el valor de la propiedad origDt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigDt(String value) {
        this.origDt = value;
    }

    /**
     * Obtiene el valor de la propiedad dueDt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDueDt() {
        return dueDt;
    }

    /**
     * Define el valor de la propiedad dueDt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDueDt(String value) {
        this.dueDt = value;
    }

    /**
     * Obtiene el valor de la propiedad outstandingCap.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutstandingCap() {
        return outstandingCap;
    }

    /**
     * Define el valor de la propiedad outstandingCap.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutstandingCap(String value) {
        this.outstandingCap = value;
    }

    /**
     * Obtiene el valor de la propiedad paidUpCap.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaidUpCap() {
        return paidUpCap;
    }

    /**
     * Define el valor de la propiedad paidUpCap.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaidUpCap(String value) {
        this.paidUpCap = value;
    }

    /**
     * Obtiene el valor de la propiedad authorizedCap.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizedCap() {
        return authorizedCap;
    }

    /**
     * Define el valor de la propiedad authorizedCap.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizedCap(String value) {
        this.authorizedCap = value;
    }

}
