//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.02.24 a las 10:07:43 PM VET 
//


package com.banesco.xmlns.enterpriseobjects.banking;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para BankAcctTrnRec complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BankAcctTrnRec"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TrnId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TrnType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TransNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrigDt" type="{http://xmlns.banesco.com/EnterpriseObjects/Banking}Date-DateTimePattern" minOccurs="0"/&gt;
 *         &lt;element name="TrnStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CurAmt" type="{http://xmlns.banesco.com/EnterpriseObjects/Banking}CurAmt" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LockDays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LockHours" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LockDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TrnTypeRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ConceptCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TaxExcCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TrnCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Memo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TrnSrc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TrnFrecuency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PercentageDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Percentage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PostedDt" type="{http://xmlns.banesco.com/EnterpriseObjects/Banking}dateTimePattern" minOccurs="0"/&gt;
 *         &lt;element name="CountryCodeSrc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HdrRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ControlKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LastNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FirstNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AcctBal" type="{http://xmlns.banesco.com/EnterpriseObjects/Banking}AcctBal" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankAcctTrnRec", propOrder = {
    "trnId",
    "trnType",
    "transNumber",
    "origDt",
    "trnStatus",
    "curAmt",
    "lockDays",
    "lockHours",
    "lockDesc",
    "desc",
    "trnTypeRef",
    "conceptCode",
    "taxExcCode",
    "trnCode",
    "memo",
    "trnSrc",
    "trnFrecuency",
    "percentageDesc",
    "percentage",
    "postedDt",
    "countryCodeSrc",
    "hdrRef",
    "controlKey",
    "lastNumber",
    "firstNumber",
    "acctBal"
})
public class BankAcctTrnRec {

    @XmlElement(name = "TrnId")
    protected String trnId;
    @XmlElement(name = "TrnType")
    protected String trnType;
    @XmlElement(name = "TransNumber")
    protected String transNumber;
    @XmlElement(name = "OrigDt")
    protected String origDt;
    @XmlElement(name = "TrnStatus")
    protected String trnStatus;
    @XmlElement(name = "CurAmt")
    protected List<CurAmt> curAmt;
    @XmlElement(name = "LockDays")
    protected String lockDays;
    @XmlElement(name = "LockHours")
    protected String lockHours;
    @XmlElement(name = "LockDesc")
    protected String lockDesc;
    @XmlElement(name = "Desc")
    protected String desc;
    @XmlElement(name = "TrnTypeRef")
    protected String trnTypeRef;
    @XmlElement(name = "ConceptCode")
    protected String conceptCode;
    @XmlElement(name = "TaxExcCode")
    protected String taxExcCode;
    @XmlElement(name = "TrnCode")
    protected String trnCode;
    @XmlElement(name = "Memo")
    protected String memo;
    @XmlElement(name = "TrnSrc")
    protected String trnSrc;
    @XmlElement(name = "TrnFrecuency")
    protected String trnFrecuency;
    @XmlElement(name = "PercentageDesc")
    protected String percentageDesc;
    @XmlElement(name = "Percentage")
    protected String percentage;
    @XmlElement(name = "PostedDt")
    protected String postedDt;
    @XmlElement(name = "CountryCodeSrc")
    protected String countryCodeSrc;
    @XmlElement(name = "HdrRef")
    protected String hdrRef;
    @XmlElement(name = "ControlKey")
    protected String controlKey;
    @XmlElement(name = "LastNumber")
    protected String lastNumber;
    @XmlElement(name = "FirstNumber")
    protected String firstNumber;
    @XmlElement(name = "AcctBal")
    protected List<AcctBal> acctBal;

