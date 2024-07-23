package org.example.sigfox.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.sigfox.service.SigfoxService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/devices")
@CrossOrigin("**")
@Slf4j
public class sigfoxController {

    private final SigfoxService sigfoxService;

    @PostMapping("callback")
    public String sigfoxHandler(@RequestBody String data){
        log.info("incoming sigfox data");
        return sigfoxService.sigfoxHandler(data);

    }
}
