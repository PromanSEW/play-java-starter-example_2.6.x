name := "play-java"

scalaVersion := "2.12.2"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

libraryDependencies += guice
