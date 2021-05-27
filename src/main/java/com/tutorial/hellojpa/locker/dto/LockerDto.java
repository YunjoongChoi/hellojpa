package com.tutorial.hellojpa.locker.dto;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.tutorial.hellojpa.employee.dto.EmployeeDto;
import com.tutorial.hellojpa.item.dto.ItemDto;
import lombok.*;

import java.util.List;

@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class LockerDto {
    private Long lockerIdx;
    @JsonManagedReference
    private EmployeeDto employee;
    @JsonManagedReference
    private List<ItemDto> items;
}
