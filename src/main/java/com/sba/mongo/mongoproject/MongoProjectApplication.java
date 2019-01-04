package com.sba.mongo.mongoproject;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sba.mongo.entities.TwtrSearchItem;
import com.sba.mongo.repositories.TwtrSearchItemRepository;

@SpringBootApplication
public class MongoProjectApplication implements CommandLineRunner {
	
	@Autowired
	private TwtrSearchItemRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(MongoProjectApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		repository.save(new TwtrSearchItem(new Date(),"key1","user1","htg",false,"Initiated","Pending-Processing",
				new Date(),"Seach initiated","Driver"));
		
		for(TwtrSearchItem item: repository.findAll()) {
			System.out.println(item.toString());
		}
		
	}

}	

