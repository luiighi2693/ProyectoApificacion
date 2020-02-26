//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.02.24 a las 10:07:43 PM VET 
//


package com.banesco.xmlns.enterpriseobjects.chk;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Chk complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Chk"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ChkBkInfo" type="{http://xmlns.banesco.com/EnterpriseObjects/Chk}ChkBkInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ChkInfo" type="{http://xmlns.banesco.com/EnterpriseObjects/Chk}ChkInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ChkOrdRec" type="{http://xmlns.banesco.com/EnterpriseObjects/Chk}ChkOrdRec" minOccurs="0"/&gt;
 *         &lt;element name="ChkIssueInfo" type="{http://xmlns.banesco.com/EnterpriseObjects/Chk}ChkIssueInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Chk", propOrder = {
    "chkBkInfo",
    "chkInfo",
    "chkOrdRec",
    "chkIssueInfo"
})
public class Chk {

    @XmlElement(name = "ChkBkInfo")
    protected List<ChkBkInfo> chkBkInfo;
    @XmlElement(name = "ChkInfo")
    protected List<ChkInfo> chkInfo;
    @XmlElement(name = "ChkOrdRec")
    protected ChkOrdRec chkOrdRec;
    @XmlElement(name = "ChkIssueInfo")
    protected ChkIssueInfo chkIssueInfo;

    /**
     * Gets the value of the chkBkInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chkBkInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChkBkInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChkBkInfo }
     * 
     * 
     */
    public List<ChkBkInfo> getChkBkInfo() {
        if (chkBkInfo == null) {
            chkBkInfo = new ArrayList<ChkBkInfo>();
        }
        return this.chkBkInfo;
    }

    /**
     * Gets the value of the chkInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chkInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChkInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChkInfo }
     * 
     * 
     */
    public List<ChkInfo> getChkInfo() {
        if (chkInfo == null) {
            chkInfo = new ArrayList<ChkInfo>();
        }
        return this.chkInfo;
    }

    /**
     * Obtiene el valor de la propiedad chkOrdRec.
     * 
     * @return
     *     possible object is
     *     {@link ChkOrdRec }
     *     
     */
    public ChkOrdRec getChkOrdRec() {
        return chkOrdRec;
    }

    /**
     * Define el valor de la propiedad chkOrdRec.
     * 
     * @param value
     *     allowed object is
     *     {@link ChkOrdRec }
     *     
     */
    public void setChkOrdRec(ChkOrdRec value) {
        this.chkOrdRec = value;
    }

    /**
     * Obtiene el valor de la propiedad chkIssueInfo.
     * 
     * @return
     *     possible object is
     *     {@link ChkIssueInfo }
     *     
     */
    public ChkIssueInfo getChkIssueInfo() {
        return chkIssueInfo;
    }

    /**
     * Define el valor de la propiedad chkIssueInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link ChkIssueInfo }
     *     
     */
    public void setChkIssueInfo(ChkIssueInfo value) {
        this.chkIssueInfo = value;
    }

}
