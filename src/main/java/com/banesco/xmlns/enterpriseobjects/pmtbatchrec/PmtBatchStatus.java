//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.02.24 a las 10:07:43 PM VET 
//


package com.banesco.xmlns.enterpriseobjects.pmtbatchrec;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PmtBatchStatus complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PmtBatchStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PmtBatchStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StatusDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StatusModBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EffDt" type="{http://xmlns.banesco.com/EnterpriseObjects/PmtBatchRec}dateTimePattern" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PmtBatchStatus", propOrder = {
    "pmtBatchStatusCode",
    "statusDesc",
    "statusModBy",
    "effDt"
})
public class PmtBatchStatus {

    @XmlElement(name = "PmtBatchStatusCode")
    protected String pmtBatchStatusCode;
    @XmlElement(name = "StatusDesc")
    protected String statusDesc;
    @XmlElement(name = "StatusModBy")
    protected String statusModBy;
    @XmlElement(name = "EffDt")
    protected String effDt;

    /**
     * Obtiene el valor de la propiedad pmtBatchStatusCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmtBatchStatusCode() {
        return pmtBatchStatusCode;
    }

    /**
     * Define el valor de la propiedad pmtBatchStatusCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmtBatchStatusCode(String value) {
        this.pmtBatchStatusCode = value;
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
     * Obtiene el valor de la propiedad statusModBy.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusModBy() {
        return statusModBy;
    }

    /**
     * Define el valor de la propiedad statusModBy.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusModBy(String value) {
        this.statusModBy = value;
    }

    /**
     * Obtiene el valor de la propiedad effDt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffDt() {
        return effDt;
    }

    /**
     * Define el valor de la propiedad effDt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffDt(String value) {
        this.effDt = value;
    }

}
