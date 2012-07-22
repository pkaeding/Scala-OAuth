organization := "com.github.jmichalicek"

name := "scala-oauth"

version := "1.0-SNAPSHOT"

scalaVersion := "2.9.1"

libraryDependencies ++= Seq(
  "commons-codec" % "commons-codec" % "1.6",
  "org.apache.httpcomponents" % "httpclient" % "4.2.1",
  "org.apache.httpcomponents" % "httpcore" % "4.2.1"
)
