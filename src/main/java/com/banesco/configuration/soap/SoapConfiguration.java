package com.banesco.configuration.soap;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class SoapConfiguration {

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setPackagesToScan(
                "com.banesco.xmlns.applicationservice.apifinancialaccountoutappsvc"
        );
        return marshaller;
    }

    @Bean
    public SoapClientService soapClientService(Jaxb2Marshaller marshaller) {
        SoapClientService client = new SoapClientService();
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }
}