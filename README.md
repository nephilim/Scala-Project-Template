Scala 프로젝트 기본 템플릿
=======================

## 목표

- 스터디 혹은 프로젝트에 사용할 스칼라 기본 프로젝트 생성 시 
  반복되는 스칼라 프로젝트 환경의 기본적인 틀 제시
- **SBT, Eclipse(Scala IDE), Git, ScalaTest** 를 지원

## 사용법 

- 아래 제시된 **작업 순서**를 마친 프로젝트임 
- 적절한 폴더에 `git clone` 후 
	1. build.sbt 내용 확인
		- 프로젝트 명, Scala 버전, 의존 라이브러리 등을 수정함
	2. `sbt`
		- sbt 콘솔 실행
	3. `eclipse with-source=true`
		- eclipse 프로젝트 작성
	4. `test` 혹은 `test-only ${테스트 대상 클래스명}`
		- 테스트를 해 본다

## 작업 순서  

1. SBT 설치 
	- SBT 버전은 0.11.2
		- Homebrew 등을 이용하기 보다는 직접 다운로드 후 설치를 권장
	- [SBT wiki](https://github.com/harrah/xsbt/wiki/Getting-Started-Setup)에 제시된 내용대로 ~/bin/sbt 생성
		- 설치 시 콘솔에서의 한글 사용을 위해 file.encoding=UTF-8을 추가함
		- ``java -Xmx512M -Dfile.encoding=UTF-8 -jar `dirname $0`/sbt-launch.jar "$@"``
2. 프로젝트 생성 
	- sbteclipse 설치
		- ${PROJECT_ROOT}/project/plugin.sbt에 sbteclipse플러그인 추가
		- 현재 plugin.sbt 내용은 다음 한 줄
			- `addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "2.0.0-M3")`
			- 당연한 말이지만, sbteclipse 버전은 향후 변경될 것임
3. Eclipse 프로젝트 설정 
	- `sbt eclispe`
		- SBT 콘솔에서 eclipse 명령어로 Eclipse Project를 생성 가능 
	- `sbt "eclipse with-source=true"`
		- ScalaTest 등의 주요 라이브러리가 소스 코드 첨부된 형태로 프로젝트가 생성
3. 테스트 
	- 학습 테스트 작성 시 BDD 스타일을 사용해 테스트 내용을 기록하면 좋을 듯함
		- 스터디 내용을 테스트 케이스로 공유하는 것도 좋은 방법!
	- test 의존 라이브러리로 설정한 ScalaTest의 Spec을 이용하면 BDD 스타일의 Test Case를 작성 가능
	- ScalaTest의 Spec 사용법은 다음의 Quick Start 링크를 참고
		- [ScalaTest QuickStart(Spec)](http://www.scalatest.org/getting_started_with_spec)
	- pis.chap17.m01.StringOpsSpec 을 참고해도 됨
	- 아직 테스트 작성 시 한글 메세지를 어떤 형식으로 작성할 것인가("given, when, then", 각종 matcher...)는 고민 중입니다.
	 	- 제안 요망