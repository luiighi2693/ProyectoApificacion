//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.02.24 a las 10:07:43 PM VET 
//


package com.banesco.xmlns.enterpriseobjects.service;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.banesco.xmlns.enterpriseobjects.service package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.banesco.xmlns.enterpriseobjects.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Service }
     * 
     */
    public Service createService() {
        return new Service();
    }

    /**
     * Create an instance of {@link SvcPayConf }
     * 
     */
    public SvcPayConf createSvcPayConf() {
        return new SvcPayConf();
    }

    /**
     * Create an instance of {@link PayAmtConf }
     * 
     */
    public PayAmtConf createPayAmtConf() {
        return new PayAmtConf();
    }

    /**
     * Create an instance of {@link SvcUseConf }
     * 
     */
    public SvcUseConf createSvcUseConf() {
        return new SvcUseConf();
    }

    /**
     * Create an instance of {@link Delivery }
     * 
     */
    public Delivery createDelivery() {
        return new Delivery();
    }

    /**
     * Create an instance of {@link Issue }
     * 
     */
    public Issue createIssue() {
        return new Issue();
    }

    /**
     * Create an instance of {@link SvcStatus }
     * 
     */
    public SvcStatus createSvcStatus() {
        return new SvcStatus();
    }

}
