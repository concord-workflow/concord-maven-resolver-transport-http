# Maven Resolver HTTP transport

This is a "fork" of the original [maven-resolver-transport-http](https://maven.apache.org/resolver/maven-resolver-transport-http/project-info.html)
project. Unfortunately the original code is hard to extend due to prevalence of final or package-private classes.

Changes comparing to the upstream:
- `HttpTransporterFactory` and `HttpTransporter` made non-final.
- hacked in the `preemptiveAuth` parameter