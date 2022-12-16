#### project info
- Springboot에서 CSV 및 URL 관리, HTML 그래프
- Flask에서 데이터 통계(CSV) 정리 및 저장 (Pandas, Requests)


- Python언어로 컨텐츠 통계 및 데이터저장(CSV) 작업을 하고, 
- Github에 CSV파일 업로드와 Springboot DB에 URL주소 전달 <-> Flask는 Springboot에 CSV주소 수신
- 코로나 데이터로 Pandas의 통계, sklean의 모델링, openCV 데이터 분석, tenserflow의 모델사용 

#### check list
- 2022-12-22까지 스토리보드와 개발아키텍처 기획 확인

#### git command
- git add . : 개인컴퓨터 폴더에 있는 코드의 기록을 추가하겠다
- git commit -m "MESSAGE" : 위에 있는 기록을 확정한다 + 코멘트
- git push origin main : 개인컴퓨터에 있는 코드 기록(git)을 서버(github)에 올린다
- git pull : 서버(github)에 있는 코드기록을 개인컴퓨터에 다운 받아서 최신 버전으로 적용시킨다

#### 용어집
- migration : 기존 솔루션 혹은 코드를 새로운 서버에 이전 하는 작업
- request : 요청. 시작 서버(client)에서 특정 문자열로 요청하는 하는 행위 (parameter 지정하여 전달 가능)
- response : 응답. request로 요청을 하면 return받는 데이터
- @Controller : spring의 route(경로, 분기점 지정) : 외부에서 요청이 오면 어디로 갈지 지정
- @Service : spring의 비즈니스 로직(개발자가 만들고 싶은 컨텐츠)을 담당하는 영역
- Repository : DB와 spring을 연결하는 영역
- JPA : 객체지향 프로그래밍 방식을 SQL문으로 번역하여 적용(전달), Entity(Instance) = tuple
- DI : Dependency Injection : 의존성 주입 : 의존하는 객체를 주입하여 관리
- DI 전략 : 필드 주입방식, setter메서드 주입방식, 생성자 주입방식 중 
- 생성자 주입방식이 의존하는 객체의 생성 순번을 지정할 수 있기 때문에 권장
- IoC : Inversion of Control : 제어의 역전 : DI개념을 개발자가 아닌 프로그램(spring)에서 제어하는 역전 현상

#### todoList

| 완료          | 작업내용                                              | 완료날짜       |
|-------------|---------------------------------------------------|------------|
| closed      | data.go.kr 공공데이터 요청                               | 2022-12-12 |
| closed      | Java 언어로 api데이터 받기 샘플코드 완성                        | 2022-12-12 |
| closed      | github가입과 관리                                      | 2022-12-12 |
| closed      | readme.md 개발문서 작성                                 | 2022-12-13 |
| closed      | server0과 server1 @GetMapping 연결 구조 설계             | 2022-12-13 |
| closed      | DB에 데이터 저장하기 sample                               | 2022-12-13 |
| closed      | DB에 데이터 불러오기 1 (data.go.kr 데이터)                   | 2022-12-14 |
| closed      | CSV web link 불러와서 URL 주소 전달하는 @RestController 만들기 | 2022-12-14 |
| closed      | DB에 검색내용, IP, 시간을 저장하는 Entity Table만들기            | 2022-12-14 |
| closed      | DB에 데이터 불러오기 2 (검색내용 불러오기)                        | 2022-12-14 |
| In Progress | 시각화 HTML 만들기 1,2 (migration:이동)                   | 2022-12-15 |
| closed      | flask과 springboot 연동                              | 2022-12-15 |
| open        | -                                                 | -          |
| open        | 시각화 페이지 URL 전달하는 API 만들기 (route CSV)              | 2022-12-16 |
| open        | 포트폴리오 목록 정하기 / 개발자 용어 정리                          | 2022-12-16 |
| open        | 시각화 HTML 만들기 3 (그래프 그리기)                          | 2022-12-16 |
| open        | -                                                 | -          |
| open        | -                                                 | -          |

---

