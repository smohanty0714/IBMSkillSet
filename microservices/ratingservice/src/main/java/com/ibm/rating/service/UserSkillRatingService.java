package com.ibm.rating.service;

/**
 * @author Amila Karunathilaka
 */

import com.ibm.rating.controller.resource.UserSkillRatingResource;
import com.ibm.rating.model.UserSkillRating;

import java.util.List;
import java.util.Optional;

public interface UserSkillRatingService {

    public Optional<UserSkillRating> save(UserSkillRatingResource userSkillRatingResource);

    public List<UserSkillRating> getSummary(String skill, int index, int offset);

}
