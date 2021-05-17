package com.tutorial.hellojpa.item.entity;

import com.tutorial.hellojpa.item.dto.ItemDto;
import com.tutorial.hellojpa.locker.dto.LockerDto;
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
    @ManyToMany(mappedBy = "itemList")
    private List<Locker> lockerList;

    public ItemDto toDto(){
        return ItemDto.builder()
                .itemIdx(this.itemIdx)
                .itemName(this.itemName)
                .lockerDtoList(LockerDto.toDtoList(this.lockerList))
                .build();
    }
}