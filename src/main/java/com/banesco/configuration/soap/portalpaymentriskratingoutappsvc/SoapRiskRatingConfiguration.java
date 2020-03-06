package com.banesco.configuration.soap.portalpaymentriskratingoutappsvc;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;


@Configuration
public class SoapRiskRatingConfiguration {
    
    @Value( "${soap.package.riskrating}" )
    private String soapPackageRiskRating;
    
    @Value( "${soap.endpoint.riskrating}" )
    private String soapAuthEndpointRiskRating;

    @Bean
    public Jaxb2Marshaller marshallerRiskRating() {
        Jaxb2Marshaller marshallerRiskRating = new Jaxb2Marshaller();
        marshallerRiskRating.setContextPath(soapPackageRiskRating);
        return marshallerRiskRating;
    }
    
    @Bean
    public SoapRiskRatingClient soapClientRiskRating(Jaxb2Marshaller marshallerRiskRating) {
    	SoapRiskRatingClient clientRiskRating = new SoapRiskRatingClient();
    	clientRiskRating.setDefaultUri(soapAuthEndpointRiskRating);
    	clientRiskRating.setMarshaller(marshallerRiskRating);
    	clientRiskRating.setUnmarshaller(marshallerRiskRating);
        return clientRiskRating;
    }
}
