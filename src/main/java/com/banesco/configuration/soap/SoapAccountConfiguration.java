package com.banesco.configuration.soap;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;


@Configuration
public class SoapAccountConfiguration {
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
    public SoapAccountClient soapClient(Jaxb2Marshaller marshaller) {
        SoapAccountClient client = new SoapAccountClient();
        client.setDefaultUri(soapAuthEndpoint);
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }

}
