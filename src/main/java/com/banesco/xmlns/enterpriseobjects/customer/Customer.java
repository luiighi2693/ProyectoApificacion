//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.02.24 a las 10:07:43 PM VET 
//


package com.banesco.xmlns.enterpriseobjects.customer;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.banesco.xmlns.enterpriseobjects.addr.Addr;
import com.banesco.xmlns.enterpriseobjects.affiliationsvc.AffiliationSvc;
import com.banesco.xmlns.enterpriseobjects.employmentdata.EmploymentData;
import com.banesco.xmlns.enterpriseobjects.organization.IncAgrmt;
import com.banesco.xmlns.enterpriseobjects.organization.OrgInfo;
import com.banesco.xmlns.enterpriseobjects.organization.TradeRegistry;
import com.banesco.xmlns.enterpriseobjects.ref.Ref;


/**
 * <p>Clase Java para Customer complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Customer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PersonInfo" type="{http://xmlns.banesco.com/EnterpriseObjects/Customer}PersonInfo" minOccurs="0"/&gt;
 *         &lt;element name="OrgInfo" type="{http://xmlns.banesco.com/EnterpriseObjects/Organization}OrgInfo" minOccurs="0"/&gt;
 *         &lt;element name="IncAgrmt" type="{http://xmlns.banesco.com/EnterpriseObjects/Organization}IncAgrmt" minOccurs="0"/&gt;
 *         &lt;element name="TradeRegistry" type="{http://xmlns.banesco.com/EnterpriseObjects/Organization}TradeRegistry" minOccurs="0"/&gt;
 *         &lt;element name="CustId" type="{http://xmlns.banesco.com/EnterpriseObjects/Customer}CustId" minOccurs="0"/&gt;
 *         &lt;element name="AffiliationTypeCustomer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustRoll" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustInfo" type="{http://xmlns.banesco.com/EnterpriseObjects/Customer}CustInfo" minOccurs="0"/&gt;
 *         &lt;element name="CustName" type="{http://xmlns.banesco.com/EnterpriseObjects/Customer}CustName" minOccurs="0"/&gt;
 *         &lt;element name="AccessType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ValidateCustId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustEmployRel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AffilTypeDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AcctExecutiveCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustStatus" type="{http://xmlns.banesco.com/EnterpriseObjects/Customer}CustStatus" minOccurs="0"/&gt;
 *         &lt;element name="EmploymentData" type="{http://xmlns.banesco.com/EnterpriseObjects/EmploymentData}EmploymentData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Addr" type="{http://xmlns.banesco.com/EnterpriseObjects/Addr}Addr" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Ownership" type="{http://xmlns.banesco.com/EnterpriseObjects/Customer}Ownership" minOccurs="0"/&gt;
 *         &lt;element name="EmployeeInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExerciseType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IndicatorVIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustProfile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExecutiveId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustPswd" type="{http://xmlns.banesco.com/EnterpriseObjects/Customer}CustPswd" minOccurs="0"/&gt;
 *         &lt;element name="Ref" type="{http://xmlns.banesco.com/EnterpriseObjects/Ref}Ref" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AffiliationSvc" type="{http://xmlns.banesco.com/EnterpriseObjects/AffiliationSvc}AffiliationSvc" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Customer", propOrder = {
    "personInfo",
    "orgInfo",
    "incAgrmt",
    "tradeRegistry",
    "custId",
    "affiliationTypeCustomer",
    "custRoll",
    "custInfo",
    "custName",
    "accessType",
    "validateCustId",
    "custEmployRel",
    "custSource",
    "affilTypeDesc",
    "custNum",
    "acctExecutiveCode",
    "custStatus",
    "employmentData",
    "addr",
    "ownership",
    "employeeInd",
    "exerciseType",
    "indicatorVIP",
    "custProfile",
    "executiveId",
    "custPswd",
    "ref",
    "affiliationSvc"
})
public class Customer {

    @XmlElement(name = "PersonInfo")
    protected PersonInfo personInfo;
    @XmlElement(name = "OrgInfo")
    protected OrgInfo orgInfo;
    @XmlElement(name = "IncAgrmt")
    protected IncAgrmt incAgrmt;
    @XmlElement(name = "TradeRegistry")
    protected TradeRegistry tradeRegistry;
    @XmlElement(name = "CustId")
    protected CustId custId;
    @XmlElement(name = "AffiliationTypeCustomer")
    protected String affiliationTypeCustomer;
    @XmlElement(name = "CustRoll")
    protected String custRoll;
    @XmlElement(name = "CustInfo")
    protected CustInfo custInfo;
    @XmlElement(name = "CustName")
    protected CustName custName;
    @XmlElement(name = "AccessType")
    protected String accessType;
    @XmlElement(name = "ValidateCustId")
    protected String validateCustId;
    @XmlElement(name = "CustEmployRel")
    protected String custEmployRel;
    @XmlElement(name = "CustSource")
    protected String custSource;
    @XmlElement(name = "AffilTypeDesc")
    protected String affilTypeDesc;
    @XmlElement(name = "CustNum")
    protected String custNum;
    @XmlElement(name = "AcctExecutiveCode")
    protected String acctExecutiveCode;
    @XmlElement(name = "CustStatus")
    protected CustStatus custStatus;
    @XmlElement(name = "EmploymentData")
    protected List<EmploymentData> employmentData;
    @XmlElement(name = "Addr")
    protected List<Addr> addr;
    @XmlElement(name = "Ownership")
    protected Ownership ownership;
    @XmlElement(name = "EmployeeInd")
    protected String employeeInd;
    @XmlElement(name = "ExerciseType")
    protected String exerciseType;
    @XmlElement(name = "IndicatorVIP")
    protected String indicatorVIP;
    @XmlElement(name = "CustProfile")
    protected String custProfile;
    @XmlElement(name = "ExecutiveId")
    protected String executiveId;
    @XmlElement(name = "CustPswd")
    protected CustPswd custPswd;
    @XmlElement(name = "Ref")
    protected List<Ref> ref;
    @XmlElement(name = "AffiliationSvc")
    protected List<AffiliationSvc> affiliationSvc;

    /**
     * Obtiene el valor de la propiedad personInfo.
     * 
     * @return
     *     possible object is
     *     {@link PersonInfo }
     *     
     */
    public PersonInfo getPersonInfo() {
        return personInfo;
    }

    /**
     * Define el valor de la propiedad personInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonInfo }
     *     
     */
    public void setPersonInfo(PersonInfo value) {
        this.personInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad orgInfo.
     * 
     * @return
     *     possible object is
     *     {@link OrgInfo }
     *     
     */
    public OrgInfo getOrgInfo() {
        return orgInfo;
    }

    /**
     * Define el valor de la propiedad orgInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link OrgInfo }
     *     
     */
    public void setOrgInfo(OrgInfo value) {
        this.orgInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad incAgrmt.
     * 
     * @return
     *     possible object is
     *     {@link IncAgrmt }
     *     
     */
    public IncAgrmt getIncAgrmt() {
        return incAgrmt;
    }

    /**
     * Define el valor de la propiedad incAgrmt.
     * 
     * @param value
     *     allowed object is
     *     {@link IncAgrmt }
     *     
     */
    public void setIncAgrmt(IncAgrmt value) {
        this.incAgrmt = value;
    }

    /**
     * Obtiene el valor de la propiedad tradeRegistry.
     * 
     * @return
     *     possible object is
     *     {@link TradeRegistry }
     *     
     */
    public TradeRegistry getTradeRegistry() {
        return tradeRegistry;
    }

    /**
     * Define el valor de la propiedad tradeRegistry.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeRegistry }
     *     
     */
    public void setTradeRegistry(TradeRegistry value) {
        this.tradeRegistry = value;
    }

    /**
     * Obtiene el valor de la propiedad custId.
     * 
     * @return
     *     possible object is
     *     {@link CustId }
     *     
     */
    public CustId getCustId() {
        return custId;
    }

    /**
     * Define el valor de la propiedad custId.
     * 
     * @param value
     *     allowed object is
     *     {@link CustId }
     *     
     */
    public void setCustId(CustId value) {
        this.custId = value;
    }

    /**
     * Obtiene el valor de la propiedad affiliationTypeCustomer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAffiliationTypeCustomer() {
        return affiliationTypeCustomer;
    }

    /**
     * Define el valor de la propiedad affiliationTypeCustomer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAffiliationTypeCustomer(String value) {
        this.affiliationTypeCustomer = value;
    }

    /**
     * Obtiene el valor de la propiedad custRoll.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustRoll() {
        return custRoll;
    }

    /**
     * Define el valor de la propiedad custRoll.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustRoll(String value) {
        this.custRoll = value;
    }

    /**
     * Obtiene el valor de la propiedad custInfo.
     * 
     * @return
     *     possible object is
     *     {@link CustInfo }
     *     
     */
    public CustInfo getCustInfo() {
        return custInfo;
    }

    /**
     * Define el valor de la propiedad custInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link CustInfo }
     *     
     */
    public void setCustInfo(CustInfo value) {
        this.custInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad custName.
     * 
     * @return
     *     possible object is
     *     {@link CustName }
     *     
     */
    public CustName getCustName() {
        return custName;
    }

    /**
     * Define el valor de la propiedad custName.
     * 
     * @param value
     *     allowed object is
     *     {@link CustName }
     *     
     */
    public void setCustName(CustName value) {
        this.custName = value;
    }

    /**
     * Obtiene el valor de la propiedad accessType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessType() {
        return accessType;
    }

    /**
     * Define el valor de la propiedad accessType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessType(String value) {
        this.accessType = value;
    }

    /**
     * Obtiene el valor de la propiedad validateCustId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidateCustId() {
        return validateCustId;
    }

    /**
     * Define el valor de la propiedad validateCustId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidateCustId(String value) {
        this.validateCustId = value;
    }

    /**
     * Obtiene el valor de la propiedad custEmployRel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustEmployRel() {
        return custEmployRel;
    }

    /**
     * Define el valor de la propiedad custEmployRel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustEmployRel(String value) {
        this.custEmployRel = value;
    }

    /**
     * Obtiene el valor de la propiedad custSource.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustSource() {
        return custSource;
    }

    /**
     * Define el valor de la propiedad custSource.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustSource(String value) {
        this.custSource = value;
    }

    /**
     * Obtiene el valor de la propiedad affilTypeDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAffilTypeDesc() {
        return affilTypeDesc;
    }

    /**
     * Define el valor de la propiedad affilTypeDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAffilTypeDesc(String value) {
        this.affilTypeDesc = value;
    }

    /**
     * Obtiene el valor de la propiedad custNum.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustNum() {
        return custNum;
    }

    /**
     * Define el valor de la propiedad custNum.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustNum(String value) {
        this.custNum = value;
    }

    /**
     * Obtiene el valor de la propiedad acctExecutiveCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctExecutiveCode() {
        return acctExecutiveCode;
    }

    /**
     * Define el valor de la propiedad acctExecutiveCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctExecutiveCode(String value) {
        this.acctExecutiveCode = value;
    }

    /**
     * Obtiene el valor de la propiedad custStatus.
     * 
     * @return
     *     possible object is
     *     {@link CustStatus }
     *     
     */
    public CustStatus getCustStatus() {
        return custStatus;
    }

    /**
     * Define el valor de la propiedad custStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link CustStatus }
     *     
     */
    public void setCustStatus(CustStatus value) {
        this.custStatus = value;
    }

    /**
     * Gets the value of the employmentData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the employmentData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmploymentData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmploymentData }
     * 
     * 
     */
    public List<EmploymentData> getEmploymentData() {
        if (employmentData == null) {
            employmentData = new ArrayList<EmploymentData>();
        }
        return this.employmentData;
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
     * Obtiene el valor de la propiedad ownership.
     * 
     * @return
     *     possible object is
     *     {@link Ownership }
     *     
     */
    public Ownership getOwnership() {
        return ownership;
    }

    /**
     * Define el valor de la propiedad ownership.
     * 
     * @param value
     *     allowed object is
     *     {@link Ownership }
     *     
     */
    public void setOwnership(Ownership value) {
        this.ownership = value;
    }

    /**
     * Obtiene el valor de la propiedad employeeInd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeInd() {
        return employeeInd;
    }

    /**
     * Define el valor de la propiedad employeeInd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeInd(String value) {
        this.employeeInd = value;
    }

    /**
     * Obtiene el valor de la propiedad exerciseType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExerciseType() {
        return exerciseType;
    }

    /**
     * Define el valor de la propiedad exerciseType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExerciseType(String value) {
        this.exerciseType = value;
    }

    /**
     * Obtiene el valor de la propiedad indicatorVIP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicatorVIP() {
        return indicatorVIP;
    }

    /**
     * Define el valor de la propiedad indicatorVIP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicatorVIP(String value) {
        this.indicatorVIP = value;
    }

    /**
     * Obtiene el valor de la propiedad custProfile.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustProfile() {
        return custProfile;
    }

    /**
     * Define el valor de la propiedad custProfile.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustProfile(String value) {
        this.custProfile = value;
    }

    /**
     * Obtiene el valor de la propiedad executiveId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExecutiveId() {
        return executiveId;
    }

    /**
     * Define el valor de la propiedad executiveId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExecutiveId(String value) {
        this.executiveId = value;
    }

    /**
     * Obtiene el valor de la propiedad custPswd.
     * 
     * @return
     *     possible object is
     *     {@link CustPswd }
     *     
     */
    public CustPswd getCustPswd() {
        return custPswd;
    }

    /**
     * Define el valor de la propiedad custPswd.
     * 
     * @param value
     *     allowed object is
     *     {@link CustPswd }
     *     
     */
    public void setCustPswd(CustPswd value) {
        this.custPswd = value;
    }

    /**
     * Gets the value of the ref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Ref }
     * 
     * 
     */
    public List<Ref> getRef() {
        if (ref == null) {
            ref = new ArrayList<Ref>();
        }
        return this.ref;
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

}
