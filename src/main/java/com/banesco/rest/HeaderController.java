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
import org.springframework.web.bind.annotation.*;

@RestController
@Api(description = "Dummy Header")
@RequestMapping(path = "/header")
public class HeaderController {
	private Logger log = LoggerFactory.getLogger(HeaderController.class);

	@CrossOrigin
	@GetMapping(path = "/{headerName}")
	public ResponseEntity<MsgRqHdr> getHeader(@PathVariable String headerName) {
		log.info("Requesting getHeader");

		MsgRqHdr result = Util.getHeader(headerName);

		log.info("logging response: " + Util.getJsonFromObject(result));
		return new ResponseEntity<>(result, HttpStatus.OK);
	}
}
