package com.acme.cxf.security;

import java.io.IOException;
import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.wss4j.common.ext.WSPasswordCallback;

public class ServerPasswordCallback implements CallbackHandler {

    @Override
    public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
        for (Callback cb : callbacks) {
            if (cb instanceof WSPasswordCallback pc) {
                // Définir le mot de passe selon l'utilisateur
                if ("testuser".equals(pc.getIdentifier())) {
                    pc.setPassword("testpass");
                }
            }
        }
    }
}
