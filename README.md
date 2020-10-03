# jwp-chess
웹 기반 체스 게임 구현을 위한 저장소

## 미션 회고 및 학습 내용

### 미션 포인트 ⏰ 
   - Spark를 Spring으로 변환하는 미션
   - 어노테이션을 활용하여 개발한다.
   - 스프링의 간략한 사용법을 파악한다.
   - 컴포넌트 스캔 등 스프링의 동작원리를 간단하게 파악한다.
### 학습 내용 📖
   - 다양한 어노테이션에 대한 학습
      - PathVariable
      - ModelAttribute
      - Controller / RestController
      - Service
      - Repository
      - RequestBody / ResponseBody
      - Valid
   - Controller, Service, Repository의 역할 이해
   - 간략하게 스프링의 동작 방식 이해
      - 요청을 Dispatcher Servlet이 받고, URL,객체 등을 분리하여 Controller로 매핑시켜줌.
      - 요청을 Service, Repository로 위임해가며 처리한 이후 반환함.
      - 반환할 때는 Json형태, ViewResolving 두가지가 대표적으로 사용 됨.

## 요구사항
- [x] 스프링 애플리케이션을 통해 시작
- [x] 도메인 객체가 아니며 재사용 할 객체를 스프링 빈을 활용하여 관리하기
## 프로그래밍 요구사항
- [x] 스프링 애플리케이션으로 체스가 실행 가능 해야한다.
- [x] @Controller나 @RestController를 활용하여 요청을 받아야 한다.
- [x] 웹 UI를 적용할 때 도메인 객체의 변경을 최소화해야한다.
- [x] 스프링 빈임을 나타내는 애너테이션(@Component, @Service 등)을 활용한다.
- [x] 컴포넌트 스캔을 통해 빈 등록하여 사용한다.
