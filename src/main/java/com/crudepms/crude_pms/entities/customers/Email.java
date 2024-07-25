package com.crudepms.crude_pms.entities.customers;


import com.crudepms.crude_pms.enums.EmailType;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Email {

    @ManyToMany
    private int emailId;
    private String email;
    private EmailType emailType;

}
