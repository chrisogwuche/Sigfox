package org.example.sigfox.service;

import org.springframework.stereotype.Service;

@Service
public interface SigfoxService {

    String sigfoxHandler(String data);
}
