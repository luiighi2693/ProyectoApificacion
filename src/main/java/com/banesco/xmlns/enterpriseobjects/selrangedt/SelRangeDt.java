//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.02.24 a las 10:07:43 PM VET 
//


package com.banesco.xmlns.enterpriseobjects.selrangedt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SelRangeDt complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SelRangeDt"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StartDt" type="{http://xmlns.banesco.com/EnterpriseObjects/SelRangeDt}datePattern" minOccurs="0"/&gt;
 *         &lt;element name="EndDt" type="{http://xmlns.banesco.com/EnterpriseObjects/SelRangeDt}datePattern" minOccurs="0"/&gt;
 *         &lt;element name="MonthRange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelRangeDt", propOrder = {
    "startDt",
    "endDt",
    "monthRange"
})
public class SelRangeDt {

    @XmlElement(name = "StartDt")
    protected String startDt;
    @XmlElement(name = "EndDt")
    protected String endDt;
    @XmlElement(name = "MonthRange")
    protected String monthRange;

    /**
     * Obtiene el valor de la propiedad startDt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDt() {
        return startDt;
    }

    /**
     * Define el valor de la propiedad startDt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDt(String value) {
        this.startDt = value;
    }

    /**
     * Obtiene el valor de la propiedad endDt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDt() {
        return endDt;
    }

    /**
     * Define el valor de la propiedad endDt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDt(String value) {
        this.endDt = value;
    }

    /**
     * Obtiene el valor de la propiedad monthRange.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonthRange() {
        return monthRange;
    }

    /**
     * Define el valor de la propiedad monthRange.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonthRange(String value) {
        this.monthRange = value;
    }

}
