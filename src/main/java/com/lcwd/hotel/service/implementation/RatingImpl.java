package com.lcwd.hotel.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lcwd.hotel.entities.Rating;
import com.lcwd.hotel.repoitory.RatingtRepository;
import com.lcwd.hotel.service.RatingService;


@Service
public class RatingImpl implements RatingService{

	@Autowired
	private RatingtRepository repo;
	
	@Override
	public Rating addRating(Rating rating) {
		// TODO Auto-generated method stub
		return repo.save(rating);
	}

	@Override
	public List<Rating> getAllRatings() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public List<Rating> getAllByUserId(String userId) {
		// TODO Auto-generated method stub
		return repo.findByUserId(userId);
	}

	@Override
	public List<Rating> getAllByHotelId(String hotelId) {
		// TODO Auto-generated method stub
		return repo.findByHotelId(hotelId);
	}

}
