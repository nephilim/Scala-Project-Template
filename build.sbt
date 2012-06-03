name := "my-scala-project"

version := "0.3"

scalaVersion := "2.9.2"

libraryDependencies += "junit" % "junit" % "4.9" % "test"

libraryDependencies += "org.scalatest" % "scalatest_2.9.2" % "1.7.2" % "test"

libraryDependencies += "org.scalaz" %% "scalaz-core_2.9.2" % "6.0.4"

/* add project library (seperated by comma) */
libraryDependencies ++= Seq()
