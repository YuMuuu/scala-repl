ThisBuild / organization := "com.example"
ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / scalaVersion := "2.12.7"


val scalazVersion = "7.2.27"
val akkaVersion = "2.5.18"
val akkaHttpVersion = "10.1.5"

val scalatest = "org.scalatest" %% "scalatest" % "3.0.5" % Test
val mockkitoCore = "org.mockito" % "mockito-core" % "2.13.0" % Test
val scalazCore = "org.scalaz" %% "scalaz-core" % scalazVersion
val scalazEffect = "org.scalaz" %% "scalaz-effect" % scalazVersion

val akkaActor = "com.typesafe.akka" %% "akka-actor" % akkaVersion
val akkaStream = "com.typesafe.akka" %% "akka-stream" % akkaVersion
val akkaHttp = "com.typesafe.akka" %% "akka-http" % akkaHttpVersion
val akkaHttpCore = "com.typesafe.akka" %% "akka-http-core" % akkaHttpVersion
val akkaHttpSprayJson = "com.typesafe.akka" %% "akka-http-spray-json" % akkaHttpVersion
val logback = "ch.qos.logback" %% "logback-classic" % "1.1.3"
val akkaHttpTestKit = "com.typesafe.akka" %% "akka-http-testkit" % akkaHttpVersion % Test
val typeSafeConfig = "com.typesafe" % "config" % "1.3.1"


scalacOptions ++= Seq("-deprecation", "-feature", "-unchecked", "-Xlint")


lazy val root = (project in file("."))
  .settings(
    name := "Hello",
    libraryDependencies ++= Seq(
      scalatest, mockkitoCore, scalazCore, scalazCore, scalazEffect, akkaActor, akkaStream,
      akkaHttp, akkaHttpCore, akkaHttpSprayJson, logback, akkaHttpTestKit, typeSafeConfig
    )
  )
