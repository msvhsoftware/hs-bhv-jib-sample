# HS Bremerhaven JIB sample

This repository contains a sample project that was used for demonstrating
the functionality of the
[JIB Maven Plugin](https://github.com/GoogleContainerTools/jib/tree/master/jib-maven-plugin)
in a lecture at HS Bremerhaven.

## Build

`mvn clean package` will build the project and store the Docker image `my-app`
as a tarball in `target/jib-image.tar`.

Run `docker load -i target/jib-image.tar` to load the image into a Docker
runtime.
