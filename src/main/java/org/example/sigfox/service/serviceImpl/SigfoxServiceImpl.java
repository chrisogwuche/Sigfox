package org.example.sigfox.service.serviceImpl;

import kong.unirest.JsonObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.sigfox.entity.Sigfox;
import org.example.sigfox.repository.SigfoxRepository;
import org.example.sigfox.service.SigfoxService;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@RequiredArgsConstructor
public class SigfoxServiceImpl implements SigfoxService {

    private final JsonObjectMapper jsonObjectMapper;
    private final SigfoxRepository sigfoxRepository;


    @Override
    public String sigfoxHandler(String data) {
        saveSigFoxToDatabase(mapToSigFox(data));
        return data;
    }

    private void saveSigFoxToDatabase(Sigfox sigfox){
        sigfoxRepository.save(sigfox);
        log.info("sigfox data saved to database");
    }

    private Sigfox mapToSigFox(String data){
        return jsonObjectMapper.readValue(data, Sigfox.class);
    }
}
