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
    private int room_type_id;
    private String room_type_name;
    private int room_type_adult_occupancy;
    private int room_type_child_occupancy;
    private String room_type_description;

}
