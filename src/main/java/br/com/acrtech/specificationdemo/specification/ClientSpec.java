package br.com.acrtech.specificationdemo.specification;

import br.com.acrtech.specificationdemo.entity.Client;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.util.ObjectUtils;

public class ClientSpec {

    public static Specification<Client> nameContains(String name) {
        return (root, query, criteriaBuilder) -> {
            if (ObjectUtils.isEmpty(name)) {
                return null;
            }
            return criteriaBuilder.like(root.get("name"), "%" + name + "%");
        };
    }

    public static Specification<Client> cpfIsEqual(String cpf) {
        return (root, query, criteriaBuilder) -> {
            if (ObjectUtils.isEmpty(cpf)) {
                return null;
            }
            return criteriaBuilder.equal(root.get("cpf"), cpf);
        };
    }

    public static Specification<Client> rgIsEqual(String rg) {
        return (root, query, criteriaBuilder) -> {
            if (ObjectUtils.isEmpty(rg)) {
                return null;
            }
            return criteriaBuilder.equal(root.get("rg"), rg);
        };
    }
}
