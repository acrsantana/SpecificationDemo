package br.com.acrtech.specificationdemo.repository;

import br.com.acrtech.specificationdemo.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ClientRepository extends
        JpaRepository<Client, Long>,
        JpaSpecificationExecutor<Client>,
        PagingAndSortingRepository<Client, Long> {
}