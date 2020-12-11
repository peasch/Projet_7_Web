package com.peasch.webbooks.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.FORBIDDEN)
public class BadMotDePasseEception extends Exception {
    public BadMotDePasseEception(String mot_de_passe_incorrect) {
        super(mot_de_passe_incorrect);
    }
}
