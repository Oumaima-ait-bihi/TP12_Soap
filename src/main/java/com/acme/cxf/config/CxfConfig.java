package com.acme.cxf.config;

import com.acme.cxf.service.MySoapService;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import jakarta.xml.ws.Endpoint;

@Configuration
public class CxfConfig {

    private final MySoapService mySoapService;

    public CxfConfig(MySoapService mySoapService) {
        this.mySoapService = mySoapService;
    }

    @Bean
    public Endpoint endpoint(Bus bus) {
        EndpointImpl endpoint = new EndpointImpl(bus, mySoapService);
        endpoint.publish("/myService");
        return endpoint;
    }
}
