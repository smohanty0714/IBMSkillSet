/**
 * 
 */
package com.ibm.skill.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.skill.model.Skill;
import com.ibm.skill.model.SkillCategory;
import com.ibm.skill.service.SkillService;
import com.ibm.skill.service.repo.SkillCategoryRepo;
import com.ibm.skill.service.repo.SkillRepo;

/**
 * @author Suvendu Mohanty
 *
 */
@Service
public class SkillServiceImpl implements SkillService {
	@Autowired
	SkillCategoryRepo skillcatrepo;
	
	@Autowired
	SkillRepo skillrepo;
	
	@Override
	public List<SkillCategory> getSkillCategory() {
		// TODO Auto-generated method stub
		return skillcatrepo.findAll();
	}

	@Override
	public List<Skill> getSkills(long cat_id) {
		// TODO Auto-generated method stub
		return skillrepo.findAllByCatID(cat_id);
	}

}
