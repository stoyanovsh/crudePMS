package com.crudepms.crude_pms.entities.rooms;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoomType {

    @Id
    private int roomTypeId;
    private String roomTypeName;
    private int roomTypeAdultOccupancy;
    private int roomTypeChildOccupancy;
    private int roomTypeMaxOccupancy;
    private int roomTypeMaxAdultOccupancy;
    private int roomTypeMaxChildOccupancy;
    private String roomTypeDescription;
    private int roomTypeRank;

}
