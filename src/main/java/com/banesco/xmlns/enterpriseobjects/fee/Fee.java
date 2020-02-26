//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.02.24 a las 10:07:43 PM VET 
//


package com.banesco.xmlns.enterpriseobjects.fee;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Fee complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Fee"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FeeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CommissionInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CurAmt" type="{http://xmlns.banesco.com/EnterpriseObjects/Fee}CurAmt" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Rate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Fee", propOrder = {
    "feeType",
    "commissionInd",
    "curAmt",
    "rate"
})
public class Fee {

    @XmlElement(name = "FeeType")
    protected String feeType;
    @XmlElement(name = "CommissionInd")
    protected String commissionInd;
    @XmlElement(name = "CurAmt")
    protected List<CurAmt> curAmt;
    @XmlElement(name = "Rate")
    protected Double rate;

    /**
     * Obtiene el valor de la propiedad feeType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeType() {
        return feeType;
    }

    /**
     * Define el valor de la propiedad feeType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeType(String value) {
        this.feeType = value;
    }

    /**
     * Obtiene el valor de la propiedad commissionInd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommissionInd() {
        return commissionInd;
    }

    /**
     * Define el valor de la propiedad commissionInd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommissionInd(String value) {
        this.commissionInd = value;
    }

    /**
     * Gets the value of the curAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the curAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CurAmt }
     * 
     * 
     */
    public List<CurAmt> getCurAmt() {
        if (curAmt == null) {
            curAmt = new ArrayList<CurAmt>();
        }
        return this.curAmt;
    }

    /**
     * Obtiene el valor de la propiedad rate.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRate() {
        return rate;
    }

    /**
     * Define el valor de la propiedad rate.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRate(Double value) {
        this.rate = value;
    }

}
