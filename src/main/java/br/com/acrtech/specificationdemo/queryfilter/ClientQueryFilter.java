package br.com.acrtech.specificationdemo.queryfilter;

import br.com.acrtech.specificationdemo.entity.Client;
import br.com.acrtech.specificationdemo.specification.ClientSpec;
import lombok.Data;
import org.springframework.data.jpa.domain.Specification;

@Data
public class ClientQueryFilter {
    private String name;
    private String cpf;
    private String rg;

    public Specification<Client> toSpecification() {
        return ClientSpec.nameContains(name)
                .and(ClientSpec.cpfIsEqual(cpf))
                .and(ClientSpec.rgIsEqual(rg));
    }
}
