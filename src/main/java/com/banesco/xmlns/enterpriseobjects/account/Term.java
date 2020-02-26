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
 * <p>Clase Java para Term complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Term"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Count" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TermUnits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InstalmentsNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Term", propOrder = {
    "count",
    "termUnits",
    "instalmentsNum"
})
public class Term {

    @XmlElement(name = "Count")
    protected String count;
    @XmlElement(name = "TermUnits")
    protected String termUnits;
    @XmlElement(name = "InstalmentsNum")
    protected String instalmentsNum;

    /**
     * Obtiene el valor de la propiedad count.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCount() {
        return count;
    }

    /**
     * Define el valor de la propiedad count.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCount(String value) {
        this.count = value;
    }

    /**
     * Obtiene el valor de la propiedad termUnits.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermUnits() {
        return termUnits;
    }

    /**
     * Define el valor de la propiedad termUnits.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermUnits(String value) {
        this.termUnits = value;
    }

    /**
     * Obtiene el valor de la propiedad instalmentsNum.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstalmentsNum() {
        return instalmentsNum;
    }

    /**
     * Define el valor de la propiedad instalmentsNum.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstalmentsNum(String value) {
        this.instalmentsNum = value;
    }

}
