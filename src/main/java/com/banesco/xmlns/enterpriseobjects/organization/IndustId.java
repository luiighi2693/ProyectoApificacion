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
 * <p>Clase Java para IndustId complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="IndustId"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Org" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IndustNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndustId", propOrder = {
    "org",
    "industNum"
})
public class IndustId {

    @XmlElement(name = "Org")
    protected String org;
    @XmlElement(name = "IndustNum")
    protected String industNum;

    /**
     * Obtiene el valor de la propiedad org.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrg() {
        return org;
    }

    /**
     * Define el valor de la propiedad org.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrg(String value) {
        this.org = value;
    }

    /**
     * Obtiene el valor de la propiedad industNum.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndustNum() {
        return industNum;
    }

    /**
     * Define el valor de la propiedad industNum.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndustNum(String value) {
        this.industNum = value;
    }

}
