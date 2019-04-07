package com.ibm.skill.service.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibm.skill.model.SkillCategory;

/**
 * 
 * @author Suvendu Mohanty
 *
 */
public interface SkillCategoryRepo extends JpaRepository<SkillCategory, Long>{

}
