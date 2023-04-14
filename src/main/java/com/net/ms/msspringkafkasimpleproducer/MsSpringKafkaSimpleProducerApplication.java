package com.net.ms.msspringkafkasimpleproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.kafka.annotation.EnableKafka;

import com.net.ms.msspringkafkasimpleproducer.adapter.out.kafka.EventProducer;

@EnableKafka
@SpringBootApplication
public class MsSpringKafkaSimpleProducerApplication {
	
   
	
	public static void main(String[] args) {
		ConfigurableApplicationContext app = SpringApplication.run(MsSpringKafkaSimpleProducerApplication.class, args);
		
		
	}
}