    /**
     * Obtiene el valor de la propiedad trnId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrnId() {
        return trnId;
    }

    /**
     * Define el valor de la propiedad trnId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrnId(String value) {
        this.trnId = value;
    }

    /**
     * Obtiene el valor de la propiedad trnType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrnType() {
        return trnType;
    }

    /**
     * Define el valor de la propiedad trnType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrnType(String value) {
        this.trnType = value;
    }

    /**
     * Obtiene el valor de la propiedad transNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransNumber() {
        return transNumber;
    }

    /**
     * Define el valor de la propiedad transNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransNumber(String value) {
        this.transNumber = value;
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
     * Obtiene el valor de la propiedad trnStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrnStatus() {
        return trnStatus;
    }

    /**
     * Define el valor de la propiedad trnStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrnStatus(String value) {
        this.trnStatus = value;
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
     * Obtiene el valor de la propiedad lockDays.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLockDays() {
        return lockDays;
    }

    /**
     * Define el valor de la propiedad lockDays.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLockDays(String value) {
        this.lockDays = value;
    }

    /**
     * Obtiene el valor de la propiedad lockHours.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLockHours() {
        return lockHours;
    }

    /**
     * Define el valor de la propiedad lockHours.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLockHours(String value) {
        this.lockHours = value;
    }

    /**
     * Obtiene el valor de la propiedad lockDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLockDesc() {
        return lockDesc;
    }

    /**
     * Define el valor de la propiedad lockDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLockDesc(String value) {
        this.lockDesc = value;
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
     * Obtiene el valor de la propiedad trnTypeRef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrnTypeRef() {
        return trnTypeRef;
    }

    /**
     * Define el valor de la propiedad trnTypeRef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrnTypeRef(String value) {
        this.trnTypeRef = value;
    }

    /**
     * Obtiene el valor de la propiedad conceptCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConceptCode() {
        return conceptCode;
    }

    /**
     * Define el valor de la propiedad conceptCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConceptCode(String value) {
        this.conceptCode = value;
    }

    /**
     * Obtiene el valor de la propiedad taxExcCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxExcCode() {
        return taxExcCode;
    }

    /**
     * Define el valor de la propiedad taxExcCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxExcCode(String value) {
        this.taxExcCode = value;
    }

    /**
     * Obtiene el valor de la propiedad trnCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrnCode() {
        return trnCode;
    }

    /**
     * Define el valor de la propiedad trnCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrnCode(String value) {
        this.trnCode = value;
    }

    /**
     * Obtiene el valor de la propiedad memo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemo() {
        return memo;
    }

    /**
     * Define el valor de la propiedad memo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemo(String value) {
        this.memo = value;
    }

    /**
     * Obtiene el valor de la propiedad trnSrc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrnSrc() {
        return trnSrc;
    }

    /**
     * Define el valor de la propiedad trnSrc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrnSrc(String value) {
        this.trnSrc = value;
    }

    /**
     * Obtiene el valor de la propiedad trnFrecuency.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrnFrecuency() {
        return trnFrecuency;
    }

    /**
     * Define el valor de la propiedad trnFrecuency.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrnFrecuency(String value) {
        this.trnFrecuency = value;
    }

    /**
     * Obtiene el valor de la propiedad percentageDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPercentageDesc() {
        return percentageDesc;
    }

    /**
     * Define el valor de la propiedad percentageDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPercentageDesc(String value) {
        this.percentageDesc = value;
    }

    /**
     * Obtiene el valor de la propiedad percentage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPercentage() {
        return percentage;
    }

    /**
     * Define el valor de la propiedad percentage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPercentage(String value) {
        this.percentage = value;
    }

    /**
     * Obtiene el valor de la propiedad postedDt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostedDt() {
        return postedDt;
    }

    /**
     * Define el valor de la propiedad postedDt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostedDt(String value) {
        this.postedDt = value;
    }

    /**
     * Obtiene el valor de la propiedad countryCodeSrc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCodeSrc() {
        return countryCodeSrc;
    }

    /**
     * Define el valor de la propiedad countryCodeSrc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCodeSrc(String value) {
        this.countryCodeSrc = value;
    }

    /**
     * Obtiene el valor de la propiedad hdrRef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHdrRef() {
        return hdrRef;
    }

    /**
     * Define el valor de la propiedad hdrRef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHdrRef(String value) {
        this.hdrRef = value;
    }

    /**
     * Obtiene el valor de la propiedad controlKey.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControlKey() {
        return controlKey;
    }

    /**
     * Define el valor de la propiedad controlKey.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControlKey(String value) {
        this.controlKey = value;
    }

    /**
     * Obtiene el valor de la propiedad lastNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastNumber() {
        return lastNumber;
    }

    /**
     * Define el valor de la propiedad lastNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastNumber(String value) {
        this.lastNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad firstNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstNumber() {
        return firstNumber;
    }

    /**
     * Define el valor de la propiedad firstNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstNumber(String value) {
        this.firstNumber = value;
    }

    /**
     * Gets the value of the acctBal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acctBal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctBal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcctBal }
     * 
     * 
     */
    public List<AcctBal> getAcctBal() {
        if (acctBal == null) {
            acctBal = new ArrayList<AcctBal>();
        }
        return this.acctBal;
    }

}
