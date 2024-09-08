package br.com.misaeldev.simuladorseguro.utils;
import org.springframework.http.ResponseEntity;



public interface Resource {
    default <T> ResponseEntity<Response<T>> retornaResponse(final Integer status, final T response) {
        return  ResponseEntity.status(status).body(new Response(status,response));
    }
    default <T> ResponseEntity<Response<T>> retornaSucesso(final T response) {
        return  this.retornaResponse(200,response);
    }
}
