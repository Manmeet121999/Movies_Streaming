package com.capflix.rating.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/ratings")
public class Controller {
	@PostMapping("/submit")
	public ResponseEntity<?> submit(){
		return ResponseEntity.ok(null);
	}
	@PutMapping("/update")
	public ResponseEntity<?> update(){
		return ResponseEntity.ok(null);
	}
	@GetMapping("/averageRating/{videoId}")
	public ResponseEntity<?> averageRating(){
		return ResponseEntity.ok(null);
	}
	

}
