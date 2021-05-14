package com.tutorial.hellojpa.locker.repository;

import com.tutorial.hellojpa.locker.entity.Locker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LockerRepository extends JpaRepository<Locker, Long> {
}
