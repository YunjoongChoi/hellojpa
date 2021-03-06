package com.tutorial.hellojpa.locker.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.tutorial.hellojpa.employee.entity.Employee;
import com.tutorial.hellojpa.item.entity.Item;
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
    @JsonManagedReference
    @OneToOne
    @JoinColumn(name = "EMPLOYEE_IDX")
    private Employee employee;
    @JsonManagedReference
    @ManyToMany
    private List<Item> items;
}
