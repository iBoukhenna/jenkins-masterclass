
echo ">>>>>>> start clearing old container"
if docker ps -a | grep "springboot-masterclass-0.0.1-SNAPSHOT*" | awk '{print $1}' | xargs docker rm -f; then
    printf 'clearing old container succeeded\n'
else
    printf 'clearing old container failed\n'
fi
