name := "deeplearningwithscala"

version := "0.1"

scalaVersion := "2.13.1"
// https://mvnrepository.com/artifact/org.datavec/datavec-api
libraryDependencies += "org.datavec" % "datavec-api" % "1.0.0-beta6"
// https://mvnrepository.com/artifact/org.deeplearning4j/deeplearning4j-core
libraryDependencies += "org.deeplearning4j" % "deeplearning4j-core" % "1.0.0-beta6"
// https://mvnrepository.com/artifact/org.deeplearning4j/deeplearning4j-nn
libraryDependencies += "org.deeplearning4j" % "deeplearning4j-nn" % "1.0.0-beta6"
// https://mvnrepository.com/artifact/org.nd4j/nd4j-native-platform
libraryDependencies += "org.nd4j" % "nd4j-native-platform" % "1.0.0-beta6"
// https://mvnrepository.com/artifact/org.slf4j/slf4j-simple
libraryDependencies += "org.slf4j" % "slf4j-simple" % "2.0.0-alpha1" % Test
