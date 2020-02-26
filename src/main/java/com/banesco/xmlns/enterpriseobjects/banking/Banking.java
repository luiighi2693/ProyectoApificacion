//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.02.24 a las 10:07:43 PM VET 
//


package com.banesco.xmlns.enterpriseobjects.banking;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Banking complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Banking"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BankAcctTrnRec" type="{http://xmlns.banesco.com/EnterpriseObjects/Banking}BankAcctTrnRec" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CurAmt" type="{http://xmlns.banesco.com/EnterpriseObjects/Banking}CurAmt" minOccurs="0"/&gt;
 *         &lt;element name="LockDays" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="Desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExecuteInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ApprovalRequiered" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PromiseDt" type="{http://xmlns.banesco.com/EnterpriseObjects/Banking}datePattern" minOccurs="0"/&gt;
 *         &lt;element name="ListofValues" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TotalTrnNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BankAgency" type="{http://xmlns.banesco.com/EnterpriseObjects/Banking}BankAgency" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Banking", propOrder = {
    "bankAcctTrnRec",
    "curAmt",
    "lockDays",
    "desc",
    "executeInd",
    "approvalRequiered",
    "promiseDt",
    "listofValues",
    "totalTrnNum",
    "bankAgency"
})
public class Banking {

    @XmlElement(name = "BankAcctTrnRec")
    protected List<BankAcctTrnRec> bankAcctTrnRec;
    @XmlElement(name = "CurAmt")
    protected CurAmt curAmt;
    @XmlElement(name = "LockDays")
    protected BigInteger lockDays;
    @XmlElement(name = "Desc")
    protected String desc;
    @XmlElement(name = "ExecuteInd")
    protected String executeInd;
    @XmlElement(name = "ApprovalRequiered")
    protected String approvalRequiered;
    @XmlElement(name = "PromiseDt")
    protected String promiseDt;
    @XmlElement(name = "ListofValues")
    protected String listofValues;
    @XmlElement(name = "TotalTrnNum")
    protected String totalTrnNum;
    @XmlElement(name = "BankAgency")
    protected BankAgency bankAgency;

    /**
     * Gets the value of the bankAcctTrnRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bankAcctTrnRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBankAcctTrnRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BankAcctTrnRec }
     * 
     * 
     */
    public List<BankAcctTrnRec> getBankAcctTrnRec() {
        if (bankAcctTrnRec == null) {
            bankAcctTrnRec = new ArrayList<BankAcctTrnRec>();
        }
        return this.bankAcctTrnRec;
    }

    /**
     * Obtiene el valor de la propiedad curAmt.
     * 
     * @return
     *     possible object is
     *     {@link CurAmt }
     *     
     */
    public CurAmt getCurAmt() {
        return curAmt;
    }

    /**
     * Define el valor de la propiedad curAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link CurAmt }
     *     
     */
    public void setCurAmt(CurAmt value) {
        this.curAmt = value;
    }

    /**
     * Obtiene el valor de la propiedad lockDays.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLockDays() {
        return lockDays;
    }

    /**
     * Define el valor de la propiedad lockDays.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLockDays(BigInteger value) {
        this.lockDays = value;
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
     * Obtiene el valor de la propiedad executeInd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExecuteInd() {
        return executeInd;
    }

    /**
     * Define el valor de la propiedad executeInd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExecuteInd(String value) {
        this.executeInd = value;
    }

    /**
     * Obtiene el valor de la propiedad approvalRequiered.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprovalRequiered() {
        return approvalRequiered;
    }

    /**
     * Define el valor de la propiedad approvalRequiered.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprovalRequiered(String value) {
        this.approvalRequiered = value;
    }

    /**
     * Obtiene el valor de la propiedad promiseDt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromiseDt() {
        return promiseDt;
    }

    /**
     * Define el valor de la propiedad promiseDt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromiseDt(String value) {
        this.promiseDt = value;
    }

    /**
     * Obtiene el valor de la propiedad listofValues.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListofValues() {
        return listofValues;
    }

    /**
     * Define el valor de la propiedad listofValues.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListofValues(String value) {
        this.listofValues = value;
    }

    /**
     * Obtiene el valor de la propiedad totalTrnNum.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalTrnNum() {
        return totalTrnNum;
    }

    /**
     * Define el valor de la propiedad totalTrnNum.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalTrnNum(String value) {
        this.totalTrnNum = value;
    }

    /**
     * Obtiene el valor de la propiedad bankAgency.
     * 
     * @return
     *     possible object is
     *     {@link BankAgency }
     *     
     */
    public BankAgency getBankAgency() {
        return bankAgency;
    }

    /**
     * Define el valor de la propiedad bankAgency.
     * 
     * @param value
     *     allowed object is
     *     {@link BankAgency }
     *     
     */
    public void setBankAgency(BankAgency value) {
        this.bankAgency = value;
    }

}
