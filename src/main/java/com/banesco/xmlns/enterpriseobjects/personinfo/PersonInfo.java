//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.02.24 a las 10:07:43 PM VET 
//


package com.banesco.xmlns.enterpriseobjects.personinfo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PersonInfo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PersonInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Nationality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MaritalStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MaritalStatusGender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BirthDt" type="{http://xmlns.banesco.com/EnterpriseObjects/PersonInfo}datePattern" minOccurs="0"/&gt;
 *         &lt;element name="BirthCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Gender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NameAddrType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BirthCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NationalityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PersonName" type="{http://xmlns.banesco.com/EnterpriseObjects/PersonInfo}PersonName" minOccurs="0"/&gt;
 *         &lt;element name="EduBackground" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OtherIdentDoc" type="{http://xmlns.banesco.com/EnterpriseObjects/PersonInfo}OtherIdentDoc" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TINInfo" type="{http://xmlns.banesco.com/EnterpriseObjects/PersonInfo}TINInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="GovIssueIdent" type="{http://xmlns.banesco.com/EnterpriseObjects/PersonInfo}GovIssueIdent" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Dependents" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HouseCondition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SpouseBirthCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Occupation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PersonType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonInfo", propOrder = {
    "fullName",
    "nationality",
    "maritalStatus",
    "maritalStatusGender",
    "birthDt",
    "birthCountry",
    "gender",
    "nameAddrType",
    "birthCountryCode",
    "nationalityCode",
    "personName",
    "eduBackground",
    "otherIdentDoc",
    "tinInfo",
    "govIssueIdent",
    "dependents",
    "houseCondition",
    "spouseBirthCountry",
    "occupation",
    "personType"
})
public class PersonInfo {

    @XmlElement(name = "FullName")
    protected String fullName;
    @XmlElement(name = "Nationality")
    protected String nationality;
    @XmlElement(name = "MaritalStatus")
    protected String maritalStatus;
    @XmlElement(name = "MaritalStatusGender")
    protected String maritalStatusGender;
    @XmlElement(name = "BirthDt")
    protected String birthDt;
    @XmlElement(name = "BirthCountry")
    protected String birthCountry;
    @XmlElement(name = "Gender")
    protected String gender;
    @XmlElement(name = "NameAddrType")
    protected String nameAddrType;
    @XmlElement(name = "BirthCountryCode")
    protected String birthCountryCode;
    @XmlElement(name = "NationalityCode")
    protected String nationalityCode;
    @XmlElement(name = "PersonName")
    protected PersonName personName;
    @XmlElement(name = "EduBackground")
    protected String eduBackground;
    @XmlElement(name = "OtherIdentDoc")
    protected List<OtherIdentDoc> otherIdentDoc;
    @XmlElement(name = "TINInfo")
    protected List<TINInfo> tinInfo;
    @XmlElement(name = "GovIssueIdent")
    protected List<GovIssueIdent> govIssueIdent;
    @XmlElement(name = "Dependents")
    protected String dependents;
    @XmlElement(name = "HouseCondition")
    protected String houseCondition;
    @XmlElement(name = "SpouseBirthCountry")
    protected String spouseBirthCountry;
    @XmlElement(name = "Occupation")
    protected String occupation;
    @XmlElement(name = "PersonType")
    protected String personType;

