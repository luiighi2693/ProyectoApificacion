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
 * <p>Clase Java para LoanInfoCommon complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="LoanInfoCommon"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DueDt" type="{http://xmlns.banesco.com/EnterpriseObjects/Account}datePattern" minOccurs="0"/&gt;
 *         &lt;element name="OrigDt" type="{http://xmlns.banesco.com/EnterpriseObjects/Account}datePattern" minOccurs="0"/&gt;
 *         &lt;element name="RegPmtCurAmt" type="{http://xmlns.banesco.com/EnterpriseObjects/Account}RegPmtCurAmt" minOccurs="0"/&gt;
 *         &lt;element name="Freq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExtraFreq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExtraPmtCurAmt" type="{http://xmlns.banesco.com/EnterpriseObjects/Account}ExtraPmtCurAmt" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="OtherPmtCurAmt" type="{http://xmlns.banesco.com/EnterpriseObjects/Account}OtherPmtCurAmt" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoanInfoCommon", propOrder = {
    "dueDt",
    "origDt",
    "regPmtCurAmt",
    "freq",
    "extraFreq",
    "extraPmtCurAmt",
    "otherPmtCurAmt"
})
public class LoanInfoCommon {

    @XmlElement(name = "DueDt")
    protected String dueDt;
    @XmlElement(name = "OrigDt")
    protected String origDt;
    @XmlElement(name = "RegPmtCurAmt")
    protected RegPmtCurAmt regPmtCurAmt;
    @XmlElement(name = "Freq")
    protected String freq;
    @XmlElement(name = "ExtraFreq")
    protected String extraFreq;
    @XmlElement(name = "ExtraPmtCurAmt")
    protected List<ExtraPmtCurAmt> extraPmtCurAmt;
    @XmlElement(name = "OtherPmtCurAmt")
    protected OtherPmtCurAmt otherPmtCurAmt;

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
     * Obtiene el valor de la propiedad origDt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigDt() {
        return origDt;
    }

    /**
     * Define el valor de la propiedad origDt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigDt(String value) {
        this.origDt = value;
    }

    /**
     * Obtiene el valor de la propiedad regPmtCurAmt.
     * 
     * @return
     *     possible object is
     *     {@link RegPmtCurAmt }
     *     
     */
    public RegPmtCurAmt getRegPmtCurAmt() {
        return regPmtCurAmt;
    }

    /**
     * Define el valor de la propiedad regPmtCurAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link RegPmtCurAmt }
     *     
     */
    public void setRegPmtCurAmt(RegPmtCurAmt value) {
        this.regPmtCurAmt = value;
    }

    /**
     * Obtiene el valor de la propiedad freq.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreq() {
        return freq;
    }

    /**
     * Define el valor de la propiedad freq.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreq(String value) {
        this.freq = value;
    }

    /**
     * Obtiene el valor de la propiedad extraFreq.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtraFreq() {
        return extraFreq;
    }

    /**
     * Define el valor de la propiedad extraFreq.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtraFreq(String value) {
        this.extraFreq = value;
    }

    /**
     * Gets the value of the extraPmtCurAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extraPmtCurAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtraPmtCurAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtraPmtCurAmt }
     * 
     * 
     */
    public List<ExtraPmtCurAmt> getExtraPmtCurAmt() {
        if (extraPmtCurAmt == null) {
            extraPmtCurAmt = new ArrayList<ExtraPmtCurAmt>();
        }
        return this.extraPmtCurAmt;
    }

    /**
     * Obtiene el valor de la propiedad otherPmtCurAmt.
     * 
     * @return
     *     possible object is
     *     {@link OtherPmtCurAmt }
     *     
     */
    public OtherPmtCurAmt getOtherPmtCurAmt() {
        return otherPmtCurAmt;
    }

    /**
     * Define el valor de la propiedad otherPmtCurAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherPmtCurAmt }
     *     
     */
    public void setOtherPmtCurAmt(OtherPmtCurAmt value) {
        this.otherPmtCurAmt = value;
    }

}
