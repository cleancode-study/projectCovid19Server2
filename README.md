[클릭](#### 기획서 작성법) 테스트
[클릭](### 그래프 샘플) 테스트

#### project info
- Springboot에서 CSV 및 URL 관리, HTML 그래프
- Flask에서 데이터 통계(CSV) 정리 및 저장 (Pandas, Requests)

- Python언어로 컨텐츠 통계 및 데이터저장(CSV) 작업을 하고, 
- Github에 CSV파일 업로드와 Springboot DB에 URL주소 전달 <-> Flask는 Springboot에 CSV주소 수신
- 코로나 데이터로 Pandas의 통계, sklean의 모델링, openCV 데이터 분석, tenserflow의 모델사용 



### 기획서 작성법
- 클래스 다이어그램 : class(인스턴스) 연관관계
  - 빅데이터 데이터 통계 테이블(전처리 후)의 표기를 위한 클래스 다이어그램
  - 자바의 솔루션 entity 설명을 위한 클래스 다이어그램
- 스토리보드 : 화면 설명
  - 와이어프레임 사용
  - 일반 화면 캡쳐 사용
- 기술스택 : 이력서 용도의 용어집(면접)
  - 개발 환경구성 : 개발자가 개발하기 위한 환경(서버)
    - git : repository URL
    - IntelliJ
    - jupyter notebook
    - anaconda 
      - 가상환경을 구성하고 빅데이터 분석에 필요한 다음 라이브러리 설치
        - scikit-learn : randomForest, gradient boost 알고리즘 활용
        - pandas : csv 전처리 활용 및 테이블 저장
  - 실제 서버환경 : 서비스를 제공하기 위한 환경(서버)
    - Server OS : ubuntu20.04 (CentOS7)
    - Python : Python3.9
      - dictionary 병합 활용 (개발 버전의 당위성 설명)
      - Pandas 1.52 에 적용
    - Dash : 2.7버전의 plotly framework
- 요구사항 분석 + 데이터기반
  - 데이터 기반의 가설 주장과 근거를 그래프와 함께 표기

#### 데이터 시각화(보고서)
- 데이터 시각화를 통한 빅데이터 인사이트 전달
  - 정보 시각화 기반으로 한 빅데이터 시각화 : 핵심 개념과 아이디어를 직관적이고 명확하게 전달
    - 정보 구조화 : 데이터 수집 및 탐색, 데이터 분류, 배열, 재배열 (전처리)
    - 정보 시각화 : 시간, 분포, 관계, 비교, 여러변수 비교, 공간 시각화
    - 정보 시각표현 : 그래픽 7요소, 그래픽 디자인 기본 원리, 인터랙션, 시각정보 디자인 7원칙
- 시간 시각화 기법 : 시계열 데이터(트랜드, 인구분포, 사업영역변화, 소비자 심리)
  - 막대 그래프
  - 점 그래프
- 분포 시각화 기법 : 데이터의 전체적인 분포를 확인, 분류, 세부 분류, 가짓 수, 최대, 최소, 전체분포 확인
  - 트리맵 차트
  - 파이 차트
  - 도넛 차트
  - 누적 연속 그래프
- 관계 시각화 기법 : 집단간의 유사점, 특정 집단의 소집단, 집단 간의 상관관계
  - 버블 차트
- 비교 시각화 기법 : 하나 이상의 변수를 기준으로 대상을 비교, 포커스 부분을 선택적으로 자세히 시각화하는 방법
  - 히트맵
  - 히트 행렬
  - 스타 차트
  - 평행 좌표계
  - 다차원 적도법
- 공간 시각화 기법 : 지도

### 그래프 샘플
- 비교 : 막대, 버블
- 추이 : 선, 영역, 타임라인
![비교추이](/src/main/resources/static/img/Compare_Transition.png)
- 비중 : 파이, 와플, 트리맵
- 관계 : 산점도, 네트워크, xy히트맵
- 지도 : 필드, 심볼, 플로우
![비교추이](/src/main/resources/static/img/ImportanceRelationshipMap.png)

### 다중 피처 그래프 예제
- (통계그래프)
*산점도, 선차트, 영역차트
x, y를 회귀 데이터, 선(산점 범위)을 분류 데이터

*다중 회귀 차원 그래프
3차원이상 회귀 데이터 출력
![비교추이](/src/main/resources/static/img/multi_regression1.png)
![비교추이](/src/main/resources/static/img/multi_regression2.png)
![비교추이](/src/main/resources/static/img/multi_regression3.png)

- (개인별 그래프)
*네트워크 그래프 : 클라이언트의 특정 질병에 적용되는 변수(요인)과 수치를 표현

*파이차트, 와플차트, 트리맵, 히트맵 (적합치 않음) : 특정 카테고리(10세 아동 등)의 분류를 지정해야 함

#### 스케쥴
- 2022-12-22까지 [주제]기획 결정 (개발환경 작성)
- 2022-12-23까지 솔루션 아키텍처(flask의 @route, spring의 @controller, repository) 구성
- 2022-12-23까지 데이터 수집 data.go.kr 혹은 구글링하여 csv파일 또는 api주소 찾기
- 2022-12-23 프로토타입 1차 확인
- 2022-12-29 전처리, 결측치, 종속변수 1차 루틴 완료, 서비스 배포(모델 적용)
- 2022-12-29 프로토타입 (view 제외(와이어프레임O)) 1차 완료, 서비스 배포(서버 배포)
- 2022-12-30까지 리소스(DB컬럼, csv, image) 정리 (사용 할 데이터)

#### Student toDoList
| 학생명 | 프로젝트 제목                     | 작업목록                           |
|-----|-----------------------------|--------------------------------|
| 박성현 | 서울 전기차 충전소 인프라 구축 데이터베이스    | 데이터 분석 작업                      |
| 성하늘 | 게임 전적 통계 서비스 구축             | HTML/CSS 플랫폼 작성                |
| 성하늘 | 게임 전적 통계 서비스 구축             | 외부 URL Link                    |
| 성하늘 | 게임 전적 통계 서비스 구축             | API 데이터 가공 및 적용               |
| 강수희 | 제주도                         | 데이터 활용                         |
| 이수지 | 프론트엔드 프로젝트 준비               | -                              |
| 박태식 | python 프로젝트                 | -                              |
| 송지선 | 건강 데이터 통계 솔루션               | -                              |
| 조예찬 | 전자책(도서)의 통계                 | 책 페이지 HTML에 출력 서버 프로토타입        |
| 조예찬 | 전자책(도서)의 통계                 | 전자책 페이지에 데이터 테이블 출력            |
| 조예찬 | 전자책(도서)의 통계                 | 전자책 페이지 데이터에 맞는 그래프 출력         |
| 윤승원 | git/readme.md 파일 정리 및 면접 준비 | -                              |
| 이지현 | 가계부 솔루션 (spring)1           | HTML(JSP)와 Spring 연동           |
| 이지현 | 가계부 솔루션 (spring)2           | Repository와 Spring 연동(C)       |
| 김지혁 | 음식점 추천 솔루션1                 | 카카오 평점과 댓글 키워드 데이터 수집          |
| 김지혁 | 음식점 추천 솔루션2                 | 키워드 형태소 분석 lib활용 또는 특정 키워드 가중치 |
| 장영훈 | 재활용 통계 서비스1                 | 데이터 API(CSV) 호출 활용             |
| 장영훈 | 재활용 통계 서비스2                 | 데이터 그래프 출력 (Spring)            |

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
- JSON : Javascript Object - : 데이터 전달 포맷 (KEY:VALUE) = map = dictionary
- List : 배열(가변배열) = python의 list []
- Map : key:value = python의 dictionary
- JSON : javascript object notation : key:value로 이루어진 배열 자료열 (map이 배열로 구성)로 된 포맷
- pandas 전처리
  - mean() : 평균값
  - median() : 중앙값
  - std() : 표준편차
  - max() / min() : 최대값, 최소값
  - dropna() : 결측값 처리
  - fillna(x.mean()) : 평균값으로 결측값 채우기
  - categorical() : 정수 기반의 범주형 데이터형

- 정적타입 : 동적타입과 다르게 변수에 타입 스타일을 지정하는 방식 : 파이썬의 typehint도 유사
- Class와 Instance : 설계도와 찍어낸 객체
- 상속 : 부모 객체의 모든 자원을 물려받기
- 추상클래스 : 클래스 + 인스턴스 만들어야 기능을 하는 클래스
- 인터페이스 : 다중 상속이 가능한 {}코드가 없는 강제적 설계도 (default, static 메서드 제외)
- 오버로딩 : 다양한 스타일로 생성자 만드는 기법
- 오버라이딩 : 부모클래스의 동일한 메서드를 재정의하여 바꾸기

- Despatcher Servlet : 클라이언트의 요청을 안내하는 에스코트 서블릿
- @RequestParam : 클라이언트의 Key값을 찾아 연결하는 어노테이션

#### todoList

| 완료     | 작업내용                                              | 완료날짜      |
|--------|---------------------------------------------------|-----------|
| closed | data.go.kr 공공데이터 요청                               | 2022-12-12 |
| closed | Java 언어로 api데이터 받기 샘플코드 완성                        | 2022-12-12 |
| closed | github가입과 관리                                      | 2022-12-12 |
| closed | readme.md 개발문서 작성                                 | 2022-12-13 |
| closed | server110과 server210 @GetMapping 연결 구조 설계         | 2022-12-13 |
| closed | DB에 데이터 저장하기 sample                               | 2022-12-13 |
| closed | DB에 데이터 불러오기 1 (data.go.kr 데이터)                   | 2022-12-14 |
| closed | CSV web link 불러와서 URL 주소 전달하는 @RestController 만들기 | 2022-12-14 |
| closed | DB에 검색내용, IP, 시간을 저장하는 Entity Table만들기            | 2022-12-14 |
| closed | DB에 데이터 불러오기 2 (검색내용 불러오기)                        | 2022-12-14 |
| closed | 시각화 HTML 만들기 1,2 (migration:이동)                   | 2022-12-15 |
| closed | flask과 springboot 연동                              | 2022-12-15 |
| closed | 시각화 페이지 URL 전달하는 API 만들기 (route CSV)              | 2022-12-16 |
| closed | 포트폴리오 목록 정하기 / 개발자 용어 정리                          | 2022-12-16 |
| closed | 시각화 HTML 만들기 3 (그래프 그리기)                          | 2022-12-16 |
| open   | -                                                 | -         |
| closed | collection framwork 데이터 타입 정립 (java = python)     | 2022-12-19         |
| closed | pandas 활용하여 데이터 정규화                               | 2022-12-19 |
| open   | -                                                 | -         |
| open   | 시계열 분석이 완료된 통계 데이터를 받아서 spring 그래프 출력하기           | 2022-12-19   |
| open   | Dash example                                      | 2022-12-20 |
| open   | 검색 내용 출력 기능                                       | 2022-12-20 |
| open   | 코로나 그래프 만들기 1                                     | 2022-12-21 |
| open   | dashboard 용도 메인 그래프 작성                            | 2022-12-21 |

---

#### 필요강의 목록
- Springboot 기본인프라
    - 기본1 HTML 게시판1
      - https://www.youtube.com/watch?v=5bcfmPfRmYE&t=2s
    - 기본2 HTML 게시판2 
      - https://www.youtube.com/watch?v=VHxR7AoCZ74
    - 기본3 Container 이론 : https://www.youtube.com/watch?v=cPpS_hsY71E
- Springboot 이론예제
  - API 데이터 가공 및 출력
    - https://www.youtube.com/watch?v=UO8XifPROOc
  - 스크래핑 (Java)
    - https://www.youtube.com/watch?v=C_gAwnseXqI
  - 이미지 업로드/다운로드
    - https://www.youtube.com/watch?v=7dmwTbSiudw
  - 차순위 : 세션과 쿠키와 (교과서 part7)시큐리티, jwt활용
- nextjs 13 기본인프라
  - 구조
    - https://youtu.be/pRoway0ktZQ
  - 레이어 표현
    - https://youtu.be/ZyZFU_6lAWc
- 인공지능 기본인프라
  - 추후 보강
- 인공지능을 위한 통계
  - 추후 보강
- 인공지능 대표 모델 설명
  - 추후 보강
- 머신러닝 모델 검증 
  - 추후 보강

                      
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
#### 주제와 요구 사항
```
  (예시)빅데이터 포트폴리오 문서 작성법
**
- 주제 (요구사항) : 타인에 대해 설득을 위한 가설 : 두괄식(결론을 먼저 쓰기)
1. 갖고 있는 데이터 병합 및 전처리 인프라 구축 (CSV, JSON API)
2. 가설주장 (데이터를 통해 주장하고 싶은 가설과 필요한 근거 요약 설명)
**
- 가설과 근거
1. 가설에 대한 개요
2. 근거를 구체적으로 설명 (*데이터 맞춰 시각화 선별)
3. 모델 선택과 이유(차별성)
3-1. 모델검증 (모델 비교)
3-2. 모델 고도화를 위한 수정작업 반복
**
- 결과
1. 결론 개요
2. 마무리
```
- 주제 : 코로나와 특정 계절과 온도와의 관계성 입증
- 가설 : 코로나 확진과 
- 서비스 개발 목적
  - (사용자 관점) 사용용이성, 효율성, 신뢰성
  - (개발자 관점) 검증가능성, 유지보수성, 이식성
  - (시스템 관점) 제어 용이성

---
#### 개발문서
| 제목             |주소 |작업자|
|----------------|----|----|
| 시각화 서버코드 110   |https://github.com/cleancode-study/projectCovid19Server110.git|김준석|
| 시각화 서버 ip/port |http://192.168.42.100:8080/|김준석|
| 관리 서버 ip/port  |http://192.168.42.100:8090/|김준석|
| 시각화 서버(python) |http://192.168.42.100:8100/|김준석|
| 통계 서버(python)  | http://192.168.42.100:8110/ |김준석|

---
#### API 문서 (Controller Mapping URL)
| API URL      | return 내용  |작업자|
|--------------|------------|----|
| /account/put | 회원가입 정보 저장 |김준석|

---
#### 환경구성
- 개발환경
  - Spring boot 3.0.0 
    - mysql connector 
    - thymeleaf 
    - lombok 
    - JSONObject 
    - JPA 
  - Flask(python)
    - pandas
    - scikit-learn
    - dash
  - mysql 8.0.30 
  - HTML 
  - CSS 3.0 
  - Javascript EC6
- 서버환경
  - ubuntu 20.04
  - 내장 tomcat
  - flask
  - springboot

---
### 스토리보드
![이미지제목](/src/main/resources/static/img/wireframe1.png)
![이미지제목](/src/main/resources/static/img/wireframe2.png)
![이미지제목](/src/main/resources/static/img/information_architecture.png)
![이미지제목](/src/main/resources/static/img/storyboard_example.png)

---
#### developer
- email : js@cleancode.kr
- name : js

---
```
  이력서 작성법
```
```
# 이력서 작성 : 인사팀이 취업자를 보기 위한 문서
*경험, 역량, 심플(두괄식)

빅데이터 : 분석능력, 통계수학 관심있는 듯한 자소서
프로그래밍 : 컴퓨터공학, 구현에 관심 + 문제해결능력

1) 사실기반(수치) + 요점강조
2) 가능한 짧게
3) 정리 잘된 레이아웃(주장과 근거, 제목과 설명 + 들여쓰기)
+ 플랫폼 (hwp, docs, word 이런 확장자보다 pdf, html link)

구성)
1. 제목
2. 인적사항(경력, github, blog, instagram)
3. 간단 자기소개 (2-5줄, 나를 표현할 있는 문장)
4. 기술스택 (2가지 장르로 표현)
5. 경험 늘려놓기 (참여 프로젝트, readme.md link, ppt link)

면접)
면접 인사(사회생활 잘 할 것 같은 인상)
면접이 끝난 후 피드백 요청
```
---
```
  프로젝트 기획서 작성법
```
```
1. 목표, 요구사항 정리 : 이 프로젝트가 어떤 사회적 이슈를 해결하고 이득을 얻는지 어필
*두괄식(주장)+근거 (2맥락)
- 빅데이터 일 경우 : 데이터 명세(컬럼 정리) (클래스 다이어그램)
데이터 형태
데이터 종류
데이터 수집방법
데이터 정제(전처리 방식)
데이터 라벨링(종속변수 지정)
- 빅데이터 과정에서는 반드시 설득을 위한 그래프와 근거

- 개발환경, 서버환경 기재
라이브러리 버전과 왜 쓰는지를 기재 = 기술을 인지하고 쓰는지 어필

* 마지막에 타임라인(일정) 테이블 또는 표 그리기 (작업 단계 구분 명확)

- 모델링을 통해 얻을 수 있는 이득에 대해 상세히 설명 (계획이 현실성이 있는지 확인)
```
---
```
  (예제) README.md 문서 작성법
```
---
- opend : 작성진행요청
- in progress : 작업진행중
- closed : 완료

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

