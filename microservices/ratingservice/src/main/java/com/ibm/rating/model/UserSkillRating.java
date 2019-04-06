package com.ibm.rating.model;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * @author Amila Karunathilaka
 */

@Entity
@Table(name = "user_skill_rating")
public class UserSkillRating {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rating_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "experience_id")
    private ExperienceMaster level;

    @ManyToOne
    @JoinColumn(name = "skill_id")
    private Skill skill;

    @ManyToOne
    @JoinColumn(name = "proficiency_id")
    private ProficiencyMaster proficiency;

    @Column(name = "certified")
    private Boolean certified;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "updated_date")
    private LocalDateTime updatedDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ExperienceMaster getLevel() {
        return level;
    }

    public void setLevel(ExperienceMaster level) {
        this.level = level;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public ProficiencyMaster getProficiency() {
        return proficiency;
    }

    public void setProficiency(ProficiencyMaster proficiency) {
        this.proficiency = proficiency;
    }

    public Boolean getCertified() {
        return certified;
    }

    public void setCertified(Boolean certified) {
        this.certified = certified;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LocalDateTime getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(LocalDateTime updatedDate) {
        this.updatedDate = updatedDate;
    }
}
