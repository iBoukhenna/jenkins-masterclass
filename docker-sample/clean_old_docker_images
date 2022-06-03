
echo ">>>>>>> start clearing old docker images"
if docker images -a | grep "iboukhenna*" | awk '{print $1":"$2}' | xargs docker rmi -f; then
    printf 'cleaning old images succeeded\n'
else
    printf 'cleaning old images failed\n'
fi
