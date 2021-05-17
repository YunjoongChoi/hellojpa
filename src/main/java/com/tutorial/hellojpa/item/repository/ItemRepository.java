package com.tutorial.hellojpa.item.repository;

import com.tutorial.hellojpa.item.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
