package com.banesco.configuration.soap.apifinancialaccountoutappsvc;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;


@Configuration
public class SoapAccountDataConfiguration {
    @Value( "${soap.account.data.package}" )
    private String soapAccountDataPackage;

    @Value( "${soap.account.data.endpoint}" )
    private String soapAccountDataAuthEndpoint;

    @Bean
    public Jaxb2Marshaller marshallerAccountData() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath(soapAccountDataPackage);
        return marshaller;
    }

    @Bean
    public SoapAccountDataClient soapAccountDataClient(Jaxb2Marshaller marshaller) {
        SoapAccountDataClient client = new SoapAccountDataClient();
        client.setDefaultUri(soapAccountDataAuthEndpoint);
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }

}
