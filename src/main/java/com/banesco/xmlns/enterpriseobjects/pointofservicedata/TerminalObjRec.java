//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.02.24 a las 10:07:43 PM VET 
//


package com.banesco.xmlns.enterpriseobjects.pointofservicedata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TerminalObjRec complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TerminalObjRec"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TerminalObjInfo" type="{http://xmlns.banesco.com/EnterpriseObjects/PointOfServiceData}TerminalObjInfo" minOccurs="0"/&gt;
 *         &lt;element name="TerminalObjEnvr" type="{http://xmlns.banesco.com/EnterpriseObjects/PointOfServiceData}TerminalObjEnvr" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TerminalObjRec", propOrder = {
    "terminalObjInfo",
    "terminalObjEnvr"
})
public class TerminalObjRec {

    @XmlElement(name = "TerminalObjInfo")
    protected TerminalObjInfo terminalObjInfo;
    @XmlElement(name = "TerminalObjEnvr")
    protected TerminalObjEnvr terminalObjEnvr;

    /**
     * Obtiene el valor de la propiedad terminalObjInfo.
     * 
     * @return
     *     possible object is
     *     {@link TerminalObjInfo }
     *     
     */
    public TerminalObjInfo getTerminalObjInfo() {
        return terminalObjInfo;
    }

    /**
     * Define el valor de la propiedad terminalObjInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalObjInfo }
     *     
     */
    public void setTerminalObjInfo(TerminalObjInfo value) {
        this.terminalObjInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad terminalObjEnvr.
     * 
     * @return
     *     possible object is
     *     {@link TerminalObjEnvr }
     *     
     */
    public TerminalObjEnvr getTerminalObjEnvr() {
        return terminalObjEnvr;
    }

    /**
     * Define el valor de la propiedad terminalObjEnvr.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalObjEnvr }
     *     
     */
    public void setTerminalObjEnvr(TerminalObjEnvr value) {
        this.terminalObjEnvr = value;
    }

}
