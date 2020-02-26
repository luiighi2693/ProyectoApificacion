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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para SecurityQuestion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SecurityQuestion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="QuestionId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="QuestionDesc" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="QuestionCreationDate" type="{http://www.w3.org/2001/XMLSchema}date" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="QuestionStatus" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="QuestionStatusDate" type="{http://www.w3.org/2001/XMLSchema}date" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityQuestion", propOrder = {
    "questionId",
    "questionDesc",
    "questionCreationDate",
    "questionStatus",
    "questionStatusDate"
})
public class SecurityQuestion {

    @XmlElement(name = "QuestionId")
    protected List<String> questionId;
    @XmlElement(name = "QuestionDesc")
    protected List<String> questionDesc;
    @XmlElement(name = "QuestionCreationDate")
    @XmlSchemaType(name = "date")
    protected List<XMLGregorianCalendar> questionCreationDate;
    @XmlElement(name = "QuestionStatus")
    protected List<String> questionStatus;
    @XmlElement(name = "QuestionStatusDate")
    @XmlSchemaType(name = "date")
    protected List<XMLGregorianCalendar> questionStatusDate;

    /**
     * Gets the value of the questionId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the questionId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuestionId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getQuestionId() {
        if (questionId == null) {
            questionId = new ArrayList<String>();
        }
        return this.questionId;
    }

    /**
     * Gets the value of the questionDesc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the questionDesc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuestionDesc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getQuestionDesc() {
        if (questionDesc == null) {
            questionDesc = new ArrayList<String>();
        }
        return this.questionDesc;
    }

    /**
     * Gets the value of the questionCreationDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the questionCreationDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuestionCreationDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMLGregorianCalendar }
     * 
     * 
     */
    public List<XMLGregorianCalendar> getQuestionCreationDate() {
        if (questionCreationDate == null) {
            questionCreationDate = new ArrayList<XMLGregorianCalendar>();
        }
        return this.questionCreationDate;
    }

    /**
     * Gets the value of the questionStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the questionStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuestionStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getQuestionStatus() {
        if (questionStatus == null) {
            questionStatus = new ArrayList<String>();
        }
        return this.questionStatus;
    }

    /**
     * Gets the value of the questionStatusDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the questionStatusDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuestionStatusDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMLGregorianCalendar }
     * 
     * 
     */
    public List<XMLGregorianCalendar> getQuestionStatusDate() {
        if (questionStatusDate == null) {
            questionStatusDate = new ArrayList<XMLGregorianCalendar>();
        }
        return this.questionStatusDate;
    }

}
