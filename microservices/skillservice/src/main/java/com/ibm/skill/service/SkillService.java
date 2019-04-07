/**
 * 
 */
package com.ibm.skill.service;

import java.util.List;

import com.ibm.skill.model.Skill;
import com.ibm.skill.model.SkillCategory;

/**
 * @author Suvendu Mohanty
 *
 */
public interface SkillService {
	
	public List<SkillCategory> getSkillCategory();
	
	public List<Skill> getSkills(long cat_id);

}
