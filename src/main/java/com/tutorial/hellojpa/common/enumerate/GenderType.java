package com.tutorial.hellojpa.common.enumerate;

import lombok.Getter;

@Getter
public enum GenderType {
    MALE("남자")
    , FEMALE("여자");

    private String value;

    private GenderType(String value) {
        this.value = value;
    }
}
