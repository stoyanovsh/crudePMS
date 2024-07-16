package com.crudepms.crude_pms.entities.customers;


import com.crudepms.crude_pms.entities.Payments.Payments;
import com.crudepms.crude_pms.entities.reservations.Reservation;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    @Id
    private int customerId;
    private String first_name;
    private String middle_name;
    private String last_name;
    private List<Phone> phoneNumberList;
    private Address current_address;
    private Address company_address;
    private List<Reservation> reservationsList;
    private List<Payments>  paymentsList;
    private double totalPayments;
}
