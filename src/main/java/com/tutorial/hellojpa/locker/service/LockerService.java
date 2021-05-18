package com.tutorial.hellojpa.locker.service;

import com.tutorial.hellojpa.locker.dto.LockerDto;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface LockerService {
    public List<LockerDto> getAllLockers(LockerDto param);
    public LockerDto getLocker(LockerDto param);
}
