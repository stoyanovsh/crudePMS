package com.crudepms.crude_pms.entities.reservations;


import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Contract {

    @Id
    @ManyToMany
    private int contractID;

}
