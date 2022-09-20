chmod +x stop.sh
sh stop.sh

nohup ./start.sh  > /tmp/test.out 2>&1 &

echo ":::Aguartando start Java:::"

mvn test

sh stop.sh
