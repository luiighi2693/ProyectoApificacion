package com.banesco.rest;

//public class ReadCustomerAccountController {
//}

import com.banesco.configuration.SoapClient;
import com.banesco.util.Util;
import com.banesco.xmlns.applicationservice.bnetfinancialaccountoutappsvc.ReadCustomerAccountRq;
import com.banesco.xmlns.applicationservice.bnetfinancialaccountoutappsvc.ReadCustomerAccountRs;
import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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

    private final SoapClient soapClient;

    @Autowired
    public AccountController(SoapClient soapClient) {
        this.soapClient = soapClient;
    }

    @CrossOrigin
    @PostMapping(path = "/customer/read")
    public ResponseEntity<ReadCustomerAccountRs> readCustomerAccount(@RequestBody ReadCustomerAccountRq request) {
        log.info("Requesting readCustomerAccount for " + Util.getJsonFromObject(request));
        ReadCustomerAccountRs response = soapClient.readCustomerAccount(request);

        log.info("logging response: " + Util.getJsonFromObject(response));
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
