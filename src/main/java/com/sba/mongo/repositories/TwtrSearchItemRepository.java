package com.sba.mongo.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sba.mongo.entities.TwtrSearchItem;

public interface TwtrSearchItemRepository extends MongoRepository<TwtrSearchItem, String> {
	
	public List<TwtrSearchItem> findBySearchKey(String searchKey);

}
