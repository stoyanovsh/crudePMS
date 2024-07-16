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
    private int room_id;
    private RoomType room_type_id;
    private RoomStatus room_status_id;


}
