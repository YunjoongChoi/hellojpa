package com.tutorial.hellojpa.locker.entity;

import com.tutorial.hellojpa.employee.entity.Employee;
import com.tutorial.hellojpa.item.dto.ItemDto;
import com.tutorial.hellojpa.item.entity.Item;
import com.tutorial.hellojpa.locker.dto.LockerDto;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Builder
@Setter
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
    @ManyToMany
    private List<Item> itemList;
}
