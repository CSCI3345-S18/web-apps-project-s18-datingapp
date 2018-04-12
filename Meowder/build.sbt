name := """Meowder!"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

resolvers += Resolver.sonatypeRepo("snapshots")

scalaVersion := "2.12.4"

crossScalaVersions := Seq("2.11.12", "2.12.4")

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "3.1.2" % Test
libraryDependencies += "com.h2database" % "h2" % "1.4.196"
libraryDependencies += "com.typesafe.play" %% "play-json" % "2.5.11"


libraryDependencies += "com.typesafe.play" %% "play-slick" % "3.0.3"
libraryDependencies += "mysql" % "mysql-connector-java" % "6.0.6"
libraryDependencies += "com.typesafe.slick" %% "slick-codegen" % "3.2.3"
