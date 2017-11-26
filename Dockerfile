FROM openjdk:8-jre-slim

# Add the jar with all the dependencies
ADD  target/PIM2C.jar /usr/share/tag/PIM2C.jar

# Command line to execute the test
ENTRYPOINT ["java", "-cp", "PIM2C.jar", "org.junit", "-testclass", "test.AllocatorTest"]