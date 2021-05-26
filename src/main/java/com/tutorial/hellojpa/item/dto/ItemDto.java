package com.tutorial.hellojpa.item.dto;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.tutorial.hellojpa.item.entity.Item;
import com.tutorial.hellojpa.locker.dto.LockerDto;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ItemDto {
    private Long itemIdx;
    private String itemName;
    @JsonManagedReference
    private List<LockerDto> lockers;
}
