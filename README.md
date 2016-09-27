# sbt-war-with-scoverage
======================

- Clean (non-instrumented) war.

Run `sbt clean package`

Check that

`target/scala-2.10/test_2.10-0.1.0-SNAPSHOT.war` doesn't contain `WEB-INF/lib/scalac-scoverage-runtime_2.10-1.3.0-RC1.jar`

- Instrumented war (ready for in-container tests).

Run `sbt clean coverage package`

Check that

`target/scala-2.10/test_2.10-0.1.0-SNAPSHOT.war` contains `WEB-INF/lib/scalac-scoverage-runtime_2.10-1.3.0-RC1.jar`
