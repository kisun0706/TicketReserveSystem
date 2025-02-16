# 프로젝트 개요: 공연 티켓 신청 시스템 [![Hits](https://hits.seeyoufarm.com/api/count/incr/badge.svg?url=https%3A%2F%2Fgithub.com%2Fkisun0706%2FTicketReserveSystem&count_bg=%2379C83D&title_bg=%23555555&icon=&icon_color=%23E7E7E7&title=hits&edge_flat=false)](https://hits.seeyoufarm.com)

---
## 개발 기간
**2025-02-16 ~**

---
### 사용 기술
프레임워크 : Spring Boot (3.4.2)

언어 : Java 21

빌드 도구 : Gradle

데이터베이스 : H2 (테스트용), Mysql

테스트 : JUnit 5, Testcontainers

---
### 요구 사항
ERD, 시퀀스 다이어그램을 그려봅니다.

공연 티켓을 신청할 수 있는 서비스를 개발합니다.

공연 티켓 신청 및 신청자 목록 관리를 RDBMS를 이용해 관리할 방법을 고민합니다.

아래 3가지 API 를 구현합니다.
- 공연 티켓 신청 API
- 공연 티켓 신청 가능 목록 조회 API
- 공연 티켓 신청 완료 목록 조회 API

---
### 제약 사항
- 각 기능 및 제약 사항에 대해 단위 테스트를 반드시 하나 이상 작성하도록 합니다.
- API별 정상 시나리오, 예외 시나리오 등에 대한 테스트를 진행합니다.
- 다수의 인스턴스로 어플리케이션이 동작하더라도 기능에 문제가 없도록 작성하도록 합니다.
- 동시성 이슈를 고려합니다.
- 정확하게 30 명의 사용자에게만 공연 티켓을 제공할 방법을 고민해 봅니다.
- 같은 사용자에게 여러 번의 공연 티켓 슬롯이 제공되지 않도록 제한할 방법을 고민해 봅니다.
- Test 는 Mysql DB 로 작성합니다.
---
### API Specs
#### 공연 티켓 신청 API ()
- 특정 userId 로 선착순으로 제공되는 공연 티켓을 신청하는 API 를 작성합니다.
- 동일한 신청자는 동일한 강의에 대해서 한 번의 수강 신청만 성공할 수 있습니다.
- 공연 티켓은 선착순 30명만 신청 가능합니다.
- 이미 신청자가 30명이 초과 되면 이후 신청자는 요청을 실패합니다.

#### 공연 티켓 신청 가능 목록 API ()
- 날짜별로 현재 신청 가능한 공연 티켓 목록을 조회하는 API 를 작성합니다.
- 공연 티켓의 정원은 30명으로 고정이며, 사용자는 각 공연 티켓에 신청하기 전 목록을 조회해 볼 수 있어야 합니다.

#### 공연 티켓 신청 완료 목록 조회 API ()
- 특정 userId 로 신청 완료된 공연 티켓 목록을 조회하는 API 를 작성합니다.
- 각 항목은 공연 티켓 ID 및 이름, 강연자 정보를 담고 있어야 합니다.
