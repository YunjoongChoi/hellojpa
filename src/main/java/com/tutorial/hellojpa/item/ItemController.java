package com.tutorial.hellojpa.item;

import com.tutorial.hellojpa.item.dto.ItemDto;
import com.tutorial.hellojpa.item.service.ItemService;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/item")
@Log
public class ItemController {
    private final ItemService itemService;

    @GetMapping({ "/all"})
    public List<ItemDto> getAllItems(){
        return itemService.getAllItems();
    }

    @GetMapping({"/{itemIdx}"})
    public ItemDto getItem(@PathVariable final Long itemIdx){
        return itemService.getItem(ItemDto.builder()
                                                .itemIdx(itemIdx)
                                            .build());
    }

    @GetMapping({"", "/"})
    public List<ItemDto> getItems(final Pageable pageable){
        return itemService.getItems(pageable);
    }
}
