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
import com.banesco.xmlns.enterpriseobjects.fee.Fee;
import com.banesco.xmlns.enterpriseobjects.guarantor.Guarantor;


/**
 * <p>Clase Java para LoanAcctRec complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="LoanAcctRec"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LoanStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MatDt" type="{http://xmlns.banesco.com/EnterpriseObjects/Account}datePattern" minOccurs="0"/&gt;
 *         &lt;element name="LoanInfoCommon" type="{http://xmlns.banesco.com/EnterpriseObjects/Account}LoanInfoCommon" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Term" type="{http://xmlns.banesco.com/EnterpriseObjects/Account}Term" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="IntRateInfo" type="{http://xmlns.banesco.com/EnterpriseObjects/Account}IntRateInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Guarantor" type="{http://xmlns.banesco.com/EnterpriseObjects/Guarantor}Guarantor" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="GuarantorInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExtraPmtCurAmt" type="{http://xmlns.banesco.com/EnterpriseObjects/Account}ExtraPmtCurAmt" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LateIntRateInfo" type="{http://xmlns.banesco.com/EnterpriseObjects/Account}LateIntRateInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Fee" type="{http://xmlns.banesco.com/EnterpriseObjects/Fee}Fee" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoanAcctRec", propOrder = {
    "loanStatus",
    "matDt",
    "loanInfoCommon",
    "term",
    "intRateInfo",
    "guarantor",
    "guarantorInd",
    "extraPmtCurAmt",
    "lateIntRateInfo",
    "fee"
})
public class LoanAcctRec {

    @XmlElement(name = "LoanStatus")
    protected String loanStatus;
    @XmlElement(name = "MatDt")
    protected String matDt;
    @XmlElement(name = "LoanInfoCommon")
    protected List<LoanInfoCommon> loanInfoCommon;
    @XmlElement(name = "Term")
    protected List<Term> term;
    @XmlElement(name = "IntRateInfo")
    protected List<IntRateInfo> intRateInfo;
    @XmlElement(name = "Guarantor")
    protected List<Guarantor> guarantor;
    @XmlElement(name = "GuarantorInd")
    protected String guarantorInd;
    @XmlElement(name = "ExtraPmtCurAmt")
    protected List<ExtraPmtCurAmt> extraPmtCurAmt;
    @XmlElement(name = "LateIntRateInfo")
    protected List<LateIntRateInfo> lateIntRateInfo;
    @XmlElement(name = "Fee")
    protected List<Fee> fee;

    /**
     * Obtiene el valor de la propiedad loanStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanStatus() {
        return loanStatus;
    }

    /**
     * Define el valor de la propiedad loanStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanStatus(String value) {
        this.loanStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad matDt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatDt() {
        return matDt;
    }

    /**
     * Define el valor de la propiedad matDt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatDt(String value) {
        this.matDt = value;
    }

    /**
     * Gets the value of the loanInfoCommon property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loanInfoCommon property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoanInfoCommon().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoanInfoCommon }
     * 
     * 
     */
    public List<LoanInfoCommon> getLoanInfoCommon() {
        if (loanInfoCommon == null) {
            loanInfoCommon = new ArrayList<LoanInfoCommon>();
        }
        return this.loanInfoCommon;
    }

    /**
     * Gets the value of the term property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the term property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTerm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Term }
     * 
     * 
     */
    public List<Term> getTerm() {
        if (term == null) {
            term = new ArrayList<Term>();
        }
        return this.term;
    }

    /**
     * Gets the value of the intRateInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the intRateInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntRateInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IntRateInfo }
     * 
     * 
     */
    public List<IntRateInfo> getIntRateInfo() {
        if (intRateInfo == null) {
            intRateInfo = new ArrayList<IntRateInfo>();
        }
        return this.intRateInfo;
    }

    /**
     * Gets the value of the guarantor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guarantor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuarantor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Guarantor }
     * 
     * 
     */
    public List<Guarantor> getGuarantor() {
        if (guarantor == null) {
            guarantor = new ArrayList<Guarantor>();
        }
        return this.guarantor;
    }

    /**
     * Obtiene el valor de la propiedad guarantorInd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuarantorInd() {
        return guarantorInd;
    }

    /**
     * Define el valor de la propiedad guarantorInd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuarantorInd(String value) {
        this.guarantorInd = value;
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
     * Gets the value of the lateIntRateInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lateIntRateInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLateIntRateInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LateIntRateInfo }
     * 
     * 
     */
    public List<LateIntRateInfo> getLateIntRateInfo() {
        if (lateIntRateInfo == null) {
            lateIntRateInfo = new ArrayList<LateIntRateInfo>();
        }
        return this.lateIntRateInfo;
    }

    /**
     * Gets the value of the fee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Fee }
     * 
     * 
     */
    public List<Fee> getFee() {
        if (fee == null) {
            fee = new ArrayList<Fee>();
        }
        return this.fee;
    }

}
