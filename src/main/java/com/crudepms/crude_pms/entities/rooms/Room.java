package com.crudepms.crude_pms.entities.rooms;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Room {

    @Id
    private int roomId;
    private RoomType roomTypeId;
    private RoomStatus roomStatusId;
    private int roomCapacity;
    private int roomCategoryLevel;
    private int roomFloor;



}
