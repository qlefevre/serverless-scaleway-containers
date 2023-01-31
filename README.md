# Java & Serverless Functions & Scaleway

A simple example to run Java Serverless Functions on top of Scaleway Serverless Containers

I wrote this Java example to complement the [existing examples](https://github.com/scaleway/serverless-scaleway-functions/tree/master/examples) on the [serverless-scaleway-functions plugin](https://github.com/scaleway/serverless-scaleway-functions).  
The example is strongly inspired by this [Flask project written in Python](https://github.com/scaleway/serverless-scaleway-functions/tree/master/examples/container) with PORT definition by Environment variable.  
The java-container folder contains a classic maven project with pom.xml and Dockerfile

Function handler :
https://github.com/qlefevre/serverless-scaleway-containers/blob/38f2ea8d1489ad078fc14a871fc9bd8225077f3a/java-container/src/main/java/Handler.java#L1-L25
