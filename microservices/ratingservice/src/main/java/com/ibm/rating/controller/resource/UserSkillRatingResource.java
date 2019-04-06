package com.ibm.rating.controller.resource;

/**
 * @author Amila Karunathilaka
 */

public class UserSkillRatingResource {

    private String level;
    private String proficinecy;
    private String category;
    private Boolean certified;
    private String skill;

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getProficinecy() {
        return proficinecy;
    }

    public void setProficinecy(String proficinecy) {
        this.proficinecy = proficinecy;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Boolean getCertified() {
        return certified;
    }

    public void setCertified(Boolean certified) {
        this.certified = certified;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
}
