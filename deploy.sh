sed -i '' -e "s/IMG_PARA_SUBSTITUIR/wviyotsj\/ecommerce-ibm:$TAG/" docker-compose.yml
docker-compose down 
docker-compose up 
