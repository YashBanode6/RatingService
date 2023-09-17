package com.lcwd.hotel.repoitory;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.lcwd.hotel.entities.Rating;

@Repository
public interface RatingtRepository extends MongoRepository<Rating, String>{

	
	List<Rating> findByUserId(String userId);
	List<Rating> findByHotelId(String hotelId);
	
}
