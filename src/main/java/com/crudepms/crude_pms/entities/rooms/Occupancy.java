package com.crudepms.crude_pms.entities.rooms;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Occupancy {

    @Id
    private int occupancyId;
    private Occupancy occupancy;
    private Room room;

}
