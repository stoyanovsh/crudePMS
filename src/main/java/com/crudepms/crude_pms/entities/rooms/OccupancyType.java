package com.crudepms.crude_pms.entities.rooms;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OccupancyType {

    private int occupancyTypeId;
    private String occupancyTypeName;
}

