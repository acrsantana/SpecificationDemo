package br.com.acrtech.specificationdemo.controller;

import br.com.acrtech.specificationdemo.entity.Client;
import br.com.acrtech.specificationdemo.queryfilter.ClientQueryFilter;
import br.com.acrtech.specificationdemo.service.ClientService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clients")
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping
    public ResponseEntity<Page<Client>> findAll(ClientQueryFilter filter, Pageable pageable) {
        return ResponseEntity.ok(clientService.findAll(filter.toSpecification(), pageable));
    }
}