    /**
     * Obtiene el valor de la propiedad fullName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Define el valor de la propiedad fullName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullName(String value) {
        this.fullName = value;
    }

    /**
     * Obtiene el valor de la propiedad nationality.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * Define el valor de la propiedad nationality.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationality(String value) {
        this.nationality = value;
    }

    /**
     * Obtiene el valor de la propiedad maritalStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * Define el valor de la propiedad maritalStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaritalStatus(String value) {
        this.maritalStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad maritalStatusGender.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaritalStatusGender() {
        return maritalStatusGender;
    }

    /**
     * Define el valor de la propiedad maritalStatusGender.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaritalStatusGender(String value) {
        this.maritalStatusGender = value;
    }

    /**
     * Obtiene el valor de la propiedad birthDt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthDt() {
        return birthDt;
    }

    /**
     * Define el valor de la propiedad birthDt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthDt(String value) {
        this.birthDt = value;
    }

    /**
     * Obtiene el valor de la propiedad birthCountry.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthCountry() {
        return birthCountry;
    }

    /**
     * Define el valor de la propiedad birthCountry.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthCountry(String value) {
        this.birthCountry = value;
    }

    /**
     * Obtiene el valor de la propiedad gender.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Define el valor de la propiedad gender.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * Obtiene el valor de la propiedad nameAddrType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameAddrType() {
        return nameAddrType;
    }

    /**
     * Define el valor de la propiedad nameAddrType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameAddrType(String value) {
        this.nameAddrType = value;
    }

    /**
     * Obtiene el valor de la propiedad birthCountryCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthCountryCode() {
        return birthCountryCode;
    }

    /**
     * Define el valor de la propiedad birthCountryCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthCountryCode(String value) {
        this.birthCountryCode = value;
    }

    /**
     * Obtiene el valor de la propiedad nationalityCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalityCode() {
        return nationalityCode;
    }

    /**
     * Define el valor de la propiedad nationalityCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalityCode(String value) {
        this.nationalityCode = value;
    }

    /**
     * Obtiene el valor de la propiedad personName.
     * 
     * @return
     *     possible object is
     *     {@link PersonName }
     *     
     */
    public PersonName getPersonName() {
        return personName;
    }

    /**
     * Define el valor de la propiedad personName.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonName }
     *     
     */
    public void setPersonName(PersonName value) {
        this.personName = value;
    }

    /**
     * Obtiene el valor de la propiedad eduBackground.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEduBackground() {
        return eduBackground;
    }

    /**
     * Define el valor de la propiedad eduBackground.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEduBackground(String value) {
        this.eduBackground = value;
    }

    /**
     * Gets the value of the otherIdentDoc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherIdentDoc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherIdentDoc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherIdentDoc }
     * 
     * 
     */
    public List<OtherIdentDoc> getOtherIdentDoc() {
        if (otherIdentDoc == null) {
            otherIdentDoc = new ArrayList<OtherIdentDoc>();
        }
        return this.otherIdentDoc;
    }

    /**
     * Gets the value of the tinInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tinInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTINInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TINInfo }
     * 
     * 
     */
    public List<TINInfo> getTINInfo() {
        if (tinInfo == null) {
            tinInfo = new ArrayList<TINInfo>();
        }
        return this.tinInfo;
    }

    /**
     * Gets the value of the govIssueIdent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the govIssueIdent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGovIssueIdent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GovIssueIdent }
     * 
     * 
     */
    public List<GovIssueIdent> getGovIssueIdent() {
        if (govIssueIdent == null) {
            govIssueIdent = new ArrayList<GovIssueIdent>();
        }
        return this.govIssueIdent;
    }

    /**
     * Obtiene el valor de la propiedad dependents.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDependents() {
        return dependents;
    }

    /**
     * Define el valor de la propiedad dependents.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDependents(String value) {
        this.dependents = value;
    }

    /**
     * Obtiene el valor de la propiedad houseCondition.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseCondition() {
        return houseCondition;
    }

    /**
     * Define el valor de la propiedad houseCondition.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseCondition(String value) {
        this.houseCondition = value;
    }

    /**
     * Obtiene el valor de la propiedad spouseBirthCountry.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpouseBirthCountry() {
        return spouseBirthCountry;
    }

    /**
     * Define el valor de la propiedad spouseBirthCountry.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpouseBirthCountry(String value) {
        this.spouseBirthCountry = value;
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
     * Obtiene el valor de la propiedad personType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonType() {
        return personType;
    }

    /**
     * Define el valor de la propiedad personType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonType(String value) {
        this.personType = value;
    }

}
