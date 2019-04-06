package com.ibm.skill.model;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author Amila Karunathilaka
 */

@Entity
@Table(name = "proficiency_master")
public class ProficiencyMaster implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "proficiency_id")
    private Long id;

    @Column(name = "proficiency_type")
    private String type;

    @Column(name = "active")
    private String active;

    @Column(name = "updated_date")
    private LocalDateTime updatedDate;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
