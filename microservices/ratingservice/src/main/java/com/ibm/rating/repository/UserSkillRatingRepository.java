package com.ibm.rating.repository;

import com.ibm.rating.model.UserSkillRating;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Amila Karunathilaka
 */

@Repository
public interface UserSkillRatingRepository extends JpaRepository<UserSkillRating, Long> {


    Page<UserSkillRating> findAllBySkill_Name(String skillName, Pageable pageable);

}
