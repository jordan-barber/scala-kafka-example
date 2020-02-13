name := "scala-learning"

version := "0.1"

scalaVersion := "2.13.1"

mainClass in (Compile, run) := Some("App")

libraryDependencies ++= {
  val akkaVersion       = "2.6.3"
  val kafkaVesion       = "0.10.1.0"

  Seq(
    "com.typesafe.akka"           %% "akka-actor"               % akkaVersion,
    "com.typesafe.akka"           %% "akka-slf4j"               % akkaVersion,
    "com.typesafe.akka"           %% "akka-stream"              % akkaVersion,
    "com.typesafe.akka" %% "akka-actor-typed" % "2.6.3",
    "com.typesafe.akka" %% "akka-http" % "10.1.11",
    "com.typesafe.akka" %% "akka-stream-kafka" % "2.0.1",
    "com.lightbend.akka" %% "akka-stream-alpakka-csv" % "1.1.2",
    "com.dimafeng" %% "testcontainers-scala" % "0.35.2",
    "com.dimafeng" %% "testcontainers-scala-kafka" % "0.35.2",
    "org.scalaz"                  %% "scalaz-core"              % "7.2.30",
    "org.apache.kafka"            % "kafka-clients"             % kafkaVesion,
    "com.typesafe" % "config" % "1.4.0",
    "io.spray" %% "spray-json" % "1.3.5"
  )
}