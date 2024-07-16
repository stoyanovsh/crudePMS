package com.crudepms.crude_pms.entities.customers;


import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    @Id
    private int addressId;
    private int countryId;
    private String address;


}
