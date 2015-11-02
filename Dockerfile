# The image source
FROM channie/env-openjdk-gradle
# Tell everyone who is maintaining this
MAINTAINER Andy Chan <andy@channie.co.uk>

WORKDIR /code
ADD build.gradle /code/build.gradle
ADD src /code/src
RUN ["gradle","build"]
EXPOSE 4567
CMD ["gradle", "runJar"]