#### Student toDoList
| 학생명 | 프로젝트 제목                 | 작업목록      |
|-----|-------------------------|-----------|
| 박성현 | 서울 전기차 충전소 인프라 구축 데이터베이스 | 데이터 분석 작업 |
| 성하늘 | 게임 전적 통계 서비스 구축                        | HTML 작성 중 |
| 강수희 | 일본 관광객과 엔화와의 관계성 통계             | 데이터 활용    |
| 이수지 | -   | - |
| 송지선 | 날씨에 따른 소비 패턴 | - |
| 박태식 | python 프로젝트 | - |
| 조예찬 | 전자책(도서)의 통계 | - |
| 윤승원 | backend 프로젝트 | - |
| 이지현 | 가계부 솔루션 (spring) | - |
| 김지혁 | backend 프로젝트 | - |
| 장영훈 | 기존 프로젝트를 서비스를 제공 (backend) | - |
                      
#### 서버 directory 구조

> component
> > convert : json과 map 자료형 변환 메서드

> controller
> > graph : graph HTML 이동
> 
> > openapi : 공공데이터 혹은 openapi 받는 controller
> 
> > rest : 통계서버 (python) 연동하는 api

> entity
> > example : DB 혹은 데이터 튜플 단위의 자료형 class

> repository
> > example : JPA를 활용하여 MySQL 연동

> service
> > example : 실질적인 개발자 코드를 작성하는 영역 (controller와 의존관계)

> temp : 사용하지 않는 코드를 임시 저장

#### 포트폴리오 개발파트 영역 
![이미지제목](/src/main/resources/static/img/developPart.png)

#### 관련 서버 구조
![이미지제목](/src/main/resources/static/img/structServer.png)
---
#### 스토리 보드
![이미지제목](/src/main/resources/static/img/storyboard.png)
---
#### 클래스 다이어그램
![이미지제목](/src/main/resources/static/img/classDiagram.png)


---
#### 요구사항
코로나 데이터 시각화

코로나 데이터 통계

코로나 데이터 모델링과 검증

---
#### 개발문서
| 제목             |주소 |작업자|
|----------------|----|----|
| 시각화 서버코드 110   |https://github.com/cleancode-study/projectCovid19Server110.git|김준석|
| 시각화 서버 ip/port |http://192.168.42.100:8080/|김준석|
| 관리 서버 ip/port  |http://192.168.42.100:8090/|김준석|
| 시각화 서버(python) |http://192.168.42.100:8100/|김준석|
| 통계 서버(python)  | http://192.168.42.100:8110/ |김준석|

#### 개발환경
- spring boot 3.0.0
- - mysql connector
- - thymeleaf
- - lombok
- - json
- - JPA
- mysql 8.0.30
- HTML 
- CSS 3.0
- Javascript EC6

---
#### developer
email : js@cleancode.kr
name : js

```
opend : 작성진행요청
in progress : 작업진행중
closed : 완료
```

---
예제
```
` : ESC 바로 아래 키 * 3 : 블럭 코드 작성 가능 : 복사할 코드 작용
# : 제목같은 큰 문자열에 쓰는 선언문 = HTML의 <h2>
```
# 한개
## 두개
### 세개


```
하이퍼 링크 예제 : 링크거는 문자열 선언 : HTML의 <a href:링크주소>
```
<https://naver.com/>

[네이버](https://naver.com)

```
선 긋기 : 가로줄 생성 : HTML <hr>
```
***
<hr>

```
순번 없는 목록
```
* 안녕하세요

```
순번 있는 목록
```
1. 일번
2. 2번

```
이미지 링크 : readme.md 파일에서 이미지 파일을 불러와서 보이기
절대주소(프로젝트의 최상단 위치에서 이미지 파일 경로 찾기)로 표기
```
![이미지제목](/src/main/resources/static/img/YONSAI_1920x1080.jpg)

```
테이블 작성
좌측, 우측 정렬 시 클론 사용 ---: 클론으로 정렬하고 싶은 위치 지정
```
|            제목 | 내용312321312312312312312312 |
|--------------:|---------------------------:|
|          테스트1 |              테스트1231231232 |

```
빅데이터 포트폴리오 문서 작성법
**
- 주제 (요구사항) : 타인에 대해 설득을 위한 가설 : 두괄식(결론을 먼저 쓰기)
1. 갖고 있는 데이터 병합 및 전처리 인프라 구축 (CSV, JSON API)
2. 가설주장 (데이터를 통해 주장하고 싶은 가설과 필요한 근거 요약 설명)
**
- 가설과 근거
1. 가설에 대한 설명
2. 근거를 구체적으로 설명 (시각화)
3. 모델 선택과 이유(차별성)
3-1. 모델검증 (모델 비교)
3-2. 하이퍼파이미터 (모델 고도화)
**
- 결과
1. 결론 설명
2. 마무리
```