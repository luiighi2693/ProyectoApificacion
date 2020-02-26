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
import com.banesco.xmlns.enterpriseobjects.addr.Addr;
import com.banesco.xmlns.enterpriseobjects.affiliationsvc.AffiliationSvc;
import com.banesco.xmlns.enterpriseobjects.bankinfo.Bankinfo;
import com.banesco.xmlns.enterpriseobjects.chk.Chk;
import com.banesco.xmlns.enterpriseobjects.customer.Customer;
import com.banesco.xmlns.enterpriseobjects.securityidentification.SecurityIdentification;
import com.banesco.xmlns.enterpriseobjects.service.Service;


/**
 * <p>Clase Java para Account complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Account"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AcctId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AcctType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AcctClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BankAcctInfo" type="{http://xmlns.banesco.com/EnterpriseObjects/Account}BankAcctInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AcctBal" type="{http://xmlns.banesco.com/EnterpriseObjects/Account}AcctBal" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SecUserInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GUIOptions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Customer" type="{http://xmlns.banesco.com/EnterpriseObjects/Customer}Customer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="BankAcctStatus" type="{http://xmlns.banesco.com/EnterpriseObjects/Account}BankAcctStatus" minOccurs="0"/&gt;
 *         &lt;element name="XferAccMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Bankinfo" type="{http://xmlns.banesco.com/EnterpriseObjects/Bankinfo}Bankinfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="BankInfo" type="{http://xmlns.banesco.com/EnterpriseObjects/Account}BankInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SvcAcctStatus" type="{http://xmlns.banesco.com/EnterpriseObjects/Account}SvcAcctStatus" minOccurs="0"/&gt;
 *         &lt;element name="Addr" type="{http://xmlns.banesco.com/EnterpriseObjects/Addr}Addr" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CardLogicalData" type="{http://xmlns.banesco.com/EnterpriseObjects/Account}CardLogicalData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LoanAcctRec" type="{http://xmlns.banesco.com/EnterpriseObjects/Account}LoanAcctRec" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="BankAcctFeatSupt" type="{http://xmlns.banesco.com/EnterpriseObjects/Account}BankAcctFeatSupt" minOccurs="0"/&gt;
 *         &lt;element name="CCAcctRec" type="{http://xmlns.banesco.com/EnterpriseObjects/Account}CCAcctRec" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="OpenDt" type="{http://xmlns.banesco.com/EnterpriseObjects/Account}datePattern" minOccurs="0"/&gt;
 *         &lt;element name="AffiliationSvc" type="{http://xmlns.banesco.com/EnterpriseObjects/AffiliationSvc}AffiliationSvc" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Chk" type="{http://xmlns.banesco.com/EnterpriseObjects/Chk}Chk" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Service" type="{http://xmlns.banesco.com/EnterpriseObjects/Service}Service" minOccurs="0"/&gt;
 *         &lt;element name="SecurityIdentification" type="{http://xmlns.banesco.com/EnterpriseObjects/SecurityIdentification}SecurityIdentification" minOccurs="0"/&gt;
 *         &lt;element name="AcctValidateInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AcctValidateStatus" type="{http://xmlns.banesco.com/EnterpriseObjects/Account}AcctValidateStatus" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Account", propOrder = {
    "acctId",
    "acctType",
    "acctClass",
    "bankAcctInfo",
    "acctBal",
    "secUserInd",
    "guiOptions",
    "customer",
    "bankAcctStatus",
    "xferAccMode",
    "bankinfo",
    "bankInfo",
    "svcAcctStatus",
    "addr",
    "cardLogicalData",
    "loanAcctRec",
    "bankAcctFeatSupt",
    "ccAcctRec",
    "openDt",
    "affiliationSvc",
    "chk",
    "service",
    "securityIdentification",
    "acctValidateInd",
    "acctValidateStatus"
})
public class Account {

    @XmlElement(name = "AcctId")
    protected List<String> acctId;
    @XmlElement(name = "AcctType")
    protected String acctType;
    @XmlElement(name = "AcctClass")
    protected String acctClass;
    @XmlElement(name = "BankAcctInfo")
    protected List<BankAcctInfo> bankAcctInfo;
    @XmlElement(name = "AcctBal")
    protected List<AcctBal> acctBal;
    @XmlElement(name = "SecUserInd")
    protected String secUserInd;
    @XmlElement(name = "GUIOptions")
    protected String guiOptions;
    @XmlElement(name = "Customer")
    protected List<Customer> customer;
    @XmlElement(name = "BankAcctStatus")
    protected BankAcctStatus bankAcctStatus;
    @XmlElement(name = "XferAccMode")
    protected String xferAccMode;
    @XmlElement(name = "Bankinfo")
    protected List<Bankinfo> bankinfo;
    @XmlElement(name = "BankInfo")
    protected List<BankInfo> bankInfo;
    @XmlElement(name = "SvcAcctStatus")
    protected SvcAcctStatus svcAcctStatus;
    @XmlElement(name = "Addr")
    protected List<Addr> addr;
    @XmlElement(name = "CardLogicalData")
    protected List<CardLogicalData> cardLogicalData;
    @XmlElement(name = "LoanAcctRec")
    protected List<LoanAcctRec> loanAcctRec;
    @XmlElement(name = "BankAcctFeatSupt")
    protected BankAcctFeatSupt bankAcctFeatSupt;
    @XmlElement(name = "CCAcctRec")
    protected List<CCAcctRec> ccAcctRec;
    @XmlElement(name = "OpenDt")
    protected String openDt;
    @XmlElement(name = "AffiliationSvc")
    protected List<AffiliationSvc> affiliationSvc;
    @XmlElement(name = "Chk")
    protected List<Chk> chk;
    @XmlElement(name = "Service")
    protected Service service;
    @XmlElement(name = "SecurityIdentification")
    protected SecurityIdentification securityIdentification;
    @XmlElement(name = "AcctValidateInd")
    protected String acctValidateInd;
    @XmlElement(name = "AcctValidateStatus")
    protected AcctValidateStatus acctValidateStatus;

    /**
     * Gets the value of the acctId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acctId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAcctId() {
        if (acctId == null) {
            acctId = new ArrayList<String>();
        }
        return this.acctId;
    }

    /**
     * Obtiene el valor de la propiedad acctType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctType() {
        return acctType;
    }

    /**
     * Define el valor de la propiedad acctType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctType(String value) {
        this.acctType = value;
    }

    /**
     * Obtiene el valor de la propiedad acctClass.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctClass() {
        return acctClass;
    }

    /**
     * Define el valor de la propiedad acctClass.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctClass(String value) {
        this.acctClass = value;
    }

    /**
     * Gets the value of the bankAcctInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bankAcctInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBankAcctInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BankAcctInfo }
     * 
     * 
     */
    public List<BankAcctInfo> getBankAcctInfo() {
        if (bankAcctInfo == null) {
            bankAcctInfo = new ArrayList<BankAcctInfo>();
        }
        return this.bankAcctInfo;
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

    /**
     * Obtiene el valor de la propiedad secUserInd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecUserInd() {
        return secUserInd;
    }

    /**
     * Define el valor de la propiedad secUserInd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecUserInd(String value) {
        this.secUserInd = value;
    }

    /**
     * Obtiene el valor de la propiedad guiOptions.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGUIOptions() {
        return guiOptions;
    }

    /**
     * Define el valor de la propiedad guiOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGUIOptions(String value) {
        this.guiOptions = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Customer }
     * 
     * 
     */
    public List<Customer> getCustomer() {
        if (customer == null) {
            customer = new ArrayList<Customer>();
        }
        return this.customer;
    }

    /**
     * Obtiene el valor de la propiedad bankAcctStatus.
     * 
     * @return
     *     possible object is
     *     {@link BankAcctStatus }
     *     
     */
    public BankAcctStatus getBankAcctStatus() {
        return bankAcctStatus;
    }

    /**
     * Define el valor de la propiedad bankAcctStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link BankAcctStatus }
     *     
     */
    public void setBankAcctStatus(BankAcctStatus value) {
        this.bankAcctStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad xferAccMode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXferAccMode() {
        return xferAccMode;
    }

    /**
     * Define el valor de la propiedad xferAccMode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXferAccMode(String value) {
        this.xferAccMode = value;
    }

    /**
     * Gets the value of the bankinfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bankinfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBankinfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Bankinfo }
     * 
     * 
     */
    public List<Bankinfo> getBankinfo() {
        if (bankinfo == null) {
            bankinfo = new ArrayList<Bankinfo>();
        }
        return this.bankinfo;
    }

    /**
     * Gets the value of the bankInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bankInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBankInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BankInfo }
     * 
     * 
     */
    public List<BankInfo> getBankInfo() {
        if (bankInfo == null) {
            bankInfo = new ArrayList<BankInfo>();
        }
        return this.bankInfo;
    }

    /**
     * Obtiene el valor de la propiedad svcAcctStatus.
     * 
     * @return
     *     possible object is
     *     {@link SvcAcctStatus }
     *     
     */
    public SvcAcctStatus getSvcAcctStatus() {
        return svcAcctStatus;
    }

    /**
     * Define el valor de la propiedad svcAcctStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcAcctStatus }
     *     
     */
    public void setSvcAcctStatus(SvcAcctStatus value) {
        this.svcAcctStatus = value;
    }

    /**
     * Gets the value of the addr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Addr }
     * 
     * 
     */
    public List<Addr> getAddr() {
        if (addr == null) {
            addr = new ArrayList<Addr>();
        }
        return this.addr;
    }

    /**
     * Gets the value of the cardLogicalData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cardLogicalData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCardLogicalData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardLogicalData }
     * 
     * 
     */
    public List<CardLogicalData> getCardLogicalData() {
        if (cardLogicalData == null) {
            cardLogicalData = new ArrayList<CardLogicalData>();
        }
        return this.cardLogicalData;
    }

    /**
     * Gets the value of the loanAcctRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loanAcctRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoanAcctRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoanAcctRec }
     * 
     * 
     */
    public List<LoanAcctRec> getLoanAcctRec() {
        if (loanAcctRec == null) {
            loanAcctRec = new ArrayList<LoanAcctRec>();
        }
        return this.loanAcctRec;
    }

    /**
     * Obtiene el valor de la propiedad bankAcctFeatSupt.
     * 
     * @return
     *     possible object is
     *     {@link BankAcctFeatSupt }
     *     
     */
    public BankAcctFeatSupt getBankAcctFeatSupt() {
        return bankAcctFeatSupt;
    }

    /**
     * Define el valor de la propiedad bankAcctFeatSupt.
     * 
     * @param value
     *     allowed object is
     *     {@link BankAcctFeatSupt }
     *     
     */
    public void setBankAcctFeatSupt(BankAcctFeatSupt value) {
        this.bankAcctFeatSupt = value;
    }

    /**
     * Gets the value of the ccAcctRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ccAcctRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCCAcctRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CCAcctRec }
     * 
     * 
     */
    public List<CCAcctRec> getCCAcctRec() {
        if (ccAcctRec == null) {
            ccAcctRec = new ArrayList<CCAcctRec>();
        }
        return this.ccAcctRec;
    }

    /**
     * Obtiene el valor de la propiedad openDt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpenDt() {
        return openDt;
    }

    /**
     * Define el valor de la propiedad openDt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpenDt(String value) {
        this.openDt = value;
    }

    /**
     * Gets the value of the affiliationSvc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the affiliationSvc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAffiliationSvc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AffiliationSvc }
     * 
     * 
     */
    public List<AffiliationSvc> getAffiliationSvc() {
        if (affiliationSvc == null) {
            affiliationSvc = new ArrayList<AffiliationSvc>();
        }
        return this.affiliationSvc;
    }

    /**
     * Gets the value of the chk property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chk property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChk().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Chk }
     * 
     * 
     */
    public List<Chk> getChk() {
        if (chk == null) {
            chk = new ArrayList<Chk>();
        }
        return this.chk;
    }

    /**
     * Obtiene el valor de la propiedad service.
     * 
     * @return
     *     possible object is
     *     {@link Service }
     *     
     */
    public Service getService() {
        return service;
    }

    /**
     * Define el valor de la propiedad service.
     * 
     * @param value
     *     allowed object is
     *     {@link Service }
     *     
     */
    public void setService(Service value) {
        this.service = value;
    }

    /**
     * Obtiene el valor de la propiedad securityIdentification.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification }
     *     
     */
    public SecurityIdentification getSecurityIdentification() {
        return securityIdentification;
    }

    /**
     * Define el valor de la propiedad securityIdentification.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification }
     *     
     */
    public void setSecurityIdentification(SecurityIdentification value) {
        this.securityIdentification = value;
    }

    /**
     * Obtiene el valor de la propiedad acctValidateInd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctValidateInd() {
        return acctValidateInd;
    }

    /**
     * Define el valor de la propiedad acctValidateInd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctValidateInd(String value) {
        this.acctValidateInd = value;
    }

    /**
     * Obtiene el valor de la propiedad acctValidateStatus.
     * 
     * @return
     *     possible object is
     *     {@link AcctValidateStatus }
     *     
     */
    public AcctValidateStatus getAcctValidateStatus() {
        return acctValidateStatus;
    }

    /**
     * Define el valor de la propiedad acctValidateStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctValidateStatus }
     *     
     */
    public void setAcctValidateStatus(AcctValidateStatus value) {
        this.acctValidateStatus = value;
    }

}
