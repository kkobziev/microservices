# microservices
Microservices

Docker compose:
docker-compose up -d

RabbitMQ:
docker pull rabbitmq:3-management
docker run -d -p 15672:15672 -p 5672:5672 --name rabbit-test-for-medium rabbitmq:3-management

HostName: “localhost”
UserName: “guest”
Password: “guest”
Port: 5672

Test the image by opening “http://localhost:15672/#/” in your browser.

Zipkin:
docker pull openzipkin/zipkin
docker run -d -p 9411:9411 openzipkin/zipkin
