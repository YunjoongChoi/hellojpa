package com.tutorial.hellojpa.common.enumerate;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum BooleanCodeType {
    Y(1, "1", "Y", true)
    , N(0, "0", "N", false);

    private final Integer numberType;
    private final String numberFormatStringType;
    private final String alphabetType;
    private final Boolean booleanType;
}
