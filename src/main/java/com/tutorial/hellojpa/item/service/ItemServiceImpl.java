package com.tutorial.hellojpa.item.service;

import com.tutorial.hellojpa.item.dto.ItemDto;
import com.tutorial.hellojpa.item.entity.Item;
import com.tutorial.hellojpa.item.repository.ItemRepository;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
@Log
public class ItemServiceImpl implements ItemService{
    private final ItemRepository itemRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<ItemDto> getAllItems() {
        return itemRepository.findAll()
                            .stream()
                            .map(Item -> modelMapper.map(Item, ItemDto.class))
                            .collect(Collectors.toList());
    }

    @Override
    public ItemDto getItem(ItemDto param) {
        return modelMapper.map(itemRepository.findById(param.getItemIdx())
                                                .orElse(Item.builder()
                                                            .build()), ItemDto.class);
    }

    @Override
    public List<ItemDto> getItems(Pageable pageable) {
        return itemRepository.findAll(pageable)
                                .stream()
                                .map(Item -> modelMapper.map(Item, ItemDto.class))
                                .collect(Collectors.toList());
    }
}
