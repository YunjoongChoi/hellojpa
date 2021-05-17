package com.tutorial.hellojpa.item.service;

import com.tutorial.hellojpa.item.dto.ItemDto;
import com.tutorial.hellojpa.item.repository.ItemRepository;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Log
public class ItemServiceImpl implements ItemService{
    private final ItemRepository itemRepository;

    @Override
    public List<ItemDto> getItemList(ItemDto param) {
        return ItemDto.toDtoList(itemRepository.findAll());
    }

    @Override
    public ItemDto getItem(ItemDto param) {
        return itemRepository.findById(param.getItemIdx()).get().toDto();
    }
}
