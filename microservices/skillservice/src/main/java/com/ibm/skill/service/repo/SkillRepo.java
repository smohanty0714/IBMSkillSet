package com.ibm.skill.service.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ibm.skill.model.Skill;

/**
 * \
 * @author Suvendu Mohanty
 *
 */
public interface SkillRepo extends JpaRepository<Skill, Long>{
	@Query("FROM Skill s where s.skillCategory.id = :skill_cat_id")
    List<Skill> findAllByCatID(@Param("skill_cat_id") Long userId);
}
