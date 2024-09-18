# <p align="center"><img align="center" src="https://github.com/hel-gather/hel-gather-server/assets/75198221/6174b163-9c25-4dbf-8e0a-a3c7d5ad8cd1" width="80" height="80"></p> <h1 align="center">모이룸 룸메이트 매칭 서비스 </h1>

<p align="center">
원치 않게 룸메이트를 찾아야 하는 상황에 처한 사용자들을 위해 알맞은 룸메이트 매칭을 진행할 수 있도록 도움을 주는 서비스입니다.  
사용자의 모바일 사용기록을 분석해 성격을 파악하고, 분석한 결과를 바탕으로 룸메이트를 추천해줍니다. 👫
</p><br>

<p>

```
📢 SSFAY 10기 2학기 공통프로젝트
📢 프로젝트 진행기간: 24.1.2 ~ 24.2.16 (총 7주)
```
<br/>

## 바로가기
[1. 개발 환경](#1-개발-환경)  
[2. 주요 기능](#2-주요-기능)  
[3. 산출물](#3-산출물)  
[4. 구현한 기능](#4-구현한-기능)  
[5. 깨달은 점](#5-깨달은-점)  
[6. 팀원 소개](#6-팀원-소개)


---

# 🔍1. 개발 환경
<h4>Management Tool</h4>
<p align="left">
<img src="https://img.shields.io/badge/JIRA-0052CC?style=for-the-badge&logo=JIRA&logoColor=white">
<img src="https://img.shields.io/badge/gitlab-FC6D26?style=for-the-badge&logo=gitlab&logoColor=white">
<img src="https://img.shields.io/badge/mattermost-0058CC?style=for-the-badge&logo=mattermost&logoColor=white">
<img src="https://img.shields.io/badge/notion-000000?style=for-the-badge&logo=notion&logoColor=white">
<img src="https://img.shields.io/badge/figma-F24E1E?style=for-the-badge&logo=figma&logoColor=white">
<img src="https://img.shields.io/badge/postman-FF6C37?style=for-the-badge&logo=postman&logoColor=white">
<img src="https://img.shields.io/badge/GIT-F05032?style=for-the-badge&logo=git&logoColor=white">
</p>

<h4>IDE</h4>
<p align="left">
<img src="https://img.shields.io/badge/INTELLIJ-000000?style=for-the-badge&logo=intellijidea&logoColor=white"/>
<img src="https://img.shields.io/badge/ANDROID STUDIO-3DDC84?style=for-the-badge&logo=ANDROID-STUDIO&logoColor=white"/>
<img src="https://img.shields.io/badge/PYCHARM-000000?style=for-the-badge&logo=pycharm&logoColor=white"/>
</p>

<h4>Infra</h4>
<p align="left">
<img src="https://img.shields.io/badge/AMAZON EC2-232F3E?style=for-the-badge&logo=amazonec2&logoColor=white"/>
<img src="https://img.shields.io/badge/AMAZON S3-569A31?style=for-the-badge&logo=amazons3&logoColor=white"/>
<img src="https://img.shields.io/badge/NGINX-009639?style=for-the-badge&logo=nginx&logoColor=white"/>
<img src="https://img.shields.io/badge/DOCKER-2496ED?style=for-the-badge&logo=docker&logoColor=white"/>
<img src="https://img.shields.io/badge/UBUNTU-E95420?style=for-the-badge&logo=ubuntu&logoColor=white"/>
<img src="https://img.shields.io/badge/JENKINS-D24939?style=for-the-badge&logo=jenkins&logoColor=white"/>
</p>

<h4>Frontend</h4>
<p align="left">
<img src="https://img.shields.io/badge/KOTLIN-7F52FF?style=for-the-badge&logo=kotlin&logoColor=white"/>
<img src="https://img.shields.io/badge/FIREBASE-FFCA28?style=for-the-badge&logo=firebase&logoColor=white"/>
</p>

<h4>Backend</h4>
<p align="left">
<img src="https://img.shields.io/badge/java-007396?style=for-the-badge&logo=java&logoColor=white">
<img src="https://img.shields.io/badge/SPRING BOOT-6DB33F?style=for-the-badge&logo=springboot&logoColor=white"/>
<img src="https://img.shields.io/badge/SPRING SECURITY-6DB33F?style=for-the-badge&logo=springsecurity&logoColor=white"/>
<img src="https://img.shields.io/badge/MYSQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white"/>
<img src="https://img.shields.io/badge/PYTHON-3776AB?style=for-the-badge&logo=python&logoColor=white"/>
<img src="https://img.shields.io/badge/FLASK-000000?style=for-the-badge&logo=flask&logoColor=white"/>
<img src="https://img.shields.io/badge/OAUTH2-40AEF0?style=for-the-badge&logo=oauth2&logoColor=white"/>
<img src="https://img.shields.io/badge/WEBSOCKET-FF9E0F?style=for-the-badge&logo=websocket&logoColor=white"/>
</p><br>

# 🔍2. 주요 기능

### 💻 소셜 로그인
<div style="display: flex; flex-direction: row;">
  <img src="image/login.jpg" width="200" style="margin-right: 5px;">
  <img src="image/login2.jpg" width="200" style="margin-right: 5px;">
</div>

### 🧑🏻‍💼 기본 정보 및 자기 소개 등록
  <img src="image/register.jpg" width="200" style="margin-right: 5px;">

### 🧑🏻‍ 사용자 권한 허용
<div style="display: flex; flex-direction: row;">
  <img src="image/auth6.jpg" width="200" style="margin-right: 5px;">
  <img src="image/auth5.jpg" width="200" style="margin-right: 5px;">
  <img src="image/auth.jpg" width="200" style="margin-right: 5px;">
  <img src="image/auth3.jpg" width="200" style="margin-right: 5px;">
  <img src="image/auth2.jpg" width="200" style="margin-right: 5px;">
  <img src="image/auth4.jpg" width="200" style="margin-right: 5px;">
</div>

### 🧑🏻 성향 분석 및 룸메이트 추천
<div style="display: flex; flex-direction: row;">
  <img src="image/match1.jpg" width="200" style="margin-right: 5px;">
  <img src="image/match2.jpg" width="200" style="margin-right: 5px;">
  <img src="image/match3.jpg" width="200" style="margin-right: 5px;">
</div>

### 💬 채팅
<div style="display: flex; flex-direction: row;">
  <img src="image/chatlist.jpg" width="200" style="margin-right: 5px;">
  <img src="image/chat.jpg" width="200" style="margin-right: 5px;">
</div>

### 💁 정보 수정 및 기타 기능
<div style="display: flex; flex-direction: row;">
  <img src="image/proflie_edit.jpg" width="200" style="margin-right: 5px;">
  <img src="image/profile_edit2.jpg" width="200" style="margin-right: 5px;">
</div>

<br/>
<br/>

# 🔍3. 산출물
## 4-1. ERD
![TEAM_MM_ERD](image/erd.png)
## 4-2. 시스템 아키텍처
![시스템 아키텍처](image/system_architecture.png)
## 4-3. 결과 영상
[![모이룸 화면 영상](image/mainpage.jpeg)](https://youtu.be/1s90BR-ahNY)
<br/>

# 🔍4. 구현한 기능
- 소셜 로그인 및 회원 정보 관련 API 구현
- 지역 정보 등록 관련 API 개발
- Web Socket을 활용한 룸메이트 채팅 서비스 API 개발


# 🔍5. 깨달은 점
- jpql 활용법
- spring을 활용한 WebSocket의 설정 방법
- WebSocket의 ws 프로토콜에 대한 이해
- OAuth에 대한 이해
- spring security 필터의 개념
- spring security에 JWT 필터 적용 방법

# 👩‍👦‍👦6. 팀원 소개

### 📱안드로이드
| [황재언](https://github.com/JaeEonHwang)                                                   | [정성현](https://github.com/JungSungHyeon)                                                 | [김준수](https://github.com/julsukim)                                                                                |
|-----------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------|
| <img width="100" alt="이미지" src="https://github.com/user-attachments/assets/b7c69a5d-654b-4808-9675-be4dc17ba260"> | <img width="100" alt="이미지" src="https://avatars.githubusercontent.com/u/172378447?v=4"> | <img width="100" alt="이미지" src="https://github.com/user-attachments/assets/109148e4-2572-4e56-b2ac-0999ee469f48"> |

### 💻 백엔드
| [진주성](https://github.com/vmfaldwntjd)                                                                                                  | [전새벽](https://github.com/toqurJeon)                                                                | [김예지](https://github.com/ykim-yeji) |
|----------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------|------------------------------------|
| <img width="100" alt="이미지" src="https://github.com/user-attachments/assets/af605219-015a-41bf-8d9d-d7eaba8d4d2d"> | <img src="https://github.com/user-attachments/assets/109148e4-2572-4e56-b2ac-0999ee469f48" alt="이미지" style="width: 100px;"> |  <img src="https://github.com/user-attachments/assets/ee159736-491b-4278-9065-9268bb57e378" alt="이미지" style="width: 100px;"> |
