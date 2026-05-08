# Simple Memo Backend

Simple Memo는 초기 CRUD 학습을 위해 만든 메모장 백엔드 프로젝트입니다.

Spring Boot와 MyBatis, MySQL을 사용해 메모 등록, 조회, 수정, 삭제, 검색 요청 흐름을 연습하는 것을 목표로 구성했습니다.

이 프로젝트는 학습용 로컬 프로젝트이며, 로그인, 인증, 권한 관리, 배포 기능은 포함하지 않습니다.

## 기술 스택

- Java
- Spring Boot
- Spring Web MVC
- MyBatis
- MySQL
- Gradle

## 주요 기능

- 메모 등록
- 메모 목록 조회
- 메모 상세 조회
- 메모 수정
- 메모 삭제
- 메모 검색 요청
- MyBatis Mapper 기반 SQL 처리
- 프론트엔드 요청을 위한 CORS 설정

## API 목록

| Method | URL | 설명 |
|---|---|---|
| POST | `/memo` | 메모 작성 |
| GET | `/memo` | 메모 목록 조회 |
| GET | `/memo/{id}` | 메모 상세 조회 |
| GET | `/memo/search?keyword=...` | 메모 검색 요청 |
| PUT | `/memo` | 메모 수정 |
| DELETE | `/memo/{id}` | 메모 삭제 |

## DB 구조

MySQL에 `memo` 데이터베이스와 `memo` 테이블이 필요합니다.

예시 테이블 구조는 다음과 같습니다.

```sql
CREATE TABLE memo (
    id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(30) NOT NULL,
    contents VARCHAR(1000) NOT NULL,
    created_at DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at DATETIME ON UPDATE CURRENT_TIMESTAMP
);
```

## 실행 방법

### 1. MySQL 준비

MySQL에서 `memo` 데이터베이스를 생성합니다.

```sql
CREATE DATABASE memo;
```

이후 `memo` 테이블을 생성합니다.

### 2. DB 접속 정보 설정

`application.yaml`에 로컬 MySQL 접속 정보를 설정합니다.

```yaml
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/memo
    username: root
    password: your_password
```

### 3. 서버 실행

```bash
./gradlew bootRun
```

기본 실행 주소는 다음과 같습니다.

```text
http://localhost:8080
```

## 프로젝트 구조

```text
src/main/java
├── controller
├── service
├── mapper
└── config

src/main/resources
├── application.yaml
└── mapper XML
```

프로젝트 구조는 실제 파일명에 맞게 필요한 경우 조정합니다.

## 참고 사항

- 이 프로젝트는 CRUD 흐름을 익히기 위한 초기 학습용 프로젝트입니다.
- 프론트엔드와 연동하려면 Vue 프론트엔드 프로젝트가 별도로 실행되어야 합니다.
- 로그인, 회원가입, JWT 인증, 권한 관리는 포함하지 않습니다.
- 배포를 전제로 한 프로젝트가 아니며 로컬 실행 기준으로 작성되었습니다.
- 실서비스 수준의 예외 처리, 보안 처리, 운영 환경 구성은 포함하지 않습니다.
