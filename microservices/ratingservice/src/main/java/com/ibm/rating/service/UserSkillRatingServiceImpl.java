package com.ibm.rating.service;

import com.ibm.rating.controller.resource.UserSkillRatingResource;
import com.ibm.rating.model.UserSkillRating;
import com.ibm.rating.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author Amila Karunathilaka
 */

@Service
public class UserSkillRatingServiceImpl implements UserSkillRatingService {

    private UserSkillRatingRepository userSkillRatingRepository;
    private SkillRepository skillRepository;
    private ExperinceMasterRepository experinceMasterRepository;
    private ProficiencyMasterRepository proficiencyMasterRepository;
    private UserRepository userRepository;

    @Autowired
    public UserSkillRatingServiceImpl(UserSkillRatingRepository userSkillRatingRepository,
                                      SkillRepository skillRepository,
                                      ExperinceMasterRepository experinceMasterRepository,
                                      ProficiencyMasterRepository proficiencyMasterRepository,
                                      UserRepository userRepository) {
        this.userSkillRatingRepository = userSkillRatingRepository;
        this.skillRepository = skillRepository;
        this.experinceMasterRepository = experinceMasterRepository;
        this.proficiencyMasterRepository = proficiencyMasterRepository;
        this.userRepository = userRepository;
    }

    @Override
    public Optional<UserSkillRating> save(UserSkillRatingResource userSkillRatingResource) {
        UserSkillRating userSkillRating = new UserSkillRating();
        userSkillRating.setCertified(userSkillRatingResource.getCertified());
        userSkillRating.setLevel(experinceMasterRepository.findByLevel(userSkillRatingResource.getLevel()));
        userSkillRating.setProficiency(proficiencyMasterRepository.findByType(userSkillRatingResource.getProficinecy()));
        userSkillRating.setSkill(skillRepository.findByName(userSkillRatingResource.getSkill()));
        userSkillRating.setUser(userRepository.findById(1L));


        return Optional.ofNullable(userSkillRatingRepository.save(userSkillRating));
    }

    @Override
    public List<UserSkillRating> getSummary(String skill, int index, int offset) {
        Pageable pageable = new PageRequest(index, offset);
        Page<UserSkillRating> userSkillRatingPage = userSkillRatingRepository.findAllBySkill_Name(skill, pageable);

        return userSkillRatingPage.getContent();
    }
}
