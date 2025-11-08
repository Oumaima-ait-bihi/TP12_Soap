package com.acme.cxf.service;

import jakarta.jws.WebService;

@WebService
public interface MySoapService {
    String sayHello(String name);
}
