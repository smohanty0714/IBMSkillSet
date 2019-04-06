package com.ibm.rating.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.rating.model.Rating;

@RestController
@RequestMapping("/node")
public class RatingController {
	
	private List<Rating> nodelist = new ArrayList<>();
	
	public RatingController() {
		nodelist.add(new Rating(1, "Node1"));
		nodelist.add(new Rating(2, "Node2"));
	}

	/**
	 * This is a demo API
	 * @return
	 */
	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json" )
	public Rating getNode(@PathVariable int id) {
		Optional<Rating> rating = nodelist.stream().filter(node1 -> node1.getId() == id).findFirst();
		return rating.get();
	}
}
