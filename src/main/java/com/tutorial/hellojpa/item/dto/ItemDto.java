package com.tutorial.hellojpa.item.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.tutorial.hellojpa.locker.dto.LockerDto;
import lombok.*;

import java.util.List;

@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ItemDto {
    private Long itemIdx;
    private String itemName;
    @JsonBackReference
    private List<LockerDto> lockers;
}
