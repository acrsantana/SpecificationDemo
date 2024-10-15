package br.com.acrtech.specificationdemo.service;

import br.com.acrtech.specificationdemo.entity.Client;
import br.com.acrtech.specificationdemo.repository.ClientRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public Page<Client> findAll(Specification<Client> filter, Pageable pageable) {
        return clientRepository.findAll(filter, pageable);
    }
}
