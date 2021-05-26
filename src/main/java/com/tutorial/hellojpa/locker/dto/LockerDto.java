package com.tutorial.hellojpa.locker.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.tutorial.hellojpa.employee.dto.EmployeeDto;
import com.tutorial.hellojpa.item.dto.ItemDto;
import com.tutorial.hellojpa.locker.entity.Locker;
import lombok.*;

import javax.persistence.OneToOne;
import java.util.ArrayList;
import java.util.List;

@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class LockerDto {
    private Long lockerIdx;
    private EmployeeDto employeeDto;
    private List<ItemDto> items;
}
