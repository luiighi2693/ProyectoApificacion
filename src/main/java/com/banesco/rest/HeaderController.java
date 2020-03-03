package com.banesco.rest;

import com.banesco.util.Util;
import com.banesco.xmlns.enterpriseobjects.msgrqhdr.MsgRqHdr;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(description = "Dummy Header")
@RequestMapping(path = "/header")
public class HeaderController {
	private Logger log = LoggerFactory.getLogger(HeaderController.class);

	//private String json ="{\"lineId\":\"0\",\"messageDate\":\"2011-01-20\",\"messageTime\":\"15:34:01\",\"networkTrnInfo\":[{\"agencyCode\":\"591\",\"bankId\":\"01\",\"channelId\":\"INT\",\"channelUserId\":\"ADOBRO-00010\",\"operationType\":\"Multiple\",\"originatorName\":null,\"registerNumber\":\"2789\",\"transactionCode\":\"0003\",\"transactionConsecutive\":\"0000\",\"transactionDate\":\"2011-01-20\",\"transactionTime\":\"15:04:02\",\"transactionType\":\"0\"}],\"operatorCode\":\"BAN0591W01\",\"requestId\":\"20130227111522223\",\"resumeId\":\"0\",\"reverseId\":\"0\",\"sourceChannelCode\":\"INT\",\"supervisorCode\":\"BAN0591W17\"}";
	private String jsonCreditCard_readCreditCardBalance  = "{\"messageDate\": \"2011-01-20\",\"messageTime\": \"15:34:01\",\"requestId\": \"\",\"resumeId\": \"0\",\"reverseId\": \"0\",\"lineId\": \"0\",\"sourceChannelCode\": \"INT\",\"supervisorCode\": \"BAN0591W17\",\"operatorCode\": \"BAN0591W01\",\"networkTrnInfo\": [{\"transactionConsecutive\": \"04120\",\"registerNumber\": \"2142\",\"operationType\": \"0\",\"transactionType\": \"0\",\"transactionCode\": \"8714\",\"transactionDate\": \"2011-01-20\",\"transactionTime\": \"15:04:02\",\"bankId\": \"01\",\"agencyCode\": \"591\",\"channelId\": \"INT\",\"channelUserId\": \"string\"}]}";
	
	@CrossOrigin
	@GetMapping(path = "/")
	public ResponseEntity<MsgRqHdr> getHeader() {
		log.info("Requesting getHeader");
		MsgRqHdr result = null;

		try {
			//result = new ObjectMapper().readValue(json, MsgRqHdr.class);
			result = new ObjectMapper().readValue(jsonCreditCard_readCreditCardBalance, MsgRqHdr.class);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}

		log.info("logging response: " + Util.getJsonFromObject(result));
		return new ResponseEntity<>(result, HttpStatus.OK);
	}
}
