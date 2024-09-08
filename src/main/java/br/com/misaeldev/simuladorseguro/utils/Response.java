package br.com.misaeldev.simuladorseguro.utils;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;


public class Response<T> implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private LocalDateTime timestamp;
    private Integer status;
    private String message;
    private String projeto;
    private transient T dados;

    public Response(final Integer status, final T dados) {
        this.timestamp = LocalDateTime.now();
        this.status = status;
        this.dados = dados;
        this.projeto = System.getenv("NOME_PROJETO");
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getProjeto() {
        return projeto;
    }

    public void setProjeto(String projeto) {
        this.projeto = projeto;
    }

    public T getDados() {
        return dados;
    }

    public void setDados(T dados) {
        this.dados = dados;
    }
}
