name := "scala-traverse-jmh-experiements"

version := "0.1"

scalaVersion := "2.12.12"

libraryDependencies += "org.openjdk.jmh" % "jmh-core" % "1.19"
libraryDependencies += "org.openjdk.jmh" % "jmh-generator-annprocess" % "1.19"

enablePlugins(JmhPlugin)
