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
 * <p>Clase Java para Organization complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Organization"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrgInfo" type="{http://xmlns.banesco.com/EnterpriseObjects/Organization}OrgInfo" minOccurs="0"/&gt;
 *         &lt;element name="IncAgrmt" type="{http://xmlns.banesco.com/EnterpriseObjects/Organization}IncAgrmt" minOccurs="0"/&gt;
 *         &lt;element name="TradeRegistry" type="{http://xmlns.banesco.com/EnterpriseObjects/Organization}TradeRegistry" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Organization", propOrder = {
    "orgInfo",
    "incAgrmt",
    "tradeRegistry"
})
public class Organization {

    @XmlElement(name = "OrgInfo")
    protected OrgInfo orgInfo;
    @XmlElement(name = "IncAgrmt")
    protected IncAgrmt incAgrmt;
    @XmlElement(name = "TradeRegistry")
    protected TradeRegistry tradeRegistry;

    /**
     * Obtiene el valor de la propiedad orgInfo.
     * 
     * @return
     *     possible object is
     *     {@link OrgInfo }
     *     
     */
    public OrgInfo getOrgInfo() {
        return orgInfo;
    }

    /**
     * Define el valor de la propiedad orgInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link OrgInfo }
     *     
     */
    public void setOrgInfo(OrgInfo value) {
        this.orgInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad incAgrmt.
     * 
     * @return
     *     possible object is
     *     {@link IncAgrmt }
     *     
     */
    public IncAgrmt getIncAgrmt() {
        return incAgrmt;
    }

    /**
     * Define el valor de la propiedad incAgrmt.
     * 
     * @param value
     *     allowed object is
     *     {@link IncAgrmt }
     *     
     */
    public void setIncAgrmt(IncAgrmt value) {
        this.incAgrmt = value;
    }

    /**
     * Obtiene el valor de la propiedad tradeRegistry.
     * 
     * @return
     *     possible object is
     *     {@link TradeRegistry }
     *     
     */
    public TradeRegistry getTradeRegistry() {
        return tradeRegistry;
    }

    /**
     * Define el valor de la propiedad tradeRegistry.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeRegistry }
     *     
     */
    public void setTradeRegistry(TradeRegistry value) {
        this.tradeRegistry = value;
    }

}
