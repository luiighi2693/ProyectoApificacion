package com.banesco.rest;

import com.banesco.configuration.RestClient;
import com.banesco.configuration.soap.SoapClientService;
import com.banesco.util.Util;
import com.banesco.xmlns.applicationservice.apifinancialaccountoutappsvc.*;
import com.banesco.xmlns.enterpriseobjects.msgrqhdr.MsgRqHdr;
import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.xml.bind.JAXBElement;

@Controller
@Api(description = "Account Data API")
@RequestMapping(path = "/financial/account/")
public class FinancialAccountController {
    private Logger log = LoggerFactory.getLogger(FinancialAccountController.class);

    private final RestClient restClient;
    private final SoapClientService soapClientService;

    @Value( "${soap.financial.account.data.endpoint}" )
    private String soapEndpoint;

    @Value( "${soap.financial.account.data.readcustomeraccount.action}" )
    private String readAccountBalanceAction;

    @Value( "${soap.financial.account.data.transferbanescoaccount.action}" )
    private String transferBanescoAccountAction;

    @Value( "${soap.financial.account.data.transferotherbankaccount.action}" )
    private String transferOtherBankAccountAction;

    @Value( "${soap.financial.account.data.namespace}" )
    private String namespace;

    @Autowired
    public FinancialAccountController(RestClient restClient, SoapClientService soapClientService) {
        this.restClient = restClient;
        this.soapClientService = soapClientService;
    }

    @CrossOrigin
    @PostMapping(path = "/balance/read")
    public ResponseEntity<ReadAccountBalanceRsType> readAccountBalance(@RequestBody ReadAccountBalanceRqType request) {
        log.info("Requesting readAccountBalance for " + Util.getJsonFromObject(request));

        MsgRqHdr msgRqHdr = restClient.getHeader("readAccountBalance");

        String requestId = restClient.getRequestId();

        msgRqHdr.setRequestId(requestId);
        
        request.setMsgRqHdr(msgRqHdr);

        ObjectFactory objectFactory = new ObjectFactory();
        JAXBElement<ReadAccountBalanceRqType> reqjaxb = objectFactory.createReadAccountBalanceRq(request);

        ReadAccountBalanceRsType response = soapClientService.callSoapService(soapEndpoint, namespace + readAccountBalanceAction, reqjaxb);

        log.info("logging response: " + Util.getJsonFromObject(response));

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @CrossOrigin
    @PostMapping(path = "/banesco/transfer")
    public ResponseEntity<TransferBanescoAccountRs> transferBanescoAccount(@RequestBody TransferBanescoAccountRq request) {
        log.info("Requesting transferBanescoAccount for " + Util.getJsonFromObject(request));

        MsgRqHdr msgRqHdr = restClient.getHeader("transferBanescoAccount");

        String requestId = restClient.getRequestId();

        msgRqHdr.setRequestId(requestId);

        request.setMsgRqHdr(msgRqHdr);

        ObjectFactory objectFactory = new ObjectFactory();
        JAXBElement<TransferBanescoAccountRq> reqjaxb = objectFactory.createTransferBanescoAccountRq(request);

        TransferBanescoAccountRs response = soapClientService.callSoapService(soapEndpoint, namespace + transferBanescoAccountAction, reqjaxb);

        log.info("logging response: " + Util.getJsonFromObject(response));

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @CrossOrigin
    @PostMapping(path = "/otherbank/transfer")
    public ResponseEntity<TransferOtherBankAccountRs> transferOtherBankAccount(@RequestBody TransferOtherBankAccountRq request) {
        log.info("Requesting transferOtherBankAccount for " + Util.getJsonFromObject(request));

        MsgRqHdr msgRqHdr = restClient.getHeader("transferOtherBankAccount");

        String requestId = restClient.getRequestId();

        msgRqHdr.setRequestId(requestId);

        request.setMsgRqHdr(msgRqHdr);

        ObjectFactory objectFactory = new ObjectFactory();
        JAXBElement<TransferOtherBankAccountRq> reqjaxb = objectFactory.createTransferOtherBankAccountRq(request);

        TransferOtherBankAccountRs response = soapClientService.callSoapService(soapEndpoint, namespace + transferOtherBankAccountAction, reqjaxb);

        log.info("logging response: " + Util.getJsonFromObject(response));

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
