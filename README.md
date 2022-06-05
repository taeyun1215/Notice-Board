# Toy-project

## 1. 개요

- 프로젝트 명칭 : Notice Board
- 개발 인원 : 2명(이태윤, 김근회)
- 개발 기간 : 2021.06.01 ~ 미정
- 주요 기능 :
  - 게시판 - CRUD 기능, 조회수, 페이징 및 검색 처리
  - 사용자 - Security 회원가입 및 로그인, 카카오 로그인, 회원 정보 수정, 유효성 검사 및 중복 검사
  - 댓글 - CRUD 기능 
- 개발 언어 : Java 11
- 개발 환경 : SpringBoot 2.7.0, gradle 7.2, jpa(Spring Data JPA), Spring Security, Oauth 2.0, mustache
- 데이터베이스 : MySQL, MariaDB
- 형상관리 툴 : GitHub
- 간단 소개 : 전반적인 웹의 기본 소양이 되는 게시판

## 2. 요구사항 분석
### 회원 가입 페이지
- 유효성 검사
- 중복확인

### 로그인 페이지
- 로그인 검사
- 로그인을 하지 않은 경우 아래 페이지만 이용가능
  - 회원가입 페이지
  - 로그인 페이지
  - 게시글 목록 조회 페이지
  - 게시글 상세보기 페이지
  - 게시글 검색 페이지

### 회원정보 수정
- 회원정보 수정은 닉네임, 비밀번호만 가능
- 닉네임 중복확인

### 소셜 로그인 기능 만들기
- 네이버 로그인 구현
- 기존 데이터 베이스에 존재한다면 기존 회원 데이터 정보를 유지

## ERD
![image](https://user-images.githubusercontent.com/65766105/171630353-ed780d32-0c91-471e-ac4d-f60db07bed27.png)

### User
![image](https://user-images.githubusercontent.com/65766105/171630759-23d8d6d2-4291-4208-9797-660a0a630688.png)

### Post
![image](https://user-images.githubusercontent.com/65766105/171630806-418b54e2-406d-402b-8171-f0b954b670d8.png)

### Comment
![image](https://user-images.githubusercontent.com/65766105/171630895-705014fc-e4e9-44c7-b44e-5b963b60542e.png)

## API설계
### 회원 API
![image](https://user-images.githubusercontent.com/65766105/171631001-f78277ca-b4be-4640-9555-3e68c2b271c8.png)

### 게시글 API
![image](https://user-images.githubusercontent.com/65766105/171631078-97e2b996-10dc-4bd1-832e-8fd54462313e.png)




## 주차별 회고
### 1주차
