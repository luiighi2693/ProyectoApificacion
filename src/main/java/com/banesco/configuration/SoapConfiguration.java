package com.banesco.configuration;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import com.banesco.xmlns.applicationservice.bnetfinancialaccountoutappsvc.ObjectFactory;


@Configuration
public class SoapConfiguration {
    @Value( "${soap.package}" )
    private String soapPackage;

    @Value( "${soap.endpoint}" )
    private String soapAuthEndpoint;
    
    @Value( "${soap.package.creditcard}" )
    private String soapPackageCreditCard;
    
    @Value( "${soap.endpoint.creditcard}" )
    private String soapAuthEndpointCreditCard;
    
    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath(soapPackage);
        return marshaller;
    }
    
    @Bean
    public Jaxb2Marshaller marshallerCreditCard() {
        Jaxb2Marshaller marshallerCreditCard = new Jaxb2Marshaller();
        marshallerCreditCard.setContextPath(soapPackageCreditCard);
        return marshallerCreditCard;
    }

    @Bean
    public SoapClient soapClient(Jaxb2Marshaller marshaller) {
        SoapClient client = new SoapClient();
        client.setDefaultUri(soapAuthEndpoint);
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }
    
    @Bean
    public SoapCreditCardClient soapClientCreditCard(Jaxb2Marshaller marshallerCreditCard) {
    	SoapCreditCardClient clientCreditCard = new SoapCreditCardClient();
    	clientCreditCard.setDefaultUri(soapAuthEndpointCreditCard);
    	clientCreditCard.setMarshaller(marshallerCreditCard);
    	clientCreditCard.setUnmarshaller(marshallerCreditCard);
        return clientCreditCard;
    }
}
