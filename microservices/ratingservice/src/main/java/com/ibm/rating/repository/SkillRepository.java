package com.ibm.rating.repository;

/**
 * @author Amila Karunathilaka
 */

import com.ibm.rating.model.Skill;
import com.ibm.rating.model.SkillCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillRepository extends JpaRepository<Skill, Long> {

    Skill findByName(String name);

}
