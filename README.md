# kafka-streams-example
Examples for kafka streams

## Dependencies
- Kafka
- Kafka Streams
- Confluent Control Center

## Usage
First for docker dependencies you run command in terminal.
```yml
  docker-compose up
```

A few minutes later all dependencies for kafka occur in docker environment. You see containers that run in local docker with these command
```yml
  docker ps
```

Then, for creating topic, producing event and consuming event you download kafka (https://kafka.apache.org/downloads) and run these commands in terminal;

```yml
bin/kafka-topics.sh --zookeeper localhost:2181 --create --topic streams-plaintext-input --partitions 1 --replication-factor 1 --if-not-exists
bin/kafka-topics.sh --zookeeper localhost:2181 --create --topic streams-wordcount-output --partitions 1 --replication-factor 1 --if-not-exists
bin/kafka-console-producer.sh --broker-list localhost:9092 --topic streams-plaintext-input
bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 \
    --topic streams-wordcount-output \
    --from-beginning \
    --formatter kafka.tools.DefaultMessageFormatter \
    --property print.key=true \
    --property print.value=true \
    --property key.deserializer=org.apache.kafka.common.serialization.StringDeserializer \
    --property value.deserializer=org.apache.kafka.common.serialization.LongDeserializer
```

Then you do example for WordCount example;

## Examples
These application contains examples like below;
- LineSplit example
- Pipe Example
- UpperCase Example
- WordCount Example (With this example you can use ktable for updating data)
- OrderFilter Example (With this example you can analyze object serializer and use filter lambda expression with kafka streams)

