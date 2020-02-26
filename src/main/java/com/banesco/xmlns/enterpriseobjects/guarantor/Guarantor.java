//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.02.24 a las 10:07:43 PM VET 
//


package com.banesco.xmlns.enterpriseobjects.guarantor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Guarantor complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Guarantor"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GuarantorId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Nationality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DocumentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Amt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Rate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="AffiliationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Guarantor", propOrder = {
    "guarantorId",
    "nationality",
    "documentId",
    "number",
    "amt",
    "rate",
    "affiliationType"
})
public class Guarantor {

    @XmlElement(name = "GuarantorId")
    protected String guarantorId;
    @XmlElement(name = "Nationality")
    protected String nationality;
    @XmlElement(name = "DocumentId")
    protected String documentId;
    @XmlElement(name = "Number")
    protected String number;
    @XmlElement(name = "Amt")
    protected Double amt;
    @XmlElement(name = "Rate")
    protected Double rate;
    @XmlElement(name = "AffiliationType")
    protected String affiliationType;

    /**
     * Obtiene el valor de la propiedad guarantorId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuarantorId() {
        return guarantorId;
    }

    /**
     * Define el valor de la propiedad guarantorId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuarantorId(String value) {
        this.guarantorId = value;
    }

    /**
     * Obtiene el valor de la propiedad nationality.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * Define el valor de la propiedad nationality.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationality(String value) {
        this.nationality = value;
    }

    /**
     * Obtiene el valor de la propiedad documentId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentId() {
        return documentId;
    }

    /**
     * Define el valor de la propiedad documentId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentId(String value) {
        this.documentId = value;
    }

    /**
     * Obtiene el valor de la propiedad number.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Define el valor de la propiedad number.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Obtiene el valor de la propiedad amt.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAmt() {
        return amt;
    }

    /**
     * Define el valor de la propiedad amt.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAmt(Double value) {
        this.amt = value;
    }

    /**
     * Obtiene el valor de la propiedad rate.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRate() {
        return rate;
    }

    /**
     * Define el valor de la propiedad rate.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRate(Double value) {
        this.rate = value;
    }

    /**
     * Obtiene el valor de la propiedad affiliationType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAffiliationType() {
        return affiliationType;
    }

    /**
     * Define el valor de la propiedad affiliationType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAffiliationType(String value) {
        this.affiliationType = value;
    }

}
