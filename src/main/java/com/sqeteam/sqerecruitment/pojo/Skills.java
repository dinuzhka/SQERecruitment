package com.sqeteam.sqerecruitment.pojo;
// Generated Apr 7, 2017 1:28:55 AM by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Skills generated by hbm2java
 */
@Entity
@Table(name = "skills")
public class Skills implements java.io.Serializable {

    @Id
    @Column
    private Integer idSkills;
    @Column
    private Persons persons;
    @Column
    private String skillName;
    @Column
    private String skillLevel;
    @Column
    private Boolean verified;
    @Column
    private String howVerified;

    public Skills() {
    }

    public Skills(Persons persons, String skillName) {
        this.persons = persons;
        this.skillName = skillName;
    }

    public Skills(Persons persons, String skillName, String skillLevel, Boolean verified, String howVerified) {
        this.persons = persons;
        this.skillName = skillName;
        this.skillLevel = skillLevel;
        this.verified = verified;
        this.howVerified = howVerified;
    }

    public Integer getIdSkills() {
        return this.idSkills;
    }

    public void setIdSkills(Integer idSkills) {
        this.idSkills = idSkills;
    }

    public Persons getPersons() {
        return this.persons;
    }

    public void setPersons(Persons persons) {
        this.persons = persons;
    }

    public String getSkillName() {
        return this.skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public String getSkillLevel() {
        return this.skillLevel;
    }

    public void setSkillLevel(String skillLevel) {
        this.skillLevel = skillLevel;
    }

    public Boolean getVerified() {
        return this.verified;
    }

    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    public String getHowVerified() {
        return this.howVerified;
    }

    public void setHowVerified(String howVerified) {
        this.howVerified = howVerified;
    }

}