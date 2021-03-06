package com.cgi.workshop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App implements CommandLineRunner
{
	@Autowired
	Producer producer;
	
    public static void main(String[] args){
    	SpringApplication.run(App.class, args);
    }

	@Override
	public void run(String... args) throws Exception {
		producer
			.publishTo(PublishTypes.DIRECT_EXCHANGE)
			.withInterval(1000)
			.with(() -> WorkOrderFactory.create());
	}
    
}
