Scala 프로젝트 기본 템플릿
=======================

## 목표

- 스터디 혹은 프로젝트에 사용할 스칼라 기본 프로젝트 생성 시 
  반복되는 스칼라 프로젝트 환경의 기본적인 틀 제시
- **SBT, Eclipse(Scala IDE), Git, ScalaTest** 를 지원

## 사용법 

- 본 프로젝트는 아래 제시된 **작업 내역**의 과정을 거쳐 만들어진 결과물임 
- 바로 사용하려면 적절한 폴더에 `git clone` 후 
	1. build.sbt 내용 변경
		- 작성하려는 프로젝트 명, Scala 버전, 의존 라이브러리 등을 수정함
		- 테스트 용 의존 라이브러리로 ScalaTest에 대한 의존성이 추가되어 있음
		- 자주 활용하는 Scalaz에 대한 의존성도 추가되어 있음
	2. `sbt`
		- sbt 콘솔 실행
	3. `eclipse with-source=true`
		- sbt 콘솔에서 eclipse 프로젝트 생성
		- with-source 옵션을 추가하면 eclipse에서 의존 라이브러리의 소스를 볼 수 있게됨
	4. `test` 혹은 `test-only ${테스트 대상 클래스명}`
		- 테스트 수행
		- Sample로 PIS 17장 관련 테스트 케이스가 들어있음. 필요 없으면 삭제할 것
		- SAMPLE이라는 안내 문서도 test폴더에 포함되어 있음

## 작업 내역 

0. 이하 해당 ScalaTemplate 프로젝트를 만든 history임
1. SBT 설치 
	- SBT 버전은 0.11.2
		- Homebrew 등을 이용하기 보다는 직접 다운로드 후 설치를 권장
	- [SBT wiki](https://github.com/harrah/xsbt/wiki/Getting-Started-Setup)에 제시된 내용대로 ~/bin/sbt 생성
		- 설치 시 콘솔에서의 한글 사용을 위해 file.encoding=UTF-8을 추가함
		- ``java -Xmx512M -Dfile.encoding=UTF-8 -jar `dirname $0`/sbt-launch.jar "$@"``
2. 프로젝트 생성 
	- build.sbt
		- 기본 프로젝트 정보 추가
		- 의존 라이브러리 추가
			- 테스트를 위해 ScalaTest 추가
			- `libraryDependencies += "org.scalatest" % "scalatest_2.9.1" % "1.6.1" % "test"`
			- Scalaz 라이브러리 추가
			- `libraryDependencies += "org.scalaz" %% "scalaz-core" % "6.0.4"%` 
	- sbteclipse plugin 설치
	    - SBT를 eclipse 프로젝트로 만들어 주는 플러그인
		- ${PROJECT_ROOT}/project/plugin.sbt에 sbteclipse플러그인 의존성 추가
		- 현재 plugin.sbt 내용은 다음 한 줄이면 설치
			- `addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "2.0.0-M3")`
			- 당연한 말이지만, sbteclipse 버전은 향후 변경될 수 있음
3. Git 설정 
	- .gitignore 작성
		- SBT 설정과 소스 파일 외 불필요한 내용은 git에 반영하지 않음

## 테스트 관련

- 학습 테스트 작성 시 BDD 스타일을 사용해 테스트 내용을 기록하면 좋을 듯함
	- 스터디 내용을 테스트 케이스로 공유하는 것도 좋은 방법!
- test 의존 라이브러리로 설정한 ScalaTest의 Spec을 이용하면 BDD 스타일의 Test Case를 작성 가능
- ScalaTest의 Spec 사용법은 다음의 Quick Start 링크를 참고
	- [ScalaTest QuickStart(Spec)](http://www.scalatest.org/getting_started_with_spec)
- pis.chap17.m01.StringOpsSpec 을 참고해도 됨
- 아직 테스트 작성 시 한글 메세지를 어떤 형식으로 작성할 것인가("given, when, then", 각종 matcher...)는 고민 중입니다.
 	- 제안 요망