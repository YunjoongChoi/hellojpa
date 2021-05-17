package com.tutorial.hellojpa.item.dto;

import com.tutorial.hellojpa.item.entity.Item;
import com.tutorial.hellojpa.locker.dto.LockerDto;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ItemDto {
    private Long itemIdx;
    private String itemName;
    private List<LockerDto> lockerDtoList;

    public Item toEntity(){
        return Item.builder()
                .itemIdx(this.itemIdx)
                .itemName(this.itemName)
                //.lockerList()
                .build();
    }

    public static List<ItemDto> toDtoList(List<Item> itemList){
        List<ItemDto> resultList = new ArrayList<>();
        for(Item item : itemList){
            resultList.add(item.toDto());
        }
        return resultList;
    }
}
