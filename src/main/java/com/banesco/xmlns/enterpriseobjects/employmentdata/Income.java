//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.02.24 a las 10:07:43 PM VET 
//


package com.banesco.xmlns.enterpriseobjects.employmentdata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Income complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Income"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Amt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="IncomeRange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IncomeRangeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Income", propOrder = {
    "amt",
    "incomeRange",
    "incomeRangeCode"
})
public class Income {

    @XmlElement(name = "Amt")
    protected Double amt;
    @XmlElement(name = "IncomeRange")
    protected String incomeRange;
    @XmlElement(name = "IncomeRangeCode")
    protected String incomeRangeCode;

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
     * Obtiene el valor de la propiedad incomeRange.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncomeRange() {
        return incomeRange;
    }

    /**
     * Define el valor de la propiedad incomeRange.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncomeRange(String value) {
        this.incomeRange = value;
    }

    /**
     * Obtiene el valor de la propiedad incomeRangeCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncomeRangeCode() {
        return incomeRangeCode;
    }

    /**
     * Define el valor de la propiedad incomeRangeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncomeRangeCode(String value) {
        this.incomeRangeCode = value;
    }

}
