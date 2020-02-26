//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.02.24 a las 10:07:43 PM VET 
//


package com.banesco.xmlns.enterpriseobjects.taxes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Taxes complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Taxes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TaxInfo" type="{http://xmlns.banesco.com/EnterpriseObjects/Taxes}TaxInfo" minOccurs="0"/&gt;
 *         &lt;element name="ExceptionCodeIDB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AmountOnIDB" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TaxType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Taxes", propOrder = {
    "taxInfo",
    "exceptionCodeIDB",
    "amountOnIDB",
    "taxType",
    "desc"
})
public class Taxes {

    @XmlElement(name = "TaxInfo")
    protected TaxInfo taxInfo;
    @XmlElement(name = "ExceptionCodeIDB")
    protected String exceptionCodeIDB;
    @XmlElement(name = "AmountOnIDB")
    protected Double amountOnIDB;
    @XmlElement(name = "TaxType")
    protected String taxType;
    @XmlElement(name = "Desc")
    protected String desc;

    /**
     * Obtiene el valor de la propiedad taxInfo.
     * 
     * @return
     *     possible object is
     *     {@link TaxInfo }
     *     
     */
    public TaxInfo getTaxInfo() {
        return taxInfo;
    }

    /**
     * Define el valor de la propiedad taxInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxInfo }
     *     
     */
    public void setTaxInfo(TaxInfo value) {
        this.taxInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad exceptionCodeIDB.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExceptionCodeIDB() {
        return exceptionCodeIDB;
    }

    /**
     * Define el valor de la propiedad exceptionCodeIDB.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExceptionCodeIDB(String value) {
        this.exceptionCodeIDB = value;
    }

    /**
     * Obtiene el valor de la propiedad amountOnIDB.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAmountOnIDB() {
        return amountOnIDB;
    }

    /**
     * Define el valor de la propiedad amountOnIDB.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAmountOnIDB(Double value) {
        this.amountOnIDB = value;
    }

    /**
     * Obtiene el valor de la propiedad taxType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxType() {
        return taxType;
    }

    /**
     * Define el valor de la propiedad taxType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxType(String value) {
        this.taxType = value;
    }

    /**
     * Obtiene el valor de la propiedad desc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Define el valor de la propiedad desc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesc(String value) {
        this.desc = value;
    }

}
