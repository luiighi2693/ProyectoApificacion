//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.02.24 a las 10:07:43 PM VET 
//


package com.banesco.xmlns.enterpriseobjects.personinfo;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.banesco.xmlns.enterpriseobjects.personinfo package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.banesco.xmlns.enterpriseobjects.personinfo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PersonInfo }
     * 
     */
    public PersonInfo createPersonInfo() {
        return new PersonInfo();
    }

    /**
     * Create an instance of {@link PersonName }
     * 
     */
    public PersonName createPersonName() {
        return new PersonName();
    }

    /**
     * Create an instance of {@link OtherIdentDoc }
     * 
     */
    public OtherIdentDoc createOtherIdentDoc() {
        return new OtherIdentDoc();
    }

    /**
     * Create an instance of {@link TINInfo }
     * 
     */
    public TINInfo createTINInfo() {
        return new TINInfo();
    }

    /**
     * Create an instance of {@link GovIssueIdent }
     * 
     */
    public GovIssueIdent createGovIssueIdent() {
        return new GovIssueIdent();
    }

}
