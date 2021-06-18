# Playground-kafka
Processing messages with apache kafka.
## Download binary
https://kafka.apache.org/

## Commands used

### Start zookeeper
```bash
bin/zookeeper-server-start.sh config/zookeeper.properties
```

### Start kafka server
```bash
bin/kafka-server-start.sh config/server.properties
```

### List topics
```bash
bin/kafka-topics.sh --list --zookeeper localhost:2181
```

### Describe groups consumers
```bash
bin/kafka-consumer-groups.sh --all-groups --bootstrap-server localhost:9092 --describe
```
### Alter partitions in topic
```bash
bin/kafka-topics.sh --alter --zookeeper localhost:2181 --topic NEW_NAME_TOPIC --partitions 3
```



