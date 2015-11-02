# simple-spark-api
This is an extremely simple [Spark](http://sparkjava.com/) api.

Its sole purpose is to demonstrate the simplicity of the SparkJava framework. Made even easier to handle being ubered by [Gradle](http://gradle.org/).

Have a look at my other repos for more examples...

## Prequisites
I'm on a Mac using Homebrew goodness...
* Java 1.8
```
brew cask install java
```
* Gradle
```
brew install gradle
```

## Setting up and compiling
```
git clone git@github.com:lendmeapound/simple-spark-api.git
cd simple-spark-api.git
gradle build
```
## Running (as executable)
To run on default port 4567
```
gradle runJar
```
Open a browser of your choice and navigate to

<http://localhost:4567/hello>

## Using docker????
I've included a Docker file here I use to run this particular app... rather than copy and past it from my other repo have a look there for how to run it... [Channie's docker-files - env-openjdk-gradle][channie-docker]

Although if you have experience with docker then the following should be enough...

Build the image...
```
docker build -t yourname/env-simple-spark-api .
```
Run the image in the container...
```
docker run -dp 10023:4567 yourname/env-simple-spark-api
```
Open a browser of your choice and navigate to

<http://your-docker-machine-ip:10023/hello>


[channie-docker]: https://github.com/lendmeapound/docker-files/tree/master/env-openjdk-gradle
