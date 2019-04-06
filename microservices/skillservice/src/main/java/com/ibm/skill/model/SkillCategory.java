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
@Table(name = "skill_category")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"updated_date"},
        allowGetters = true)
public class SkillCategory implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -8210360695285082143L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "skill_category_id")
    private Long id;

    @Column(name = "skill_category_name")
    private String name;
    
    @JsonIgnore
    @Column(name = "active")
    private String active;
    
    @JsonIgnore
    @Column(name = "updated_date")
    private LocalDateTime updatedDate;


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
}
