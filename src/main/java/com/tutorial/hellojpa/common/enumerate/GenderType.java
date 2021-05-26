package com.tutorial.hellojpa.common.enumerate;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum GenderType {
    MALE("남성")
    , FEMALE("여성");

    private final String value;
}
