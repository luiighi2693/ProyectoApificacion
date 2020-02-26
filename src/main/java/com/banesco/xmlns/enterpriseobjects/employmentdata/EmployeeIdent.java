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
 * <p>Clase Java para EmployeeIdent complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EmployeeIdent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EmployerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EmployeeIdentlNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IssueLoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IssDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExpDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmployeeIdent", propOrder = {
    "employerName",
    "desc",
    "employeeIdentlNum",
    "issueLoc",
    "issDt",
    "expDt"
})
public class EmployeeIdent {

    @XmlElement(name = "EmployerName")
    protected String employerName;
    @XmlElement(name = "Desc")
    protected String desc;
    @XmlElement(name = "EmployeeIdentlNum")
    protected String employeeIdentlNum;
    @XmlElement(name = "IssueLoc")
    protected String issueLoc;
    @XmlElement(name = "IssDt")
    protected String issDt;
    @XmlElement(name = "ExpDt")
    protected String expDt;

    /**
     * Obtiene el valor de la propiedad employerName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployerName() {
        return employerName;
    }

    /**
     * Define el valor de la propiedad employerName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployerName(String value) {
        this.employerName = value;
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

    /**
     * Obtiene el valor de la propiedad employeeIdentlNum.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeIdentlNum() {
        return employeeIdentlNum;
    }

    /**
     * Define el valor de la propiedad employeeIdentlNum.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeIdentlNum(String value) {
        this.employeeIdentlNum = value;
    }

    /**
     * Obtiene el valor de la propiedad issueLoc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueLoc() {
        return issueLoc;
    }

    /**
     * Define el valor de la propiedad issueLoc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssueLoc(String value) {
        this.issueLoc = value;
    }

    /**
     * Obtiene el valor de la propiedad issDt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssDt() {
        return issDt;
    }

    /**
     * Define el valor de la propiedad issDt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssDt(String value) {
        this.issDt = value;
    }

    /**
     * Obtiene el valor de la propiedad expDt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpDt() {
        return expDt;
    }

    /**
     * Define el valor de la propiedad expDt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpDt(String value) {
        this.expDt = value;
    }

}
