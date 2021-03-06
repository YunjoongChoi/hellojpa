package com.tutorial.hellojpa.locker;

import com.tutorial.hellojpa.locker.dto.LockerDto;
import com.tutorial.hellojpa.locker.service.LockerService;
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
@RequestMapping("/locker")
@Log
public class LockerController {
    private final LockerService lockerService;

    @GetMapping({"/all"})
    public List<LockerDto> getAllLockers(){
        return lockerService.getAllLockers();
    }

    @GetMapping({"/{lockerIdx}"})
    public LockerDto getLocker(@PathVariable final Long lockerIdx){
        return lockerService.getLocker(LockerDto.builder()
                                                    .lockerIdx(lockerIdx)
                                                .build());
    }

    @GetMapping({"", "/"})
    public List<LockerDto> getLockers(final Pageable pageable){
        return lockerService.getLockers(pageable);
    }
}
