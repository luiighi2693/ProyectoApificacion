//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.02.24 a las 10:07:43 PM VET 
//


package com.banesco.xmlns.enterpriseobjects.service;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Issue complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Issue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IssueType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IssueQty" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="IssueTypeDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Issue", propOrder = {
    "issueType",
    "issueQty",
    "issueTypeDesc"
})
public class Issue {

    @XmlElement(name = "IssueType")
    protected String issueType;
    @XmlElement(name = "IssueQty")
    protected BigInteger issueQty;
    @XmlElement(name = "IssueTypeDesc")
    protected String issueTypeDesc;

    /**
     * Obtiene el valor de la propiedad issueType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueType() {
        return issueType;
    }

    /**
     * Define el valor de la propiedad issueType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssueType(String value) {
        this.issueType = value;
    }

    /**
     * Obtiene el valor de la propiedad issueQty.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIssueQty() {
        return issueQty;
    }

    /**
     * Define el valor de la propiedad issueQty.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIssueQty(BigInteger value) {
        this.issueQty = value;
    }

    /**
     * Obtiene el valor de la propiedad issueTypeDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueTypeDesc() {
        return issueTypeDesc;
    }

    /**
     * Define el valor de la propiedad issueTypeDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssueTypeDesc(String value) {
        this.issueTypeDesc = value;
    }

}
