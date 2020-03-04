package com.banesco.configuration.soap;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;


@Configuration
public class SoapCreditCardConfiguration {
    
    @Value( "${soap.package.creditcard}" )
    private String soapPackageCreditCard;
    
    @Value( "${soap.endpoint.creditcard}" )
    private String soapAuthEndpointCreditCard;

    @Bean
    public Jaxb2Marshaller marshallerCreditCard() {
        Jaxb2Marshaller marshallerCreditCard = new Jaxb2Marshaller();
        marshallerCreditCard.setContextPath(soapPackageCreditCard);
        return marshallerCreditCard;
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
