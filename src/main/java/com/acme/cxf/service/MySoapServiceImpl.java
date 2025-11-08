package com.acme.cxf.service;

import jakarta.jws.WebService;

@WebService(endpointInterface = "com.acme.cxf.service.MySoapService")
public class MySoapServiceImpl implements MySoapService {
    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
