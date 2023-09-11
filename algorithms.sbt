name:= "Algorithms Learning"

version:= "1.0"

scalaVersion := "2.13.12"

libraryDependencies ++=Seq(
// Testin Lib : Specs
//"org.specs2" %% "specs2" % "3.7" % Test,
"org.specs2" %% "specs2-core" % "4.20.2" % Test,
"org.specs2" %% "specs2-mock" % "4.20.2" % Test,
"org.scalatest" %% "scalatest" % "3.3.0-SNAP4" % Test,
"commons-io" % "commons-io" % "2.13.0", 

//Machine Learning Libraries
"org.apache.spark" %% "spark-mllib" % "3.4.1" % "provided",

//Natural Language processing
"org.deeplearning4j" % "deeplearning4j-nlp" % "1.0.0-M2.1",

// Statistics
"org.opendaylight.openflowplugin.model" % "model-flow-statistics" % "0.16.2",

//Data Visualization
//"com.cibo" %% "evilplot" % "0.8.0",
"org.plotly-scala" %% "plotly-render" % "0.8.4",
"org.plotly-scala" %% "plotly-core" % "0.8.4",
"org.plotly-scala" %% "kaleido" % "0.1.0",

//Data Analyisis
"org.scalanlp" %% "breeze" % "2.1.0",
"org.scalanlp" %% "breeze-viz" % "2.1.0"
)


resolvers ++=Seq(
"Sonatype Repository" at "https://oss.sonatype.org/content/repositories/releases/",
"Centratl Repository" at "https://repo1.maven.org/maven2/",
"Hortonworks Repository" at "https://repo.hortonworks.com/content/repositories/releases/",
"Atlassian Repository" at "https://packages.atlassian.com/mvn/maven-atlassian-external/",
"CiBo Repository" at "https://dl.bintray.com/cibotech/public/"
)
