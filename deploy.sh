docker image rm wviyotsj/hellobank-ibm:$TAG
sed -i '' -e "s/IMG_PARA_SUBSTITUIR/wviyotsj\/hellobank-ibm:$TAG/" docker-compose.yml
docker-compose down 
docker-compose up 
