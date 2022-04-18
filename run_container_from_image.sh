
echo ">>>>>>> start running container of docker images"
docker run -d -p 9090:8080 --name=springboot-masterclass-0.0.1-SNAPSHOT$BUILD_NUMBER iboukhenna/jenkins-docker-spring:springboot-masterclass-0.0.1-SNAPSHOT$BUILD_NUMBER
echo ">>>>>>> start running container of docker images"
