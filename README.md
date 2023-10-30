# 카카오 테크 캠퍼스 - 카카오 쇼핑하기
## 개요
카카오 테크 캠퍼스 2단계 프로젝트
+ 카카오 쇼핑하기 클론 프로젝트
+ 2023.06 ~ 2023.08 (6주간 진행)

## 배포 주소 (~ 2023.09)
카카오 크램폴린 측 종료로 현재는 접속 불가
+ 배포한 주소 : https://user-app.krampoline.com/kd581462908d6a/
+ API 문서 주소 : https://user-app.krampoline.com/kd581462908d6a/api/docs/api-docs.html

## 사용 스택
<img src = https://github.com/jminkkk/kakao-shop/assets/102847513/08f60309-4fad-401d-b287-a483e3eb7132 width = 40%>


## 구현 기능 및 시연 화면

|회원가입|로그인|
|---|---|
|![회원가입](https://github.com/jminkkk/kakao-shop/assets/102847513/2ab9d7c2-0673-4f5b-9c87-93d6cbe69ad4)|![로그인](https://github.com/jminkkk/kakao-shop/assets/102847513/ae965d97-ccd5-4dc8-8c40-8165fe7c43d1)|

|인증되지 않은 사용자 처리|장바구니|
|---|---|
|![로그인XX](https://github.com/jminkkk/kakao-shop/assets/102847513/2e40d83e-3859-4475-a725-d68e6527160e)|![장바구니](https://github.com/jminkkk/kakao-shop/assets/102847513/3c0a2205-5f9a-4fab-a768-7469b235ff09)|

|주문하기|주문 후 장바구니 초기화|
|---|---|
|![주문하기](https://github.com/jminkkk/kakao-shop/assets/102847513/6cadaf8b-c3cb-4794-9fe0-e8b7004972bf)|![주문 후 장바구니](https://github.com/jminkkk/kakao-shop/assets/102847513/99042564-efc4-4ccb-a346-0387e7ecd540)|

## 주차별 활동 내역
### 1주차
+ 요구사항분석/API요청 및 응답 시나리오 분석
+ 요구사항 추가 반영 및 테이블 설계도

### 2주차
+ 전체 API 주소 설계
+ Mock API Controller 구현

### 3주차
+ BDD 패턴을 통한 레포지토리 단위테스트 

### 4주차
+ 컨트롤러 단위 테스트
  	+ Mockito를 이용하여 stub을 구현
  	+ 인증이 필요한 컨트롤러 테스트

### 5주차
+ 카카오 쇼핑 프로젝트 전체 코드 리팩토링
	+ AOP로 유효성검사 적용
	+ GlobalExceptionHanlder 구현
 	+ 장바구니 담기 및 주문하기 예외 처리
  	+ 결재하기 기능 구현 (장바구니 초기화)
	+ 주문결과 확인 기능 구현

### 6주차
+ 통합테스트를 구현
+ restdoc을 통한 API문서 구현 
+ 카카오 클라우드에 배포
