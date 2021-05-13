package com.tutorial.hellojpa.common.enumerate;

import lombok.Getter;

@Getter
public enum GenderType {
    MALE("남성")
    , FEMALE("여성");

    private String value;

    private GenderType(String value) {
        this.value = value;
    }
}
