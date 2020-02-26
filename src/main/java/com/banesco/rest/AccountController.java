package com.banesco.rest;

//public class ReadCustomerAccountController {
//}

import com.banesco.configuration.SoapClient;
import com.banesco.xmlns.applicationservice.bnetfinancialaccountoutappsvc.ReadCustomerAccountRq;
import com.banesco.xmlns.applicationservice.bnetfinancialaccountoutappsvc.ReadCustomerAccountRs;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Api(description = "Read Customer Account API")
@RequestMapping(path = "/account")
public class AccountController {
    private Logger log = LoggerFactory.getLogger(AccountController.class);

    private final ApplicationContext context;

    @Value("${soap.client}")
    private String soapClient;

    @Autowired
    public AccountController(ApplicationContext context) {
        this.context = context;
    }

    @CrossOrigin
    @PostMapping(path = "/customer/read")
    public ResponseEntity<ReadCustomerAccountRs> readCustomerAccount(@RequestBody ReadCustomerAccountRq request) {
        log.info("Requesting readCustomerAccount for " + getJsonFromObject(request));
        ReadCustomerAccountRs response = ((SoapClient) context
                .getBean(soapClient))
                .readCustomerAccount(request);

        log.info("logging response: " + getJsonFromObject(response));
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    private String getJsonFromObject(Object object) {
        try {
            return new ObjectMapper().writeValueAsString(object);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }
}
