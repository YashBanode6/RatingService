package com.lcwd.hotel.service;

import java.util.List;

import com.lcwd.hotel.entities.Rating;

public interface RatingService {

	public Rating addRating(Rating rating);
	
	public List<Rating> getAllRatings();
	
	public List<Rating> getAllByUserId(String userId);
	
	public List<Rating> getAllByHotelId(String hotelId);

	
}
