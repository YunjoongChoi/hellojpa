# 개요

- JPA 프로그래밍을 익히기 위한 프로젝트입니다.
- 아래의 내용을 모두 다룰 수 있는 프로젝트를 백엔드 중점으로 간략히 코딩합니다.
- 화면을 생략합니다.
  - 모든 요청을 URL을 이용한 GET 방식으로 보내고, 그 결과를 JSON 형태로 받도록 합니다.
- 회사, 사원(1:N) 정도의 도메인
  - N:1, N:N 관계를 활용할 수 있는 기능?
  
# 포함할 내용

- DDD
  - 디렉토리 구성을 도메인 단위로 가져간다.
- JPA
    - `Spring Data JPA`
    - `@Enumerated`
    - `@Temporal`
    - `@Lob`
    - `@OneToMany`
    - `@ManyToOne`
    - `@OneToOne`
    - `@ManyToMany`
    - `ModelMapper`
    - `MapStruct`
    - `Pageable`, `Sort`
    - `JPA 메소드 네임 쿼리`
- TDD
    - `JUnit5`
    - `Spring REST Docs`

# 작업사항

## 프로젝트명

> hellojpa

- groupid : com.tutorial
- artifactid : hellojpa

## 스택

- Java 8
- Spring Boot 2.4.5
- Spring Boot Devtools
- Lombok
- Spring Configuration Processor
- Spring Web MVC
- Spring Data JPA
- H2
- ModelMapper 2.3.0
- MapStruct 1.4.2
- JUnit 5
- Spring REST Docs

## 기능

- 회사, 사원, 라커룸, 물건 조회

## 주요사항

- 화면 생략
    - 모든 요청을 URL을 이용한 GET방식으로 보내고, 결과는 JSON으로 확인한다.
- Test 코드 작성