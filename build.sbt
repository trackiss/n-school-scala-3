lazy val scalaTestV = "3.2.9"

lazy val globalSettings = Seq(
  libraryDependencies ++= Seq(
    "org.scalatest" %% "scalatest" % scalaTestV % Test
  ),
  scalacOptions ++= Seq(
    "-deprecation",
    "-explain",
    "-feature",
    "-unchecked"
  ),
  scalaVersion := "3.0.0"
)

lazy val root = (project in file("."))
  .aggregate(advance)
  .settings(globalSettings: _*)
  .settings(
    name := "n-school-scala-3",
    version := "0.0.1"
  )

lazy val advance = (project in file("advance"))
  .settings(globalSettings: _*)
  .settings(
    name := "advance",
    version := "0.0.1"
  )
