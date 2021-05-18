package com.tutorial.hellojpa.item.service;

import com.tutorial.hellojpa.item.dto.ItemDto;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ItemService {
    public List<ItemDto> getAllItems(ItemDto param);
    public ItemDto getItem(ItemDto param);
    List<ItemDto> getItems(ItemDto param, Pageable pageable);
}
