package com.banesco.rest;

import com.banesco.util.Util;
import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(description = "Id Generator")
@RequestMapping(path = "/generator/id")
public class GeneratorIdController {
    private Logger log = LoggerFactory.getLogger(GeneratorIdController.class);

    @CrossOrigin
    @GetMapping(path = "/instance-id")
    public ResponseEntity<String> getInstanceId() {
        log.info("Requesting getInstanceId");

        String result = Util.getInstanceId();

        log.info("logging response: " + result);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @CrossOrigin
    @GetMapping(path = "/request-id/{instanceId}")
    public ResponseEntity<String> getRequestId(@PathVariable String instanceId) {
        log.info("Requesting getInstanceId");

        String result = Util.getRequestId(instanceId);

        log.info("logging response: " + result);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
