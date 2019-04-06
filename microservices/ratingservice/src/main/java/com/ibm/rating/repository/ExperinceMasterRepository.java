package com.ibm.rating.repository;

/**
 * @author Amila Karunathilaka
 */

import com.ibm.rating.model.ExperienceMaster;
import com.ibm.rating.model.SkillCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperinceMasterRepository extends JpaRepository<ExperienceMaster, Long> {

    ExperienceMaster findByLevel(String name);

}
