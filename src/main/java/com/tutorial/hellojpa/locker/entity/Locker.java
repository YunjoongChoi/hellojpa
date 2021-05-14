package com.tutorial.hellojpa.locker.entity;

import com.tutorial.hellojpa.employee.entity.Employee;
import com.tutorial.hellojpa.locker.dto.LockerDto;
import com.tutorial.hellojpa.product.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Locker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long lockerIdx;
    @OneToOne
    @JoinColumn(name = "EMPLOYEE_IDX")
    private Employee employee;
    //@ManyToMany
    //private List<Product> productList;

    public LockerDto toDto(){
        return LockerDto.builder()
                .lockerIdx(this.lockerIdx)
                .employeeDto(this.employee.toDto())
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
