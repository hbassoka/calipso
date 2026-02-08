package com.jdevhub.calipso.mapper;




import java.util.List;
import java.util.stream.Collectors;

import com.jdevhub.calipso.dto.CustomerDto;
import com.jdevhub.calipso.model.Customer;

public class CustomerMapper {

    // Entity -> DTO
    public static CustomerDto toDto(Customer customer) {
        if (customer == null) return null;

        return new CustomerDto(
            customer.getId(),
            customer.getFirstname(),
            customer.getLastname(),
            customer.getEmail(),
            customer.getCreationDate()
        );
    }

    // DTO -> Entity
    public static Customer toEntity(CustomerDto dto) {
        if (dto == null) return null;

        Customer customer = new Customer();
        customer.setId(dto.id());
        customer.setFirstname(dto.firstname());
        customer.setLastname(dto.lastname());
        customer.setEmail(dto.email());
        customer.setCreationDate(dto.creationDate());

        return customer;
    }

    // Liste Entity -> Liste DTO
    public static List<CustomerDto> toDtoList(List<Customer> customers) {
        return customers.stream()
                        .map(CustomerMapper::toDto)
                        .collect(Collectors.toList());
    }
}