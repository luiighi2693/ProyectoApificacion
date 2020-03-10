//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.03.09 a las 04:12:39 PM VET 
//


package com.banesco.xmlns.applicationservice.apifinancialaccountoutappsvc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AcctBal_Rstype complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AcctBal_Rstype"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CurAmt" type="{http://xmlns.banesco.com/ApplicationService/APIFinancialAccountOutAppSvc}CurAmt_Rstype" minOccurs="0"/&gt;
 *         &lt;element name="BalType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SignalBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcctBal_Rstype", propOrder = {
    "curAmt",
    "balType",
    "signalBalance"
})
public class AcctBalRstype {

    @XmlElement(name = "CurAmt")
    protected CurAmtRstype curAmt;
    @XmlElement(name = "BalType")
    protected String balType;
    @XmlElement(name = "SignalBalance")
    protected String signalBalance;

    /**
     * Obtiene el valor de la propiedad curAmt.
     * 
     * @return
     *     possible object is
     *     {@link CurAmtRstype }
     *     
     */
    public CurAmtRstype getCurAmt() {
        return curAmt;
    }

    /**
     * Define el valor de la propiedad curAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link CurAmtRstype }
     *     
     */
    public void setCurAmt(CurAmtRstype value) {
        this.curAmt = value;
    }

    /**
     * Obtiene el valor de la propiedad balType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalType() {
        return balType;
    }

    /**
     * Define el valor de la propiedad balType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalType(String value) {
        this.balType = value;
    }

    /**
     * Obtiene el valor de la propiedad signalBalance.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignalBalance() {
        return signalBalance;
    }

    /**
     * Define el valor de la propiedad signalBalance.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignalBalance(String value) {
        this.signalBalance = value;
    }

}
