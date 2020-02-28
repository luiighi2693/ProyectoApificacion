package com.banesco.rest;

import com.banesco.util.Util;
import com.banesco.xmlns.enterpriseobjects.msgrshdr.MsgRsHdr;
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

import java.util.Arrays;
import java.util.List;

@RestController
@Api(description = "Dummy Header")
@RequestMapping(path = "/header")
public class HeaderController {
	private Logger log = LoggerFactory.getLogger(HeaderController.class);

	private String json = "[{\"privateChannelId\":null,\"finalStatusRequest\":\"2789\",\"countDataOut\":\"11\",\"headerTypeReg\":null,\"detailTypeReg\":null,\"transactionCode\":\"0003\",\"supervisorCode\":\"BAN0591W17\",\"operationType\":\"Multiple\",\"transactionConsecutive\":\"0000\",\"detailReg\":\"Transaccion finalizada con exito\",\"registerNumber\":[\"2789\"],\"transactionType\":\"0\",\"requestId\":\"20130227111522223\",\"requestedOperationType\":null,\"messageDate\":null,\"transactionTime\":null,\"lastStatusRequest\":null,\"returnValue\":null,\"requestStatus\":null,\"messageTime\":null,\"transacctionDate\":null,\"requestNumber\":null,\"appName\":\"AS400\"}]";

	@CrossOrigin
	@GetMapping(path = "/")
	public ResponseEntity<List<MsgRsHdr>> getHeader() {
		log.info("Requesting getHeader");
		MsgRsHdr[] result = null;

		try {
			result = new ObjectMapper().readValue(json, MsgRsHdr[].class);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}

		log.info("logging response: " + Util.getJsonFromObject(result));
		return new ResponseEntity<>(Arrays.asList(result), HttpStatus.OK);
	}
}
