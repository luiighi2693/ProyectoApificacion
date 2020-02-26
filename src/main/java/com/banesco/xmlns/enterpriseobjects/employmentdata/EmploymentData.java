//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.02.24 a las 10:07:43 PM VET 
//


package com.banesco.xmlns.enterpriseobjects.employmentdata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.banesco.xmlns.enterpriseobjects.addr.Addr;


/**
 * <p>Clase Java para EmploymentData complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EmploymentData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EmploymentStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Occupation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OccupDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StartDt" type="{http://xmlns.banesco.com/EnterpriseObjects/EmploymentData}datePattern" minOccurs="0"/&gt;
 *         &lt;element name="EndDt" type="{http://xmlns.banesco.com/EnterpriseObjects/EmploymentData}datePattern" minOccurs="0"/&gt;
 *         &lt;element name="OrgInfo" type="{http://xmlns.banesco.com/EnterpriseObjects/EmploymentData}OrgInfo" minOccurs="0"/&gt;
 *         &lt;element name="Income" type="{http://xmlns.banesco.com/EnterpriseObjects/EmploymentData}Income" minOccurs="0"/&gt;
 *         &lt;element name="ExtraIncome" type="{http://xmlns.banesco.com/EnterpriseObjects/EmploymentData}ExtraIncome" minOccurs="0"/&gt;
 *         &lt;element name="Addr" type="{http://xmlns.banesco.com/EnterpriseObjects/Addr}Addr" minOccurs="0"/&gt;
 *         &lt;element name="Expenses" type="{http://xmlns.banesco.com/EnterpriseObjects/EmploymentData}Expenses" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="JobTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EmployeeIdent" type="{http://xmlns.banesco.com/EnterpriseObjects/EmploymentData}EmployeeIdent" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmploymentData", propOrder = {
    "employmentStatus",
    "occupation",
    "occupDesc",
    "startDt",
    "endDt",
    "orgInfo",
    "income",
    "extraIncome",
    "addr",
    "expenses",
    "jobTitle",
    "employeeIdent"
})
public class EmploymentData {

    @XmlElement(name = "EmploymentStatus")
    protected String employmentStatus;
    @XmlElement(name = "Occupation")
    protected String occupation;
    @XmlElement(name = "OccupDesc")
    protected String occupDesc;
    @XmlElement(name = "StartDt")
    protected String startDt;
    @XmlElement(name = "EndDt")
    protected String endDt;
    @XmlElement(name = "OrgInfo")
    protected OrgInfo orgInfo;
    @XmlElement(name = "Income")
    protected Income income;
    @XmlElement(name = "ExtraIncome")
    protected ExtraIncome extraIncome;
    @XmlElement(name = "Addr")
    protected Addr addr;
    @XmlElement(name = "Expenses")
    protected List<Expenses> expenses;
    @XmlElement(name = "JobTitle")
    protected String jobTitle;
    @XmlElement(name = "EmployeeIdent")
    protected EmployeeIdent employeeIdent;

    /**
     * Obtiene el valor de la propiedad employmentStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmploymentStatus() {
        return employmentStatus;
    }

    /**
     * Define el valor de la propiedad employmentStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmploymentStatus(String value) {
        this.employmentStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad occupation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccupation() {
        return occupation;
    }

    /**
     * Define el valor de la propiedad occupation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccupation(String value) {
        this.occupation = value;
    }

    /**
     * Obtiene el valor de la propiedad occupDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccupDesc() {
        return occupDesc;
    }

    /**
     * Define el valor de la propiedad occupDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccupDesc(String value) {
        this.occupDesc = value;
    }

    /**
     * Obtiene el valor de la propiedad startDt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDt() {
        return startDt;
    }

    /**
     * Define el valor de la propiedad startDt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDt(String value) {
        this.startDt = value;
    }

    /**
     * Obtiene el valor de la propiedad endDt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDt() {
        return endDt;
    }

    /**
     * Define el valor de la propiedad endDt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDt(String value) {
        this.endDt = value;
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
     * Obtiene el valor de la propiedad income.
     * 
     * @return
     *     possible object is
     *     {@link Income }
     *     
     */
    public Income getIncome() {
        return income;
    }

    /**
     * Define el valor de la propiedad income.
     * 
     * @param value
     *     allowed object is
     *     {@link Income }
     *     
     */
    public void setIncome(Income value) {
        this.income = value;
    }

    /**
     * Obtiene el valor de la propiedad extraIncome.
     * 
     * @return
     *     possible object is
     *     {@link ExtraIncome }
     *     
     */
    public ExtraIncome getExtraIncome() {
        return extraIncome;
    }

    /**
     * Define el valor de la propiedad extraIncome.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtraIncome }
     *     
     */
    public void setExtraIncome(ExtraIncome value) {
        this.extraIncome = value;
    }

    /**
     * Obtiene el valor de la propiedad addr.
     * 
     * @return
     *     possible object is
     *     {@link Addr }
     *     
     */
    public Addr getAddr() {
        return addr;
    }

    /**
     * Define el valor de la propiedad addr.
     * 
     * @param value
     *     allowed object is
     *     {@link Addr }
     *     
     */
    public void setAddr(Addr value) {
        this.addr = value;
    }

    /**
     * Gets the value of the expenses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the expenses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExpenses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Expenses }
     * 
     * 
     */
    public List<Expenses> getExpenses() {
        if (expenses == null) {
            expenses = new ArrayList<Expenses>();
        }
        return this.expenses;
    }

    /**
     * Obtiene el valor de la propiedad jobTitle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Define el valor de la propiedad jobTitle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobTitle(String value) {
        this.jobTitle = value;
    }

    /**
     * Obtiene el valor de la propiedad employeeIdent.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeIdent }
     *     
     */
    public EmployeeIdent getEmployeeIdent() {
        return employeeIdent;
    }

    /**
     * Define el valor de la propiedad employeeIdent.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeIdent }
     *     
     */
    public void setEmployeeIdent(EmployeeIdent value) {
        this.employeeIdent = value;
    }

}
