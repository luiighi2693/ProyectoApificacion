//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.02.24 a las 10:07:43 PM VET 
//


package com.banesco.xmlns.enterpriseobjects.account;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CardLogicalStatus complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CardLogicalStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CardLogStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StatusDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StatusType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BlockType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BlockDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BlockDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StatusCausal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardLogicalStatus", propOrder = {
    "cardLogStatus",
    "statusDesc",
    "statusCode",
    "statusType",
    "blockType",
    "blockDesc",
    "blockDt",
    "statusCausal"
})
public class CardLogicalStatus {

    @XmlElement(name = "CardLogStatus")
    protected String cardLogStatus;
    @XmlElement(name = "StatusDesc")
    protected String statusDesc;
    @XmlElement(name = "StatusCode")
    protected String statusCode;
    @XmlElement(name = "StatusType")
    protected String statusType;
    @XmlElement(name = "BlockType")
    protected String blockType;
    @XmlElement(name = "BlockDesc")
    protected String blockDesc;
    @XmlElement(name = "BlockDt")
    protected String blockDt;
    @XmlElement(name = "StatusCausal")
    protected String statusCausal;

    /**
     * Obtiene el valor de la propiedad cardLogStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardLogStatus() {
        return cardLogStatus;
    }

    /**
     * Define el valor de la propiedad cardLogStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardLogStatus(String value) {
        this.cardLogStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad statusDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusDesc() {
        return statusDesc;
    }

    /**
     * Define el valor de la propiedad statusDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusDesc(String value) {
        this.statusDesc = value;
    }

    /**
     * Obtiene el valor de la propiedad statusCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * Define el valor de la propiedad statusCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusCode(String value) {
        this.statusCode = value;
    }

    /**
     * Obtiene el valor de la propiedad statusType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusType() {
        return statusType;
    }

    /**
     * Define el valor de la propiedad statusType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusType(String value) {
        this.statusType = value;
    }

    /**
     * Obtiene el valor de la propiedad blockType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlockType() {
        return blockType;
    }

    /**
     * Define el valor de la propiedad blockType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlockType(String value) {
        this.blockType = value;
    }

    /**
     * Obtiene el valor de la propiedad blockDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlockDesc() {
        return blockDesc;
    }

    /**
     * Define el valor de la propiedad blockDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlockDesc(String value) {
        this.blockDesc = value;
    }

    /**
     * Obtiene el valor de la propiedad blockDt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlockDt() {
        return blockDt;
    }

    /**
     * Define el valor de la propiedad blockDt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlockDt(String value) {
        this.blockDt = value;
    }

    /**
     * Obtiene el valor de la propiedad statusCausal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusCausal() {
        return statusCausal;
    }

    /**
     * Define el valor de la propiedad statusCausal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusCausal(String value) {
        this.statusCausal = value;
    }

}
