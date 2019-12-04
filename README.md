1. cd /java-test-demo

2. mvn clean package -Dmaven.test.skip=true

3. cd /java-test-demo/target

4. java -jar cicd-demo-1.0.0.jar 

5. curl http://localhost:8080/hello