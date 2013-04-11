name := "my-scala-project"

version := "0.5"

scalaVersion := "2.10.1"

libraryDependencies += "junit" % "junit" % "4.9" % "test"

libraryDependencies += "org.scalatest" %% "scalatest" % "1.9.1" % "test"

/* add custom project library 
   Seq('groupId % artifactId % version', '...') */
libraryDependencies ++= Seq()
