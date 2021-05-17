package com.tutorial.hellojpa.locker.service;

import com.tutorial.hellojpa.locker.dto.LockerDto;
import com.tutorial.hellojpa.locker.entity.Locker;
import com.tutorial.hellojpa.locker.repository.LockerRepository;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Log
public class LockerServiceImpl implements LockerService{
    private final LockerRepository lockerRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<LockerDto> getLockerList(LockerDto param, Pageable pageable) {
        return LockerDto.toDtoList(lockerRepository.findAll());
    }

    @Override
    public LockerDto getLocker(LockerDto param) {
        return modelMapper.map(lockerRepository.findById(param.getLockerIdx())
                                                                .orElse(Locker.builder()
                                                                                .build()), LockerDto.class);
    }
}
