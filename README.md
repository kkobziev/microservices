# microservices
Microservices

start services:
EurekaNamingServer
SpringCloudConfigServer
CurrencyExchangeService
CurrencyCalculationService
ZuulApiGatewayServer

docker-compose up -d

API:
GET  http://localhost:8100/currency-converter/from/USD/to/UAH/quantity/1000 - calculate with rest template
GET  http://localhost:8100/currency-converter-feign/from/USD/to/UAH/quantity/1000 - calculate with feign
GET  http://localhost:8765/currency-calculation-service/currency-converter-feign/from/USD/to/UAH/quantity/1000 - calculate via zuul
GET  http://localhost:8000/currency-exchange/from/USD/to/UAH - get exchange rate
GET  http://localhost:8000/limits - get limits from config
POST http://localhost:8000/actuator/bus-refresh - update configuration
GET  http://localhost:8000/fault-tolerance-example - hystrix test

Docker compose:
docker-compose up -d
docker-compose stop
docker-compose down --remove-orphans

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


