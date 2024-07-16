package com.crudepms.crude_pms.entities.reservations;

import com.crudepms.crude_pms.entities.customers.Customer;
import com.crudepms.crude_pms.entities.rooms.Occupancy;
import com.crudepms.crude_pms.entities.rooms.Room;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.List;

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
    private List<Room> room;
    @ManyToOne
    private Contract contact;
    private Timestamp reservationDate;
    private Timestamp reservationBeginDate;
    private Timestamp reservationEndDate;
    private int reservationStatus;
    private String voucherNumber;
    private double reservationAmount;
    private String comment;
    private Occupancy occupancy;






}
