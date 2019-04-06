package com.ibm.rating.repository;

/**
 * @author Amila Karunathilaka
 */

import com.ibm.rating.model.ProficiencyMaster;
import com.ibm.rating.model.SkillCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProficiencyMasterRepository extends JpaRepository<ProficiencyMaster, Long> {

    ProficiencyMaster findByType(String name);

}
