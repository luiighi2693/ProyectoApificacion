//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.02.24 a las 10:07:43 PM VET 
//


package com.banesco.xmlns.enterpriseobjects.securityidentification;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CustomerResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CustomerResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResponseCustId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ResponseCustDesc" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ResponseCustStatus" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerResponse", propOrder = {
    "responseCustId",
    "responseCustDesc",
    "responseCustStatus"
})
public class CustomerResponse {

    @XmlElement(name = "ResponseCustId")
    protected List<String> responseCustId;
    @XmlElement(name = "ResponseCustDesc")
    protected List<String> responseCustDesc;
    @XmlElement(name = "ResponseCustStatus")
    protected List<String> responseCustStatus;

    /**
     * Gets the value of the responseCustId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the responseCustId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResponseCustId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getResponseCustId() {
        if (responseCustId == null) {
            responseCustId = new ArrayList<String>();
        }
        return this.responseCustId;
    }

    /**
     * Gets the value of the responseCustDesc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the responseCustDesc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResponseCustDesc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getResponseCustDesc() {
        if (responseCustDesc == null) {
            responseCustDesc = new ArrayList<String>();
        }
        return this.responseCustDesc;
    }

    /**
     * Gets the value of the responseCustStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the responseCustStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResponseCustStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getResponseCustStatus() {
        if (responseCustStatus == null) {
            responseCustStatus = new ArrayList<String>();
        }
        return this.responseCustStatus;
    }

}
