package com.tutorial.hellojpa.locker.dto;

import com.tutorial.hellojpa.employee.dto.EmployeeDto;
import com.tutorial.hellojpa.employee.entity.Employee;
import com.tutorial.hellojpa.locker.entity.Locker;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class LockerDto {
    private Long lockerIdx;
    private EmployeeDto employeeDto;

    public Locker toEntity(){
        return Locker.builder()
                .lockerIdx(this.lockerIdx)
                .employee(this.employeeDto.toEntity())
                .build();
    }
}
