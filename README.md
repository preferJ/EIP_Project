# 프로젝트 이름
Engineer Information Processing Project
<!-- <p align="center">
  <br>
  <img src="./images/common/logo-sample.jpeg">
  <br>
</p> -->



## 프로젝트 소개

<p align="justify">
프로젝트 개요/동기
</p>
정보처리 기사 문제 은행의 데이터를 이용해 과목별/년도별/틀린문제/취약과목 등의 항목으로 구분하여 문제를 복습 할 수 있도록 해주는 사이트 구현

<p align="center">
GIF Images
</p>

<br>

## 기술 스택

<!-- | JavaScript | TypeScript |  React   |  Node   |
| :--------: | :--------: | :------: | :-----: |
|   ![js]    |   ![ts]    | ![react] | ![node] |
 -->
<br>

## 구현 기능

### 기능 1 [회원]
1.1 회원가입<br>
1.2 로그인-아웃<br>
1.3 마이페이지<br>
>1.3.1 정보 수정 (닉네임 변경)<br>
1.3.2 내 취약 과목 조회 가능<br>
1.3.3 푼 문제/ 안 푼 문제/ 틀린 문제/ 맞은 문제 조회 가능<br>
1.3.4 코멘트를 달아 둔 문제 조회<br>
>1.3.5 다시풀기 / 즐겨찾기 한 문제 조회<br>
1.4 회원 등급 표시<br>
1.4.1 댓글에 회원 등급 순 정렬 이 존재, 코멘트(해설) 추가 시 좋아요(투표)가 경험치가 되어 티어(등급) 상승<br>
1.4.2 비추를 받을 수록 해적(불량회원)화 됨 // 비추 받은 댓글을 관리자가 보고 판단 // 따라서 관리자는 비추댓글을 조회 할 수 있어야함<br>
1.5 관리자<br>
1.5.1 회원 관리(수정/삭제) 기능<br>
1.5.2 문제 관리<br>
1.5.3 비추 댓글 관리<br>
1.5.4 문제 신고 관리<br>
### 기능 2 [문제]<br>
1.1 문제 풀기 창 이동 (비로그인 - 로그인창 호출)<br>
1.2 원하는 카테고리별 문제 제공<br>
1.2.1 년도별<br>
1.2.2 과목별<br>
1.2.3 틀린 문제 복습<br>
1.2.4 풀지 않은 문제<br>
1.2.5 즐겨찾기 한 문제<br>
1.2.6 랜덤 출제<br>
1.3 채점 기능 설정<br>
1.3.1 바로 채점 on/off<br>
1.3.2 년도/과목이 아닐 시 도중 채점이 가능<br>
1.4 해설 on/off<br>
1.5 코멘트<br>
1.5.1 댓글 작성<br>
1.5.2 댓글창 on/off<br>
1.5.3 정렬<br>
1.5.3.1 최신<br>
1.5.3.1 추천<br>
1.6 문제 저장(즐겨찾기)<br>
1.7 틀린 문제 리스트 에서 삭제<br>
1.8 문제 오류 신고<br>
### 기능 3 [게시판]<br>
1.1 질문게시판<br>
1.1.1 댓글기능<br>
1.1.2 추천기능<br>
1.2 유저 커스텀 문제 출제 게시판<br>
1.2.1 댓글기능<br>
1.2.2 추천기능<br>
1.2.3 유저 문제 모아풀기 기능 제공<br>
<br><br>
<br>
<br>
## 화면 구성<br>

### 화면 1 [메인화면]<br>
2. 대문 로고<br>
3. 문제 풀기 버튼<br>
4. 메인 화면에 랜덤 문제의 해설 노출 (해설은 대부분 용어 설명으로 이루어짐)<br>
<br>
### 화면 2 [헤더]<br>
1. 게시판 (가능하다면 토글 css 적용 후 자유/문제 게시판으로 이동 할 수 있게)<br>
2. 로그인 / 로그아웃<br>
3. 회원가입 / 마이페이지<br>
4. 홈버튼<br>
5. 문제 풀기 버튼<br>
<br>
### 화면 3 [문제 풀기]<br>
1. 문제 카테고리 (년도/과목)<br>
2. 문제 및 보기<br>
3. 답안 클릭 및 제출 버튼 (키보드로 지원)<br>
4. 문제 오류 신고 버튼<br>
5. 댓글창 (on / off)<br>
6. 해설창 (on / off)<br>
7. 채점 기능 설정<br>
<br>
### 화면 4 [마이페이지]<br>
1. 개인 정보<br>
2. 과목별 지표<br>
3. 저장/틀린 문제 리스트<br>
4. 작성한 댓글 리스트<br>
5. 개인 설정 도구<br>
<br>
### 화면 5 [어드민]<br>
1. 회원 리스트<br>
2. 신고 리스트 (댓글 / 문제)<br>
3. 문제 관리<br>
3.1 문제 오류 수정<br>
3.2 문제 추가<br>
3.3 문제 삭제<br>
3.4 유저 커스텀 문제 조회<br>
  <br>
### 화면 6 [게시판]<br>
1. 자유게시판<br>
2. 문제 출제 게시판<br>
2.1 글 작성 시 자유게시판 과는 다른 폼 제공<br>
<br>


## More?<br>
1. 카카오 로그인 구현<br>
2. 카카오 채팅을 이용, 모바일로 문제 은행 접근 구현<br>
3. 응시 지원 구현 (남은 응시장 정보를 받아 올 수 있다면?)<br>
<p align="justify">

</p>

<br>




