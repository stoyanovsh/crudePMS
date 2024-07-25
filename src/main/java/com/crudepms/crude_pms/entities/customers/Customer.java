package com.crudepms.crude_pms.entities.customers;


import com.crudepms.crude_pms.entities.Payments.Payments;
import com.crudepms.crude_pms.entities.reservations.Reservation;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.sql.Timestamp;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    @Id
    private int customerId;
    private String firstName;
    private String middleName;
    private String lastName;
    private int identificationNumber;
    private String passportNumber;
    private Timestamp birthDate;
    private Timestamp passportExpiryDate;
    private Timestamp passportRegistrationDate;
    private String email;
    private List<Phone> phoneNumberList;
    @OneToMany
    private List<Address> addressList;
    @OneToMany
    private List<Reservation> reservationsList;
    @OneToMany
    private List<Payments>  paymentsList;
    private List<Email> emailList;


}
