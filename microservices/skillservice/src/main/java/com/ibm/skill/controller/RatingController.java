package com.ibm.skill.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.skill.model.Skill;
import com.ibm.skill.model.SkillCategory;
import com.ibm.skill.service.SkillService;

/**
 * 
 * @author sumohanty
 *
 */
@RestController
@RequestMapping("/skill")
public class RatingController {
	
	@Autowired
	SkillService skillService;

	/**
	 * This is a API
	 * @return
	 */
	@RequestMapping(value = "/skillcategory", method = RequestMethod.GET, produces = "application/json" )
	public ResponseEntity<List<SkillCategory>> getSkillCategory() {
		List<SkillCategory> skillcats = skillService.getSkillCategory();
		
		return new ResponseEntity<List<SkillCategory>>(skillcats, HttpStatus.OK);
	}
	
	/**
	 * This is a API
	 * @return
	 */
	@RequestMapping(value = "/{category_id}", method = RequestMethod.GET, produces = "application/json" )
	public ResponseEntity<List<Skill>> getSkills(@PathVariable("category_id") int category_id) {
		
		List<Skill> skills = skillService.getSkills(category_id);
		return new ResponseEntity<List<Skill> >(skills, HttpStatus.OK);
	}
	
	

	
}
