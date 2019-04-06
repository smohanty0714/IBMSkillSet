package com.ibm.rating.controller;

import java.util.List;

import com.ibm.rating.controller.resource.UserSkillRatingResource;
import com.ibm.rating.model.UserSkillRating;
import com.ibm.rating.service.UserSkillRatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * @author Amila Karunathilaka
 */
@RestController
@RequestMapping("/rating")
public class UserSkillRatingController {

	private UserSkillRatingService userSkillRatingService;

	@Autowired
	public UserSkillRatingController(UserSkillRatingService userSkillRatingService) {
		this.userSkillRatingService = userSkillRatingService;
	}


	@GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<UserSkillRating> getNode(@RequestParam("skill") String skill, @RequestParam("index") int index,
						  @RequestParam("offset") int offset) {
		return userSkillRatingService.getSummary(skill, index, offset);
	}

	@PostMapping(value = "/", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String createRating(@RequestBody UserSkillRatingResource userSkillRatingResource) {
		return userSkillRatingService.save(userSkillRatingResource).isPresent() ?
				"{message: \"Success\"}" : "{message: \"Failure\"}";
	}

	@PutMapping(value = "/", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String updateRating(@RequestBody UserSkillRatingResource userSkillRatingResource) {
		return userSkillRatingService.save(userSkillRatingResource).isPresent() ?
				"{message: \"Success\"}" : "{message: \"Failure\"}";
	}
}
