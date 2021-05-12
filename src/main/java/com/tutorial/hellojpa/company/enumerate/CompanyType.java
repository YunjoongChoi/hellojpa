package com.tutorial.hellojpa.company.enumerate;

import lombok.Getter;

@Getter
public enum CompanyType {
    IT("IT")
    , FINANCE("금융")
    , SEMICONDUCTOR("반도체");

    private String value;

    private CompanyType(String value) {
        this.value = value;
    }
}
