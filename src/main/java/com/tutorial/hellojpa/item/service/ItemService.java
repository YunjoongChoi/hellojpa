package com.tutorial.hellojpa.item.service;

import com.tutorial.hellojpa.item.dto.ItemDto;

import java.util.List;

public interface ItemService {
    public List<ItemDto> getItemList(ItemDto param);
    public ItemDto getItem(ItemDto param);
}
