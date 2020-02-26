//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.02.24 a las 10:07:43 PM VET 
//


package com.banesco.xmlns.enterpriseobjects.organization;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TradeRegistry complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TradeRegistry"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RegistryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RegistryNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NotaryInfo" type="{http://xmlns.banesco.com/EnterpriseObjects/Organization}NotaryInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeRegistry", propOrder = {
    "registryName",
    "registryNum",
    "notaryInfo"
})
public class TradeRegistry {

    @XmlElement(name = "RegistryName")
    protected String registryName;
    @XmlElement(name = "RegistryNum")
    protected String registryNum;
    @XmlElement(name = "NotaryInfo")
    protected NotaryInfo notaryInfo;

    /**
     * Obtiene el valor de la propiedad registryName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistryName() {
        return registryName;
    }

    /**
     * Define el valor de la propiedad registryName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistryName(String value) {
        this.registryName = value;
    }

    /**
     * Obtiene el valor de la propiedad registryNum.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistryNum() {
        return registryNum;
    }

    /**
     * Define el valor de la propiedad registryNum.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistryNum(String value) {
        this.registryNum = value;
    }

    /**
     * Obtiene el valor de la propiedad notaryInfo.
     * 
     * @return
     *     possible object is
     *     {@link NotaryInfo }
     *     
     */
    public NotaryInfo getNotaryInfo() {
        return notaryInfo;
    }

    /**
     * Define el valor de la propiedad notaryInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link NotaryInfo }
     *     
     */
    public void setNotaryInfo(NotaryInfo value) {
        this.notaryInfo = value;
    }

}
