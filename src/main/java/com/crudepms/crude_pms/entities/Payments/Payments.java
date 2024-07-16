package com.crudepms.crude_pms.entities.Payments;


import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payments {

    @Id
    private int paymentId;
    private String paymentName;
    private double paymentAmount;
}
