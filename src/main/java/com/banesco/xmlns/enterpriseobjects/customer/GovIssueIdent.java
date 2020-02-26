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
 * <p>Clase Java para GovIssueIdent complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GovIssueIdent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GovIssueIdentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IdentSerialNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GovIssueIdent", propOrder = {
    "govIssueIdentType",
    "identSerialNum"
})
public class GovIssueIdent {

    @XmlElement(name = "GovIssueIdentType")
    protected String govIssueIdentType;
    @XmlElement(name = "IdentSerialNum")
    protected String identSerialNum;

    /**
     * Obtiene el valor de la propiedad govIssueIdentType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGovIssueIdentType() {
        return govIssueIdentType;
    }

    /**
     * Define el valor de la propiedad govIssueIdentType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGovIssueIdentType(String value) {
        this.govIssueIdentType = value;
    }

    /**
     * Obtiene el valor de la propiedad identSerialNum.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentSerialNum() {
        return identSerialNum;
    }

    /**
     * Define el valor de la propiedad identSerialNum.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentSerialNum(String value) {
        this.identSerialNum = value;
    }

}
