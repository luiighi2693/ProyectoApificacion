//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.02.24 a las 10:07:43 PM VET 
//


package com.banesco.xmlns.enterpriseobjects.pmtbatchrec;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CurAmt complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CurAmt"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Amt" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AmtCom" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="AmtType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "CurAmt", propOrder = {
    "amt",
    "amtCom",
    "amtType",
    "curCode",
    "desc"
})
public class CurAmt {

    @XmlElement(name = "Amt", type = Double.class)
    protected List<Double> amt;
    @XmlElement(name = "AmtCom")
    protected Double amtCom;
    @XmlElement(name = "AmtType")
    protected String amtType;
    @XmlElement(name = "CurCode")
    protected String curCode;
    @XmlElement(name = "Desc")
    protected String desc;

    /**
     * Gets the value of the amt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the amt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getAmt() {
        if (amt == null) {
            amt = new ArrayList<Double>();
        }
        return this.amt;
    }

    /**
     * Obtiene el valor de la propiedad amtCom.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAmtCom() {
        return amtCom;
    }

    /**
     * Define el valor de la propiedad amtCom.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAmtCom(Double value) {
        this.amtCom = value;
    }

    /**
     * Obtiene el valor de la propiedad amtType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmtType() {
        return amtType;
    }

    /**
     * Define el valor de la propiedad amtType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmtType(String value) {
        this.amtType = value;
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
