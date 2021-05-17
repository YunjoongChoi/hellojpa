package com.tutorial.hellojpa.item.entity;

import com.tutorial.hellojpa.item.dto.ItemDto;
import com.tutorial.hellojpa.locker.dto.LockerDto;
import com.tutorial.hellojpa.locker.entity.Locker;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long itemIdx;
    @Column
    private String itemName;
    @ManyToMany
    private List<Locker> lockerList;

    public ItemDto toDto(){
        return ItemDto.builder()
                .itemIdx(this.itemIdx)
                .itemName(this.itemName)
                .lockerDtoList(LockerDto.toDtoList(this.lockerList))
                .build();
    }
}
