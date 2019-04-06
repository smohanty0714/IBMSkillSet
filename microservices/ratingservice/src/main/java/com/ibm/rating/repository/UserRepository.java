package com.ibm.rating.repository;

/**
 * @author Amila Karunathilaka
 */

import com.ibm.rating.model.SkillCategory;
import com.ibm.rating.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByName(String name);
    User findById(Long id);
}
