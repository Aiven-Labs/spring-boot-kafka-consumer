package io.aiven.springbootkafkaconsumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
public class SpringBootKafkaConsumerApplication {
	private static final Logger logger = LoggerFactory.getLogger(SpringBootKafkaConsumerApplication.class);

    public static final String TOPIC = "spring";
	public static void main(String[] args) {
		SpringApplication.run(SpringBootKafkaConsumerApplication.class, args);
	}

    @KafkaListener(topics = TOPIC, groupId = "aiven")
    public void receive(ConsumerRecord<String, String> consumerRecord) {
        logger.info("Received payload: '{}'", consumerRecord.toString());
    }
}
