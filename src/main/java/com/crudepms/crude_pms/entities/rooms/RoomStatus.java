package com.crudepms.crude_pms.entities.rooms;


import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoomStatus {

    @Id
    private int roomStatus_id;
    private String roomStatus_name;
    private String roomStatus_description;
}
