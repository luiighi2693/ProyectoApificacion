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
 * <p>Clase Java para TINInfo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TINInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TINType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TaxId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TINInfo", propOrder = {
    "tinType",
    "taxId"
})
public class TINInfo {

    @XmlElement(name = "TINType")
    protected String tinType;
    @XmlElement(name = "TaxId")
    protected String taxId;

    /**
     * Obtiene el valor de la propiedad tinType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTINType() {
        return tinType;
    }

    /**
     * Define el valor de la propiedad tinType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTINType(String value) {
        this.tinType = value;
    }

    /**
     * Obtiene el valor de la propiedad taxId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxId() {
        return taxId;
    }

    /**
     * Define el valor de la propiedad taxId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxId(String value) {
        this.taxId = value;
    }

}
