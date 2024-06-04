package org.springframework.amqp.tutorials.rabbitmq_amqp_tutorials;

import org.springframework.amqp.tutorials.rabbitmq_amqp_tutorials.tut1.Tut1Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@RestController
public class RabbitmqAmqpTutorialsApplication {

	@Autowired Tut1Sender tut1Sender;

	public static void main(String[] args) {
		SpringApplication.run(RabbitmqAmqpTutorialsApplication.class, args);
	}

	@GetMapping("/ping")
	public String ping(){
		for(int i=0; i<10000;i++)
				tut1Sender.send();
		return "hola mundo";
	}

}
