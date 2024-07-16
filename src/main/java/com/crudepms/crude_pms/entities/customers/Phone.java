package com.crudepms.crude_pms.entities.customers;

import com.crudepms.crude_pms.enums.PhoneType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Phone {

    @Id
    private int phoneId;
    private String phone_number;
    private PhoneType phoneType;

}
