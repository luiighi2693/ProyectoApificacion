package com.banesco.configuration.soap.bnetfinancialaccountoutappsvc;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;


@Configuration
public class SoapAccountConfiguration {
    @Value( "${soap.account.package}" )
    private String soapPackage;

    @Value( "${soap.account.endpoint}" )
    private String soapAuthEndpoint;

    @Bean
    public Jaxb2Marshaller marshallerAccount() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath(soapPackage);
        return marshaller;
    }

    @Bean
    public SoapAccountClient soapAccountClient(Jaxb2Marshaller marshallerAccount) {
        SoapAccountClient client = new SoapAccountClient();
        client.setDefaultUri(soapAuthEndpoint);
        client.setMarshaller(marshallerAccount);
        client.setUnmarshaller(marshallerAccount);
        return client;
    }

}
