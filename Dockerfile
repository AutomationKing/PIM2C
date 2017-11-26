FROM openjdk:8-jre-slim

# Add the jar with all the dependencies
ADD  target/PIM2C-0.0.1-SNAPSHOT-tests.jar /usr/share/tag/PIM2C-0.0.1-SNAPSHOT-tests.jar

# Command line to execute the test
ENTRYPOINT ["java", "-cp", "PIM2C-0.0.1-SNAPSHOT-tests.jar", "org.junit", "-testclass", "test.AllocatorTest"]