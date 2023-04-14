package com.net.ms.msspringkafkasimpleproducer.adapter.in.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.net.ms.msspringkafkasimpleproducer.adapter.out.kafka.EventProducer;


@RestController
public class Controller {
	
	@Autowired
	EventProducer producer;
	
	@PostMapping("/sendEvent")
	private void sendEvent() {
		for (int i = 0 ; i<500 ;i++) {
			producer.sendEvent("msg-number-"+i);
		}

	}

}
