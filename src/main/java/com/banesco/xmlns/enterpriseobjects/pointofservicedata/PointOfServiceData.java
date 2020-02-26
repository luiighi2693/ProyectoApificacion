//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.02.24 a las 10:07:43 PM VET 
//


package com.banesco.xmlns.enterpriseobjects.pointofservicedata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.banesco.xmlns.enterpriseobjects.pmtbatchrec.PmtBatchRec;


/**
 * <p>Clase Java para PointOfServiceData complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PointOfServiceData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TerminalObjId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TerminalObjRec" type="{http://xmlns.banesco.com/EnterpriseObjects/PointOfServiceData}TerminalObjRec" minOccurs="0"/&gt;
 *         &lt;element name="PmtBatchRec" type="{http://xmlns.banesco.com/EnterpriseObjects/PmtBatchRec}PmtBatchRec" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointOfServiceData", propOrder = {
    "terminalObjId",
    "terminalObjRec",
    "pmtBatchRec"
})
public class PointOfServiceData {

    @XmlElement(name = "TerminalObjId")
    protected String terminalObjId;
    @XmlElement(name = "TerminalObjRec")
    protected TerminalObjRec terminalObjRec;
    @XmlElement(name = "PmtBatchRec")
    protected List<PmtBatchRec> pmtBatchRec;

    /**
     * Obtiene el valor de la propiedad terminalObjId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalObjId() {
        return terminalObjId;
    }

    /**
     * Define el valor de la propiedad terminalObjId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalObjId(String value) {
        this.terminalObjId = value;
    }

    /**
     * Obtiene el valor de la propiedad terminalObjRec.
     * 
     * @return
     *     possible object is
     *     {@link TerminalObjRec }
     *     
     */
    public TerminalObjRec getTerminalObjRec() {
        return terminalObjRec;
    }

    /**
     * Define el valor de la propiedad terminalObjRec.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalObjRec }
     *     
     */
    public void setTerminalObjRec(TerminalObjRec value) {
        this.terminalObjRec = value;
    }

    /**
     * Gets the value of the pmtBatchRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pmtBatchRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPmtBatchRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PmtBatchRec }
     * 
     * 
     */
    public List<PmtBatchRec> getPmtBatchRec() {
        if (pmtBatchRec == null) {
            pmtBatchRec = new ArrayList<PmtBatchRec>();
        }
        return this.pmtBatchRec;
    }

}
