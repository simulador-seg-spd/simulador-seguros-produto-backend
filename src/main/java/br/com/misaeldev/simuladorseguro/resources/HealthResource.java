package br.com.misaeldev.simuladorseguro.resources;

import br.com.misaeldev.simuladorseguro.utils.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.misaeldev.simuladorseguro.utils.Resource;

@RestController
@RequestMapping("/produto")
public class HealthResource implements Resource {
    @GetMapping("/health")
    public ResponseEntity<Response<String>> getHealth(){
        return retornaSucesso("Ok");
    }
}

