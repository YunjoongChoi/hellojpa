package com.tutorial.hellojpa.employee.enumerate;

import lombok.Getter;

@Getter
public enum EmployeePositionType {
    PLANNER("기획자")
    , DESIGNER("디자이너")
    , FRONT_END("프론트엔드 개발자")
    , BACK_END("백엔드 개발자")
    , DATA_ENGINEER("데이터 엔지니어");

    private String value;

    private EmployeePositionType(String value) {
        this.value = value;
    }
}
