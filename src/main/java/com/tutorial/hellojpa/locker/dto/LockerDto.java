package com.tutorial.hellojpa.locker.dto;

import com.tutorial.hellojpa.employee.dto.EmployeeDto;
import com.tutorial.hellojpa.item.dto.ItemDto;
import com.tutorial.hellojpa.locker.entity.Locker;
import lombok.*;

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
    private List<ItemDto> itemDtoList;

    public Locker toEntity(){
        return Locker.builder()
                .lockerIdx(this.lockerIdx)
                .employee(this.employeeDto.toEntity())
                //.itemList()
                .build();
    }

    public static List<LockerDto> toDtoList(List<Locker> lockerList){
        List<LockerDto> resultList = new ArrayList<>();
        for(Locker locker : lockerList){
            resultList.add(locker.toDto());
        }
        return resultList;
    }
}
