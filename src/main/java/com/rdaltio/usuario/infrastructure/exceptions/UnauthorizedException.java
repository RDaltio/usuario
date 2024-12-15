package com.rdaltio.usuario.infrastructure.exceptions;

import javax.naming.AuthenticationException;

public class UnauthorizedException extends AuthenticationException {
    public UnauthorizedException(String mensagem){
        super(mensagem);
    }

}
