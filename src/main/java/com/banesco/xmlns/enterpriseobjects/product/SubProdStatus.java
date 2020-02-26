//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.02.24 a las 10:07:43 PM VET 
//


package com.banesco.xmlns.enterpriseobjects.product;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SubProdStatus complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SubProdStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BlockCausal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BlockCausalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubProdStatus", propOrder = {
    "blockCausal",
    "blockCausalCode"
})
public class SubProdStatus {

    @XmlElement(name = "BlockCausal")
    protected String blockCausal;
    @XmlElement(name = "BlockCausalCode")
    protected String blockCausalCode;

    /**
     * Obtiene el valor de la propiedad blockCausal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlockCausal() {
        return blockCausal;
    }

    /**
     * Define el valor de la propiedad blockCausal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlockCausal(String value) {
        this.blockCausal = value;
    }

    /**
     * Obtiene el valor de la propiedad blockCausalCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlockCausalCode() {
        return blockCausalCode;
    }

    /**
     * Define el valor de la propiedad blockCausalCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlockCausalCode(String value) {
        this.blockCausalCode = value;
    }

}
