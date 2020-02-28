package com.banesco.rest;

import com.banesco.util.Util;
import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Api(description = "util API")
@RequestMapping(path = "/util")
public class UtilController {
    private Logger log = LoggerFactory.getLogger(UtilController.class);

    @CrossOrigin
    @GetMapping(path = "/instance-id")
    public ResponseEntity<String> getInstanceId() {
        log.info("Requesting getInstanceId");
        String result;

        result = Util.instanceId;

        log.info("logging response: " + Util.getJsonFromObject(result));
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
