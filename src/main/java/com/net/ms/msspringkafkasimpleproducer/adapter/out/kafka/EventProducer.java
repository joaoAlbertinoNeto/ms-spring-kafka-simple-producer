package com.net.ms.msspringkafkasimpleproducer.adapter.out.kafka;
 



import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;


@Component
public class EventProducer {
	
	@Autowired
    private KafkaTemplate<String, String> template;

	@PostMapping("/sendEvent")
    public void sendEvent(String event){
       ProducerRecord<String, String> msg = new ProducerRecord<String, String>("msgs",null,event);
       template.send(msg);
       
       System.out.println("Evento enviado : "+msg);
    }
}
