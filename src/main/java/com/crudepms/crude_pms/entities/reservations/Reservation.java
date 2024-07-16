package com.crudepms.crude_pms.entities.reservations;

import com.crudepms.crude_pms.entities.customers.Customer;
import com.crudepms.crude_pms.entities.rooms.Room;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reservation {

    @Id
    @ManyToMany
    private int reservationId;
    private Customer customer;
    @ManyToOne
    private Agency reservationAgency;
    @ManyToOne
    private ReservationChannel reservationChannel;
    @ManyToMany
    private Room room;
    @ManyToOne
    private Contract contact_id;
    private Timestamp reservationDate;
    private Timestamp reservationBeginDate;
    private Timestamp reservationEndDate;
    private int reservationStatus;
    private String voucherNumber;
    private int roomOccupancy;
    private double reservationAmount;





}
