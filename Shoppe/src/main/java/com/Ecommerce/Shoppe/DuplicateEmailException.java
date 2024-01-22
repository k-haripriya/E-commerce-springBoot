package com.Ecommerce.Shoppe;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.CONFLICT)
public class DuplicateEmailException extends Throwable {
    public DuplicateEmailException(String s) {

            super(s);

    }
}
