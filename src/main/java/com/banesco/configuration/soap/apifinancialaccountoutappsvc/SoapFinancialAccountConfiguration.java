package com.banesco.configuration.soap.apifinancialaccountoutappsvc;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;


@Configuration
public class SoapFinancialAccountConfiguration {
    @Value( "${soap.financial.account.data.package}" )
    private String soapFinancialAccountPackage;

    @Value( "${soap.financial.account.data.endpoint}" )
    private String soapFinancialAccountAuthEndpoint;

    @Bean
    public Jaxb2Marshaller marshallerFinancialAccount() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath(soapFinancialAccountPackage);
        return marshaller;
    }

    @Bean
    public SoapFinancialAccountClient soapFinancialAccountClient(Jaxb2Marshaller marshallerFinancialAccount) {
        SoapFinancialAccountClient client = new SoapFinancialAccountClient();
        client.setDefaultUri(soapFinancialAccountAuthEndpoint);
        client.setMarshaller(marshallerFinancialAccount);
        client.setUnmarshaller(marshallerFinancialAccount);
        return client;
    }

}
