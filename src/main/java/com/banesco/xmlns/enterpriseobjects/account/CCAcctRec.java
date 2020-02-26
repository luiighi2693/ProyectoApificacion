//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.02.24 a las 10:07:43 PM VET 
//


package com.banesco.xmlns.enterpriseobjects.account;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CCAcctRec complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CCAcctRec"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TotalCurAmt" type="{http://xmlns.banesco.com/EnterpriseObjects/Account}TotalCurAmt" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="MinAmt" type="{http://xmlns.banesco.com/EnterpriseObjects/Account}MinAmt" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DueDt" type="{http://xmlns.banesco.com/EnterpriseObjects/Account}datePattern" minOccurs="0"/&gt;
 *         &lt;element name="ArrearTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCAcctRec", propOrder = {
    "totalCurAmt",
    "minAmt",
    "dueDt",
    "arrearTime"
})
public class CCAcctRec {

    @XmlElement(name = "TotalCurAmt")
    protected List<TotalCurAmt> totalCurAmt;
    @XmlElement(name = "MinAmt")
    protected List<MinAmt> minAmt;
    @XmlElement(name = "DueDt")
    protected String dueDt;
    @XmlElement(name = "ArrearTime")
    protected String arrearTime;

    /**
     * Gets the value of the totalCurAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the totalCurAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTotalCurAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TotalCurAmt }
     * 
     * 
     */
    public List<TotalCurAmt> getTotalCurAmt() {
        if (totalCurAmt == null) {
            totalCurAmt = new ArrayList<TotalCurAmt>();
        }
        return this.totalCurAmt;
    }

    /**
     * Gets the value of the minAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the minAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMinAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MinAmt }
     * 
     * 
     */
    public List<MinAmt> getMinAmt() {
        if (minAmt == null) {
            minAmt = new ArrayList<MinAmt>();
        }
        return this.minAmt;
    }

    /**
     * Obtiene el valor de la propiedad dueDt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDueDt() {
        return dueDt;
    }

    /**
     * Define el valor de la propiedad dueDt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDueDt(String value) {
        this.dueDt = value;
    }

    /**
     * Obtiene el valor de la propiedad arrearTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrearTime() {
        return arrearTime;
    }

    /**
     * Define el valor de la propiedad arrearTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrearTime(String value) {
        this.arrearTime = value;
    }

}
