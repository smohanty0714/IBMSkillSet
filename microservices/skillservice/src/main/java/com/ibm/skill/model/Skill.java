package com.ibm.skill.model;

import javax.persistence.*;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author Suvendu Mohanty
 */

@Entity
@Table(name = "skill")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"updated_date"},
        allowGetters = true)
public class Skill implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -6789605667522166991L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "skill_id")
    private Long id;

    @Column(name = "skill_name")
    private String name;
    
    
    @Column(name = "active")
    private String active;
    
    @JsonIgnore
    @Column(name = "updated_date")
    private LocalDateTime updatedDate;
    
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "skill_category_id", nullable = false)
    private SkillCategory skillCategory;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public LocalDateTime getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(LocalDateTime updatedDate) {
        this.updatedDate = updatedDate;
    }

    public SkillCategory getSkillCategory() {
        return skillCategory;
    }

    public void setSkillCategory(SkillCategory skillCategory) {
        this.skillCategory = skillCategory;
    }
}
