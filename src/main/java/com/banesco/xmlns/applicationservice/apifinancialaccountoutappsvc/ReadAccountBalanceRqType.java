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
import com.banesco.xmlns.enterpriseobjects.msgrqhdr.MsgRqHdr;


/**
 * <p>Clase Java para readAccountBalance_RqType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="readAccountBalance_RqType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MsgRqHdr" type="{http://xmlns.banesco.com/EnterpriseObjects/MsgRqHdr}MsgRqHdr" minOccurs="0"/&gt;
 *         &lt;element name="Account" type="{http://xmlns.banesco.com/ApplicationService/APIFinancialAccountOutAppSvc}Account_Rqtype" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "readAccountBalance_Rq", propOrder = {
    "msgRqHdr",
    "account"
})
public class ReadAccountBalanceRqType {

    @XmlElement(name = "MsgRqHdr")
    protected MsgRqHdr msgRqHdr;
    @XmlElement(name = "Account")
    protected AccountRqtype account;

    /**
     * Obtiene el valor de la propiedad msgRqHdr.
     * 
     * @return
     *     possible object is
     *     {@link MsgRqHdr }
     *     
     */
    public MsgRqHdr getMsgRqHdr() {
        return msgRqHdr;
    }

    /**
     * Define el valor de la propiedad msgRqHdr.
     * 
     * @param value
     *     allowed object is
     *     {@link MsgRqHdr }
     *     
     */
    public void setMsgRqHdr(MsgRqHdr value) {
        this.msgRqHdr = value;
    }

    /**
     * Obtiene el valor de la propiedad account.
     * 
     * @return
     *     possible object is
     *     {@link AccountRqtype }
     *     
     */
    public AccountRqtype getAccount() {
        return account;
    }

    /**
     * Define el valor de la propiedad account.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountRqtype }
     *     
     */
    public void setAccount(AccountRqtype value) {
        this.account = value;
    }

}
