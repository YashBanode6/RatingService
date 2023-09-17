package com.lcwd.hotel.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lcwd.hotel.entities.Rating;
import com.lcwd.hotel.service.RatingService;

@RestController
@RequestMapping("/ratings")
public class RatingController {

	@Autowired
	private RatingService service;
	
	@PostMapping("/rating")
	public ResponseEntity<?> addRating(@RequestBody Rating rating){
		
		ResponseEntity<?> response = null;
		
		response = new ResponseEntity<>(service.addRating(rating), HttpStatus.OK);
		
		return response;
		
	}
	
	@GetMapping("/ratings")
	public ResponseEntity<?> viewAll(){
		
		ResponseEntity<?> response = null;
		
		response = new ResponseEntity<>(service.getAllRatings(), HttpStatus.OK);
		
		return response;
		
	}
	
	@GetMapping("/users/{userId}")
	public ResponseEntity<?> viewAllByUserId(@PathVariable String userId){
		
		ResponseEntity<?> response = null;
		
		response = new ResponseEntity<>(service.getAllByUserId(userId), HttpStatus.OK);
		
		return response;
		
	}


	@GetMapping("/{hotelId}")
	public ResponseEntity<?> viewAllByHotelId(@PathVariable String hotelId){
		
		ResponseEntity<?> response = null;
		
		response = new ResponseEntity<>(service.getAllByHotelId(hotelId), HttpStatus.OK);
		
		return response;
		
	}







	
	
}
