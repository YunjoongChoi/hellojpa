# 개요

- JPA 프로그래밍을 익히기 위한 프로젝트입니다.
- 위의 내용을 모두 다룰 수 있는 프로젝트를 백엔드 중점으로 간략히 코딩합니다.
- 화면을 생략합니다.
  - URL을 이용해 파라미터를 포함 모든 요청을 GET 방식으로 던지고, 그 결과를 JSON 형태로 받도록 합니다.
- 회사, 사원(1:N) 정도의 기능
  - N:1, N:N 관계를 활용할 수 있는 기능?
  
# 포함할 내용

- JPA 프로그래밍 연습
    - Spring Data JPA p539~
    - @Enumerated p124
    - @Temporal p124
    - Pageable, Sort p551
    - queryDSL p351, p429~
    - NativeSQL p352, p443~
    - @Query p549
    - @OneToMany
    - @ManyToOne
- TDD
    - JUnit5
    - Spring REST Docs

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
- Spring Web Services
- Thymeleaf (미사용 예정, 일단 포함)
- Spring Data JPA
- H2
- JUnit 5
- Spring REST Docs

## 기능

- 게시판 목록 조회, 특정 게시물 조회
- 특정 게시물의 댓글 조회

## 주요사항

- 화면 생략
    - 파라미터를 포함한 모든 요청을 URL을 이용해 GET방식으로 보내고, 결과는 JSON으로 확인한다.
- Test 코드 작성