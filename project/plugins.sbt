resolvers += Resolver.sonatypeRepo("snapshots")

addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.5.0-SNAPSHOT")

addSbtPlugin("com.earldouglas" % "xsbt-web-plugin" % "2.1.0")

scalacOptions ++= Seq("-feature", "-deprecation")
