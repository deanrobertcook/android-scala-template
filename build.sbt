androidBuild

name := "android-scala-template"
organization := "org.theronin"
version := "0.0.1"

javacOptions in Compile ++= "-source" :: "1.7" :: "-target" :: "1.7" :: Nil

platformTarget := "android-23"
proguardCache := Nil

libraryDependencies ++= Seq (
  "com.android.support" % "support-v4" % "23.1.0",
  "com.android.support" % "appcompat-v7" % "23.1.0"
)

fork in Test := true