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
 * <p>Clase Java para Plan complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Plan"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PlanId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InsuredItem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PlanCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PlanValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CurCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "Plan", propOrder = {
    "planId",
    "insuredItem",
    "planCode",
    "planValue",
    "curCode",
    "desc"
})
public class Plan {

    @XmlElement(name = "PlanId")
    protected String planId;
    @XmlElement(name = "InsuredItem")
    protected String insuredItem;
    @XmlElement(name = "PlanCode")
    protected String planCode;
    @XmlElement(name = "PlanValue")
    protected String planValue;
    @XmlElement(name = "CurCode")
    protected String curCode;
    @XmlElement(name = "Desc")
    protected String desc;

    /**
     * Obtiene el valor de la propiedad planId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanId() {
        return planId;
    }

    /**
     * Define el valor de la propiedad planId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanId(String value) {
        this.planId = value;
    }

    /**
     * Obtiene el valor de la propiedad insuredItem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuredItem() {
        return insuredItem;
    }

    /**
     * Define el valor de la propiedad insuredItem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuredItem(String value) {
        this.insuredItem = value;
    }

    /**
     * Obtiene el valor de la propiedad planCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanCode() {
        return planCode;
    }

    /**
     * Define el valor de la propiedad planCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanCode(String value) {
        this.planCode = value;
    }

    /**
     * Obtiene el valor de la propiedad planValue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanValue() {
        return planValue;
    }

    /**
     * Define el valor de la propiedad planValue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanValue(String value) {
        this.planValue = value;
    }

    /**
     * Obtiene el valor de la propiedad curCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurCode() {
        return curCode;
    }

    /**
     * Define el valor de la propiedad curCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurCode(String value) {
        this.curCode = value;
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
