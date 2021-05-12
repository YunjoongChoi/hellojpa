package com.tutorial.hellojpa.common.enumerate;

import lombok.Getter;

@Getter
public enum BooleanCodeType {
    Y(1, "1", "Y", true)
    , N(0, "0", "N", false);

    private Integer numberType;
    private String numberFormatStringType;
    private String alphabetType;
    private Boolean booleanType;

    private BooleanCodeType(Integer numberType, String numberFormatStringType, String alphabetType, Boolean booleanType) {
        this.numberType = numberType;
        this.numberFormatStringType = numberFormatStringType;
        this.alphabetType = alphabetType;
        this.booleanType = booleanType;
    }
}
