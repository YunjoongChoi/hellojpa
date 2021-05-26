package com.tutorial.hellojpa.company.enumerate;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CompanyType {
    IT("IT")
    , FINANCE("금융")
    , SEMICONDUCTOR("반도체");

    private final String value;
}
