//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.02.24 a las 10:07:43 PM VET 
//


package com.banesco.xmlns.enterpriseobjects.msgrqhdr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ApplicantData complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ApplicantData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EnterpriseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PrivateChannelId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HostName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StadisticId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Application" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Nationality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IdDocument" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RolType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PlanCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Channel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplicantData", propOrder = {
    "enterpriseCode",
    "privateChannelId",
    "ipAddress",
    "hostName",
    "stadisticId",
    "application",
    "nationality",
    "idDocument",
    "rolType",
    "planCode",
    "channel"
})
public class ApplicantData {

    @XmlElement(name = "EnterpriseCode")
    protected String enterpriseCode;
    @XmlElement(name = "PrivateChannelId")
    protected String privateChannelId;
    @XmlElement(name = "IpAddress")
    protected String ipAddress;
    @XmlElement(name = "HostName")
    protected String hostName;
    @XmlElement(name = "StadisticId")
    protected String stadisticId;
    @XmlElement(name = "Application")
    protected String application;
    @XmlElement(name = "Nationality")
    protected String nationality;
    @XmlElement(name = "IdDocument")
    protected String idDocument;
    @XmlElement(name = "RolType")
    protected String rolType;
    @XmlElement(name = "PlanCode")
    protected String planCode;
    @XmlElement(name = "Channel")
    protected String channel;

    /**
     * Obtiene el valor de la propiedad enterpriseCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnterpriseCode() {
        return enterpriseCode;
    }

    /**
     * Define el valor de la propiedad enterpriseCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnterpriseCode(String value) {
        this.enterpriseCode = value;
    }

    /**
     * Obtiene el valor de la propiedad privateChannelId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrivateChannelId() {
        return privateChannelId;
    }

    /**
     * Define el valor de la propiedad privateChannelId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrivateChannelId(String value) {
        this.privateChannelId = value;
    }

    /**
     * Obtiene el valor de la propiedad ipAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * Define el valor de la propiedad ipAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpAddress(String value) {
        this.ipAddress = value;
    }

    /**
     * Obtiene el valor de la propiedad hostName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostName() {
        return hostName;
    }

    /**
     * Define el valor de la propiedad hostName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostName(String value) {
        this.hostName = value;
    }

    /**
     * Obtiene el valor de la propiedad stadisticId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStadisticId() {
        return stadisticId;
    }

    /**
     * Define el valor de la propiedad stadisticId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStadisticId(String value) {
        this.stadisticId = value;
    }

    /**
     * Obtiene el valor de la propiedad application.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplication() {
        return application;
    }

    /**
     * Define el valor de la propiedad application.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplication(String value) {
        this.application = value;
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
     * Obtiene el valor de la propiedad idDocument.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdDocument() {
        return idDocument;
    }

    /**
     * Define el valor de la propiedad idDocument.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdDocument(String value) {
        this.idDocument = value;
    }

    /**
     * Obtiene el valor de la propiedad rolType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRolType() {
        return rolType;
    }

    /**
     * Define el valor de la propiedad rolType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRolType(String value) {
        this.rolType = value;
    }

    /**
     * Obtiene el valor de la propiedad planCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanCode() {
        return planCode;
    }

    /**
     * Define el valor de la propiedad planCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanCode(String value) {
        this.planCode = value;
    }

    /**
     * Obtiene el valor de la propiedad channel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannel() {
        return channel;
    }

    /**
     * Define el valor de la propiedad channel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannel(String value) {
        this.channel = value;
    }

}
