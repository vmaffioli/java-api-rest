package com.vmaffioli.apirest.exception;

import java.io.Serializable;

import lombok.Getter;

@Getter
public class ExceptionResponse implements Serializable {

    private Object retorno;
    private String mensagem;

    public ExceptionResponse(Object retorno, String mensagem) {
        super();
        this.retorno = retorno;
        this.mensagem = mensagem;

    }

}
