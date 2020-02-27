package com.banesco.configuration;
import com.banesco.xmlns.applicationservice.bnetfinancialaccountoutappsvc.ObjectFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class SoapConfiguration {
    @Value( "${soap.package}" )
    private String soapPackage;

    @Value( "${soap.endpoint}" )
    private String soapAuthEndpoint;

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath(soapPackage);
        return marshaller;
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
    public ObjectFactory objectFactory() {
        return new ObjectFactory();
    }
}
