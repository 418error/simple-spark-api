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
java -jar build/libs/simple-spark-api-1.0.jar
```
