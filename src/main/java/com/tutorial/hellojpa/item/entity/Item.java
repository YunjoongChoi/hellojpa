package com.tutorial.hellojpa.item.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.tutorial.hellojpa.locker.entity.Locker;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long itemIdx;
    @Column
    private String itemName;
    @JsonBackReference
    @ManyToMany(mappedBy = "items")
    private List<Locker> lockers;
}
