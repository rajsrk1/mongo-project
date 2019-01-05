package com.sba.mongo.mongoproject;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.sba.mongo.entities.ActivityItem;
import com.sba.mongo.entities.TwtrSearchItem;
import com.sba.mongo.repositories.TwtrSearchItemRepository;
import java.util.ArrayList;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.sba.mongo.repositories")
public class MongoProjectApplication implements CommandLineRunner {
	
	@Autowired
	private TwtrSearchItemRepository repository;
	
	@Autowired
	protected MongoTemplate mongoTemplate;
	
	public static void main(String[] args) {
		SpringApplication.run(MongoProjectApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		
		List<ActivityItem> activity = new ArrayList<ActivityItem>();
		
		activity.add(new ActivityItem(new Date(),"Initiated","Pending-Processing",
				"Seach initiated","Driver"));
		
		repository.save(new TwtrSearchItem(new Date(),"key1","user1","htg",false,"Initiated","Pending-Processing",
				new Date(),"Seach initiated","Driver",activity));				
		
		String id = "";
		
		for(TwtrSearchItem item: repository.findAll()) {
			id = item.getId();
			System.out.println(item.toString());
		}
		
		System.out.println("adding another acty");
		
		ActivityItem anotherActy = new ActivityItem(new Date(),"Data-Collection","Completed",
				"HT search completed","Driver");
		
		mongoTemplate.updateFirst(Query.query(Criteria.where("id").is(id)), 
				new Update().push("activity", anotherActy), TwtrSearchItem.class);
		
		for(TwtrSearchItem item: repository.findAll()) {
			//id = item.getId();
			System.out.println(item.toString());
		}
		
	}

}	

